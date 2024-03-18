/*
 * The MIT License
 * Copyright © 2024 Andy Miles
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.amilesend.tvdb.client;

import com.amilesend.tvdb.client.api.LoginApi;
import com.amilesend.tvdb.client.model.InlineResponse200;
import com.amilesend.tvdb.client.model.InlineResponse200Data;
import com.amilesend.tvdb.client.model.LoginBody;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.Validate;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Factory used to simplify configuring and obtaining authenticated client instances to access TheTVDB v4 API.
 *
 * @see ApiClient
 */
public class ApiClientFactory {
    private final String apiKey;
    private final AtomicReference<AuthInfo> auth = new AtomicReference<>(null);
    private final Object lock = new Object();

    /**
     * Creates a new {@code ApiClientFactory} instance used to configure an authenticated TVDB client.
     *
     * @param apiKey the API key used to obtain the auth token
     */
    public ApiClientFactory(final String apiKey) {
        Validate.notBlank(apiKey, "apiKey must not be blank");
        this.apiKey = apiKey;
    }

    /**
     * Authenticates and sets the default ApiClient configuration.
     *
     * @throws ApiException if an error occurred while obtaining the auth token
     */
    public void authenticateDefaultClient() throws ApiException {
        getAuthenticatedClient();
    }

    /**
     * Gets the authenticated {@code ApiClient} instance.
     *
     * @return the authenticated client instance
     * @throws ApiException if an error occurred while obtaining the auth token
     */
    public ApiClient getAuthenticatedClient() throws ApiException {
        if (isAuthenticated()) {
            return Configuration.getDefaultApiClient();
        }

        synchronized (lock) {
            final AuthInfo authInfo = refresh(apiKey);
            auth.set(authInfo);

            final ApiClient apiClient = new ApiClient();
            apiClient.setAccessToken(authInfo.getToken());
            // Configure the default ApiClient instance so that all API classes can invoke the APIs with an
            // auth token using the default ctor.
            Configuration.setDefaultApiClient(apiClient);

            return apiClient;
        }
    }

    private boolean isAuthenticated() {
        final boolean isAuthInfoValid = Optional.ofNullable(auth)
                .map(AtomicReference::get)
                .map(AuthInfo::isExpired)
                .map(BooleanUtils::isFalse)
                .orElse(false);
        final boolean isDefaultClientAuthenticationSet =
                !Configuration.getDefaultApiClient().getAuthentications().isEmpty();
        return isAuthInfoValid && isDefaultClientAuthenticationSet;
    }

    private AuthInfo refresh(final String apiKey) throws ApiException {
        return Optional.ofNullable(new LoginApi().loginPost(new LoginBody().apikey(apiKey)))
                .map(InlineResponse200::getData)
                .map(InlineResponse200Data::getToken)
                .map(t -> new AuthInfo(t))
                .orElseThrow(() -> new ApiException("Unable to read auth token in response"));
    }

    /** Client authentication information that keeps track of the auth token and its expiration status. */
    private static class AuthInfo {
        // 24 Hours is the default.  Refresh every 23 to avoid time sync issues.
        private static final Duration TOKEN_EXPIRATION_DURATION = Duration.ofHours(23);

        private final String token;
        private final Instant expiration;

        public AuthInfo(final String token) {
            Validate.notBlank(token, "Token must not be blank");

            this.token = token;
            expiration = Instant.now().plus(TOKEN_EXPIRATION_DURATION);
        }

        public boolean isExpired() {
            return Instant.now().isAfter(expiration);
        }

        public String getToken() {
            return token;
        }
    }
}

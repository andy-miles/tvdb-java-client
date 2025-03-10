/*
 * TVDB API V4
 * Documentation of [TheTVDB](https://thetvdb.com/) API V4. All related information is linked from our [Github repo](https://github.com/thetvdb/v4-api). You might also want to use our [Postman collection] (https://www.getpostman.com/collections/7a9397ce69ff246f74d0) ## Authentication 1. Use the /login endpoint and provide your API key as \"apikey\". If you have a user-supported key, also provide your subscriber PIN as \"pin\". Otherwise completely remove \"pin\" from your call. 2. Executing this call will provide you with a bearer token, which is valid for 1 month. 3. Provide your bearer token for subsequent API calls by clicking Authorize below or including in the header of all direct API calls: `Authorization: Bearer [your-token]`  ## Notes 1. \"score\" is a field across almost all entities.  We generate scores for different types of entities in various ways, so no assumptions should be made about the meaning of this value.  It is simply used to hint at relative popularity for sorting purposes. 
 *
 * OpenAPI spec version: 4.7.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amilesend.tvdb.client.api;

import com.amilesend.tvdb.client.ApiCallback;
import com.amilesend.tvdb.client.ApiClient;
import com.amilesend.tvdb.client.ApiException;
import com.amilesend.tvdb.client.ApiResponse;
import com.amilesend.tvdb.client.Configuration;
import com.amilesend.tvdb.client.Pair;
import com.amilesend.tvdb.client.ProgressRequestBody;
import com.amilesend.tvdb.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.amilesend.tvdb.client.model.InlineResponse20038;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeopleTypesApi {
    private ApiClient apiClient;

    public PeopleTypesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PeopleTypesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllPeopleTypes
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getAllPeopleTypesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/people/types";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllPeopleTypesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        okhttp3.Call call = getAllPeopleTypesCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * returns list of peopleType records
     * @return InlineResponse20038
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20038 getAllPeopleTypes() throws ApiException {
        ApiResponse<InlineResponse20038> resp = getAllPeopleTypesWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * returns list of peopleType records
     * @return ApiResponse&lt;InlineResponse20038&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20038> getAllPeopleTypesWithHttpInfo() throws ApiException {
        okhttp3.Call call = getAllPeopleTypesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20038>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * returns list of peopleType records
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getAllPeopleTypesAsync(final ApiCallback<InlineResponse20038> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = getAllPeopleTypesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20038>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

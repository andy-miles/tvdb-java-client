<a name="readme-top"></a>
<!-- Template Credit: Othneil Drew (https://github.com/othneildrew),
                      https://github.com/othneildrew/Best-README-Template/tree/master -->
<!-- PROJECT SHIELDS -->
<div align="center">

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

</div>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://thetvdb.com/">
  	<picture>
      <source media="(prefers-color-scheme: dark)" srcset="https://thetvdb.com/images/attribution/logo1.png">
      <source media="(prefers-color-scheme: light)" srcset="https://thetvdb.com/images/attribution/logo2.png">
      <img alt="The TVDB Logo" src="https://thetvdb.com/images/attribution/logo2.png">
  	</picture>
  </a>
  <br/>
  <a href="https://thetvdb.com/">thetvdb.com</a>
  <h3 align="center">tvdb-java-client</h3>

  <p align="center">
    A swagger-generated TheTVDB v4 java client.
    <br />
    <a href="https://www.amilesend.com/tvdb-java-client"><strong>Maven Project Info</strong></a>
    -
    <a href="https://www.amilesend.com/tvdb-java-client/apidocs/index.html"><strong>Javadoc</strong></a>
    <br />
    <a href="https://github.com/andy-miles/tvdb-java-client/issues">Report Bug</a>
    -
    <a href="https://github.com/andy-miles/tvdb-java-client/issues">Request Feature</a>
  </p>
</div>


<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#recipes">Recipes</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>


<!-- ABOUT THE PROJECT -->
# About The Project

An auto-generated client for Java programmatic access to [TheTVDB v4 API](https://thetvdb.github.io/v4-api/).


## Getting Started

You'll need to register for your own API key via [The TVDB API and Data Licensing](https://thetvdb.com/api-information)

## Recipes

### Authenticating the default ApiClient

```java
final ApiClientFactory clientFactory = new ApiClientFactory("MyApiKey");
clientFactory.authenticateDefaultClient();

final SearchApi searchApi = new SearchApi();
final List<SearchResult> resultList = searchApi.getSearchResults(
        "friends",  // query
        null,       // q
        "series",   // type
        null,       // year
        null,       // company 
        null,       // country
        null,       // director
        null,       // language
        null,       // primaryType
        null,       // network
        null,       // remoteId
        null,       // offset
        new BigDecimal(3) /* limit */).getData();
```

### Obtaining an authenticated ApiClient

```java
final ApiClientFactory clientFactory = new ApiClientFactory("MyApiKey");
final ApiClient myClient = clientFactory.getAuthenticatedClient();

// You can explicitly pass the authenticated client to each Api
final SearchApi searchApi = new SearchApi(myClient);
```

## Contributing

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<div align="right">(<a href="#readme-top">back to top</a>)</div>

<!-- LICENSE -->
## License

Distributed under the MIT license. See [LICENSE](https://github.com/andy-miles/tvdb-java-client/blob/main/LICENSE) for more information.

<div align="right">(<a href="#readme-top">back to top</a>)</div>


<!-- CONTACT -->
## Contact

Andy Miles - andy.miles (at) amilesend.com

Project Link: [https://github.com/andy-miles/tvdb-java-client](https://github.com/andy-miles/tvdb-java-client)

<div align="right">(<a href="#readme-top">back to top</a>)</div>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/andy-miles/tvdb-java-client.svg?style=for-the-badge
[contributors-url]: https://github.com/andy-miles/tvdb-java-client/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/andy-miles/tvdb-java-client.svg?style=for-the-badge
[forks-url]: https://github.com/andy-miles/tvdb-java-client/network/members
[stars-shield]: https://img.shields.io/github/stars/andy-miles/tvdb-java-client.svg?style=for-the-badge
[stars-url]: https://github.com/andy-miles/tvdb-java-client/stargazers
[issues-shield]: https://img.shields.io/github/issues/andy-miles/tvdb-java-client.svg?style=for-the-badge
[issues-url]: https://github.com/andy-miles/tvdb-java-client/issues
[license-shield]: https://img.shields.io/github/license/andy-miles/tvdb-java-client.svg?style=for-the-badge
[license-url]: https://github.com/andy-miles/tvdb-java-client/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/andy-miles
[product-screenshot]: images/screenshot.png
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 

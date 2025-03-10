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

package com.amilesend.tvdb.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.amilesend.tvdb.client.model.Alias;
import com.amilesend.tvdb.client.model.ArtworkExtendedRecord;
import com.amilesend.tvdb.client.model.Character;
import com.amilesend.tvdb.client.model.Company;
import com.amilesend.tvdb.client.model.ContentRating;
import com.amilesend.tvdb.client.model.EpisodeBaseRecord;
import com.amilesend.tvdb.client.model.GenreBaseRecord;
import com.amilesend.tvdb.client.model.ListBaseRecord;
import com.amilesend.tvdb.client.model.RemoteID;
import com.amilesend.tvdb.client.model.SeasonBaseRecord;
import com.amilesend.tvdb.client.model.SeasonType;
import com.amilesend.tvdb.client.model.SeriesAirsDays;
import com.amilesend.tvdb.client.model.Status;
import com.amilesend.tvdb.client.model.TagOption;
import com.amilesend.tvdb.client.model.Trailer;
import com.amilesend.tvdb.client.model.TranslationExtended;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The extended record for a series. All series airs time like firstAired, lastAired, nextAired, etc. are in US EST for US series, and for all non-US series, the time of the show’s country capital or most populous city. For streaming services, is the official release time. See https://support.thetvdb.com/kb/faq.php?id&#x3D;29.
 */
@Schema(description = "The extended record for a series. All series airs time like firstAired, lastAired, nextAired, etc. are in US EST for US series, and for all non-US series, the time of the show’s country capital or most populous city. For streaming services, is the official release time. See https://support.thetvdb.com/kb/faq.php?id=29.")


public class SeriesExtendedRecord {
  @SerializedName("abbreviation")
  private String abbreviation = null;

  @SerializedName("airsDays")
  private SeriesAirsDays airsDays = null;

  @SerializedName("airsTime")
  private String airsTime = null;

  @SerializedName("aliases")
  private List<Alias> aliases = null;

  @SerializedName("artworks")
  private List<ArtworkExtendedRecord> artworks = null;

  @SerializedName("averageRuntime")
  private Integer averageRuntime = null;

  @SerializedName("characters")
  private List<Character> characters = null;

  @SerializedName("contentRatings")
  private List<ContentRating> contentRatings = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("defaultSeasonType")
  private Long defaultSeasonType = null;

  @SerializedName("episodes")
  private List<EpisodeBaseRecord> episodes = null;

  @SerializedName("firstAired")
  private String firstAired = null;

  @SerializedName("lists")
  private List<ListBaseRecord> lists = null;

  @SerializedName("genres")
  private List<GenreBaseRecord> genres = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("isOrderRandomized")
  private Boolean isOrderRandomized = null;

  @SerializedName("lastAired")
  private String lastAired = null;

  @SerializedName("lastUpdated")
  private String lastUpdated = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameTranslations")
  private List<String> nameTranslations = null;

  @SerializedName("companies")
  private List<Company> companies = null;

  @SerializedName("nextAired")
  private String nextAired = null;

  @SerializedName("originalCountry")
  private String originalCountry = null;

  @SerializedName("originalLanguage")
  private String originalLanguage = null;

  @SerializedName("originalNetwork")
  private Company originalNetwork = null;

  @SerializedName("overview")
  private String overview = null;

  @SerializedName("latestNetwork")
  private Company latestNetwork = null;

  @SerializedName("overviewTranslations")
  private List<String> overviewTranslations = null;

  @SerializedName("remoteIds")
  private List<RemoteID> remoteIds = null;

  @SerializedName("score")
  private Double score = null;

  @SerializedName("seasons")
  private List<SeasonBaseRecord> seasons = null;

  @SerializedName("seasonTypes")
  private List<SeasonType> seasonTypes = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("status")
  private Status status = null;

  @SerializedName("tags")
  private List<TagOption> tags = null;

  @SerializedName("trailers")
  private List<Trailer> trailers = null;

  @SerializedName("translations")
  private TranslationExtended translations = null;

  @SerializedName("year")
  private String year = null;

  public SeriesExtendedRecord abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * Get abbreviation
   * @return abbreviation
  **/
  @Schema(description = "")
  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public SeriesExtendedRecord airsDays(SeriesAirsDays airsDays) {
    this.airsDays = airsDays;
    return this;
  }

   /**
   * Get airsDays
   * @return airsDays
  **/
  @Schema(description = "")
  public SeriesAirsDays getAirsDays() {
    return airsDays;
  }

  public void setAirsDays(SeriesAirsDays airsDays) {
    this.airsDays = airsDays;
  }

  public SeriesExtendedRecord airsTime(String airsTime) {
    this.airsTime = airsTime;
    return this;
  }

   /**
   * Get airsTime
   * @return airsTime
  **/
  @Schema(description = "")
  public String getAirsTime() {
    return airsTime;
  }

  public void setAirsTime(String airsTime) {
    this.airsTime = airsTime;
  }

  public SeriesExtendedRecord aliases(List<Alias> aliases) {
    this.aliases = aliases;
    return this;
  }

  public SeriesExtendedRecord addAliasesItem(Alias aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<Alias>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @Schema(description = "")
  public List<Alias> getAliases() {
    return aliases;
  }

  public void setAliases(List<Alias> aliases) {
    this.aliases = aliases;
  }

  public SeriesExtendedRecord artworks(List<ArtworkExtendedRecord> artworks) {
    this.artworks = artworks;
    return this;
  }

  public SeriesExtendedRecord addArtworksItem(ArtworkExtendedRecord artworksItem) {
    if (this.artworks == null) {
      this.artworks = new ArrayList<ArtworkExtendedRecord>();
    }
    this.artworks.add(artworksItem);
    return this;
  }

   /**
   * Get artworks
   * @return artworks
  **/
  @Schema(description = "")
  public List<ArtworkExtendedRecord> getArtworks() {
    return artworks;
  }

  public void setArtworks(List<ArtworkExtendedRecord> artworks) {
    this.artworks = artworks;
  }

  public SeriesExtendedRecord averageRuntime(Integer averageRuntime) {
    this.averageRuntime = averageRuntime;
    return this;
  }

   /**
   * Get averageRuntime
   * @return averageRuntime
  **/
  @Schema(description = "")
  public Integer getAverageRuntime() {
    return averageRuntime;
  }

  public void setAverageRuntime(Integer averageRuntime) {
    this.averageRuntime = averageRuntime;
  }

  public SeriesExtendedRecord characters(List<Character> characters) {
    this.characters = characters;
    return this;
  }

  public SeriesExtendedRecord addCharactersItem(Character charactersItem) {
    if (this.characters == null) {
      this.characters = new ArrayList<Character>();
    }
    this.characters.add(charactersItem);
    return this;
  }

   /**
   * Get characters
   * @return characters
  **/
  @Schema(description = "")
  public List<Character> getCharacters() {
    return characters;
  }

  public void setCharacters(List<Character> characters) {
    this.characters = characters;
  }

  public SeriesExtendedRecord contentRatings(List<ContentRating> contentRatings) {
    this.contentRatings = contentRatings;
    return this;
  }

  public SeriesExtendedRecord addContentRatingsItem(ContentRating contentRatingsItem) {
    if (this.contentRatings == null) {
      this.contentRatings = new ArrayList<ContentRating>();
    }
    this.contentRatings.add(contentRatingsItem);
    return this;
  }

   /**
   * Get contentRatings
   * @return contentRatings
  **/
  @Schema(description = "")
  public List<ContentRating> getContentRatings() {
    return contentRatings;
  }

  public void setContentRatings(List<ContentRating> contentRatings) {
    this.contentRatings = contentRatings;
  }

  public SeriesExtendedRecord country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public SeriesExtendedRecord defaultSeasonType(Long defaultSeasonType) {
    this.defaultSeasonType = defaultSeasonType;
    return this;
  }

   /**
   * Get defaultSeasonType
   * @return defaultSeasonType
  **/
  @Schema(description = "")
  public Long getDefaultSeasonType() {
    return defaultSeasonType;
  }

  public void setDefaultSeasonType(Long defaultSeasonType) {
    this.defaultSeasonType = defaultSeasonType;
  }

  public SeriesExtendedRecord episodes(List<EpisodeBaseRecord> episodes) {
    this.episodes = episodes;
    return this;
  }

  public SeriesExtendedRecord addEpisodesItem(EpisodeBaseRecord episodesItem) {
    if (this.episodes == null) {
      this.episodes = new ArrayList<EpisodeBaseRecord>();
    }
    this.episodes.add(episodesItem);
    return this;
  }

   /**
   * Get episodes
   * @return episodes
  **/
  @Schema(description = "")
  public List<EpisodeBaseRecord> getEpisodes() {
    return episodes;
  }

  public void setEpisodes(List<EpisodeBaseRecord> episodes) {
    this.episodes = episodes;
  }

  public SeriesExtendedRecord firstAired(String firstAired) {
    this.firstAired = firstAired;
    return this;
  }

   /**
   * Get firstAired
   * @return firstAired
  **/
  @Schema(description = "")
  public String getFirstAired() {
    return firstAired;
  }

  public void setFirstAired(String firstAired) {
    this.firstAired = firstAired;
  }

  public SeriesExtendedRecord lists(List<ListBaseRecord> lists) {
    this.lists = lists;
    return this;
  }

  public SeriesExtendedRecord addListsItem(ListBaseRecord listsItem) {
    if (this.lists == null) {
      this.lists = new ArrayList<ListBaseRecord>();
    }
    this.lists.add(listsItem);
    return this;
  }

   /**
   * Get lists
   * @return lists
  **/
  @Schema(description = "")
  public List<ListBaseRecord> getLists() {
    return lists;
  }

  public void setLists(List<ListBaseRecord> lists) {
    this.lists = lists;
  }

  public SeriesExtendedRecord genres(List<GenreBaseRecord> genres) {
    this.genres = genres;
    return this;
  }

  public SeriesExtendedRecord addGenresItem(GenreBaseRecord genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<GenreBaseRecord>();
    }
    this.genres.add(genresItem);
    return this;
  }

   /**
   * Get genres
   * @return genres
  **/
  @Schema(description = "")
  public List<GenreBaseRecord> getGenres() {
    return genres;
  }

  public void setGenres(List<GenreBaseRecord> genres) {
    this.genres = genres;
  }

  public SeriesExtendedRecord id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SeriesExtendedRecord image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @Schema(description = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public SeriesExtendedRecord isOrderRandomized(Boolean isOrderRandomized) {
    this.isOrderRandomized = isOrderRandomized;
    return this;
  }

   /**
   * Get isOrderRandomized
   * @return isOrderRandomized
  **/
  @Schema(description = "")
  public Boolean isIsOrderRandomized() {
    return isOrderRandomized;
  }

  public void setIsOrderRandomized(Boolean isOrderRandomized) {
    this.isOrderRandomized = isOrderRandomized;
  }

  public SeriesExtendedRecord lastAired(String lastAired) {
    this.lastAired = lastAired;
    return this;
  }

   /**
   * Get lastAired
   * @return lastAired
  **/
  @Schema(description = "")
  public String getLastAired() {
    return lastAired;
  }

  public void setLastAired(String lastAired) {
    this.lastAired = lastAired;
  }

  public SeriesExtendedRecord lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @Schema(description = "")
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public SeriesExtendedRecord name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SeriesExtendedRecord nameTranslations(List<String> nameTranslations) {
    this.nameTranslations = nameTranslations;
    return this;
  }

  public SeriesExtendedRecord addNameTranslationsItem(String nameTranslationsItem) {
    if (this.nameTranslations == null) {
      this.nameTranslations = new ArrayList<String>();
    }
    this.nameTranslations.add(nameTranslationsItem);
    return this;
  }

   /**
   * Get nameTranslations
   * @return nameTranslations
  **/
  @Schema(description = "")
  public List<String> getNameTranslations() {
    return nameTranslations;
  }

  public void setNameTranslations(List<String> nameTranslations) {
    this.nameTranslations = nameTranslations;
  }

  public SeriesExtendedRecord companies(List<Company> companies) {
    this.companies = companies;
    return this;
  }

  public SeriesExtendedRecord addCompaniesItem(Company companiesItem) {
    if (this.companies == null) {
      this.companies = new ArrayList<Company>();
    }
    this.companies.add(companiesItem);
    return this;
  }

   /**
   * Get companies
   * @return companies
  **/
  @Schema(description = "")
  public List<Company> getCompanies() {
    return companies;
  }

  public void setCompanies(List<Company> companies) {
    this.companies = companies;
  }

  public SeriesExtendedRecord nextAired(String nextAired) {
    this.nextAired = nextAired;
    return this;
  }

   /**
   * Get nextAired
   * @return nextAired
  **/
  @Schema(description = "")
  public String getNextAired() {
    return nextAired;
  }

  public void setNextAired(String nextAired) {
    this.nextAired = nextAired;
  }

  public SeriesExtendedRecord originalCountry(String originalCountry) {
    this.originalCountry = originalCountry;
    return this;
  }

   /**
   * Get originalCountry
   * @return originalCountry
  **/
  @Schema(description = "")
  public String getOriginalCountry() {
    return originalCountry;
  }

  public void setOriginalCountry(String originalCountry) {
    this.originalCountry = originalCountry;
  }

  public SeriesExtendedRecord originalLanguage(String originalLanguage) {
    this.originalLanguage = originalLanguage;
    return this;
  }

   /**
   * Get originalLanguage
   * @return originalLanguage
  **/
  @Schema(description = "")
  public String getOriginalLanguage() {
    return originalLanguage;
  }

  public void setOriginalLanguage(String originalLanguage) {
    this.originalLanguage = originalLanguage;
  }

  public SeriesExtendedRecord originalNetwork(Company originalNetwork) {
    this.originalNetwork = originalNetwork;
    return this;
  }

   /**
   * Get originalNetwork
   * @return originalNetwork
  **/
  @Schema(description = "")
  public Company getOriginalNetwork() {
    return originalNetwork;
  }

  public void setOriginalNetwork(Company originalNetwork) {
    this.originalNetwork = originalNetwork;
  }

  public SeriesExtendedRecord overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @Schema(description = "")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public SeriesExtendedRecord latestNetwork(Company latestNetwork) {
    this.latestNetwork = latestNetwork;
    return this;
  }

   /**
   * Get latestNetwork
   * @return latestNetwork
  **/
  @Schema(description = "")
  public Company getLatestNetwork() {
    return latestNetwork;
  }

  public void setLatestNetwork(Company latestNetwork) {
    this.latestNetwork = latestNetwork;
  }

  public SeriesExtendedRecord overviewTranslations(List<String> overviewTranslations) {
    this.overviewTranslations = overviewTranslations;
    return this;
  }

  public SeriesExtendedRecord addOverviewTranslationsItem(String overviewTranslationsItem) {
    if (this.overviewTranslations == null) {
      this.overviewTranslations = new ArrayList<String>();
    }
    this.overviewTranslations.add(overviewTranslationsItem);
    return this;
  }

   /**
   * Get overviewTranslations
   * @return overviewTranslations
  **/
  @Schema(description = "")
  public List<String> getOverviewTranslations() {
    return overviewTranslations;
  }

  public void setOverviewTranslations(List<String> overviewTranslations) {
    this.overviewTranslations = overviewTranslations;
  }

  public SeriesExtendedRecord remoteIds(List<RemoteID> remoteIds) {
    this.remoteIds = remoteIds;
    return this;
  }

  public SeriesExtendedRecord addRemoteIdsItem(RemoteID remoteIdsItem) {
    if (this.remoteIds == null) {
      this.remoteIds = new ArrayList<RemoteID>();
    }
    this.remoteIds.add(remoteIdsItem);
    return this;
  }

   /**
   * Get remoteIds
   * @return remoteIds
  **/
  @Schema(description = "")
  public List<RemoteID> getRemoteIds() {
    return remoteIds;
  }

  public void setRemoteIds(List<RemoteID> remoteIds) {
    this.remoteIds = remoteIds;
  }

  public SeriesExtendedRecord score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @Schema(description = "")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public SeriesExtendedRecord seasons(List<SeasonBaseRecord> seasons) {
    this.seasons = seasons;
    return this;
  }

  public SeriesExtendedRecord addSeasonsItem(SeasonBaseRecord seasonsItem) {
    if (this.seasons == null) {
      this.seasons = new ArrayList<SeasonBaseRecord>();
    }
    this.seasons.add(seasonsItem);
    return this;
  }

   /**
   * Get seasons
   * @return seasons
  **/
  @Schema(description = "")
  public List<SeasonBaseRecord> getSeasons() {
    return seasons;
  }

  public void setSeasons(List<SeasonBaseRecord> seasons) {
    this.seasons = seasons;
  }

  public SeriesExtendedRecord seasonTypes(List<SeasonType> seasonTypes) {
    this.seasonTypes = seasonTypes;
    return this;
  }

  public SeriesExtendedRecord addSeasonTypesItem(SeasonType seasonTypesItem) {
    if (this.seasonTypes == null) {
      this.seasonTypes = new ArrayList<SeasonType>();
    }
    this.seasonTypes.add(seasonTypesItem);
    return this;
  }

   /**
   * Get seasonTypes
   * @return seasonTypes
  **/
  @Schema(description = "")
  public List<SeasonType> getSeasonTypes() {
    return seasonTypes;
  }

  public void setSeasonTypes(List<SeasonType> seasonTypes) {
    this.seasonTypes = seasonTypes;
  }

  public SeriesExtendedRecord slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @Schema(description = "")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public SeriesExtendedRecord status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public SeriesExtendedRecord tags(List<TagOption> tags) {
    this.tags = tags;
    return this;
  }

  public SeriesExtendedRecord addTagsItem(TagOption tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagOption>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<TagOption> getTags() {
    return tags;
  }

  public void setTags(List<TagOption> tags) {
    this.tags = tags;
  }

  public SeriesExtendedRecord trailers(List<Trailer> trailers) {
    this.trailers = trailers;
    return this;
  }

  public SeriesExtendedRecord addTrailersItem(Trailer trailersItem) {
    if (this.trailers == null) {
      this.trailers = new ArrayList<Trailer>();
    }
    this.trailers.add(trailersItem);
    return this;
  }

   /**
   * Get trailers
   * @return trailers
  **/
  @Schema(description = "")
  public List<Trailer> getTrailers() {
    return trailers;
  }

  public void setTrailers(List<Trailer> trailers) {
    this.trailers = trailers;
  }

  public SeriesExtendedRecord translations(TranslationExtended translations) {
    this.translations = translations;
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @Schema(description = "")
  public TranslationExtended getTranslations() {
    return translations;
  }

  public void setTranslations(TranslationExtended translations) {
    this.translations = translations;
  }

  public SeriesExtendedRecord year(String year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @Schema(description = "")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeriesExtendedRecord seriesExtendedRecord = (SeriesExtendedRecord) o;
    return Objects.equals(this.abbreviation, seriesExtendedRecord.abbreviation) &&
        Objects.equals(this.airsDays, seriesExtendedRecord.airsDays) &&
        Objects.equals(this.airsTime, seriesExtendedRecord.airsTime) &&
        Objects.equals(this.aliases, seriesExtendedRecord.aliases) &&
        Objects.equals(this.artworks, seriesExtendedRecord.artworks) &&
        Objects.equals(this.averageRuntime, seriesExtendedRecord.averageRuntime) &&
        Objects.equals(this.characters, seriesExtendedRecord.characters) &&
        Objects.equals(this.contentRatings, seriesExtendedRecord.contentRatings) &&
        Objects.equals(this.country, seriesExtendedRecord.country) &&
        Objects.equals(this.defaultSeasonType, seriesExtendedRecord.defaultSeasonType) &&
        Objects.equals(this.episodes, seriesExtendedRecord.episodes) &&
        Objects.equals(this.firstAired, seriesExtendedRecord.firstAired) &&
        Objects.equals(this.lists, seriesExtendedRecord.lists) &&
        Objects.equals(this.genres, seriesExtendedRecord.genres) &&
        Objects.equals(this.id, seriesExtendedRecord.id) &&
        Objects.equals(this.image, seriesExtendedRecord.image) &&
        Objects.equals(this.isOrderRandomized, seriesExtendedRecord.isOrderRandomized) &&
        Objects.equals(this.lastAired, seriesExtendedRecord.lastAired) &&
        Objects.equals(this.lastUpdated, seriesExtendedRecord.lastUpdated) &&
        Objects.equals(this.name, seriesExtendedRecord.name) &&
        Objects.equals(this.nameTranslations, seriesExtendedRecord.nameTranslations) &&
        Objects.equals(this.companies, seriesExtendedRecord.companies) &&
        Objects.equals(this.nextAired, seriesExtendedRecord.nextAired) &&
        Objects.equals(this.originalCountry, seriesExtendedRecord.originalCountry) &&
        Objects.equals(this.originalLanguage, seriesExtendedRecord.originalLanguage) &&
        Objects.equals(this.originalNetwork, seriesExtendedRecord.originalNetwork) &&
        Objects.equals(this.overview, seriesExtendedRecord.overview) &&
        Objects.equals(this.latestNetwork, seriesExtendedRecord.latestNetwork) &&
        Objects.equals(this.overviewTranslations, seriesExtendedRecord.overviewTranslations) &&
        Objects.equals(this.remoteIds, seriesExtendedRecord.remoteIds) &&
        Objects.equals(this.score, seriesExtendedRecord.score) &&
        Objects.equals(this.seasons, seriesExtendedRecord.seasons) &&
        Objects.equals(this.seasonTypes, seriesExtendedRecord.seasonTypes) &&
        Objects.equals(this.slug, seriesExtendedRecord.slug) &&
        Objects.equals(this.status, seriesExtendedRecord.status) &&
        Objects.equals(this.tags, seriesExtendedRecord.tags) &&
        Objects.equals(this.trailers, seriesExtendedRecord.trailers) &&
        Objects.equals(this.translations, seriesExtendedRecord.translations) &&
        Objects.equals(this.year, seriesExtendedRecord.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, airsDays, airsTime, aliases, artworks, averageRuntime, characters, contentRatings, country, defaultSeasonType, episodes, firstAired, lists, genres, id, image, isOrderRandomized, lastAired, lastUpdated, name, nameTranslations, companies, nextAired, originalCountry, originalLanguage, originalNetwork, overview, latestNetwork, overviewTranslations, remoteIds, score, seasons, seasonTypes, slug, status, tags, trailers, translations, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesExtendedRecord {\n");
    
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    airsDays: ").append(toIndentedString(airsDays)).append("\n");
    sb.append("    airsTime: ").append(toIndentedString(airsTime)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    artworks: ").append(toIndentedString(artworks)).append("\n");
    sb.append("    averageRuntime: ").append(toIndentedString(averageRuntime)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    contentRatings: ").append(toIndentedString(contentRatings)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    defaultSeasonType: ").append(toIndentedString(defaultSeasonType)).append("\n");
    sb.append("    episodes: ").append(toIndentedString(episodes)).append("\n");
    sb.append("    firstAired: ").append(toIndentedString(firstAired)).append("\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    isOrderRandomized: ").append(toIndentedString(isOrderRandomized)).append("\n");
    sb.append("    lastAired: ").append(toIndentedString(lastAired)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameTranslations: ").append(toIndentedString(nameTranslations)).append("\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
    sb.append("    nextAired: ").append(toIndentedString(nextAired)).append("\n");
    sb.append("    originalCountry: ").append(toIndentedString(originalCountry)).append("\n");
    sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
    sb.append("    originalNetwork: ").append(toIndentedString(originalNetwork)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    latestNetwork: ").append(toIndentedString(latestNetwork)).append("\n");
    sb.append("    overviewTranslations: ").append(toIndentedString(overviewTranslations)).append("\n");
    sb.append("    remoteIds: ").append(toIndentedString(remoteIds)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    seasons: ").append(toIndentedString(seasons)).append("\n");
    sb.append("    seasonTypes: ").append(toIndentedString(seasonTypes)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    trailers: ").append(toIndentedString(trailers)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

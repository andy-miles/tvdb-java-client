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
import com.amilesend.tvdb.client.model.RecordInfo;
import com.amilesend.tvdb.client.model.TagOption;
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
 * character record
 */
@Schema(description = "character record")


public class Character {
  @SerializedName("aliases")
  private List<Alias> aliases = null;

  @SerializedName("episode")
  private RecordInfo episode = null;

  @SerializedName("episodeId")
  private Integer episodeId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("isFeatured")
  private Boolean isFeatured = null;

  @SerializedName("movieId")
  private Integer movieId = null;

  @SerializedName("movie")
  private RecordInfo movie = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameTranslations")
  private List<String> nameTranslations = null;

  @SerializedName("overviewTranslations")
  private List<String> overviewTranslations = null;

  @SerializedName("peopleId")
  private Integer peopleId = null;

  @SerializedName("personImgURL")
  private String personImgURL = null;

  @SerializedName("peopleType")
  private String peopleType = null;

  @SerializedName("seriesId")
  private Integer seriesId = null;

  @SerializedName("series")
  private RecordInfo series = null;

  @SerializedName("sort")
  private Long sort = null;

  @SerializedName("tagOptions")
  private List<TagOption> tagOptions = null;

  @SerializedName("type")
  private Long type = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("personName")
  private String personName = null;

  public Character aliases(List<Alias> aliases) {
    this.aliases = aliases;
    return this;
  }

  public Character addAliasesItem(Alias aliasesItem) {
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

  public Character episode(RecordInfo episode) {
    this.episode = episode;
    return this;
  }

   /**
   * Get episode
   * @return episode
  **/
  @Schema(description = "")
  public RecordInfo getEpisode() {
    return episode;
  }

  public void setEpisode(RecordInfo episode) {
    this.episode = episode;
  }

  public Character episodeId(Integer episodeId) {
    this.episodeId = episodeId;
    return this;
  }

   /**
   * Get episodeId
   * @return episodeId
  **/
  @Schema(description = "")
  public Integer getEpisodeId() {
    return episodeId;
  }

  public void setEpisodeId(Integer episodeId) {
    this.episodeId = episodeId;
  }

  public Character id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Character image(String image) {
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

  public Character isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

   /**
   * Get isFeatured
   * @return isFeatured
  **/
  @Schema(description = "")
  public Boolean isIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public Character movieId(Integer movieId) {
    this.movieId = movieId;
    return this;
  }

   /**
   * Get movieId
   * @return movieId
  **/
  @Schema(description = "")
  public Integer getMovieId() {
    return movieId;
  }

  public void setMovieId(Integer movieId) {
    this.movieId = movieId;
  }

  public Character movie(RecordInfo movie) {
    this.movie = movie;
    return this;
  }

   /**
   * Get movie
   * @return movie
  **/
  @Schema(description = "")
  public RecordInfo getMovie() {
    return movie;
  }

  public void setMovie(RecordInfo movie) {
    this.movie = movie;
  }

  public Character name(String name) {
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

  public Character nameTranslations(List<String> nameTranslations) {
    this.nameTranslations = nameTranslations;
    return this;
  }

  public Character addNameTranslationsItem(String nameTranslationsItem) {
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

  public Character overviewTranslations(List<String> overviewTranslations) {
    this.overviewTranslations = overviewTranslations;
    return this;
  }

  public Character addOverviewTranslationsItem(String overviewTranslationsItem) {
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

  public Character peopleId(Integer peopleId) {
    this.peopleId = peopleId;
    return this;
  }

   /**
   * Get peopleId
   * @return peopleId
  **/
  @Schema(description = "")
  public Integer getPeopleId() {
    return peopleId;
  }

  public void setPeopleId(Integer peopleId) {
    this.peopleId = peopleId;
  }

  public Character personImgURL(String personImgURL) {
    this.personImgURL = personImgURL;
    return this;
  }

   /**
   * Get personImgURL
   * @return personImgURL
  **/
  @Schema(description = "")
  public String getPersonImgURL() {
    return personImgURL;
  }

  public void setPersonImgURL(String personImgURL) {
    this.personImgURL = personImgURL;
  }

  public Character peopleType(String peopleType) {
    this.peopleType = peopleType;
    return this;
  }

   /**
   * Get peopleType
   * @return peopleType
  **/
  @Schema(description = "")
  public String getPeopleType() {
    return peopleType;
  }

  public void setPeopleType(String peopleType) {
    this.peopleType = peopleType;
  }

  public Character seriesId(Integer seriesId) {
    this.seriesId = seriesId;
    return this;
  }

   /**
   * Get seriesId
   * @return seriesId
  **/
  @Schema(description = "")
  public Integer getSeriesId() {
    return seriesId;
  }

  public void setSeriesId(Integer seriesId) {
    this.seriesId = seriesId;
  }

  public Character series(RecordInfo series) {
    this.series = series;
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @Schema(description = "")
  public RecordInfo getSeries() {
    return series;
  }

  public void setSeries(RecordInfo series) {
    this.series = series;
  }

  public Character sort(Long sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @Schema(description = "")
  public Long getSort() {
    return sort;
  }

  public void setSort(Long sort) {
    this.sort = sort;
  }

  public Character tagOptions(List<TagOption> tagOptions) {
    this.tagOptions = tagOptions;
    return this;
  }

  public Character addTagOptionsItem(TagOption tagOptionsItem) {
    if (this.tagOptions == null) {
      this.tagOptions = new ArrayList<TagOption>();
    }
    this.tagOptions.add(tagOptionsItem);
    return this;
  }

   /**
   * Get tagOptions
   * @return tagOptions
  **/
  @Schema(description = "")
  public List<TagOption> getTagOptions() {
    return tagOptions;
  }

  public void setTagOptions(List<TagOption> tagOptions) {
    this.tagOptions = tagOptions;
  }

  public Character type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public Character url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Character personName(String personName) {
    this.personName = personName;
    return this;
  }

   /**
   * Get personName
   * @return personName
  **/
  @Schema(description = "")
  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Character character = (Character) o;
    return Objects.equals(this.aliases, character.aliases) &&
        Objects.equals(this.episode, character.episode) &&
        Objects.equals(this.episodeId, character.episodeId) &&
        Objects.equals(this.id, character.id) &&
        Objects.equals(this.image, character.image) &&
        Objects.equals(this.isFeatured, character.isFeatured) &&
        Objects.equals(this.movieId, character.movieId) &&
        Objects.equals(this.movie, character.movie) &&
        Objects.equals(this.name, character.name) &&
        Objects.equals(this.nameTranslations, character.nameTranslations) &&
        Objects.equals(this.overviewTranslations, character.overviewTranslations) &&
        Objects.equals(this.peopleId, character.peopleId) &&
        Objects.equals(this.personImgURL, character.personImgURL) &&
        Objects.equals(this.peopleType, character.peopleType) &&
        Objects.equals(this.seriesId, character.seriesId) &&
        Objects.equals(this.series, character.series) &&
        Objects.equals(this.sort, character.sort) &&
        Objects.equals(this.tagOptions, character.tagOptions) &&
        Objects.equals(this.type, character.type) &&
        Objects.equals(this.url, character.url) &&
        Objects.equals(this.personName, character.personName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, episode, episodeId, id, image, isFeatured, movieId, movie, name, nameTranslations, overviewTranslations, peopleId, personImgURL, peopleType, seriesId, series, sort, tagOptions, type, url, personName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Character {\n");
    
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    episode: ").append(toIndentedString(episode)).append("\n");
    sb.append("    episodeId: ").append(toIndentedString(episodeId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    movieId: ").append(toIndentedString(movieId)).append("\n");
    sb.append("    movie: ").append(toIndentedString(movie)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameTranslations: ").append(toIndentedString(nameTranslations)).append("\n");
    sb.append("    overviewTranslations: ").append(toIndentedString(overviewTranslations)).append("\n");
    sb.append("    peopleId: ").append(toIndentedString(peopleId)).append("\n");
    sb.append("    personImgURL: ").append(toIndentedString(personImgURL)).append("\n");
    sb.append("    peopleType: ").append(toIndentedString(peopleType)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    tagOptions: ").append(toIndentedString(tagOptions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
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

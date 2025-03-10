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
import com.amilesend.tvdb.client.model.Entity;
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
 * extended list record
 */
@Schema(description = "extended list record")


public class ListExtendedRecord {
  @SerializedName("aliases")
  private List<Alias> aliases = null;

  @SerializedName("entities")
  private List<Entity> entities = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("imageIsFallback")
  private Boolean imageIsFallback = null;

  @SerializedName("isOfficial")
  private Boolean isOfficial = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameTranslations")
  private List<String> nameTranslations = null;

  @SerializedName("overview")
  private String overview = null;

  @SerializedName("overviewTranslations")
  private List<String> overviewTranslations = null;

  @SerializedName("score")
  private Long score = null;

  @SerializedName("url")
  private String url = null;

  public ListExtendedRecord aliases(List<Alias> aliases) {
    this.aliases = aliases;
    return this;
  }

  public ListExtendedRecord addAliasesItem(Alias aliasesItem) {
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

  public ListExtendedRecord entities(List<Entity> entities) {
    this.entities = entities;
    return this;
  }

  public ListExtendedRecord addEntitiesItem(Entity entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<Entity>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @Schema(description = "")
  public List<Entity> getEntities() {
    return entities;
  }

  public void setEntities(List<Entity> entities) {
    this.entities = entities;
  }

  public ListExtendedRecord id(Long id) {
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

  public ListExtendedRecord image(String image) {
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

  public ListExtendedRecord imageIsFallback(Boolean imageIsFallback) {
    this.imageIsFallback = imageIsFallback;
    return this;
  }

   /**
   * Get imageIsFallback
   * @return imageIsFallback
  **/
  @Schema(description = "")
  public Boolean isImageIsFallback() {
    return imageIsFallback;
  }

  public void setImageIsFallback(Boolean imageIsFallback) {
    this.imageIsFallback = imageIsFallback;
  }

  public ListExtendedRecord isOfficial(Boolean isOfficial) {
    this.isOfficial = isOfficial;
    return this;
  }

   /**
   * Get isOfficial
   * @return isOfficial
  **/
  @Schema(description = "")
  public Boolean isIsOfficial() {
    return isOfficial;
  }

  public void setIsOfficial(Boolean isOfficial) {
    this.isOfficial = isOfficial;
  }

  public ListExtendedRecord name(String name) {
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

  public ListExtendedRecord nameTranslations(List<String> nameTranslations) {
    this.nameTranslations = nameTranslations;
    return this;
  }

  public ListExtendedRecord addNameTranslationsItem(String nameTranslationsItem) {
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

  public ListExtendedRecord overview(String overview) {
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

  public ListExtendedRecord overviewTranslations(List<String> overviewTranslations) {
    this.overviewTranslations = overviewTranslations;
    return this;
  }

  public ListExtendedRecord addOverviewTranslationsItem(String overviewTranslationsItem) {
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

  public ListExtendedRecord score(Long score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @Schema(description = "")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public ListExtendedRecord url(String url) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListExtendedRecord listExtendedRecord = (ListExtendedRecord) o;
    return Objects.equals(this.aliases, listExtendedRecord.aliases) &&
        Objects.equals(this.entities, listExtendedRecord.entities) &&
        Objects.equals(this.id, listExtendedRecord.id) &&
        Objects.equals(this.image, listExtendedRecord.image) &&
        Objects.equals(this.imageIsFallback, listExtendedRecord.imageIsFallback) &&
        Objects.equals(this.isOfficial, listExtendedRecord.isOfficial) &&
        Objects.equals(this.name, listExtendedRecord.name) &&
        Objects.equals(this.nameTranslations, listExtendedRecord.nameTranslations) &&
        Objects.equals(this.overview, listExtendedRecord.overview) &&
        Objects.equals(this.overviewTranslations, listExtendedRecord.overviewTranslations) &&
        Objects.equals(this.score, listExtendedRecord.score) &&
        Objects.equals(this.url, listExtendedRecord.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, entities, id, image, imageIsFallback, isOfficial, name, nameTranslations, overview, overviewTranslations, score, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListExtendedRecord {\n");
    
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageIsFallback: ").append(toIndentedString(imageIsFallback)).append("\n");
    sb.append("    isOfficial: ").append(toIndentedString(isOfficial)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameTranslations: ").append(toIndentedString(nameTranslations)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    overviewTranslations: ").append(toIndentedString(overviewTranslations)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

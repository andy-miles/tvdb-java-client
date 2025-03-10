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
import com.amilesend.tvdb.client.model.Companies;
import com.amilesend.tvdb.client.model.SeasonType;
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
 * season genre record
 */
@Schema(description = "season genre record")


public class SeasonBaseRecord {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("imageType")
  private Integer imageType = null;

  @SerializedName("lastUpdated")
  private String lastUpdated = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameTranslations")
  private List<String> nameTranslations = null;

  @SerializedName("number")
  private Long number = null;

  @SerializedName("overviewTranslations")
  private List<String> overviewTranslations = null;

  @SerializedName("companies")
  private Companies companies = null;

  @SerializedName("seriesId")
  private Long seriesId = null;

  @SerializedName("type")
  private SeasonType type = null;

  @SerializedName("year")
  private String year = null;

  public SeasonBaseRecord id(Integer id) {
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

  public SeasonBaseRecord image(String image) {
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

  public SeasonBaseRecord imageType(Integer imageType) {
    this.imageType = imageType;
    return this;
  }

   /**
   * Get imageType
   * @return imageType
  **/
  @Schema(description = "")
  public Integer getImageType() {
    return imageType;
  }

  public void setImageType(Integer imageType) {
    this.imageType = imageType;
  }

  public SeasonBaseRecord lastUpdated(String lastUpdated) {
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

  public SeasonBaseRecord name(String name) {
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

  public SeasonBaseRecord nameTranslations(List<String> nameTranslations) {
    this.nameTranslations = nameTranslations;
    return this;
  }

  public SeasonBaseRecord addNameTranslationsItem(String nameTranslationsItem) {
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

  public SeasonBaseRecord number(Long number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @Schema(description = "")
  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public SeasonBaseRecord overviewTranslations(List<String> overviewTranslations) {
    this.overviewTranslations = overviewTranslations;
    return this;
  }

  public SeasonBaseRecord addOverviewTranslationsItem(String overviewTranslationsItem) {
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

  public SeasonBaseRecord companies(Companies companies) {
    this.companies = companies;
    return this;
  }

   /**
   * Get companies
   * @return companies
  **/
  @Schema(description = "")
  public Companies getCompanies() {
    return companies;
  }

  public void setCompanies(Companies companies) {
    this.companies = companies;
  }

  public SeasonBaseRecord seriesId(Long seriesId) {
    this.seriesId = seriesId;
    return this;
  }

   /**
   * Get seriesId
   * @return seriesId
  **/
  @Schema(description = "")
  public Long getSeriesId() {
    return seriesId;
  }

  public void setSeriesId(Long seriesId) {
    this.seriesId = seriesId;
  }

  public SeasonBaseRecord type(SeasonType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public SeasonType getType() {
    return type;
  }

  public void setType(SeasonType type) {
    this.type = type;
  }

  public SeasonBaseRecord year(String year) {
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
    SeasonBaseRecord seasonBaseRecord = (SeasonBaseRecord) o;
    return Objects.equals(this.id, seasonBaseRecord.id) &&
        Objects.equals(this.image, seasonBaseRecord.image) &&
        Objects.equals(this.imageType, seasonBaseRecord.imageType) &&
        Objects.equals(this.lastUpdated, seasonBaseRecord.lastUpdated) &&
        Objects.equals(this.name, seasonBaseRecord.name) &&
        Objects.equals(this.nameTranslations, seasonBaseRecord.nameTranslations) &&
        Objects.equals(this.number, seasonBaseRecord.number) &&
        Objects.equals(this.overviewTranslations, seasonBaseRecord.overviewTranslations) &&
        Objects.equals(this.companies, seasonBaseRecord.companies) &&
        Objects.equals(this.seriesId, seasonBaseRecord.seriesId) &&
        Objects.equals(this.type, seasonBaseRecord.type) &&
        Objects.equals(this.year, seasonBaseRecord.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, image, imageType, lastUpdated, name, nameTranslations, number, overviewTranslations, companies, seriesId, type, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeasonBaseRecord {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameTranslations: ").append(toIndentedString(nameTranslations)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    overviewTranslations: ").append(toIndentedString(overviewTranslations)).append("\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

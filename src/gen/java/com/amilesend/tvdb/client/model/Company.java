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
import com.amilesend.tvdb.client.model.ParentCompany;
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
 * A company record
 */
@Schema(description = "A company record")


public class Company {
  @SerializedName("activeDate")
  private String activeDate = null;

  @SerializedName("aliases")
  private List<Alias> aliases = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("inactiveDate")
  private String inactiveDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameTranslations")
  private List<String> nameTranslations = null;

  @SerializedName("overviewTranslations")
  private List<String> overviewTranslations = null;

  @SerializedName("primaryCompanyType")
  private Long primaryCompanyType = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("parentCompany")
  private ParentCompany parentCompany = null;

  @SerializedName("tagOptions")
  private List<TagOption> tagOptions = null;

  public Company activeDate(String activeDate) {
    this.activeDate = activeDate;
    return this;
  }

   /**
   * Get activeDate
   * @return activeDate
  **/
  @Schema(description = "")
  public String getActiveDate() {
    return activeDate;
  }

  public void setActiveDate(String activeDate) {
    this.activeDate = activeDate;
  }

  public Company aliases(List<Alias> aliases) {
    this.aliases = aliases;
    return this;
  }

  public Company addAliasesItem(Alias aliasesItem) {
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

  public Company country(String country) {
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

  public Company id(Long id) {
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

  public Company inactiveDate(String inactiveDate) {
    this.inactiveDate = inactiveDate;
    return this;
  }

   /**
   * Get inactiveDate
   * @return inactiveDate
  **/
  @Schema(description = "")
  public String getInactiveDate() {
    return inactiveDate;
  }

  public void setInactiveDate(String inactiveDate) {
    this.inactiveDate = inactiveDate;
  }

  public Company name(String name) {
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

  public Company nameTranslations(List<String> nameTranslations) {
    this.nameTranslations = nameTranslations;
    return this;
  }

  public Company addNameTranslationsItem(String nameTranslationsItem) {
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

  public Company overviewTranslations(List<String> overviewTranslations) {
    this.overviewTranslations = overviewTranslations;
    return this;
  }

  public Company addOverviewTranslationsItem(String overviewTranslationsItem) {
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

  public Company primaryCompanyType(Long primaryCompanyType) {
    this.primaryCompanyType = primaryCompanyType;
    return this;
  }

   /**
   * Get primaryCompanyType
   * @return primaryCompanyType
  **/
  @Schema(description = "")
  public Long getPrimaryCompanyType() {
    return primaryCompanyType;
  }

  public void setPrimaryCompanyType(Long primaryCompanyType) {
    this.primaryCompanyType = primaryCompanyType;
  }

  public Company slug(String slug) {
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

  public Company parentCompany(ParentCompany parentCompany) {
    this.parentCompany = parentCompany;
    return this;
  }

   /**
   * Get parentCompany
   * @return parentCompany
  **/
  @Schema(description = "")
  public ParentCompany getParentCompany() {
    return parentCompany;
  }

  public void setParentCompany(ParentCompany parentCompany) {
    this.parentCompany = parentCompany;
  }

  public Company tagOptions(List<TagOption> tagOptions) {
    this.tagOptions = tagOptions;
    return this;
  }

  public Company addTagOptionsItem(TagOption tagOptionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.activeDate, company.activeDate) &&
        Objects.equals(this.aliases, company.aliases) &&
        Objects.equals(this.country, company.country) &&
        Objects.equals(this.id, company.id) &&
        Objects.equals(this.inactiveDate, company.inactiveDate) &&
        Objects.equals(this.name, company.name) &&
        Objects.equals(this.nameTranslations, company.nameTranslations) &&
        Objects.equals(this.overviewTranslations, company.overviewTranslations) &&
        Objects.equals(this.primaryCompanyType, company.primaryCompanyType) &&
        Objects.equals(this.slug, company.slug) &&
        Objects.equals(this.parentCompany, company.parentCompany) &&
        Objects.equals(this.tagOptions, company.tagOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDate, aliases, country, id, inactiveDate, name, nameTranslations, overviewTranslations, primaryCompanyType, slug, parentCompany, tagOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    activeDate: ").append(toIndentedString(activeDate)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inactiveDate: ").append(toIndentedString(inactiveDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameTranslations: ").append(toIndentedString(nameTranslations)).append("\n");
    sb.append("    overviewTranslations: ").append(toIndentedString(overviewTranslations)).append("\n");
    sb.append("    primaryCompanyType: ").append(toIndentedString(primaryCompanyType)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    parentCompany: ").append(toIndentedString(parentCompany)).append("\n");
    sb.append("    tagOptions: ").append(toIndentedString(tagOptions)).append("\n");
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

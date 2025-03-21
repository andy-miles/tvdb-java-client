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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Links for next, previous and current record
 */
@Schema(description = "Links for next, previous and current record")


public class Links {
  @SerializedName("prev")
  private String prev = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("next")
  private String next = null;

  @SerializedName("total_items")
  private Integer totalItems = null;

  @SerializedName("page_size")
  private Integer pageSize = null;

  public Links prev(String prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @Schema(description = "")
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public Links self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @Schema(description = "")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public Links next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @Schema(description = "")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public Links totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Get totalItems
   * @return totalItems
  **/
  @Schema(description = "")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public Links pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.prev, links.prev) &&
        Objects.equals(this.self, links.self) &&
        Objects.equals(this.next, links.next) &&
        Objects.equals(this.totalItems, links.totalItems) &&
        Objects.equals(this.pageSize, links.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prev, self, next, totalItems, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

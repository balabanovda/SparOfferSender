/*
 * Loymax.SystemApi
 * Loymax version: 2020.1.1.55071
 *
 * OpenAPI spec version: V1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.example.demo.restclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Фильтр для брендов.
 */
@ApiModel(description = "Фильтр для брендов.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class BrandFilter {
  /**
   * Определяет, возвращать ли объекты с состоянием hidden.
   */
  public enum StateEnum {
    NORMAL("Normal"),
    
    HIDDEN("Hidden");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("from")
  private Integer from = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("substring")
  private String substring = null;

  @JsonProperty("sortingIds")
  private List<Integer> sortingIds = null;

  public BrandFilter state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Определяет, возвращать ли объекты с состоянием hidden.
   * @return state
  **/
  @ApiModelProperty(value = "Определяет, возвращать ли объекты с состоянием hidden.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public BrandFilter from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * Начало выборки.
   * @return from
  **/
  @ApiModelProperty(value = "Начало выборки.")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public BrandFilter count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Количество.
   * @return count
  **/
  @ApiModelProperty(value = "Количество.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public BrandFilter substring(String substring) {
    this.substring = substring;
    return this;
  }

   /**
   * Подстрока для поиска.
   * @return substring
  **/
  @ApiModelProperty(value = "Подстрока для поиска.")
  public String getSubstring() {
    return substring;
  }

  public void setSubstring(String substring) {
    this.substring = substring;
  }

  public BrandFilter sortingIds(List<Integer> sortingIds) {
    this.sortingIds = sortingIds;
    return this;
  }

  public BrandFilter addSortingIdsItem(Integer sortingIdsItem) {
    if (this.sortingIds == null) {
      this.sortingIds = new ArrayList<>();
    }
    this.sortingIds.add(sortingIdsItem);
    return this;
  }

   /**
   * Идентификаторы брендов, которые будут выбираться первыми.
   * @return sortingIds
  **/
  @ApiModelProperty(value = "Идентификаторы брендов, которые будут выбираться первыми.")
  public List<Integer> getSortingIds() {
    return sortingIds;
  }

  public void setSortingIds(List<Integer> sortingIds) {
    this.sortingIds = sortingIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandFilter brandFilter = (BrandFilter) o;
    return Objects.equals(this.state, brandFilter.state) &&
        Objects.equals(this.from, brandFilter.from) &&
        Objects.equals(this.count, brandFilter.count) &&
        Objects.equals(this.substring, brandFilter.substring) &&
        Objects.equals(this.sortingIds, brandFilter.sortingIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, from, count, substring, sortingIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandFilter {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    substring: ").append(toIndentedString(substring)).append("\n");
    sb.append("    sortingIds: ").append(toIndentedString(sortingIds)).append("\n");
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


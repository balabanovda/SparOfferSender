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
 * Фильтр для партнеров.
 */
@ApiModel(description = "Фильтр для партнеров.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PartnerFilter {
  @JsonProperty("from")
  private Integer from = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("permission")
  private String permission = null;

  @JsonProperty("orderByDesc")
  private Boolean orderByDesc = null;

  @JsonProperty("sortingIds")
  private List<Integer> sortingIds = null;

  @JsonProperty("loyaltyPrograms")
  private List<Integer> loyaltyPrograms = null;

  public PartnerFilter from(Integer from) {
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

  public PartnerFilter count(Integer count) {
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

  public PartnerFilter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Подстрока для поиска по имени.
   * @return name
  **/
  @ApiModelProperty(value = "Подстрока для поиска по имени.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartnerFilter permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Выбираются партнеры, на которые текущий пользователь имеет указанное право.
   * @return permission
  **/
  @ApiModelProperty(value = "Выбираются партнеры, на которые текущий пользователь имеет указанное право.")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public PartnerFilter orderByDesc(Boolean orderByDesc) {
    this.orderByDesc = orderByDesc;
    return this;
  }

   /**
   * Сортировать в обратном порядке.
   * @return orderByDesc
  **/
  @ApiModelProperty(value = "Сортировать в обратном порядке.")
  public Boolean isOrderByDesc() {
    return orderByDesc;
  }

  public void setOrderByDesc(Boolean orderByDesc) {
    this.orderByDesc = orderByDesc;
  }

  public PartnerFilter sortingIds(List<Integer> sortingIds) {
    this.sortingIds = sortingIds;
    return this;
  }

  public PartnerFilter addSortingIdsItem(Integer sortingIdsItem) {
    if (this.sortingIds == null) {
      this.sortingIds = new ArrayList<>();
    }
    this.sortingIds.add(sortingIdsItem);
    return this;
  }

   /**
   * Список идентификаторов для первоочередного выбора.
   * @return sortingIds
  **/
  @ApiModelProperty(value = "Список идентификаторов для первоочередного выбора.")
  public List<Integer> getSortingIds() {
    return sortingIds;
  }

  public void setSortingIds(List<Integer> sortingIds) {
    this.sortingIds = sortingIds;
  }

  public PartnerFilter loyaltyPrograms(List<Integer> loyaltyPrograms) {
    this.loyaltyPrograms = loyaltyPrograms;
    return this;
  }

  public PartnerFilter addLoyaltyProgramsItem(Integer loyaltyProgramsItem) {
    if (this.loyaltyPrograms == null) {
      this.loyaltyPrograms = new ArrayList<>();
    }
    this.loyaltyPrograms.add(loyaltyProgramsItem);
    return this;
  }

   /**
   * Список ПЛ для фильтра по ПЛ.
   * @return loyaltyPrograms
  **/
  @ApiModelProperty(value = "Список ПЛ для фильтра по ПЛ.")
  public List<Integer> getLoyaltyPrograms() {
    return loyaltyPrograms;
  }

  public void setLoyaltyPrograms(List<Integer> loyaltyPrograms) {
    this.loyaltyPrograms = loyaltyPrograms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerFilter partnerFilter = (PartnerFilter) o;
    return Objects.equals(this.from, partnerFilter.from) &&
        Objects.equals(this.count, partnerFilter.count) &&
        Objects.equals(this.name, partnerFilter.name) &&
        Objects.equals(this.permission, partnerFilter.permission) &&
        Objects.equals(this.orderByDesc, partnerFilter.orderByDesc) &&
        Objects.equals(this.sortingIds, partnerFilter.sortingIds) &&
        Objects.equals(this.loyaltyPrograms, partnerFilter.loyaltyPrograms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, count, name, permission, orderByDesc, sortingIds, loyaltyPrograms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerFilter {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    orderByDesc: ").append(toIndentedString(orderByDesc)).append("\n");
    sb.append("    sortingIds: ").append(toIndentedString(sortingIds)).append("\n");
    sb.append("    loyaltyPrograms: ").append(toIndentedString(loyaltyPrograms)).append("\n");
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


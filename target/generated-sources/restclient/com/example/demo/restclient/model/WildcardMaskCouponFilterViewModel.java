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
import com.example.demo.restclient.model.FilterViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Фильтр купонов по маске.
 */
@ApiModel(description = "Фильтр купонов по маске.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class WildcardMaskCouponFilterViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isDeletedFilterType")
  private Boolean isDeletedFilterType = null;

  @JsonProperty("wildcardMask")
  private String wildcardMask = null;

  public WildcardMaskCouponFilterViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public WildcardMaskCouponFilterViewModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WildcardMaskCouponFilterViewModel isDeletedFilterType(Boolean isDeletedFilterType) {
    this.isDeletedFilterType = isDeletedFilterType;
    return this;
  }

   /**
   * Get isDeletedFilterType
   * @return isDeletedFilterType
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDeletedFilterType() {
    return isDeletedFilterType;
  }

  public void setIsDeletedFilterType(Boolean isDeletedFilterType) {
    this.isDeletedFilterType = isDeletedFilterType;
  }

  public WildcardMaskCouponFilterViewModel wildcardMask(String wildcardMask) {
    this.wildcardMask = wildcardMask;
    return this;
  }

   /**
   * Маска номера купона.
   * @return wildcardMask
  **/
  @ApiModelProperty(value = "Маска номера купона.")
  public String getWildcardMask() {
    return wildcardMask;
  }

  public void setWildcardMask(String wildcardMask) {
    this.wildcardMask = wildcardMask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WildcardMaskCouponFilterViewModel wildcardMaskCouponFilterViewModel = (WildcardMaskCouponFilterViewModel) o;
    return Objects.equals(this.id, wildcardMaskCouponFilterViewModel.id) &&
        Objects.equals(this.name, wildcardMaskCouponFilterViewModel.name) &&
        Objects.equals(this.isDeletedFilterType, wildcardMaskCouponFilterViewModel.isDeletedFilterType) &&
        Objects.equals(this.wildcardMask, wildcardMaskCouponFilterViewModel.wildcardMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isDeletedFilterType, wildcardMask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WildcardMaskCouponFilterViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeletedFilterType: ").append(toIndentedString(isDeletedFilterType)).append("\n");
    sb.append("    wildcardMask: ").append(toIndentedString(wildcardMask)).append("\n");
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


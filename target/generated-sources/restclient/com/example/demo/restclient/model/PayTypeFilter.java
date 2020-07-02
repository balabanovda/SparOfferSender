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

/**
 * Фильтр для типов оплаты.
 */
@ApiModel(description = "Фильтр для типов оплаты.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PayTypeFilter {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("from")
  private Integer from = null;

  public PayTypeFilter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название типа оплаты.
   * @return name
  **/
  @ApiModelProperty(value = "Название типа оплаты.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PayTypeFilter count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Количество элементов в выборке.
   * @return count
  **/
  @ApiModelProperty(value = "Количество элементов в выборке.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PayTypeFilter from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * С какого элемента начать выборку.
   * @return from
  **/
  @ApiModelProperty(value = "С какого элемента начать выборку.")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayTypeFilter payTypeFilter = (PayTypeFilter) o;
    return Objects.equals(this.name, payTypeFilter.name) &&
        Objects.equals(this.count, payTypeFilter.count) &&
        Objects.equals(this.from, payTypeFilter.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, count, from);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayTypeFilter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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


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
import com.example.demo.restclient.model.FilterDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Фильтр \&quot;День рождения\&quot;.
 */
@ApiModel(description = "Фильтр \"День рождения\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class BirthDayFilterDto {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("daysBefore")
  private Integer daysBefore = null;

  @JsonProperty("daysAfter")
  private Integer daysAfter = null;

  public BirthDayFilterDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Имя фильтра.
   * @return name
  **/
  @ApiModelProperty(value = "Имя фильтра.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BirthDayFilterDto daysBefore(Integer daysBefore) {
    this.daysBefore = daysBefore;
    return this;
  }

   /**
   * Дней до.
   * @return daysBefore
  **/
  @ApiModelProperty(value = "Дней до.")
  public Integer getDaysBefore() {
    return daysBefore;
  }

  public void setDaysBefore(Integer daysBefore) {
    this.daysBefore = daysBefore;
  }

  public BirthDayFilterDto daysAfter(Integer daysAfter) {
    this.daysAfter = daysAfter;
    return this;
  }

   /**
   * Дней после.
   * @return daysAfter
  **/
  @ApiModelProperty(value = "Дней после.")
  public Integer getDaysAfter() {
    return daysAfter;
  }

  public void setDaysAfter(Integer daysAfter) {
    this.daysAfter = daysAfter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BirthDayFilterDto birthDayFilterDto = (BirthDayFilterDto) o;
    return Objects.equals(this.name, birthDayFilterDto.name) &&
        Objects.equals(this.daysBefore, birthDayFilterDto.daysBefore) &&
        Objects.equals(this.daysAfter, birthDayFilterDto.daysAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, daysBefore, daysAfter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BirthDayFilterDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    daysBefore: ").append(toIndentedString(daysBefore)).append("\n");
    sb.append("    daysAfter: ").append(toIndentedString(daysAfter)).append("\n");
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


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
import com.example.demo.restclient.model.AttributeValueModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Модель StringDateValue.
 */
@ApiModel(description = "Модель StringDateValue.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class StringDateValueModel {
  @JsonProperty("stringDateValue")
  private String stringDateValue = null;

  public StringDateValueModel stringDateValue(String stringDateValue) {
    this.stringDateValue = stringDateValue;
    return this;
  }

   /**
   * StringDateValue.
   * @return stringDateValue
  **/
  @ApiModelProperty(value = "StringDateValue.")
  public String getStringDateValue() {
    return stringDateValue;
  }

  public void setStringDateValue(String stringDateValue) {
    this.stringDateValue = stringDateValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringDateValueModel stringDateValueModel = (StringDateValueModel) o;
    return Objects.equals(this.stringDateValue, stringDateValueModel.stringDateValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringDateValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringDateValueModel {\n");
    
    sb.append("    stringDateValue: ").append(toIndentedString(stringDateValue)).append("\n");
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


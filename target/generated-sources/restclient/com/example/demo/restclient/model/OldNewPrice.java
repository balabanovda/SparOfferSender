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
import com.example.demo.restclient.model.RewardThumbnail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Старая-новая цена.
 */
@ApiModel(description = "Старая-новая цена.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class OldNewPrice {
  @JsonProperty("oldPrice")
  private String oldPrice = null;

  @JsonProperty("newPrice")
  private String newPrice = null;

  public OldNewPrice oldPrice(String oldPrice) {
    this.oldPrice = oldPrice;
    return this;
  }

   /**
   * Старая цена.
   * @return oldPrice
  **/
  @ApiModelProperty(value = "Старая цена.")
  public String getOldPrice() {
    return oldPrice;
  }

  public void setOldPrice(String oldPrice) {
    this.oldPrice = oldPrice;
  }

  public OldNewPrice newPrice(String newPrice) {
    this.newPrice = newPrice;
    return this;
  }

   /**
   * Новая цена.
   * @return newPrice
  **/
  @ApiModelProperty(value = "Новая цена.")
  public String getNewPrice() {
    return newPrice;
  }

  public void setNewPrice(String newPrice) {
    this.newPrice = newPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OldNewPrice oldNewPrice = (OldNewPrice) o;
    return Objects.equals(this.oldPrice, oldNewPrice.oldPrice) &&
        Objects.equals(this.newPrice, oldNewPrice.newPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldPrice, newPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OldNewPrice {\n");
    
    sb.append("    oldPrice: ").append(toIndentedString(oldPrice)).append("\n");
    sb.append("    newPrice: ").append(toIndentedString(newPrice)).append("\n");
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


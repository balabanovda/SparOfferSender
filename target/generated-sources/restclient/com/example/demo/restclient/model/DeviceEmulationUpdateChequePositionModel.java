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
 * Модель для обновления чековой позиции.
 */
@ApiModel(description = "Модель для обновления чековой позиции.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class DeviceEmulationUpdateChequePositionModel {
  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  @JsonProperty("partnerDiscount")
  private Double partnerDiscount = null;

  @JsonProperty("partnerCashback")
  private Double partnerCashback = null;

  public DeviceEmulationUpdateChequePositionModel price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Цена.
   * @return price
  **/
  @ApiModelProperty(value = "Цена.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public DeviceEmulationUpdateChequePositionModel quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Количество.
   * @return quantity
  **/
  @ApiModelProperty(value = "Количество.")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public DeviceEmulationUpdateChequePositionModel partnerDiscount(Double partnerDiscount) {
    this.partnerDiscount = partnerDiscount;
    return this;
  }

   /**
   * Партнерская скидка.
   * @return partnerDiscount
  **/
  @ApiModelProperty(value = "Партнерская скидка.")
  public Double getPartnerDiscount() {
    return partnerDiscount;
  }

  public void setPartnerDiscount(Double partnerDiscount) {
    this.partnerDiscount = partnerDiscount;
  }

  public DeviceEmulationUpdateChequePositionModel partnerCashback(Double partnerCashback) {
    this.partnerCashback = partnerCashback;
    return this;
  }

   /**
   * Партнерский кешбек.
   * @return partnerCashback
  **/
  @ApiModelProperty(value = "Партнерский кешбек.")
  public Double getPartnerCashback() {
    return partnerCashback;
  }

  public void setPartnerCashback(Double partnerCashback) {
    this.partnerCashback = partnerCashback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEmulationUpdateChequePositionModel deviceEmulationUpdateChequePositionModel = (DeviceEmulationUpdateChequePositionModel) o;
    return Objects.equals(this.price, deviceEmulationUpdateChequePositionModel.price) &&
        Objects.equals(this.quantity, deviceEmulationUpdateChequePositionModel.quantity) &&
        Objects.equals(this.partnerDiscount, deviceEmulationUpdateChequePositionModel.partnerDiscount) &&
        Objects.equals(this.partnerCashback, deviceEmulationUpdateChequePositionModel.partnerCashback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, quantity, partnerDiscount, partnerCashback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEmulationUpdateChequePositionModel {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    partnerDiscount: ").append(toIndentedString(partnerDiscount)).append("\n");
    sb.append("    partnerCashback: ").append(toIndentedString(partnerCashback)).append("\n");
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


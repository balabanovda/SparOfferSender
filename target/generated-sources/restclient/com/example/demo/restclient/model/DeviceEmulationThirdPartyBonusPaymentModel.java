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
 * Модель добавления оплаты бонусами.
 */
@ApiModel(description = "Модель добавления оплаты бонусами.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class DeviceEmulationThirdPartyBonusPaymentModel {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("info")
  private String info = null;

  public DeviceEmulationThirdPartyBonusPaymentModel amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Сумма.
   * @return amount
  **/
  @ApiModelProperty(value = "Сумма.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public DeviceEmulationThirdPartyBonusPaymentModel info(String info) {
    this.info = info;
    return this;
  }

   /**
   * Информация о бонусах.
   * @return info
  **/
  @ApiModelProperty(value = "Информация о бонусах.")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEmulationThirdPartyBonusPaymentModel deviceEmulationThirdPartyBonusPaymentModel = (DeviceEmulationThirdPartyBonusPaymentModel) o;
    return Objects.equals(this.amount, deviceEmulationThirdPartyBonusPaymentModel.amount) &&
        Objects.equals(this.info, deviceEmulationThirdPartyBonusPaymentModel.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEmulationThirdPartyBonusPaymentModel {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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


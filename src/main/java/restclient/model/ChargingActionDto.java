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


package restclient.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Действие акции \&quot;Доп. бонусы\&quot;.
 */
@ApiModel(description = "Действие акции \"Доп. бонусы\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ChargingActionDto {
  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("deviceId")
  private String deviceId = null;

  @JsonProperty("currencyExternalId")
  private String currencyExternalId = null;

  public ChargingActionDto order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Порядковый номер действия в цепочке.
   * @return order
  **/
  @ApiModelProperty(value = "Порядковый номер действия в цепочке.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public ChargingActionDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id действия в цепочке.
   * @return id
  **/
  @ApiModelProperty(value = "Id действия в цепочке.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChargingActionDto amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Фиксированная сумма.
   * @return amount
  **/
  @ApiModelProperty(value = "Фиксированная сумма.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public ChargingActionDto deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Логическое имя дебетовой кассы.
   * @return deviceId
  **/
  @ApiModelProperty(value = "Логическое имя дебетовой кассы.")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public ChargingActionDto currencyExternalId(String currencyExternalId) {
    this.currencyExternalId = currencyExternalId;
    return this;
  }

   /**
   * Внешний идентификатор валюты.
   * @return currencyExternalId
  **/
  @ApiModelProperty(value = "Внешний идентификатор валюты.")
  public String getCurrencyExternalId() {
    return currencyExternalId;
  }

  public void setCurrencyExternalId(String currencyExternalId) {
    this.currencyExternalId = currencyExternalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargingActionDto chargingActionDto = (ChargingActionDto) o;
    return Objects.equals(this.order, chargingActionDto.order) &&
        Objects.equals(this.id, chargingActionDto.id) &&
        Objects.equals(this.amount, chargingActionDto.amount) &&
        Objects.equals(this.deviceId, chargingActionDto.deviceId) &&
        Objects.equals(this.currencyExternalId, chargingActionDto.currencyExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, id, amount, deviceId, currencyExternalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingActionDto {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    currencyExternalId: ").append(toIndentedString(currencyExternalId)).append("\n");
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


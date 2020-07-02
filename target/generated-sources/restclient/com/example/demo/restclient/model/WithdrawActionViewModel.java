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
import com.example.demo.restclient.model.CurrencyViewModel;
import com.example.demo.restclient.model.DeviceBriefViewModel;
import com.example.demo.restclient.model.OfferActionViewModelBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Модель для редактирования действия \&quot;Списание бонусов\&quot;.
 */
@ApiModel(description = "Модель для редактирования действия \"Списание бонусов\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class WithdrawActionViewModel {
  @JsonProperty("actionId")
  private Integer actionId = null;

  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("device")
  private DeviceBriefViewModel device = null;

  @JsonProperty("currency")
  private CurrencyViewModel currency = null;

  public WithdrawActionViewModel actionId(Integer actionId) {
    this.actionId = actionId;
    return this;
  }

   /**
   * Id действия. Если указан, редактируется действие, иначе создается новое.
   * @return actionId
  **/
  @ApiModelProperty(value = "Id действия. Если указан, редактируется действие, иначе создается новое.")
  public Integer getActionId() {
    return actionId;
  }

  public void setActionId(Integer actionId) {
    this.actionId = actionId;
  }

  public WithdrawActionViewModel order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Порядок действия.
   * @return order
  **/
  @ApiModelProperty(value = "Порядок действия.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public WithdrawActionViewModel amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Сумма изъятия.
   * @return amount
  **/
  @ApiModelProperty(value = "Сумма изъятия.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public WithdrawActionViewModel device(DeviceBriefViewModel device) {
    this.device = device;
    return this;
  }

   /**
   * Дебетовая касса.
   * @return device
  **/
  @ApiModelProperty(value = "Дебетовая касса.")
  public DeviceBriefViewModel getDevice() {
    return device;
  }

  public void setDevice(DeviceBriefViewModel device) {
    this.device = device;
  }

  public WithdrawActionViewModel currency(CurrencyViewModel currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Валюта.
   * @return currency
  **/
  @ApiModelProperty(value = "Валюта.")
  public CurrencyViewModel getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyViewModel currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WithdrawActionViewModel withdrawActionViewModel = (WithdrawActionViewModel) o;
    return Objects.equals(this.actionId, withdrawActionViewModel.actionId) &&
        Objects.equals(this.order, withdrawActionViewModel.order) &&
        Objects.equals(this.amount, withdrawActionViewModel.amount) &&
        Objects.equals(this.device, withdrawActionViewModel.device) &&
        Objects.equals(this.currency, withdrawActionViewModel.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, order, amount, device, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawActionViewModel {\n");
    
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

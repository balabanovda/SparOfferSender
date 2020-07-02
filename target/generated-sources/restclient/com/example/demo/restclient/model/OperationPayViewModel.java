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
import com.example.demo.restclient.model.PayTypeViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Модель операций оплаты по покупке.
 */
@ApiModel(description = "Модель операций оплаты по покупке.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class OperationPayViewModel {
  @JsonProperty("payTypeViewModel")
  private PayTypeViewModel payTypeViewModel = null;

  @JsonProperty("info")
  private String info = null;

  @JsonProperty("amount")
  private Double amount = null;

  public OperationPayViewModel payTypeViewModel(PayTypeViewModel payTypeViewModel) {
    this.payTypeViewModel = payTypeViewModel;
    return this;
  }

   /**
   * Модель способа оплаты.
   * @return payTypeViewModel
  **/
  @ApiModelProperty(value = "Модель способа оплаты.")
  public PayTypeViewModel getPayTypeViewModel() {
    return payTypeViewModel;
  }

  public void setPayTypeViewModel(PayTypeViewModel payTypeViewModel) {
    this.payTypeViewModel = payTypeViewModel;
  }

  public OperationPayViewModel info(String info) {
    this.info = info;
    return this;
  }

   /**
   * Информация по способу оплаты.
   * @return info
  **/
  @ApiModelProperty(value = "Информация по способу оплаты.")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public OperationPayViewModel amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Оплаченная сумма с помощью определенного способа оплаты.
   * @return amount
  **/
  @ApiModelProperty(value = "Оплаченная сумма с помощью определенного способа оплаты.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationPayViewModel operationPayViewModel = (OperationPayViewModel) o;
    return Objects.equals(this.payTypeViewModel, operationPayViewModel.payTypeViewModel) &&
        Objects.equals(this.info, operationPayViewModel.info) &&
        Objects.equals(this.amount, operationPayViewModel.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payTypeViewModel, info, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationPayViewModel {\n");
    
    sb.append("    payTypeViewModel: ").append(toIndentedString(payTypeViewModel)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

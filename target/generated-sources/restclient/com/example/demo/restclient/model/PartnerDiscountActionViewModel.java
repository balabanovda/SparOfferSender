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
import com.example.demo.restclient.model.OfferActionViewModelBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Модель для редактирования действия \&quot;Партнерская прямая скидка\&quot;.
 */
@ApiModel(description = "Модель для редактирования действия \"Партнерская прямая скидка\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PartnerDiscountActionViewModel {
  @JsonProperty("actionId")
  private Integer actionId = null;

  @JsonProperty("order")
  private Integer order = null;

  public PartnerDiscountActionViewModel actionId(Integer actionId) {
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

  public PartnerDiscountActionViewModel order(Integer order) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerDiscountActionViewModel partnerDiscountActionViewModel = (PartnerDiscountActionViewModel) o;
    return Objects.equals(this.actionId, partnerDiscountActionViewModel.actionId) &&
        Objects.equals(this.order, partnerDiscountActionViewModel.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerDiscountActionViewModel {\n");
    
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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


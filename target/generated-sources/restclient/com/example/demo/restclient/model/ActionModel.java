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
import com.example.demo.restclient.model.ActionResultModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Фильтр для списка счетов кассы.
 */
@ApiModel(description = "Фильтр для списка счетов кассы.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ActionModel {
  @JsonProperty("actionId")
  private Integer actionId = null;

  /**
   * Тип.
   */
  public enum ActionTypeEnum {
    DIRECTDISCOUNT("DirectDiscount"),
    
    CASHBACK("Cashback"),
    
    SENDMESSAGE("SendMessage"),
    
    CHARGING("Charging"),
    
    PARTNERDIRECTDISCOUNT("PartnerDirectDiscount"),
    
    PARTNERCASHBACKDISCOUNT("PartnerCashbackDiscount"),
    
    CHEQUEMESSAGE("ChequeMessage"),
    
    CASHIERMESSAGE("CashierMessage"),
    
    MINPRICE("MinPrice"),
    
    CORRECTIONDIRECTDISCOUNT("CorrectionDirectDiscount"),
    
    COUPONISSUE("CouponIssue"),
    
    SETCOUPONUSED("SetCouponUsed"),
    
    COUNTER("Counter"),
    
    ENABLETRIGGEREDMAILING("EnableTriggeredMailing"),
    
    DISABLETRIGGEREDMAILING("DisableTriggeredMailing"),
    
    WITHDRAW("Withdraw"),
    
    PERSONALOFFERUPDATE("PersonalOfferUpdate"),
    
    GOODSSETDIVIDE("GoodsSetDivide"),
    
    PAYMENT("Payment"),
    
    FAVORITEGOODS("FavoriteGoods"),
    
    CORRECTIONPAYMENT("CorrectionPayment"),
    
    CASHBACKNN("CashbackNn"),
    
    PARTNERCOUPONDISCOUNT("PartnerCouponDiscount"),
    
    CASHBACKFORWEIGHT("CashbackForWeight"),
    
    INITIALPRICE("InitialPrice");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionTypeEnum fromValue(String text) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("actionType")
  private ActionTypeEnum actionType = null;

  @JsonProperty("results")
  private List<ActionResultModel> results = null;

  public ActionModel actionId(Integer actionId) {
    this.actionId = actionId;
    return this;
  }

   /**
   * Идентификатор.
   * @return actionId
  **/
  @ApiModelProperty(value = "Идентификатор.")
  public Integer getActionId() {
    return actionId;
  }

  public void setActionId(Integer actionId) {
    this.actionId = actionId;
  }

  public ActionModel actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Тип.
   * @return actionType
  **/
  @ApiModelProperty(value = "Тип.")
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public ActionModel results(List<ActionResultModel> results) {
    this.results = results;
    return this;
  }

  public ActionModel addResultsItem(ActionResultModel resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Результаты.
   * @return results
  **/
  @ApiModelProperty(value = "Результаты.")
  public List<ActionResultModel> getResults() {
    return results;
  }

  public void setResults(List<ActionResultModel> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionModel actionModel = (ActionModel) o;
    return Objects.equals(this.actionId, actionModel.actionId) &&
        Objects.equals(this.actionType, actionModel.actionType) &&
        Objects.equals(this.results, actionModel.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, actionType, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionModel {\n");
    
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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


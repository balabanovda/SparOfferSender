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
 * ViewModel цепочки событий.
 */
@ApiModel(description = "ViewModel цепочки событий.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class OfferActionChainViewModel {
  @JsonProperty("id")
  private Integer id = null;

  /**
   * Тип события.
   */
  public enum EventTypeEnum {
    ONPURCHASECALCULATE("OnPurchaseCalculate"),
    
    ONATTACHPHONE("OnAttachPhone"),
    
    ONPURCHASECONFIRM("OnPurchaseConfirm"),
    
    ONPURCHASEPAYMENT("OnPurchasePayment"),
    
    ONBALANCEREQUEST("OnBalanceRequest"),
    
    ONCARDISSUE("OnCardIssue"),
    
    ONCARDACTIVATION("OnCardActivation"),
    
    ONSOCIALACTIVITY("OnSocialActivity"),
    
    ONSOCIALGROUPJOIN("OnSocialGroupJoin"),
    
    ONFRIENDINVITE("OnFriendInvite"),
    
    ONSOCIALGROUPLEAVE("OnSocialGroupLeave"),
    
    ONQUESTIONNAIREUPDATE("OnQuestionnaireUpdate"),
    
    ONMOBILEAPPINSTALL("OnMobileAppInstall"),
    
    ONENDPERSONREGISTRATION("OnEndPersonRegistration"),
    
    ONSOCIALNETWORKLINK("OnSocialNetworkLink"),
    
    ONBONUSLIFETIMEEXPIRED("OnBonusLifetimeExpired"),
    
    ONBIRTHDAY("OnBirthday"),
    
    ONPURCHASEREFUND("OnPurchaseRefund"),
    
    ONREFERRALPURCHASE("OnReferralPurchase"),
    
    ONPURCHASECANCEL("OnPurchaseCancel"),
    
    ONREMOVESOCIALACTIVITY("OnRemoveSocialActivity"),
    
    ONPURCHASEDISCOUNT("OnPurchaseDiscount"),
    
    ONSENDPASSWORDTOCHEQUE("OnSendPasswordToCheque"),
    
    ONGOODSSETPROCESS("OnGoodsSetProcess"),
    
    ONATTACHEMAIL("OnAttachEmail"),
    
    ONBONUSLIFETIMEACTIVATION("OnBonusLifetimeActivation"),
    
    ONPURCHASEPAYMENTCALCULATE("OnPurchasePaymentCalculate"),
    
    ONPURCHASEPAYMENTCANCEL("OnPurchasePaymentCancel"),
    
    ONCOUPONPURCHASED("OnCouponPurchased"),
    
    ONCOUPONREFUNDED("OnCouponRefunded"),
    
    ONPURCHASEDEPOSIT("OnPurchaseDeposit"),
    
    ONCARDATTACH("OnCardAttach"),
    
    ONCARDREPLACE("OnCardReplace"),
    
    ONEXTERNALCARDREPLACE("OnExternalCardReplace"),
    
    ONPURCHASEREFUNDCALCULATE("OnPurchaseRefundCalculate"),
    
    ONMANUALCHARGE("OnManualCharge"),
    
    ONMANUALWITHDRAW("OnManualWithdraw");

    private String value;

    EventTypeEnum(String value) {
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
    public static EventTypeEnum fromValue(String text) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("eventType")
  private EventTypeEnum eventType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("parentActionId")
  private Integer parentActionId = null;

  public OfferActionChainViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор цепочки.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор цепочки.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OfferActionChainViewModel eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Тип события.
   * @return eventType
  **/
  @ApiModelProperty(value = "Тип события.")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public OfferActionChainViewModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название цепочки.
   * @return name
  **/
  @ApiModelProperty(value = "Название цепочки.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OfferActionChainViewModel order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Порядковый номер цепочки.
   * @return order
  **/
  @ApiModelProperty(value = "Порядковый номер цепочки.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public OfferActionChainViewModel parentActionId(Integer parentActionId) {
    this.parentActionId = parentActionId;
    return this;
  }

   /**
   * Ссылка на действие-владельца цепочки.
   * @return parentActionId
  **/
  @ApiModelProperty(value = "Ссылка на действие-владельца цепочки.")
  public Integer getParentActionId() {
    return parentActionId;
  }

  public void setParentActionId(Integer parentActionId) {
    this.parentActionId = parentActionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferActionChainViewModel offerActionChainViewModel = (OfferActionChainViewModel) o;
    return Objects.equals(this.id, offerActionChainViewModel.id) &&
        Objects.equals(this.eventType, offerActionChainViewModel.eventType) &&
        Objects.equals(this.name, offerActionChainViewModel.name) &&
        Objects.equals(this.order, offerActionChainViewModel.order) &&
        Objects.equals(this.parentActionId, offerActionChainViewModel.parentActionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventType, name, order, parentActionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferActionChainViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    parentActionId: ").append(toIndentedString(parentActionId)).append("\n");
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

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
 * ActionPlacementInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ActionPlacementInfo {
  @JsonProperty("chainNumber")
  private Integer chainNumber = null;

  /**
   * Gets or Sets eventType
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

  @JsonProperty("parentActionId")
  private Integer parentActionId = null;

  public ActionPlacementInfo chainNumber(Integer chainNumber) {
    this.chainNumber = chainNumber;
    return this;
  }

   /**
   * Get chainNumber
   * @return chainNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getChainNumber() {
    return chainNumber;
  }

  public void setChainNumber(Integer chainNumber) {
    this.chainNumber = chainNumber;
  }

  public ActionPlacementInfo eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(value = "")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public ActionPlacementInfo parentActionId(Integer parentActionId) {
    this.parentActionId = parentActionId;
    return this;
  }

   /**
   * Get parentActionId
   * @return parentActionId
  **/
  @ApiModelProperty(value = "")
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
    ActionPlacementInfo actionPlacementInfo = (ActionPlacementInfo) o;
    return Objects.equals(this.chainNumber, actionPlacementInfo.chainNumber) &&
        Objects.equals(this.eventType, actionPlacementInfo.eventType) &&
        Objects.equals(this.parentActionId, actionPlacementInfo.parentActionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainNumber, eventType, parentActionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionPlacementInfo {\n");
    
    sb.append("    chainNumber: ").append(toIndentedString(chainNumber)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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


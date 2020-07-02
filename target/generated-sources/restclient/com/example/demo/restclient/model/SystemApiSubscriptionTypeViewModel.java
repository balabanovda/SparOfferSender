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
import com.example.demo.restclient.model.SubscriptionTypeViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ViewModel для типа подписки.
 */
@ApiModel(description = "ViewModel для типа подписки.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class SystemApiSubscriptionTypeViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Тип подписки.
   */
  public enum TypeEnum {
    CASHBACK("Cashback"),
    
    PAYMENT("Payment"),
    
    REFILL("Refill"),
    
    OFFER("Offer"),
    
    SYSTEM("System"),
    
    MAILING("Mailing"),
    
    REFUND("Refund"),
    
    DEVICEEMULATION("DeviceEmulation");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("smsEnable")
  private Boolean smsEnable = null;

  @JsonProperty("emailEnable")
  private Boolean emailEnable = null;

  @JsonProperty("pushEnable")
  private Boolean pushEnable = null;

  @JsonProperty("viberEnable")
  private Boolean viberEnable = null;

  @JsonProperty("socialNetworksEnable")
  private Boolean socialNetworksEnable = null;

  /**
   * Тип ограничения по времени рассылки.
   */
  public enum TimeLimitTypeEnum {
    NOLIMIT("NoLimit"),
    
    NIGHTLIMIT("NightLimit"),
    
    NIGHTANDWEEKENDLIMIT("NightAndWeekendLimit");

    private String value;

    TimeLimitTypeEnum(String value) {
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
    public static TimeLimitTypeEnum fromValue(String text) {
      for (TimeLimitTypeEnum b : TimeLimitTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("timeLimitType")
  private TimeLimitTypeEnum timeLimitType = null;

  @JsonProperty("chatBotEnable")
  private Boolean chatBotEnable = null;

  @JsonProperty("lifeTime")
  private Integer lifeTime = null;

  /**
   * Еденица времени жизни рассылки.
   */
  public enum TimeUnitEnum {
    MINUTE("Minute"),
    
    HOUR("Hour"),
    
    DAY("Day"),
    
    WEEK("Week"),
    
    MONTH("Month"),
    
    YEAR("Year");

    private String value;

    TimeUnitEnum(String value) {
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
    public static TimeUnitEnum fromValue(String text) {
      for (TimeUnitEnum b : TimeUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("timeUnit")
  private TimeUnitEnum timeUnit = null;

  @JsonProperty("hiddenTemplate")
  private Boolean hiddenTemplate = null;

  public SystemApiSubscriptionTypeViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id типа подписки.
   * @return id
  **/
  @ApiModelProperty(value = "Id типа подписки.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SystemApiSubscriptionTypeViewModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название типа подписки.
   * @return name
  **/
  @ApiModelProperty(value = "Название типа подписки.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SystemApiSubscriptionTypeViewModel type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Тип подписки.
   * @return type
  **/
  @ApiModelProperty(value = "Тип подписки.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SystemApiSubscriptionTypeViewModel smsEnable(Boolean smsEnable) {
    this.smsEnable = smsEnable;
    return this;
  }

   /**
   * Оповещение по Sms.
   * @return smsEnable
  **/
  @ApiModelProperty(value = "Оповещение по Sms.")
  public Boolean isSmsEnable() {
    return smsEnable;
  }

  public void setSmsEnable(Boolean smsEnable) {
    this.smsEnable = smsEnable;
  }

  public SystemApiSubscriptionTypeViewModel emailEnable(Boolean emailEnable) {
    this.emailEnable = emailEnable;
    return this;
  }

   /**
   * Оповещение по Email.
   * @return emailEnable
  **/
  @ApiModelProperty(value = "Оповещение по Email.")
  public Boolean isEmailEnable() {
    return emailEnable;
  }

  public void setEmailEnable(Boolean emailEnable) {
    this.emailEnable = emailEnable;
  }

  public SystemApiSubscriptionTypeViewModel pushEnable(Boolean pushEnable) {
    this.pushEnable = pushEnable;
    return this;
  }

   /**
   * Оповещение по Email.
   * @return pushEnable
  **/
  @ApiModelProperty(value = "Оповещение по Email.")
  public Boolean isPushEnable() {
    return pushEnable;
  }

  public void setPushEnable(Boolean pushEnable) {
    this.pushEnable = pushEnable;
  }

  public SystemApiSubscriptionTypeViewModel viberEnable(Boolean viberEnable) {
    this.viberEnable = viberEnable;
    return this;
  }

   /**
   * Оповещение по Viber.
   * @return viberEnable
  **/
  @ApiModelProperty(value = "Оповещение по Viber.")
  public Boolean isViberEnable() {
    return viberEnable;
  }

  public void setViberEnable(Boolean viberEnable) {
    this.viberEnable = viberEnable;
  }

  public SystemApiSubscriptionTypeViewModel socialNetworksEnable(Boolean socialNetworksEnable) {
    this.socialNetworksEnable = socialNetworksEnable;
    return this;
  }

   /**
   * Оповещение по SocialNetworks.
   * @return socialNetworksEnable
  **/
  @ApiModelProperty(value = "Оповещение по SocialNetworks.")
  public Boolean isSocialNetworksEnable() {
    return socialNetworksEnable;
  }

  public void setSocialNetworksEnable(Boolean socialNetworksEnable) {
    this.socialNetworksEnable = socialNetworksEnable;
  }

  public SystemApiSubscriptionTypeViewModel timeLimitType(TimeLimitTypeEnum timeLimitType) {
    this.timeLimitType = timeLimitType;
    return this;
  }

   /**
   * Тип ограничения по времени рассылки.
   * @return timeLimitType
  **/
  @ApiModelProperty(value = "Тип ограничения по времени рассылки.")
  public TimeLimitTypeEnum getTimeLimitType() {
    return timeLimitType;
  }

  public void setTimeLimitType(TimeLimitTypeEnum timeLimitType) {
    this.timeLimitType = timeLimitType;
  }

  public SystemApiSubscriptionTypeViewModel chatBotEnable(Boolean chatBotEnable) {
    this.chatBotEnable = chatBotEnable;
    return this;
  }

   /**
   * Оповещение по ChatBot.
   * @return chatBotEnable
  **/
  @ApiModelProperty(value = "Оповещение по ChatBot.")
  public Boolean isChatBotEnable() {
    return chatBotEnable;
  }

  public void setChatBotEnable(Boolean chatBotEnable) {
    this.chatBotEnable = chatBotEnable;
  }

  public SystemApiSubscriptionTypeViewModel lifeTime(Integer lifeTime) {
    this.lifeTime = lifeTime;
    return this;
  }

   /**
   * Время жизни рассылки.
   * @return lifeTime
  **/
  @ApiModelProperty(value = "Время жизни рассылки.")
  public Integer getLifeTime() {
    return lifeTime;
  }

  public void setLifeTime(Integer lifeTime) {
    this.lifeTime = lifeTime;
  }

  public SystemApiSubscriptionTypeViewModel timeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Еденица времени жизни рассылки.
   * @return timeUnit
  **/
  @ApiModelProperty(value = "Еденица времени жизни рассылки.")
  public TimeUnitEnum getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
  }

  public SystemApiSubscriptionTypeViewModel hiddenTemplate(Boolean hiddenTemplate) {
    this.hiddenTemplate = hiddenTemplate;
    return this;
  }

   /**
   * Тип подписки скрыт в шаблонах.
   * @return hiddenTemplate
  **/
  @ApiModelProperty(value = "Тип подписки скрыт в шаблонах.")
  public Boolean isHiddenTemplate() {
    return hiddenTemplate;
  }

  public void setHiddenTemplate(Boolean hiddenTemplate) {
    this.hiddenTemplate = hiddenTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemApiSubscriptionTypeViewModel systemApiSubscriptionTypeViewModel = (SystemApiSubscriptionTypeViewModel) o;
    return Objects.equals(this.id, systemApiSubscriptionTypeViewModel.id) &&
        Objects.equals(this.name, systemApiSubscriptionTypeViewModel.name) &&
        Objects.equals(this.type, systemApiSubscriptionTypeViewModel.type) &&
        Objects.equals(this.smsEnable, systemApiSubscriptionTypeViewModel.smsEnable) &&
        Objects.equals(this.emailEnable, systemApiSubscriptionTypeViewModel.emailEnable) &&
        Objects.equals(this.pushEnable, systemApiSubscriptionTypeViewModel.pushEnable) &&
        Objects.equals(this.viberEnable, systemApiSubscriptionTypeViewModel.viberEnable) &&
        Objects.equals(this.socialNetworksEnable, systemApiSubscriptionTypeViewModel.socialNetworksEnable) &&
        Objects.equals(this.timeLimitType, systemApiSubscriptionTypeViewModel.timeLimitType) &&
        Objects.equals(this.chatBotEnable, systemApiSubscriptionTypeViewModel.chatBotEnable) &&
        Objects.equals(this.lifeTime, systemApiSubscriptionTypeViewModel.lifeTime) &&
        Objects.equals(this.timeUnit, systemApiSubscriptionTypeViewModel.timeUnit) &&
        Objects.equals(this.hiddenTemplate, systemApiSubscriptionTypeViewModel.hiddenTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, smsEnable, emailEnable, pushEnable, viberEnable, socialNetworksEnable, timeLimitType, chatBotEnable, lifeTime, timeUnit, hiddenTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemApiSubscriptionTypeViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    smsEnable: ").append(toIndentedString(smsEnable)).append("\n");
    sb.append("    emailEnable: ").append(toIndentedString(emailEnable)).append("\n");
    sb.append("    pushEnable: ").append(toIndentedString(pushEnable)).append("\n");
    sb.append("    viberEnable: ").append(toIndentedString(viberEnable)).append("\n");
    sb.append("    socialNetworksEnable: ").append(toIndentedString(socialNetworksEnable)).append("\n");
    sb.append("    timeLimitType: ").append(toIndentedString(timeLimitType)).append("\n");
    sb.append("    chatBotEnable: ").append(toIndentedString(chatBotEnable)).append("\n");
    sb.append("    lifeTime: ").append(toIndentedString(lifeTime)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    hiddenTemplate: ").append(toIndentedString(hiddenTemplate)).append("\n");
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


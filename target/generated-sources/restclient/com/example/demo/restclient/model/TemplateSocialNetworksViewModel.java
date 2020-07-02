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
import com.example.demo.restclient.model.NotifyTemplateViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Шаблон для сообщения через социальную сеть.
 */
@ApiModel(description = "Шаблон для сообщения через социальную сеть.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class TemplateSocialNetworksViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("logicalName")
  private String logicalName = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("priority")
  private Integer priority = null;

  /**
   * Тип подписки.
   */
  public enum SubscriptionTypeEnum {
    CASHBACK("Cashback"),
    
    PAYMENT("Payment"),
    
    REFILL("Refill"),
    
    OFFER("Offer"),
    
    SYSTEM("System"),
    
    MAILING("Mailing"),
    
    REFUND("Refund"),
    
    DEVICEEMULATION("DeviceEmulation");

    private String value;

    SubscriptionTypeEnum(String value) {
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
    public static SubscriptionTypeEnum fromValue(String text) {
      for (SubscriptionTypeEnum b : SubscriptionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("subscriptionType")
  private SubscriptionTypeEnum subscriptionType = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = null;

  @JsonProperty("canNotBeDeleted")
  private Boolean canNotBeDeleted = null;

  public TemplateSocialNetworksViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TemplateSocialNetworksViewModel logicalName(String logicalName) {
    this.logicalName = logicalName;
    return this;
  }

   /**
   * Уникальное логическое имя.
   * @return logicalName
  **/
  @ApiModelProperty(value = "Уникальное логическое имя.")
  public String getLogicalName() {
    return logicalName;
  }

  public void setLogicalName(String logicalName) {
    this.logicalName = logicalName;
  }

  public TemplateSocialNetworksViewModel text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Текст.
   * @return text
  **/
  @ApiModelProperty(value = "Текст.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TemplateSocialNetworksViewModel priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Приоритет.
   * @return priority
  **/
  @ApiModelProperty(value = "Приоритет.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TemplateSocialNetworksViewModel subscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * Тип подписки.
   * @return subscriptionType
  **/
  @ApiModelProperty(value = "Тип подписки.")
  public SubscriptionTypeEnum getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public TemplateSocialNetworksViewModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Флаг удаления.
   * @return isDeleted
  **/
  @ApiModelProperty(value = "Флаг удаления.")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public TemplateSocialNetworksViewModel canNotBeDeleted(Boolean canNotBeDeleted) {
    this.canNotBeDeleted = canNotBeDeleted;
    return this;
  }

   /**
   * Может ли сущность быть удалена.
   * @return canNotBeDeleted
  **/
  @ApiModelProperty(value = "Может ли сущность быть удалена.")
  public Boolean isCanNotBeDeleted() {
    return canNotBeDeleted;
  }

  public void setCanNotBeDeleted(Boolean canNotBeDeleted) {
    this.canNotBeDeleted = canNotBeDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSocialNetworksViewModel templateSocialNetworksViewModel = (TemplateSocialNetworksViewModel) o;
    return Objects.equals(this.id, templateSocialNetworksViewModel.id) &&
        Objects.equals(this.logicalName, templateSocialNetworksViewModel.logicalName) &&
        Objects.equals(this.text, templateSocialNetworksViewModel.text) &&
        Objects.equals(this.priority, templateSocialNetworksViewModel.priority) &&
        Objects.equals(this.subscriptionType, templateSocialNetworksViewModel.subscriptionType) &&
        Objects.equals(this.isDeleted, templateSocialNetworksViewModel.isDeleted) &&
        Objects.equals(this.canNotBeDeleted, templateSocialNetworksViewModel.canNotBeDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logicalName, text, priority, subscriptionType, isDeleted, canNotBeDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSocialNetworksViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logicalName: ").append(toIndentedString(logicalName)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    canNotBeDeleted: ").append(toIndentedString(canNotBeDeleted)).append("\n");
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


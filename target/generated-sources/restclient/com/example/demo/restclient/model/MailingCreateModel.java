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
 * Модель создания рассылки.
 */
@ApiModel(description = "Модель создания рассылки.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class MailingCreateModel {
  @JsonProperty("legalId")
  private Integer legalId = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Способ отправки.
   */
  public enum WaySendTypeEnum {
    MAIL("Mail"),
    
    SMS("Sms"),
    
    PUSH("Push"),
    
    VIBER("Viber"),
    
    SOCIALNETWORKS("SocialNetworks"),
    
    CHATBOT("ChatBot");

    private String value;

    WaySendTypeEnum(String value) {
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
    public static WaySendTypeEnum fromValue(String text) {
      for (WaySendTypeEnum b : WaySendTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("waySendType")
  private WaySendTypeEnum waySendType = null;

  @JsonProperty("loyaltyProgramId")
  private Integer loyaltyProgramId = null;

  public MailingCreateModel legalId(Integer legalId) {
    this.legalId = legalId;
    return this;
  }

   /**
   * Идентификатор юр.лица.
   * @return legalId
  **/
  @ApiModelProperty(value = "Идентификатор юр.лица.")
  public Integer getLegalId() {
    return legalId;
  }

  public void setLegalId(Integer legalId) {
    this.legalId = legalId;
  }

  public MailingCreateModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название рассылки.
   * @return name
  **/
  @ApiModelProperty(value = "Название рассылки.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MailingCreateModel waySendType(WaySendTypeEnum waySendType) {
    this.waySendType = waySendType;
    return this;
  }

   /**
   * Способ отправки.
   * @return waySendType
  **/
  @ApiModelProperty(value = "Способ отправки.")
  public WaySendTypeEnum getWaySendType() {
    return waySendType;
  }

  public void setWaySendType(WaySendTypeEnum waySendType) {
    this.waySendType = waySendType;
  }

  public MailingCreateModel loyaltyProgramId(Integer loyaltyProgramId) {
    this.loyaltyProgramId = loyaltyProgramId;
    return this;
  }

   /**
   * Программа лояльности.
   * @return loyaltyProgramId
  **/
  @ApiModelProperty(value = "Программа лояльности.")
  public Integer getLoyaltyProgramId() {
    return loyaltyProgramId;
  }

  public void setLoyaltyProgramId(Integer loyaltyProgramId) {
    this.loyaltyProgramId = loyaltyProgramId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailingCreateModel mailingCreateModel = (MailingCreateModel) o;
    return Objects.equals(this.legalId, mailingCreateModel.legalId) &&
        Objects.equals(this.name, mailingCreateModel.name) &&
        Objects.equals(this.waySendType, mailingCreateModel.waySendType) &&
        Objects.equals(this.loyaltyProgramId, mailingCreateModel.loyaltyProgramId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalId, name, waySendType, loyaltyProgramId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingCreateModel {\n");
    
    sb.append("    legalId: ").append(toIndentedString(legalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    waySendType: ").append(toIndentedString(waySendType)).append("\n");
    sb.append("    loyaltyProgramId: ").append(toIndentedString(loyaltyProgramId)).append("\n");
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


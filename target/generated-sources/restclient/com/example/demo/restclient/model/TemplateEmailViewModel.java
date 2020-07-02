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
import com.example.demo.restclient.model.SendNotificationViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Действия для оповещения по электронной почте.
 */
@ApiModel(description = "Действия для оповещения по электронной почте.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class TemplateEmailViewModel {
  /**
   * Уведомление будет рассылаться не чаще чем раз в указанный период.              Если не указано, то каждый раз при срабатывании лимита.
   */
  public enum FrequencyEnum {
    HOUR("Hour"),
    
    DAY("Day"),
    
    WEEK("Week"),
    
    MONTH("Month");

    private String value;

    FrequencyEnum(String value) {
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
    public static FrequencyEnum fromValue(String text) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("frequency")
  private FrequencyEnum frequency = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("isArchived")
  private Boolean isArchived = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("header")
  private String header = null;

  public TemplateEmailViewModel frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Уведомление будет рассылаться не чаще чем раз в указанный период.              Если не указано, то каждый раз при срабатывании лимита.
   * @return frequency
  **/
  @ApiModelProperty(value = "Уведомление будет рассылаться не чаще чем раз в указанный период.              Если не указано, то каждый раз при срабатывании лимита.")
  public FrequencyEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }

  public TemplateEmailViewModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Текст уведомления.
   * @return message
  **/
  @ApiModelProperty(value = "Текст уведомления.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TemplateEmailViewModel id(Integer id) {
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

  public TemplateEmailViewModel isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * В архивном состоянии или нет.
   * @return isArchived
  **/
  @ApiModelProperty(value = "В архивном состоянии или нет.")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public TemplateEmailViewModel email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Адрес электронной почты.
   * @return email
  **/
  @ApiModelProperty(value = "Адрес электронной почты.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TemplateEmailViewModel header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Заголовок сообщения.
   * @return header
  **/
  @ApiModelProperty(value = "Заголовок сообщения.")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateEmailViewModel templateEmailViewModel = (TemplateEmailViewModel) o;
    return Objects.equals(this.frequency, templateEmailViewModel.frequency) &&
        Objects.equals(this.message, templateEmailViewModel.message) &&
        Objects.equals(this.id, templateEmailViewModel.id) &&
        Objects.equals(this.isArchived, templateEmailViewModel.isArchived) &&
        Objects.equals(this.email, templateEmailViewModel.email) &&
        Objects.equals(this.header, templateEmailViewModel.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, message, id, isArchived, email, header);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateEmailViewModel {\n");
    
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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


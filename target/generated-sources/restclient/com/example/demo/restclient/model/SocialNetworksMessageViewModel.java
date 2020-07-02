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
import com.example.demo.restclient.model.MessageViewModel;
import com.example.demo.restclient.model.NotificationGatewayBriefViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * ViewModel socialNetworks сообщения.
 */
@ApiModel(description = "ViewModel socialNetworks сообщения.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class SocialNetworksMessageViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("body")
  private String body = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("changeDate")
  private OffsetDateTime changeDate = null;

  @JsonProperty("recipient")
  private String recipient = null;

  /**
   * Статус.
   */
  public enum StateEnum {
    READYFORSEND("ReadyForSend"),
    
    SENT("Sent"),
    
    CRITICALERROR("CriticalError"),
    
    DELIVERYINPROCESS("DeliveryInProcess"),
    
    DELIVERYOK("DeliveryOk"),
    
    DELIVERYFAILED("DeliveryFailed"),
    
    DELIVERYREAD("DeliveryRead"),
    
    DELIVERYUNKNOWN("DeliveryUnknown"),
    
    DELETED("Deleted");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("gateway")
  private NotificationGatewayBriefViewModel gateway = null;

  public SocialNetworksMessageViewModel id(Integer id) {
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

  public SocialNetworksMessageViewModel body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Содержимое.
   * @return body
  **/
  @ApiModelProperty(value = "Содержимое.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public SocialNetworksMessageViewModel creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Дата создания.
   * @return creationDate
  **/
  @ApiModelProperty(value = "Дата создания.")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public SocialNetworksMessageViewModel changeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
    return this;
  }

   /**
   * Дата изменения.
   * @return changeDate
  **/
  @ApiModelProperty(value = "Дата изменения.")
  public OffsetDateTime getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
  }

  public SocialNetworksMessageViewModel recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * Получатель.
   * @return recipient
  **/
  @ApiModelProperty(value = "Получатель.")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public SocialNetworksMessageViewModel state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Статус.
   * @return state
  **/
  @ApiModelProperty(value = "Статус.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public SocialNetworksMessageViewModel gateway(NotificationGatewayBriefViewModel gateway) {
    this.gateway = gateway;
    return this;
  }

   /**
   * Шлюз.
   * @return gateway
  **/
  @ApiModelProperty(value = "Шлюз.")
  public NotificationGatewayBriefViewModel getGateway() {
    return gateway;
  }

  public void setGateway(NotificationGatewayBriefViewModel gateway) {
    this.gateway = gateway;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialNetworksMessageViewModel socialNetworksMessageViewModel = (SocialNetworksMessageViewModel) o;
    return Objects.equals(this.id, socialNetworksMessageViewModel.id) &&
        Objects.equals(this.body, socialNetworksMessageViewModel.body) &&
        Objects.equals(this.creationDate, socialNetworksMessageViewModel.creationDate) &&
        Objects.equals(this.changeDate, socialNetworksMessageViewModel.changeDate) &&
        Objects.equals(this.recipient, socialNetworksMessageViewModel.recipient) &&
        Objects.equals(this.state, socialNetworksMessageViewModel.state) &&
        Objects.equals(this.gateway, socialNetworksMessageViewModel.gateway);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, body, creationDate, changeDate, recipient, state, gateway);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialNetworksMessageViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
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


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


package restclient.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * ViewModel mail сообщений.
 */
@ApiModel(description = "ViewModel mail сообщений.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class MailMessageViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("body")
  private String body = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("changeDate")
  private OffsetDateTime changeDate = null;

  @JsonProperty("header")
  private String header = null;

  @JsonProperty("fromEmail")
  private String fromEmail = null;

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

  @JsonProperty("subscriptionTypeID")
  private Integer subscriptionTypeID = null;

  public MailMessageViewModel id(Integer id) {
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

  public MailMessageViewModel body(String body) {
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

  public MailMessageViewModel creationDate(OffsetDateTime creationDate) {
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

  public MailMessageViewModel changeDate(OffsetDateTime changeDate) {
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

  public MailMessageViewModel header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Заголовок.
   * @return header
  **/
  @ApiModelProperty(value = "Заголовок.")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public MailMessageViewModel fromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * Адрес отправителя.
   * @return fromEmail
  **/
  @ApiModelProperty(value = "Адрес отправителя.")
  public String getFromEmail() {
    return fromEmail;
  }

  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }

  public MailMessageViewModel recipient(String recipient) {
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

  public MailMessageViewModel state(StateEnum state) {
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

  public MailMessageViewModel subscriptionTypeID(Integer subscriptionTypeID) {
    this.subscriptionTypeID = subscriptionTypeID;
    return this;
  }

   /**
   * Идентификатор типа подписки.
   * @return subscriptionTypeID
  **/
  @ApiModelProperty(value = "Идентификатор типа подписки.")
  public Integer getSubscriptionTypeID() {
    return subscriptionTypeID;
  }

  public void setSubscriptionTypeID(Integer subscriptionTypeID) {
    this.subscriptionTypeID = subscriptionTypeID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailMessageViewModel mailMessageViewModel = (MailMessageViewModel) o;
    return Objects.equals(this.id, mailMessageViewModel.id) &&
        Objects.equals(this.body, mailMessageViewModel.body) &&
        Objects.equals(this.creationDate, mailMessageViewModel.creationDate) &&
        Objects.equals(this.changeDate, mailMessageViewModel.changeDate) &&
        Objects.equals(this.header, mailMessageViewModel.header) &&
        Objects.equals(this.fromEmail, mailMessageViewModel.fromEmail) &&
        Objects.equals(this.recipient, mailMessageViewModel.recipient) &&
        Objects.equals(this.state, mailMessageViewModel.state) &&
        Objects.equals(this.subscriptionTypeID, mailMessageViewModel.subscriptionTypeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, body, creationDate, changeDate, header, fromEmail, recipient, state, subscriptionTypeID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailMessageViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriptionTypeID: ").append(toIndentedString(subscriptionTypeID)).append("\n");
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


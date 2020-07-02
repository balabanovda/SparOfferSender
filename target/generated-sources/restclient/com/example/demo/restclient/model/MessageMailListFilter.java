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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * MessageMailListFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class MessageMailListFilter {
  @JsonProperty("dateFrom")
  private OffsetDateTime dateFrom = null;

  @JsonProperty("dateTo")
  private OffsetDateTime dateTo = null;

  @JsonProperty("toEmail")
  private String toEmail = null;

  @JsonProperty("header")
  private String header = null;

  /**
   * Gets or Sets state
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
  private List<StateEnum> state = null;

  @JsonProperty("personUid")
  private UUID personUid = null;

  public MessageMailListFilter dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Get dateFrom
   * @return dateFrom
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }

  public MessageMailListFilter dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Get dateTo
   * @return dateTo
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }

  public MessageMailListFilter toEmail(String toEmail) {
    this.toEmail = toEmail;
    return this;
  }

   /**
   * Get toEmail
   * @return toEmail
  **/
  @ApiModelProperty(value = "")
  public String getToEmail() {
    return toEmail;
  }

  public void setToEmail(String toEmail) {
    this.toEmail = toEmail;
  }

  public MessageMailListFilter header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(value = "")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public MessageMailListFilter state(List<StateEnum> state) {
    this.state = state;
    return this;
  }

  public MessageMailListFilter addStateItem(StateEnum stateItem) {
    if (this.state == null) {
      this.state = new ArrayList<>();
    }
    this.state.add(stateItem);
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public List<StateEnum> getState() {
    return state;
  }

  public void setState(List<StateEnum> state) {
    this.state = state;
  }

  public MessageMailListFilter personUid(UUID personUid) {
    this.personUid = personUid;
    return this;
  }

   /**
   * Get personUid
   * @return personUid
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getPersonUid() {
    return personUid;
  }

  public void setPersonUid(UUID personUid) {
    this.personUid = personUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageMailListFilter messageMailListFilter = (MessageMailListFilter) o;
    return Objects.equals(this.dateFrom, messageMailListFilter.dateFrom) &&
        Objects.equals(this.dateTo, messageMailListFilter.dateTo) &&
        Objects.equals(this.toEmail, messageMailListFilter.toEmail) &&
        Objects.equals(this.header, messageMailListFilter.header) &&
        Objects.equals(this.state, messageMailListFilter.state) &&
        Objects.equals(this.personUid, messageMailListFilter.personUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, toEmail, header, state, personUid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageMailListFilter {\n");
    
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    toEmail: ").append(toIndentedString(toEmail)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    personUid: ").append(toIndentedString(personUid)).append("\n");
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

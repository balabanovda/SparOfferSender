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
import com.example.demo.restclient.model.CallCenterOperationBaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Модель для блокировки карт.
 */
@ApiModel(description = "Модель для блокировки карт.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class BlockCardModel {
  @JsonProperty("ticketId")
  private String ticketId = null;

  @JsonProperty("cardID")
  private Integer cardID = null;

  @JsonProperty("callerPhone")
  private String callerPhone = null;

  @JsonProperty("comment")
  private String comment = null;

  public BlockCardModel ticketId(String ticketId) {
    this.ticketId = ticketId;
    return this;
  }

   /**
   * Идентификатор заявки в OTRS.
   * @return ticketId
  **/
  @ApiModelProperty(value = "Идентификатор заявки в OTRS.")
  public String getTicketId() {
    return ticketId;
  }

  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }

  public BlockCardModel cardID(Integer cardID) {
    this.cardID = cardID;
    return this;
  }

   /**
   * Идентификатор карты.
   * @return cardID
  **/
  @ApiModelProperty(value = "Идентификатор карты.")
  public Integer getCardID() {
    return cardID;
  }

  public void setCardID(Integer cardID) {
    this.cardID = cardID;
  }

  public BlockCardModel callerPhone(String callerPhone) {
    this.callerPhone = callerPhone;
    return this;
  }

   /**
   * Номер телефона звонящего.
   * @return callerPhone
  **/
  @ApiModelProperty(value = "Номер телефона звонящего.")
  public String getCallerPhone() {
    return callerPhone;
  }

  public void setCallerPhone(String callerPhone) {
    this.callerPhone = callerPhone;
  }

  public BlockCardModel comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Комментарий.
   * @return comment
  **/
  @ApiModelProperty(value = "Комментарий.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockCardModel blockCardModel = (BlockCardModel) o;
    return Objects.equals(this.ticketId, blockCardModel.ticketId) &&
        Objects.equals(this.cardID, blockCardModel.cardID) &&
        Objects.equals(this.callerPhone, blockCardModel.callerPhone) &&
        Objects.equals(this.comment, blockCardModel.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketId, cardID, callerPhone, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockCardModel {\n");
    
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    cardID: ").append(toIndentedString(cardID)).append("\n");
    sb.append("    callerPhone: ").append(toIndentedString(callerPhone)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

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
import com.example.demo.restclient.model.EditOfferModelBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * Модель отправки акции на согласование.
 */
@ApiModel(description = "Модель отправки акции на согласование.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class SendOfferToApprovalModel {
  @JsonProperty("offerId")
  private Integer offerId = null;

  @JsonProperty("applyChangesDate")
  private OffsetDateTime applyChangesDate = null;

  @JsonProperty("comment")
  private String comment = null;

  public SendOfferToApprovalModel offerId(Integer offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Id акции.
   * @return offerId
  **/
  @ApiModelProperty(value = "Id акции.")
  public Integer getOfferId() {
    return offerId;
  }

  public void setOfferId(Integer offerId) {
    this.offerId = offerId;
  }

  public SendOfferToApprovalModel applyChangesDate(OffsetDateTime applyChangesDate) {
    this.applyChangesDate = applyChangesDate;
    return this;
  }

   /**
   * Дата вступления изменений в силу.
   * @return applyChangesDate
  **/
  @ApiModelProperty(value = "Дата вступления изменений в силу.")
  public OffsetDateTime getApplyChangesDate() {
    return applyChangesDate;
  }

  public void setApplyChangesDate(OffsetDateTime applyChangesDate) {
    this.applyChangesDate = applyChangesDate;
  }

  public SendOfferToApprovalModel comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Комментарий для согласования.
   * @return comment
  **/
  @ApiModelProperty(value = "Комментарий для согласования.")
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
    SendOfferToApprovalModel sendOfferToApprovalModel = (SendOfferToApprovalModel) o;
    return Objects.equals(this.offerId, sendOfferToApprovalModel.offerId) &&
        Objects.equals(this.applyChangesDate, sendOfferToApprovalModel.applyChangesDate) &&
        Objects.equals(this.comment, sendOfferToApprovalModel.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, applyChangesDate, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendOfferToApprovalModel {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    applyChangesDate: ").append(toIndentedString(applyChangesDate)).append("\n");
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


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

/**
 * Модель отклонения изменений акции.
 */
@ApiModel(description = "Модель отклонения изменений акции.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class RejectOfferChangesModel {
  @JsonProperty("offerId")
  private Integer offerId = null;

  @JsonProperty("reason")
  private String reason = null;

  public RejectOfferChangesModel offerId(Integer offerId) {
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

  public RejectOfferChangesModel reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Причина отклонения.
   * @return reason
  **/
  @ApiModelProperty(value = "Причина отклонения.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectOfferChangesModel rejectOfferChangesModel = (RejectOfferChangesModel) o;
    return Objects.equals(this.offerId, rejectOfferChangesModel.offerId) &&
        Objects.equals(this.reason, rejectOfferChangesModel.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectOfferChangesModel {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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


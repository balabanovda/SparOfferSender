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
import java.util.UUID;

/**
 * Ссылка на акцию.
 */
@ApiModel(description = "Ссылка на акцию.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class OfferLinkDto {
  @JsonProperty("offerId")
  private String offerId = null;

  @JsonProperty("partnerId")
  private UUID partnerId = null;

  public OfferLinkDto offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Внешний идентификатор акции.
   * @return offerId
  **/
  @ApiModelProperty(value = "Внешний идентификатор акции.")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OfferLinkDto partnerId(UUID partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Идентификатор партнера акции.
   * @return partnerId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Идентификатор партнера акции.")
  public UUID getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(UUID partnerId) {
    this.partnerId = partnerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferLinkDto offerLinkDto = (OfferLinkDto) o;
    return Objects.equals(this.offerId, offerLinkDto.offerId) &&
        Objects.equals(this.partnerId, offerLinkDto.partnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, partnerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferLinkDto {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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


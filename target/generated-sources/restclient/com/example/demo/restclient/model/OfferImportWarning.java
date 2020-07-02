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
import com.example.demo.restclient.model.ImportWarning;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Предупреждение, возникшие при импорте, с идентификатором акций.
 */
@ApiModel(description = "Предупреждение, возникшие при импорте, с идентификатором акций.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class OfferImportWarning {
  @JsonProperty("offerId")
  private String offerId = null;

  @JsonProperty("warning")
  private ImportWarning warning = null;

  public OfferImportWarning offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Идентификатор акции.
   * @return offerId
  **/
  @ApiModelProperty(value = "Идентификатор акции.")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OfferImportWarning warning(ImportWarning warning) {
    this.warning = warning;
    return this;
  }

   /**
   * Предупреждение, возникающее при импорте.
   * @return warning
  **/
  @ApiModelProperty(value = "Предупреждение, возникающее при импорте.")
  public ImportWarning getWarning() {
    return warning;
  }

  public void setWarning(ImportWarning warning) {
    this.warning = warning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferImportWarning offerImportWarning = (OfferImportWarning) o;
    return Objects.equals(this.offerId, offerImportWarning.offerId) &&
        Objects.equals(this.warning, offerImportWarning.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, warning);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferImportWarning {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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


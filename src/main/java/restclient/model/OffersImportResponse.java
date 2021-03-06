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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Ответ на запрос импорта акций.
 */
@ApiModel(description = "Ответ на запрос импорта акций.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class OffersImportResponse {
  @JsonProperty("inserted")
  private Integer inserted = null;

  @JsonProperty("updated")
  private Integer updated = null;

  @JsonProperty("skipped")
  private Integer skipped = null;

  @JsonProperty("errors")
  private List<OfferImportError> errors = null;

  @JsonProperty("offerImportWarnings")
  private List<OfferImportWarning> offerImportWarnings = null;

  public OffersImportResponse inserted(Integer inserted) {
    this.inserted = inserted;
    return this;
  }

   /**
   * Количество новых акций.
   * @return inserted
  **/
  @ApiModelProperty(value = "Количество новых акций.")
  public Integer getInserted() {
    return inserted;
  }

  public void setInserted(Integer inserted) {
    this.inserted = inserted;
  }

  public OffersImportResponse updated(Integer updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Количество обновленных акций.
   * @return updated
  **/
  @ApiModelProperty(value = "Количество обновленных акций.")
  public Integer getUpdated() {
    return updated;
  }

  public void setUpdated(Integer updated) {
    this.updated = updated;
  }

  public OffersImportResponse skipped(Integer skipped) {
    this.skipped = skipped;
    return this;
  }

   /**
   * Количество неизмененных акций.
   * @return skipped
  **/
  @ApiModelProperty(value = "Количество неизмененных акций.")
  public Integer getSkipped() {
    return skipped;
  }

  public void setSkipped(Integer skipped) {
    this.skipped = skipped;
  }

  public OffersImportResponse errors(List<OfferImportError> errors) {
    this.errors = errors;
    return this;
  }

  public OffersImportResponse addErrorsItem(OfferImportError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Ошибки импорта по акциям.
   * @return errors
  **/
  @ApiModelProperty(value = "Ошибки импорта по акциям.")
  public List<OfferImportError> getErrors() {
    return errors;
  }

  public void setErrors(List<OfferImportError> errors) {
    this.errors = errors;
  }

  public OffersImportResponse offerImportWarnings(List<OfferImportWarning> offerImportWarnings) {
    this.offerImportWarnings = offerImportWarnings;
    return this;
  }

  public OffersImportResponse addOfferImportWarningsItem(OfferImportWarning offerImportWarningsItem) {
    if (this.offerImportWarnings == null) {
      this.offerImportWarnings = new ArrayList<>();
    }
    this.offerImportWarnings.add(offerImportWarningsItem);
    return this;
  }

   /**
   * Предупреждения, возникшие при импорте, с идентификаторами акций.
   * @return offerImportWarnings
  **/
  @ApiModelProperty(value = "Предупреждения, возникшие при импорте, с идентификаторами акций.")
  public List<OfferImportWarning> getOfferImportWarnings() {
    return offerImportWarnings;
  }

  public void setOfferImportWarnings(List<OfferImportWarning> offerImportWarnings) {
    this.offerImportWarnings = offerImportWarnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffersImportResponse offersImportResponse = (OffersImportResponse) o;
    return Objects.equals(this.inserted, offersImportResponse.inserted) &&
        Objects.equals(this.updated, offersImportResponse.updated) &&
        Objects.equals(this.skipped, offersImportResponse.skipped) &&
        Objects.equals(this.errors, offersImportResponse.errors) &&
        Objects.equals(this.offerImportWarnings, offersImportResponse.offerImportWarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inserted, updated, skipped, errors, offerImportWarnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffersImportResponse {\n");
    
    sb.append("    inserted: ").append(toIndentedString(inserted)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    offerImportWarnings: ").append(toIndentedString(offerImportWarnings)).append("\n");
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


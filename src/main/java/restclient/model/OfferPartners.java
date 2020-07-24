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
 * Партнеры, к которым относится акция.
 */
@ApiModel(description = "Партнеры, к которым относится акция.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class OfferPartners {
  @JsonProperty("partners")
  private List<PartnerDto> partners = null;

  public OfferPartners partners(List<PartnerDto> partners) {
    this.partners = partners;
    return this;
  }

  public OfferPartners addPartnersItem(PartnerDto partnersItem) {
    if (this.partners == null) {
      this.partners = new ArrayList<>();
    }
    this.partners.add(partnersItem);
    return this;
  }

   /**
   * Коллекция партнеров.
   * @return partners
  **/
  @ApiModelProperty(value = "Коллекция партнеров.")
  public List<PartnerDto> getPartners() {
    return partners;
  }

  public void setPartners(List<PartnerDto> partners) {
    this.partners = partners;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPartners offerPartners = (OfferPartners) o;
    return Objects.equals(this.partners, offerPartners.partners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partners);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPartners {\n");
    
    sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
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

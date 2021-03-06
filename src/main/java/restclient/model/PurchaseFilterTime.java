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

/**
 * Время покупок.
 */
@ApiModel(description = "Время покупок.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PurchaseFilterTime {
  @JsonProperty("beginHour")
  private Integer beginHour = null;

  @JsonProperty("beginMinute")
  private Integer beginMinute = null;

  @JsonProperty("endHour")
  private Integer endHour = null;

  @JsonProperty("endMinute")
  private Integer endMinute = null;

  public PurchaseFilterTime beginHour(Integer beginHour) {
    this.beginHour = beginHour;
    return this;
  }

   /**
   * Часы начала.
   * @return beginHour
  **/
  @ApiModelProperty(value = "Часы начала.")
  public Integer getBeginHour() {
    return beginHour;
  }

  public void setBeginHour(Integer beginHour) {
    this.beginHour = beginHour;
  }

  public PurchaseFilterTime beginMinute(Integer beginMinute) {
    this.beginMinute = beginMinute;
    return this;
  }

   /**
   * Минуты начала.
   * @return beginMinute
  **/
  @ApiModelProperty(value = "Минуты начала.")
  public Integer getBeginMinute() {
    return beginMinute;
  }

  public void setBeginMinute(Integer beginMinute) {
    this.beginMinute = beginMinute;
  }

  public PurchaseFilterTime endHour(Integer endHour) {
    this.endHour = endHour;
    return this;
  }

   /**
   * Часы окончания.
   * @return endHour
  **/
  @ApiModelProperty(value = "Часы окончания.")
  public Integer getEndHour() {
    return endHour;
  }

  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }

  public PurchaseFilterTime endMinute(Integer endMinute) {
    this.endMinute = endMinute;
    return this;
  }

   /**
   * Минуты окончания.
   * @return endMinute
  **/
  @ApiModelProperty(value = "Минуты окончания.")
  public Integer getEndMinute() {
    return endMinute;
  }

  public void setEndMinute(Integer endMinute) {
    this.endMinute = endMinute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseFilterTime purchaseFilterTime = (PurchaseFilterTime) o;
    return Objects.equals(this.beginHour, purchaseFilterTime.beginHour) &&
        Objects.equals(this.beginMinute, purchaseFilterTime.beginMinute) &&
        Objects.equals(this.endHour, purchaseFilterTime.endHour) &&
        Objects.equals(this.endMinute, purchaseFilterTime.endMinute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginHour, beginMinute, endHour, endMinute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseFilterTime {\n");
    
    sb.append("    beginHour: ").append(toIndentedString(beginHour)).append("\n");
    sb.append("    beginMinute: ").append(toIndentedString(beginMinute)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    endMinute: ").append(toIndentedString(endMinute)).append("\n");
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


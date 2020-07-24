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
 * Модель для внешних способов оплатов.
 */
@ApiModel(description = "Модель для внешних способов оплатов.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class DeviceEmulationAddOtherPaymentModel {
  @JsonProperty("cashAmount")
  private Double cashAmount = null;

  @JsonProperty("otherPaymentType")
  private String otherPaymentType = null;

  public DeviceEmulationAddOtherPaymentModel cashAmount(Double cashAmount) {
    this.cashAmount = cashAmount;
    return this;
  }

   /**
   * Сумма.
   * @return cashAmount
  **/
  @ApiModelProperty(value = "Сумма.")
  public Double getCashAmount() {
    return cashAmount;
  }

  public void setCashAmount(Double cashAmount) {
    this.cashAmount = cashAmount;
  }

  public DeviceEmulationAddOtherPaymentModel otherPaymentType(String otherPaymentType) {
    this.otherPaymentType = otherPaymentType;
    return this;
  }

   /**
   * Способ оплаты отличный от дефолтного.
   * @return otherPaymentType
  **/
  @ApiModelProperty(value = "Способ оплаты отличный от дефолтного.")
  public String getOtherPaymentType() {
    return otherPaymentType;
  }

  public void setOtherPaymentType(String otherPaymentType) {
    this.otherPaymentType = otherPaymentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEmulationAddOtherPaymentModel deviceEmulationAddOtherPaymentModel = (DeviceEmulationAddOtherPaymentModel) o;
    return Objects.equals(this.cashAmount, deviceEmulationAddOtherPaymentModel.cashAmount) &&
        Objects.equals(this.otherPaymentType, deviceEmulationAddOtherPaymentModel.otherPaymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashAmount, otherPaymentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEmulationAddOtherPaymentModel {\n");
    
    sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
    sb.append("    otherPaymentType: ").append(toIndentedString(otherPaymentType)).append("\n");
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

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
 * Модель добавления оплаты.
 */
@ApiModel(description = "Модель добавления оплаты.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class DeviceEmulationAddBonusPaymentModel {
  @JsonProperty("identifier")
  private DeviceEmulationIdentifierViewModel identifier = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("pin")
  private String pin = null;

  public DeviceEmulationAddBonusPaymentModel identifier(DeviceEmulationIdentifierViewModel identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Идентификатор пользователя.
   * @return identifier
  **/
  @ApiModelProperty(value = "Идентификатор пользователя.")
  public DeviceEmulationIdentifierViewModel getIdentifier() {
    return identifier;
  }

  public void setIdentifier(DeviceEmulationIdentifierViewModel identifier) {
    this.identifier = identifier;
  }

  public DeviceEmulationAddBonusPaymentModel amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Сумма.
   * @return amount
  **/
  @ApiModelProperty(value = "Сумма.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public DeviceEmulationAddBonusPaymentModel pin(String pin) {
    this.pin = pin;
    return this;
  }

   /**
   * Код подтверждения.
   * @return pin
  **/
  @ApiModelProperty(value = "Код подтверждения.")
  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEmulationAddBonusPaymentModel deviceEmulationAddBonusPaymentModel = (DeviceEmulationAddBonusPaymentModel) o;
    return Objects.equals(this.identifier, deviceEmulationAddBonusPaymentModel.identifier) &&
        Objects.equals(this.amount, deviceEmulationAddBonusPaymentModel.amount) &&
        Objects.equals(this.pin, deviceEmulationAddBonusPaymentModel.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, amount, pin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEmulationAddBonusPaymentModel {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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


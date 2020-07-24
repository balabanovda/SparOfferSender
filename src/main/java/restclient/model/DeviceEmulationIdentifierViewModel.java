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
 * Модель идентификатора пользователя в покупке.
 */
@ApiModel(description = "Модель идентификатора пользователя в покупке.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class DeviceEmulationIdentifierViewModel {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("loyaltyProgram")
  private String loyaltyProgram = null;

  public DeviceEmulationIdentifierViewModel value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Значение.
   * @return value
  **/
  @ApiModelProperty(value = "Значение.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DeviceEmulationIdentifierViewModel loyaltyProgram(String loyaltyProgram) {
    this.loyaltyProgram = loyaltyProgram;
    return this;
  }

   /**
   * Программа лояльности.
   * @return loyaltyProgram
  **/
  @ApiModelProperty(value = "Программа лояльности.")
  public String getLoyaltyProgram() {
    return loyaltyProgram;
  }

  public void setLoyaltyProgram(String loyaltyProgram) {
    this.loyaltyProgram = loyaltyProgram;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEmulationIdentifierViewModel deviceEmulationIdentifierViewModel = (DeviceEmulationIdentifierViewModel) o;
    return Objects.equals(this.value, deviceEmulationIdentifierViewModel.value) &&
        Objects.equals(this.loyaltyProgram, deviceEmulationIdentifierViewModel.loyaltyProgram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, loyaltyProgram);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEmulationIdentifierViewModel {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    loyaltyProgram: ").append(toIndentedString(loyaltyProgram)).append("\n");
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

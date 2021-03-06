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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Модель параметра чековой позиции.
 */
@ApiModel(description = "Модель параметра чековой позиции.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class DeviceEmulationPositionParamViewModel {
  /**
   * Тип.
   */
  public enum ParameterTypeEnum {
    DECIMAL("Decimal"),
    
    STRING("String");

    private String value;

    ParameterTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ParameterTypeEnum fromValue(String text) {
      for (ParameterTypeEnum b : ParameterTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("parameterType")
  private ParameterTypeEnum parameterType = null;

  @JsonProperty("parameterName")
  private String parameterName = null;

  @JsonProperty("parameterValue")
  private String parameterValue = null;

  public DeviceEmulationPositionParamViewModel parameterType(ParameterTypeEnum parameterType) {
    this.parameterType = parameterType;
    return this;
  }

   /**
   * Тип.
   * @return parameterType
  **/
  @ApiModelProperty(value = "Тип.")
  public ParameterTypeEnum getParameterType() {
    return parameterType;
  }

  public void setParameterType(ParameterTypeEnum parameterType) {
    this.parameterType = parameterType;
  }

  public DeviceEmulationPositionParamViewModel parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Название.
   * @return parameterName
  **/
  @ApiModelProperty(value = "Название.")
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  public DeviceEmulationPositionParamViewModel parameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

   /**
   * Значение.
   * @return parameterValue
  **/
  @ApiModelProperty(value = "Значение.")
  public String getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEmulationPositionParamViewModel deviceEmulationPositionParamViewModel = (DeviceEmulationPositionParamViewModel) o;
    return Objects.equals(this.parameterType, deviceEmulationPositionParamViewModel.parameterType) &&
        Objects.equals(this.parameterName, deviceEmulationPositionParamViewModel.parameterName) &&
        Objects.equals(this.parameterValue, deviceEmulationPositionParamViewModel.parameterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterType, parameterName, parameterValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEmulationPositionParamViewModel {\n");
    
    sb.append("    parameterType: ").append(toIndentedString(parameterType)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
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


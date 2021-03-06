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
 * Модель для значения партнерского атрибута.
 */
@ApiModel(description = "Модель для значения партнерского атрибута.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PartnerAttributeValueModel {
  @JsonProperty("logicalName")
  private String logicalName = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("displayName")
  private String displayName = null;

  public PartnerAttributeValueModel logicalName(String logicalName) {
    this.logicalName = logicalName;
    return this;
  }

   /**
   * Логическое имя.
   * @return logicalName
  **/
  @ApiModelProperty(value = "Логическое имя.")
  public String getLogicalName() {
    return logicalName;
  }

  public void setLogicalName(String logicalName) {
    this.logicalName = logicalName;
  }

  public PartnerAttributeValueModel value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Значение атрибута.
   * @return value
  **/
  @ApiModelProperty(value = "Значение атрибута.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public PartnerAttributeValueModel displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Имя для отображения.
   * @return displayName
  **/
  @ApiModelProperty(value = "Имя для отображения.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerAttributeValueModel partnerAttributeValueModel = (PartnerAttributeValueModel) o;
    return Objects.equals(this.logicalName, partnerAttributeValueModel.logicalName) &&
        Objects.equals(this.value, partnerAttributeValueModel.value) &&
        Objects.equals(this.displayName, partnerAttributeValueModel.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalName, value, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerAttributeValueModel {\n");
    
    sb.append("    logicalName: ").append(toIndentedString(logicalName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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


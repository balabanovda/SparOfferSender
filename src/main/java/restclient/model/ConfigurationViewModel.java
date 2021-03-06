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
 * Модель представления для конфигураций.
 */
@ApiModel(description = "Модель представления для конфигураций.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ConfigurationViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public ConfigurationViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID.
   * @return id
  **/
  @ApiModelProperty(value = "ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ConfigurationViewModel key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Ключ.
   * @return key
  **/
  @ApiModelProperty(value = "Ключ.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ConfigurationViewModel value(String value) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationViewModel configurationViewModel = (ConfigurationViewModel) o;
    return Objects.equals(this.id, configurationViewModel.id) &&
        Objects.equals(this.key, configurationViewModel.key) &&
        Objects.equals(this.value, configurationViewModel.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


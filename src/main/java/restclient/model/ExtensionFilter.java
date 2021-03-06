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
 * Фильтр плагинов.
 */
@ApiModel(description = "Фильтр плагинов.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ExtensionFilter {
  @JsonProperty("nameSearchedText")
  private String nameSearchedText = null;

  @JsonProperty("classNameSearchedText")
  private String classNameSearchedText = null;

  @JsonProperty("isDisabled")
  private Boolean isDisabled = null;

  public ExtensionFilter nameSearchedText(String nameSearchedText) {
    this.nameSearchedText = nameSearchedText;
    return this;
  }

   /**
   * Текст поиска в имени.
   * @return nameSearchedText
  **/
  @ApiModelProperty(value = "Текст поиска в имени.")
  public String getNameSearchedText() {
    return nameSearchedText;
  }

  public void setNameSearchedText(String nameSearchedText) {
    this.nameSearchedText = nameSearchedText;
  }

  public ExtensionFilter classNameSearchedText(String classNameSearchedText) {
    this.classNameSearchedText = classNameSearchedText;
    return this;
  }

   /**
   * Текст поиска в имени класса.
   * @return classNameSearchedText
  **/
  @ApiModelProperty(value = "Текст поиска в имени класса.")
  public String getClassNameSearchedText() {
    return classNameSearchedText;
  }

  public void setClassNameSearchedText(String classNameSearchedText) {
    this.classNameSearchedText = classNameSearchedText;
  }

  public ExtensionFilter isDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Состояние.
   * @return isDisabled
  **/
  @ApiModelProperty(value = "Состояние.")
  public Boolean isIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionFilter extensionFilter = (ExtensionFilter) o;
    return Objects.equals(this.nameSearchedText, extensionFilter.nameSearchedText) &&
        Objects.equals(this.classNameSearchedText, extensionFilter.classNameSearchedText) &&
        Objects.equals(this.isDisabled, extensionFilter.isDisabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameSearchedText, classNameSearchedText, isDisabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionFilter {\n");
    
    sb.append("    nameSearchedText: ").append(toIndentedString(nameSearchedText)).append("\n");
    sb.append("    classNameSearchedText: ").append(toIndentedString(classNameSearchedText)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
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


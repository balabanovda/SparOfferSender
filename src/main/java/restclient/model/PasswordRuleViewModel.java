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
 * Модель представления для {Loymax.Domain.Contract.Model.Person.Password.IPasswordRule}.
 */
@ApiModel(description = "Модель представления для {Loymax.Domain.Contract.Model.Person.Password.IPasswordRule}.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PasswordRuleViewModel {
  /**
   * Тип.
   */
  public enum TypeEnum {
    LENGTH("Length"),
    
    LATINCHARACTERS("LatinCharacters"),
    
    CAPITALLETTERS("CapitalLetters"),
    
    NUMBERS("Numbers"),
    
    SPECIALCHARACTERS("SpecialCharacters");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("isUsed")
  private Boolean isUsed = null;

  @JsonProperty("isRequired")
  private Boolean isRequired = null;

  @JsonProperty("minCount")
  private Integer minCount = null;

  @JsonProperty("maxCount")
  private Integer maxCount = null;

  @JsonProperty("additionalInformation")
  private String additionalInformation = null;

  public PasswordRuleViewModel type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Тип.
   * @return type
  **/
  @ApiModelProperty(value = "Тип.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PasswordRuleViewModel isUsed(Boolean isUsed) {
    this.isUsed = isUsed;
    return this;
  }

   /**
   * Используется.
   * @return isUsed
  **/
  @ApiModelProperty(value = "Используется.")
  public Boolean isIsUsed() {
    return isUsed;
  }

  public void setIsUsed(Boolean isUsed) {
    this.isUsed = isUsed;
  }

  public PasswordRuleViewModel isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Обязательное.
   * @return isRequired
  **/
  @ApiModelProperty(value = "Обязательное.")
  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public PasswordRuleViewModel minCount(Integer minCount) {
    this.minCount = minCount;
    return this;
  }

   /**
   * Минимальное количество.
   * @return minCount
  **/
  @ApiModelProperty(value = "Минимальное количество.")
  public Integer getMinCount() {
    return minCount;
  }

  public void setMinCount(Integer minCount) {
    this.minCount = minCount;
  }

  public PasswordRuleViewModel maxCount(Integer maxCount) {
    this.maxCount = maxCount;
    return this;
  }

   /**
   * Максимальное количество.
   * @return maxCount
  **/
  @ApiModelProperty(value = "Максимальное количество.")
  public Integer getMaxCount() {
    return maxCount;
  }

  public void setMaxCount(Integer maxCount) {
    this.maxCount = maxCount;
  }

  public PasswordRuleViewModel additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Дополнительная информация.
   * @return additionalInformation
  **/
  @ApiModelProperty(value = "Дополнительная информация.")
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordRuleViewModel passwordRuleViewModel = (PasswordRuleViewModel) o;
    return Objects.equals(this.type, passwordRuleViewModel.type) &&
        Objects.equals(this.isUsed, passwordRuleViewModel.isUsed) &&
        Objects.equals(this.isRequired, passwordRuleViewModel.isRequired) &&
        Objects.equals(this.minCount, passwordRuleViewModel.minCount) &&
        Objects.equals(this.maxCount, passwordRuleViewModel.maxCount) &&
        Objects.equals(this.additionalInformation, passwordRuleViewModel.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, isUsed, isRequired, minCount, maxCount, additionalInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordRuleViewModel {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isUsed: ").append(toIndentedString(isUsed)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    minCount: ").append(toIndentedString(minCount)).append("\n");
    sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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


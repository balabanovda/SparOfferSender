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


package com.example.demo.restclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.example.demo.restclient.model.FilterDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * Фильтр \&quot;Дни\&quot;.
 */
@ApiModel(description = "Фильтр \"Дни\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class DateFilterDto {
  @JsonProperty("name")
  private String name = null;

  /**
   * Оператор сравнения.
   */
  public enum OperatorEnum {
    MORE("More"),
    
    LESS("Less"),
    
    EQUALS("Equals"),
    
    BETWEEN("Between"),
    
    MOREOREQUAL("MoreOrEqual"),
    
    LESSOREQUAL("LessOrEqual"),
    
    BETWEENLESSEQUAL("BetweenLessEqual"),
    
    BETWEENMOREEQUAL("BetweenMoreEqual"),
    
    BETWEENEQUAL("BetweenEqual"),
    
    EACH("Each");

    private String value;

    OperatorEnum(String value) {
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
    public static OperatorEnum fromValue(String text) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operator")
  private OperatorEnum operator = null;

  @JsonProperty("firstValueAsString")
  private String firstValueAsString = null;

  @JsonProperty("secondValueAsString")
  private String secondValueAsString = null;

  @JsonProperty("firstValue")
  private OffsetDateTime firstValue = null;

  @JsonProperty("secondValue")
  private OffsetDateTime secondValue = null;

  public DateFilterDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Имя фильтра.
   * @return name
  **/
  @ApiModelProperty(value = "Имя фильтра.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DateFilterDto operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Оператор сравнения.
   * @return operator
  **/
  @ApiModelProperty(value = "Оператор сравнения.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public DateFilterDto firstValueAsString(String firstValueAsString) {
    this.firstValueAsString = firstValueAsString;
    return this;
  }

   /**
   * Первое значение (pure xml).
   * @return firstValueAsString
  **/
  @ApiModelProperty(value = "Первое значение (pure xml).")
  public String getFirstValueAsString() {
    return firstValueAsString;
  }

  public void setFirstValueAsString(String firstValueAsString) {
    this.firstValueAsString = firstValueAsString;
  }

  public DateFilterDto secondValueAsString(String secondValueAsString) {
    this.secondValueAsString = secondValueAsString;
    return this;
  }

   /**
   * Второе значение (pure xml).
   * @return secondValueAsString
  **/
  @ApiModelProperty(value = "Второе значение (pure xml).")
  public String getSecondValueAsString() {
    return secondValueAsString;
  }

  public void setSecondValueAsString(String secondValueAsString) {
    this.secondValueAsString = secondValueAsString;
  }

  public DateFilterDto firstValue(OffsetDateTime firstValue) {
    this.firstValue = firstValue;
    return this;
  }

   /**
   * Первое значение.
   * @return firstValue
  **/
  @ApiModelProperty(value = "Первое значение.")
  public OffsetDateTime getFirstValue() {
    return firstValue;
  }

  public void setFirstValue(OffsetDateTime firstValue) {
    this.firstValue = firstValue;
  }

  public DateFilterDto secondValue(OffsetDateTime secondValue) {
    this.secondValue = secondValue;
    return this;
  }

   /**
   * Второе значение.
   * @return secondValue
  **/
  @ApiModelProperty(value = "Второе значение.")
  public OffsetDateTime getSecondValue() {
    return secondValue;
  }

  public void setSecondValue(OffsetDateTime secondValue) {
    this.secondValue = secondValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateFilterDto dateFilterDto = (DateFilterDto) o;
    return Objects.equals(this.name, dateFilterDto.name) &&
        Objects.equals(this.operator, dateFilterDto.operator) &&
        Objects.equals(this.firstValueAsString, dateFilterDto.firstValueAsString) &&
        Objects.equals(this.secondValueAsString, dateFilterDto.secondValueAsString) &&
        Objects.equals(this.firstValue, dateFilterDto.firstValue) &&
        Objects.equals(this.secondValue, dateFilterDto.secondValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operator, firstValueAsString, secondValueAsString, firstValue, secondValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateFilterDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    firstValueAsString: ").append(toIndentedString(firstValueAsString)).append("\n");
    sb.append("    secondValueAsString: ").append(toIndentedString(secondValueAsString)).append("\n");
    sb.append("    firstValue: ").append(toIndentedString(firstValue)).append("\n");
    sb.append("    secondValue: ").append(toIndentedString(secondValue)).append("\n");
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


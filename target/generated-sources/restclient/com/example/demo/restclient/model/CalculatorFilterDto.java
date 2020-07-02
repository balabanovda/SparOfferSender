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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Фильтр \&quot;Фильтр по репозиторию\&quot;.
 */
@ApiModel(description = "Фильтр \"Фильтр по репозиторию\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CalculatorFilterDto {
  @JsonProperty("calculatorId")
  private Integer calculatorId = null;

  /**
   * Операция.
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

  @JsonProperty("firstValue")
  private Double firstValue = null;

  @JsonProperty("secondValue")
  private Double secondValue = null;

  @JsonProperty("name")
  private String name = null;

  public CalculatorFilterDto calculatorId(Integer calculatorId) {
    this.calculatorId = calculatorId;
    return this;
  }

   /**
   * Id калькулятора.
   * @return calculatorId
  **/
  @ApiModelProperty(value = "Id калькулятора.")
  public Integer getCalculatorId() {
    return calculatorId;
  }

  public void setCalculatorId(Integer calculatorId) {
    this.calculatorId = calculatorId;
  }

  public CalculatorFilterDto operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Операция.
   * @return operator
  **/
  @ApiModelProperty(value = "Операция.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public CalculatorFilterDto firstValue(Double firstValue) {
    this.firstValue = firstValue;
    return this;
  }

   /**
   * Первое значение.
   * @return firstValue
  **/
  @ApiModelProperty(value = "Первое значение.")
  public Double getFirstValue() {
    return firstValue;
  }

  public void setFirstValue(Double firstValue) {
    this.firstValue = firstValue;
  }

  public CalculatorFilterDto secondValue(Double secondValue) {
    this.secondValue = secondValue;
    return this;
  }

   /**
   * Второе значение.
   * @return secondValue
  **/
  @ApiModelProperty(value = "Второе значение.")
  public Double getSecondValue() {
    return secondValue;
  }

  public void setSecondValue(Double secondValue) {
    this.secondValue = secondValue;
  }

  public CalculatorFilterDto name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculatorFilterDto calculatorFilterDto = (CalculatorFilterDto) o;
    return Objects.equals(this.calculatorId, calculatorFilterDto.calculatorId) &&
        Objects.equals(this.operator, calculatorFilterDto.operator) &&
        Objects.equals(this.firstValue, calculatorFilterDto.firstValue) &&
        Objects.equals(this.secondValue, calculatorFilterDto.secondValue) &&
        Objects.equals(this.name, calculatorFilterDto.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatorId, operator, firstValue, secondValue, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculatorFilterDto {\n");
    
    sb.append("    calculatorId: ").append(toIndentedString(calculatorId)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    firstValue: ").append(toIndentedString(firstValue)).append("\n");
    sb.append("    secondValue: ").append(toIndentedString(secondValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


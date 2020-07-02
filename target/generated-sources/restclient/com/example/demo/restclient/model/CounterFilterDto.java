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
import com.example.demo.restclient.model.BaseCounterDto;
import com.example.demo.restclient.model.FilterDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Фильтр \&quot;Счётчик\&quot;.
 */
@ApiModel(description = "Фильтр \"Счётчик\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CounterFilterDto {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("counter")
  private BaseCounterDto counter = null;

  /**
   * Тип операции сравнения.
   */
  public enum OperationEnum {
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

    OperationEnum(String value) {
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
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation = null;

  @JsonProperty("value")
  private Double value = null;

  public CounterFilterDto name(String name) {
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

  public CounterFilterDto counter(BaseCounterDto counter) {
    this.counter = counter;
    return this;
  }

   /**
   * Cчетчик.
   * @return counter
  **/
  @ApiModelProperty(value = "Cчетчик.")
  public BaseCounterDto getCounter() {
    return counter;
  }

  public void setCounter(BaseCounterDto counter) {
    this.counter = counter;
  }

  public CounterFilterDto operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Тип операции сравнения.
   * @return operation
  **/
  @ApiModelProperty(value = "Тип операции сравнения.")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public CounterFilterDto value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Значение для сравнения.
   * @return value
  **/
  @ApiModelProperty(value = "Значение для сравнения.")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
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
    CounterFilterDto counterFilterDto = (CounterFilterDto) o;
    return Objects.equals(this.name, counterFilterDto.name) &&
        Objects.equals(this.counter, counterFilterDto.counter) &&
        Objects.equals(this.operation, counterFilterDto.operation) &&
        Objects.equals(this.value, counterFilterDto.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, counter, operation, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterFilterDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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


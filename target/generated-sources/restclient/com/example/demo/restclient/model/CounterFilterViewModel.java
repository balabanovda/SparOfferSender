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
import com.example.demo.restclient.model.FilterViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * View модель фильтра \&quot;Счётчик\&quot;.
 */
@ApiModel(description = "View модель фильтра \"Счётчик\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CounterFilterViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isDeletedFilterType")
  private Boolean isDeletedFilterType = null;

  @JsonProperty("counterId")
  private Integer counterId = null;

  @JsonProperty("counterName")
  private String counterName = null;

  /**
   * Вид сравнения.
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

  public CounterFilterViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CounterFilterViewModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CounterFilterViewModel isDeletedFilterType(Boolean isDeletedFilterType) {
    this.isDeletedFilterType = isDeletedFilterType;
    return this;
  }

   /**
   * Get isDeletedFilterType
   * @return isDeletedFilterType
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDeletedFilterType() {
    return isDeletedFilterType;
  }

  public void setIsDeletedFilterType(Boolean isDeletedFilterType) {
    this.isDeletedFilterType = isDeletedFilterType;
  }

  public CounterFilterViewModel counterId(Integer counterId) {
    this.counterId = counterId;
    return this;
  }

   /**
   * Идентификатор счетчика.
   * @return counterId
  **/
  @ApiModelProperty(value = "Идентификатор счетчика.")
  public Integer getCounterId() {
    return counterId;
  }

  public void setCounterId(Integer counterId) {
    this.counterId = counterId;
  }

  public CounterFilterViewModel counterName(String counterName) {
    this.counterName = counterName;
    return this;
  }

   /**
   * Наименование счетчика.
   * @return counterName
  **/
  @ApiModelProperty(value = "Наименование счетчика.")
  public String getCounterName() {
    return counterName;
  }

  public void setCounterName(String counterName) {
    this.counterName = counterName;
  }

  public CounterFilterViewModel operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Вид сравнения.
   * @return operation
  **/
  @ApiModelProperty(value = "Вид сравнения.")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public CounterFilterViewModel value(Double value) {
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
    CounterFilterViewModel counterFilterViewModel = (CounterFilterViewModel) o;
    return Objects.equals(this.id, counterFilterViewModel.id) &&
        Objects.equals(this.name, counterFilterViewModel.name) &&
        Objects.equals(this.isDeletedFilterType, counterFilterViewModel.isDeletedFilterType) &&
        Objects.equals(this.counterId, counterFilterViewModel.counterId) &&
        Objects.equals(this.counterName, counterFilterViewModel.counterName) &&
        Objects.equals(this.operation, counterFilterViewModel.operation) &&
        Objects.equals(this.value, counterFilterViewModel.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isDeletedFilterType, counterId, counterName, operation, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterFilterViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeletedFilterType: ").append(toIndentedString(isDeletedFilterType)).append("\n");
    sb.append("    counterId: ").append(toIndentedString(counterId)).append("\n");
    sb.append("    counterName: ").append(toIndentedString(counterName)).append("\n");
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


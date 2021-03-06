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
import java.util.ArrayList;
import java.util.List;

/**
 * Модель для фильтра по дополнительным параметрам чековых позиций.
 */
@ApiModel(description = "Модель для фильтра по дополнительным параметрам чековых позиций.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ChequePositionParameterFilterViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isDeletedFilterType")
  private Boolean isDeletedFilterType = null;

  @JsonProperty("parameterName")
  private String parameterName = null;

  @JsonProperty("parameterExpectedValues")
  private List<String> parameterExpectedValues = null;

  @JsonProperty("negative")
  private Boolean negative = null;

  public ChequePositionParameterFilterViewModel id(Integer id) {
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

  public ChequePositionParameterFilterViewModel name(String name) {
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

  public ChequePositionParameterFilterViewModel isDeletedFilterType(Boolean isDeletedFilterType) {
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

  public ChequePositionParameterFilterViewModel parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Имя параметра.
   * @return parameterName
  **/
  @ApiModelProperty(value = "Имя параметра.")
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  public ChequePositionParameterFilterViewModel parameterExpectedValues(List<String> parameterExpectedValues) {
    this.parameterExpectedValues = parameterExpectedValues;
    return this;
  }

  public ChequePositionParameterFilterViewModel addParameterExpectedValuesItem(String parameterExpectedValuesItem) {
    if (this.parameterExpectedValues == null) {
      this.parameterExpectedValues = new ArrayList<>();
    }
    this.parameterExpectedValues.add(parameterExpectedValuesItem);
    return this;
  }

   /**
   * Ожидаемые значения параметра.
   * @return parameterExpectedValues
  **/
  @ApiModelProperty(value = "Ожидаемые значения параметра.")
  public List<String> getParameterExpectedValues() {
    return parameterExpectedValues;
  }

  public void setParameterExpectedValues(List<String> parameterExpectedValues) {
    this.parameterExpectedValues = parameterExpectedValues;
  }

  public ChequePositionParameterFilterViewModel negative(Boolean negative) {
    this.negative = negative;
    return this;
  }

   /**
   * Отрицание (значение параметра не должно быть среди ожидаемых).
   * @return negative
  **/
  @ApiModelProperty(value = "Отрицание (значение параметра не должно быть среди ожидаемых).")
  public Boolean isNegative() {
    return negative;
  }

  public void setNegative(Boolean negative) {
    this.negative = negative;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChequePositionParameterFilterViewModel chequePositionParameterFilterViewModel = (ChequePositionParameterFilterViewModel) o;
    return Objects.equals(this.id, chequePositionParameterFilterViewModel.id) &&
        Objects.equals(this.name, chequePositionParameterFilterViewModel.name) &&
        Objects.equals(this.isDeletedFilterType, chequePositionParameterFilterViewModel.isDeletedFilterType) &&
        Objects.equals(this.parameterName, chequePositionParameterFilterViewModel.parameterName) &&
        Objects.equals(this.parameterExpectedValues, chequePositionParameterFilterViewModel.parameterExpectedValues) &&
        Objects.equals(this.negative, chequePositionParameterFilterViewModel.negative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isDeletedFilterType, parameterName, parameterExpectedValues, negative);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChequePositionParameterFilterViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeletedFilterType: ").append(toIndentedString(isDeletedFilterType)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterExpectedValues: ").append(toIndentedString(parameterExpectedValues)).append("\n");
    sb.append("    negative: ").append(toIndentedString(negative)).append("\n");
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


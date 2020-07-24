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
 * ViewModel позиции чека.
 */
@ApiModel(description = "ViewModel позиции чека.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class HistoryChequeItemModel {
  @JsonProperty("positionId")
  private Integer positionId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("count")
  private Double count = null;

  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("amount")
  private Double amount = null;

  public HistoryChequeItemModel positionId(Integer positionId) {
    this.positionId = positionId;
    return this;
  }

   /**
   * Позиция чека.
   * @return positionId
  **/
  @ApiModelProperty(value = "Позиция чека.")
  public Integer getPositionId() {
    return positionId;
  }

  public void setPositionId(Integer positionId) {
    this.positionId = positionId;
  }

  public HistoryChequeItemModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Описание.
   * @return description
  **/
  @ApiModelProperty(value = "Описание.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HistoryChequeItemModel count(Double count) {
    this.count = count;
    return this;
  }

   /**
   * Кол-во.
   * @return count
  **/
  @ApiModelProperty(value = "Кол-во.")
  public Double getCount() {
    return count;
  }

  public void setCount(Double count) {
    this.count = count;
  }

  public HistoryChequeItemModel unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Единица измерения.
   * @return unit
  **/
  @ApiModelProperty(value = "Единица измерения.")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public HistoryChequeItemModel amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Стоимость.
   * @return amount
  **/
  @ApiModelProperty(value = "Стоимость.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryChequeItemModel historyChequeItemModel = (HistoryChequeItemModel) o;
    return Objects.equals(this.positionId, historyChequeItemModel.positionId) &&
        Objects.equals(this.description, historyChequeItemModel.description) &&
        Objects.equals(this.count, historyChequeItemModel.count) &&
        Objects.equals(this.unit, historyChequeItemModel.unit) &&
        Objects.equals(this.amount, historyChequeItemModel.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionId, description, count, unit, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryChequeItemModel {\n");
    
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

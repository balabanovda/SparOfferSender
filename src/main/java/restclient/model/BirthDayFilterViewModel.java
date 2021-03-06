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
 * ViewModel для фильтра День рождения.
 */
@ApiModel(description = "ViewModel для фильтра День рождения.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class BirthDayFilterViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isDeletedFilterType")
  private Boolean isDeletedFilterType = null;

  @JsonProperty("daysBefore")
  private Integer daysBefore = null;

  @JsonProperty("daysAfter")
  private Integer daysAfter = null;

  public BirthDayFilterViewModel id(Integer id) {
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

  public BirthDayFilterViewModel name(String name) {
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

  public BirthDayFilterViewModel isDeletedFilterType(Boolean isDeletedFilterType) {
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

  public BirthDayFilterViewModel daysBefore(Integer daysBefore) {
    this.daysBefore = daysBefore;
    return this;
  }

   /**
   * Дней до.
   * @return daysBefore
  **/
  @ApiModelProperty(value = "Дней до.")
  public Integer getDaysBefore() {
    return daysBefore;
  }

  public void setDaysBefore(Integer daysBefore) {
    this.daysBefore = daysBefore;
  }

  public BirthDayFilterViewModel daysAfter(Integer daysAfter) {
    this.daysAfter = daysAfter;
    return this;
  }

   /**
   * Дней после.
   * @return daysAfter
  **/
  @ApiModelProperty(value = "Дней после.")
  public Integer getDaysAfter() {
    return daysAfter;
  }

  public void setDaysAfter(Integer daysAfter) {
    this.daysAfter = daysAfter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BirthDayFilterViewModel birthDayFilterViewModel = (BirthDayFilterViewModel) o;
    return Objects.equals(this.id, birthDayFilterViewModel.id) &&
        Objects.equals(this.name, birthDayFilterViewModel.name) &&
        Objects.equals(this.isDeletedFilterType, birthDayFilterViewModel.isDeletedFilterType) &&
        Objects.equals(this.daysBefore, birthDayFilterViewModel.daysBefore) &&
        Objects.equals(this.daysAfter, birthDayFilterViewModel.daysAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isDeletedFilterType, daysBefore, daysAfter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BirthDayFilterViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeletedFilterType: ").append(toIndentedString(isDeletedFilterType)).append("\n");
    sb.append("    daysBefore: ").append(toIndentedString(daysBefore)).append("\n");
    sb.append("    daysAfter: ").append(toIndentedString(daysAfter)).append("\n");
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


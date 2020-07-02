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
import com.example.demo.restclient.model.CalculationModel;
import com.example.demo.restclient.model.CreatorModel;
import com.example.demo.restclient.model.PartialRequiredViewModel;
import com.example.demo.restclient.model.PartnerLoyaltyProgramModel;
import com.example.demo.restclient.model.PartnerModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * View модель целевой аудитории.
 */
@ApiModel(description = "View модель целевой аудитории.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class TargetGroupViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isArchived")
  private Boolean isArchived = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("changeDate")
  private OffsetDateTime changeDate = null;

  @JsonProperty("creatorDescription")
  private CreatorModel creatorDescription = null;

  @JsonProperty("lastChangeUserDescription")
  private CreatorModel lastChangeUserDescription = null;

  @JsonProperty("fixUserDescription")
  private CreatorModel fixUserDescription = null;

  @JsonProperty("isFixed")
  private Boolean isFixed = null;

  @JsonProperty("fixDate")
  private OffsetDateTime fixDate = null;

  @JsonProperty("partner")
  private PartnerModel partner = null;

  @JsonProperty("loyaltyProgram")
  private PartnerLoyaltyProgramModel loyaltyProgram = null;

  @JsonProperty("calculationInfo")
  private CalculationModel calculationInfo = null;

  @JsonProperty("lastCalculationInfo")
  private CalculationModel lastCalculationInfo = null;

  @JsonProperty("hasFilters")
  private Boolean hasFilters = null;

  /**
   * Доступные операции над ЦА.
   */
  public enum OperationsEnum {
    NONE("None"),
    
    VIEW("View"),
    
    EDIT("Edit"),
    
    CALCULATE("Calculate");

    private String value;

    OperationsEnum(String value) {
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
    public static OperationsEnum fromValue(String text) {
      for (OperationsEnum b : OperationsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operations")
  private OperationsEnum operations = null;

  public TargetGroupViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id целевой аудитории.
   * @return id
  **/
  @ApiModelProperty(value = "Id целевой аудитории.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TargetGroupViewModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название.
   * @return name
  **/
  @ApiModelProperty(value = "Название.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TargetGroupViewModel description(String description) {
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

  public TargetGroupViewModel isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Признак архивной целевой аудитории.
   * @return isArchived
  **/
  @ApiModelProperty(value = "Признак архивной целевой аудитории.")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public TargetGroupViewModel creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Дата создания.
   * @return creationDate
  **/
  @ApiModelProperty(value = "Дата создания.")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public TargetGroupViewModel changeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
    return this;
  }

   /**
   * Дата изменения.
   * @return changeDate
  **/
  @ApiModelProperty(value = "Дата изменения.")
  public OffsetDateTime getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
  }

  public TargetGroupViewModel creatorDescription(CreatorModel creatorDescription) {
    this.creatorDescription = creatorDescription;
    return this;
  }

   /**
   * Описание автора.
   * @return creatorDescription
  **/
  @ApiModelProperty(value = "Описание автора.")
  public CreatorModel getCreatorDescription() {
    return creatorDescription;
  }

  public void setCreatorDescription(CreatorModel creatorDescription) {
    this.creatorDescription = creatorDescription;
  }

  public TargetGroupViewModel lastChangeUserDescription(CreatorModel lastChangeUserDescription) {
    this.lastChangeUserDescription = lastChangeUserDescription;
    return this;
  }

   /**
   * Описание пользователя, внесшего последние изменения.
   * @return lastChangeUserDescription
  **/
  @ApiModelProperty(value = "Описание пользователя, внесшего последние изменения.")
  public CreatorModel getLastChangeUserDescription() {
    return lastChangeUserDescription;
  }

  public void setLastChangeUserDescription(CreatorModel lastChangeUserDescription) {
    this.lastChangeUserDescription = lastChangeUserDescription;
  }

  public TargetGroupViewModel fixUserDescription(CreatorModel fixUserDescription) {
    this.fixUserDescription = fixUserDescription;
    return this;
  }

   /**
   * Описание пользователя, осуществившего последнюю фиксацию.
   * @return fixUserDescription
  **/
  @ApiModelProperty(value = "Описание пользователя, осуществившего последнюю фиксацию.")
  public CreatorModel getFixUserDescription() {
    return fixUserDescription;
  }

  public void setFixUserDescription(CreatorModel fixUserDescription) {
    this.fixUserDescription = fixUserDescription;
  }

  public TargetGroupViewModel isFixed(Boolean isFixed) {
    this.isFixed = isFixed;
    return this;
  }

   /**
   * Зафиксирована или нет.
   * @return isFixed
  **/
  @ApiModelProperty(value = "Зафиксирована или нет.")
  public Boolean isIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Boolean isFixed) {
    this.isFixed = isFixed;
  }

  public TargetGroupViewModel fixDate(OffsetDateTime fixDate) {
    this.fixDate = fixDate;
    return this;
  }

   /**
   * Дата фиксации.
   * @return fixDate
  **/
  @ApiModelProperty(value = "Дата фиксации.")
  public OffsetDateTime getFixDate() {
    return fixDate;
  }

  public void setFixDate(OffsetDateTime fixDate) {
    this.fixDate = fixDate;
  }

  public TargetGroupViewModel partner(PartnerModel partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Партнер.
   * @return partner
  **/
  @ApiModelProperty(value = "Партнер.")
  public PartnerModel getPartner() {
    return partner;
  }

  public void setPartner(PartnerModel partner) {
    this.partner = partner;
  }

  public TargetGroupViewModel loyaltyProgram(PartnerLoyaltyProgramModel loyaltyProgram) {
    this.loyaltyProgram = loyaltyProgram;
    return this;
  }

   /**
   * Программа лояльности.
   * @return loyaltyProgram
  **/
  @ApiModelProperty(value = "Программа лояльности.")
  public PartnerLoyaltyProgramModel getLoyaltyProgram() {
    return loyaltyProgram;
  }

  public void setLoyaltyProgram(PartnerLoyaltyProgramModel loyaltyProgram) {
    this.loyaltyProgram = loyaltyProgram;
  }

  public TargetGroupViewModel calculationInfo(CalculationModel calculationInfo) {
    this.calculationInfo = calculationInfo;
    return this;
  }

   /**
   * Информация о расчете.
   * @return calculationInfo
  **/
  @ApiModelProperty(value = "Информация о расчете.")
  public CalculationModel getCalculationInfo() {
    return calculationInfo;
  }

  public void setCalculationInfo(CalculationModel calculationInfo) {
    this.calculationInfo = calculationInfo;
  }

  public TargetGroupViewModel lastCalculationInfo(CalculationModel lastCalculationInfo) {
    this.lastCalculationInfo = lastCalculationInfo;
    return this;
  }

   /**
   * Информация о последнем расчете.
   * @return lastCalculationInfo
  **/
  @ApiModelProperty(value = "Информация о последнем расчете.")
  public CalculationModel getLastCalculationInfo() {
    return lastCalculationInfo;
  }

  public void setLastCalculationInfo(CalculationModel lastCalculationInfo) {
    this.lastCalculationInfo = lastCalculationInfo;
  }

  public TargetGroupViewModel hasFilters(Boolean hasFilters) {
    this.hasFilters = hasFilters;
    return this;
  }

   /**
   * Признак наличия фильтров.
   * @return hasFilters
  **/
  @ApiModelProperty(value = "Признак наличия фильтров.")
  public Boolean isHasFilters() {
    return hasFilters;
  }

  public void setHasFilters(Boolean hasFilters) {
    this.hasFilters = hasFilters;
  }

  public TargetGroupViewModel operations(OperationsEnum operations) {
    this.operations = operations;
    return this;
  }

   /**
   * Доступные операции над ЦА.
   * @return operations
  **/
  @ApiModelProperty(value = "Доступные операции над ЦА.")
  public OperationsEnum getOperations() {
    return operations;
  }

  public void setOperations(OperationsEnum operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetGroupViewModel targetGroupViewModel = (TargetGroupViewModel) o;
    return Objects.equals(this.id, targetGroupViewModel.id) &&
        Objects.equals(this.name, targetGroupViewModel.name) &&
        Objects.equals(this.description, targetGroupViewModel.description) &&
        Objects.equals(this.isArchived, targetGroupViewModel.isArchived) &&
        Objects.equals(this.creationDate, targetGroupViewModel.creationDate) &&
        Objects.equals(this.changeDate, targetGroupViewModel.changeDate) &&
        Objects.equals(this.creatorDescription, targetGroupViewModel.creatorDescription) &&
        Objects.equals(this.lastChangeUserDescription, targetGroupViewModel.lastChangeUserDescription) &&
        Objects.equals(this.fixUserDescription, targetGroupViewModel.fixUserDescription) &&
        Objects.equals(this.isFixed, targetGroupViewModel.isFixed) &&
        Objects.equals(this.fixDate, targetGroupViewModel.fixDate) &&
        Objects.equals(this.partner, targetGroupViewModel.partner) &&
        Objects.equals(this.loyaltyProgram, targetGroupViewModel.loyaltyProgram) &&
        Objects.equals(this.calculationInfo, targetGroupViewModel.calculationInfo) &&
        Objects.equals(this.lastCalculationInfo, targetGroupViewModel.lastCalculationInfo) &&
        Objects.equals(this.hasFilters, targetGroupViewModel.hasFilters) &&
        Objects.equals(this.operations, targetGroupViewModel.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, isArchived, creationDate, changeDate, creatorDescription, lastChangeUserDescription, fixUserDescription, isFixed, fixDate, partner, loyaltyProgram, calculationInfo, lastCalculationInfo, hasFilters, operations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetGroupViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    creatorDescription: ").append(toIndentedString(creatorDescription)).append("\n");
    sb.append("    lastChangeUserDescription: ").append(toIndentedString(lastChangeUserDescription)).append("\n");
    sb.append("    fixUserDescription: ").append(toIndentedString(fixUserDescription)).append("\n");
    sb.append("    isFixed: ").append(toIndentedString(isFixed)).append("\n");
    sb.append("    fixDate: ").append(toIndentedString(fixDate)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    loyaltyProgram: ").append(toIndentedString(loyaltyProgram)).append("\n");
    sb.append("    calculationInfo: ").append(toIndentedString(calculationInfo)).append("\n");
    sb.append("    lastCalculationInfo: ").append(toIndentedString(lastCalculationInfo)).append("\n");
    sb.append("    hasFilters: ").append(toIndentedString(hasFilters)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

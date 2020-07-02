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
import com.example.demo.restclient.model.PartnerLoyaltyProgramModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * PartnerModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PartnerModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("externalId")
  private UUID externalId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("canEdit")
  private Boolean canEdit = null;

  @JsonProperty("loyaltyPrograms")
  private List<PartnerLoyaltyProgramModel> loyaltyPrograms = null;

  public PartnerModel id(Integer id) {
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

  public PartnerModel externalId(UUID externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getExternalId() {
    return externalId;
  }

  public void setExternalId(UUID externalId) {
    this.externalId = externalId;
  }

  public PartnerModel name(String name) {
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

  public PartnerModel canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

   /**
   * Get canEdit
   * @return canEdit
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public PartnerModel loyaltyPrograms(List<PartnerLoyaltyProgramModel> loyaltyPrograms) {
    this.loyaltyPrograms = loyaltyPrograms;
    return this;
  }

  public PartnerModel addLoyaltyProgramsItem(PartnerLoyaltyProgramModel loyaltyProgramsItem) {
    if (this.loyaltyPrograms == null) {
      this.loyaltyPrograms = new ArrayList<>();
    }
    this.loyaltyPrograms.add(loyaltyProgramsItem);
    return this;
  }

   /**
   * Get loyaltyPrograms
   * @return loyaltyPrograms
  **/
  @ApiModelProperty(value = "")
  public List<PartnerLoyaltyProgramModel> getLoyaltyPrograms() {
    return loyaltyPrograms;
  }

  public void setLoyaltyPrograms(List<PartnerLoyaltyProgramModel> loyaltyPrograms) {
    this.loyaltyPrograms = loyaltyPrograms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerModel partnerModel = (PartnerModel) o;
    return Objects.equals(this.id, partnerModel.id) &&
        Objects.equals(this.externalId, partnerModel.externalId) &&
        Objects.equals(this.name, partnerModel.name) &&
        Objects.equals(this.canEdit, partnerModel.canEdit) &&
        Objects.equals(this.loyaltyPrograms, partnerModel.loyaltyPrograms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalId, name, canEdit, loyaltyPrograms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    loyaltyPrograms: ").append(toIndentedString(loyaltyPrograms)).append("\n");
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


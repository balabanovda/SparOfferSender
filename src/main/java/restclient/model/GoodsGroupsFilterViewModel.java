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
 * ViewModel для фильтра по вхождению товара в группу товаров.
 */
@ApiModel(description = "ViewModel для фильтра по вхождению товара в группу товаров.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class GoodsGroupsFilterViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isDeletedFilterType")
  private Boolean isDeletedFilterType = null;

  @JsonProperty("goodsGroups")
  private List<GoodsGroupViewModel> goodsGroups = null;

  @JsonProperty("personalOfferAttributeId")
  private Integer personalOfferAttributeId = null;

  public GoodsGroupsFilterViewModel id(Integer id) {
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

  public GoodsGroupsFilterViewModel name(String name) {
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

  public GoodsGroupsFilterViewModel isDeletedFilterType(Boolean isDeletedFilterType) {
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

  public GoodsGroupsFilterViewModel goodsGroups(List<GoodsGroupViewModel> goodsGroups) {
    this.goodsGroups = goodsGroups;
    return this;
  }

  public GoodsGroupsFilterViewModel addGoodsGroupsItem(GoodsGroupViewModel goodsGroupsItem) {
    if (this.goodsGroups == null) {
      this.goodsGroups = new ArrayList<>();
    }
    this.goodsGroups.add(goodsGroupsItem);
    return this;
  }

   /**
   * Список выбранных групп товаров.
   * @return goodsGroups
  **/
  @ApiModelProperty(value = "Список выбранных групп товаров.")
  public List<GoodsGroupViewModel> getGoodsGroups() {
    return goodsGroups;
  }

  public void setGoodsGroups(List<GoodsGroupViewModel> goodsGroups) {
    this.goodsGroups = goodsGroups;
  }

  public GoodsGroupsFilterViewModel personalOfferAttributeId(Integer personalOfferAttributeId) {
    this.personalOfferAttributeId = personalOfferAttributeId;
    return this;
  }

   /**
   * Идентификатор атрибута \&quot;Персональное предложение\&quot;.
   * @return personalOfferAttributeId
  **/
  @ApiModelProperty(value = "Идентификатор атрибута \"Персональное предложение\".")
  public Integer getPersonalOfferAttributeId() {
    return personalOfferAttributeId;
  }

  public void setPersonalOfferAttributeId(Integer personalOfferAttributeId) {
    this.personalOfferAttributeId = personalOfferAttributeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsGroupsFilterViewModel goodsGroupsFilterViewModel = (GoodsGroupsFilterViewModel) o;
    return Objects.equals(this.id, goodsGroupsFilterViewModel.id) &&
        Objects.equals(this.name, goodsGroupsFilterViewModel.name) &&
        Objects.equals(this.isDeletedFilterType, goodsGroupsFilterViewModel.isDeletedFilterType) &&
        Objects.equals(this.goodsGroups, goodsGroupsFilterViewModel.goodsGroups) &&
        Objects.equals(this.personalOfferAttributeId, goodsGroupsFilterViewModel.personalOfferAttributeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isDeletedFilterType, goodsGroups, personalOfferAttributeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsGroupsFilterViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeletedFilterType: ").append(toIndentedString(isDeletedFilterType)).append("\n");
    sb.append("    goodsGroups: ").append(toIndentedString(goodsGroups)).append("\n");
    sb.append("    personalOfferAttributeId: ").append(toIndentedString(personalOfferAttributeId)).append("\n");
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


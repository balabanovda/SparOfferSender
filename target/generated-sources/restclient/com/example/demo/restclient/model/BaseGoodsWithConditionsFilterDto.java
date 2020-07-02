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
import com.example.demo.restclient.model.BaseGoodsFilterDto;
import com.example.demo.restclient.model.BaseGoodsGroupDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Базоый класс для фильтров по чеку c условиями.
 */
@ApiModel(description = "Базоый класс для фильтров по чеку c условиями.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class BaseGoodsWithConditionsFilterDto {
  @JsonProperty("goodsGroups")
  private List<BaseGoodsGroupDto> goodsGroups = null;

  @JsonProperty("personalOfferAttributeLogicalName")
  private String personalOfferAttributeLogicalName = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Тип фильтрации.
   */
  public enum TypeEnum {
    ONLYGOODS("OnlyGoods"),
    
    GOODSQUANTITY("GoodsQuantity"),
    
    GOODSAMOUNT("GoodsAmount");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  /**
   * Gets or sets the operator.
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

  public BaseGoodsWithConditionsFilterDto goodsGroups(List<BaseGoodsGroupDto> goodsGroups) {
    this.goodsGroups = goodsGroups;
    return this;
  }

  public BaseGoodsWithConditionsFilterDto addGoodsGroupsItem(BaseGoodsGroupDto goodsGroupsItem) {
    if (this.goodsGroups == null) {
      this.goodsGroups = new ArrayList<>();
    }
    this.goodsGroups.add(goodsGroupsItem);
    return this;
  }

   /**
   * Группы товаров.
   * @return goodsGroups
  **/
  @ApiModelProperty(value = "Группы товаров.")
  public List<BaseGoodsGroupDto> getGoodsGroups() {
    return goodsGroups;
  }

  public void setGoodsGroups(List<BaseGoodsGroupDto> goodsGroups) {
    this.goodsGroups = goodsGroups;
  }

  public BaseGoodsWithConditionsFilterDto personalOfferAttributeLogicalName(String personalOfferAttributeLogicalName) {
    this.personalOfferAttributeLogicalName = personalOfferAttributeLogicalName;
    return this;
  }

   /**
   * Логическое имя атрибута \&quot;Персональное предложение\&quot;.
   * @return personalOfferAttributeLogicalName
  **/
  @ApiModelProperty(value = "Логическое имя атрибута \"Персональное предложение\".")
  public String getPersonalOfferAttributeLogicalName() {
    return personalOfferAttributeLogicalName;
  }

  public void setPersonalOfferAttributeLogicalName(String personalOfferAttributeLogicalName) {
    this.personalOfferAttributeLogicalName = personalOfferAttributeLogicalName;
  }

  public BaseGoodsWithConditionsFilterDto name(String name) {
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

  public BaseGoodsWithConditionsFilterDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Тип фильтрации.
   * @return type
  **/
  @ApiModelProperty(value = "Тип фильтрации.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BaseGoodsWithConditionsFilterDto operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Gets or sets the operator.
   * @return operator
  **/
  @ApiModelProperty(value = "Gets or sets the operator.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public BaseGoodsWithConditionsFilterDto firstValue(Double firstValue) {
    this.firstValue = firstValue;
    return this;
  }

   /**
   * Первое значение для операции.
   * @return firstValue
  **/
  @ApiModelProperty(value = "Первое значение для операции.")
  public Double getFirstValue() {
    return firstValue;
  }

  public void setFirstValue(Double firstValue) {
    this.firstValue = firstValue;
  }

  public BaseGoodsWithConditionsFilterDto secondValue(Double secondValue) {
    this.secondValue = secondValue;
    return this;
  }

   /**
   * Второе значение для операции.
   * @return secondValue
  **/
  @ApiModelProperty(value = "Второе значение для операции.")
  public Double getSecondValue() {
    return secondValue;
  }

  public void setSecondValue(Double secondValue) {
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
    BaseGoodsWithConditionsFilterDto baseGoodsWithConditionsFilterDto = (BaseGoodsWithConditionsFilterDto) o;
    return Objects.equals(this.goodsGroups, baseGoodsWithConditionsFilterDto.goodsGroups) &&
        Objects.equals(this.personalOfferAttributeLogicalName, baseGoodsWithConditionsFilterDto.personalOfferAttributeLogicalName) &&
        Objects.equals(this.name, baseGoodsWithConditionsFilterDto.name) &&
        Objects.equals(this.type, baseGoodsWithConditionsFilterDto.type) &&
        Objects.equals(this.operator, baseGoodsWithConditionsFilterDto.operator) &&
        Objects.equals(this.firstValue, baseGoodsWithConditionsFilterDto.firstValue) &&
        Objects.equals(this.secondValue, baseGoodsWithConditionsFilterDto.secondValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsGroups, personalOfferAttributeLogicalName, name, type, operator, firstValue, secondValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseGoodsWithConditionsFilterDto {\n");
    
    sb.append("    goodsGroups: ").append(toIndentedString(goodsGroups)).append("\n");
    sb.append("    personalOfferAttributeLogicalName: ").append(toIndentedString(personalOfferAttributeLogicalName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

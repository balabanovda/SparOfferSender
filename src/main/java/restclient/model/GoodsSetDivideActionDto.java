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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Действие \&quot;Разбиение по наборам\&quot;.
 */
@ApiModel(description = "Действие \"Разбиение по наборам\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class GoodsSetDivideActionDto {
  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("event")
  private GoodsSetProcessEventDto event = null;

  @JsonProperty("compositionInfo")
  private List<GoodsSetItemDto> compositionInfo = null;

  /**
   * Поле, по значениям которого будет формироваться набор.
   */
  public enum TargetFieldTypeEnum {
    QUANTITY("Quantity"),
    
    AMOUNT("Amount");

    private String value;

    TargetFieldTypeEnum(String value) {
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
    public static TargetFieldTypeEnum fromValue(String text) {
      for (TargetFieldTypeEnum b : TargetFieldTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("targetFieldType")
  private TargetFieldTypeEnum targetFieldType = null;

  /**
   * Тип сортировки.
   */
  public enum ChequeGoodsSortTypeEnum {
    POSITIONASCENDING("PositionAscending"),
    
    POSITIONDESCENDING("PositionDescending"),
    
    PRICEASCENDING("PriceAscending"),
    
    PRICEDESCENDING("PriceDescending");

    private String value;

    ChequeGoodsSortTypeEnum(String value) {
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
    public static ChequeGoodsSortTypeEnum fromValue(String text) {
      for (ChequeGoodsSortTypeEnum b : ChequeGoodsSortTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("chequeGoodsSortType")
  private ChequeGoodsSortTypeEnum chequeGoodsSortType = null;

  @JsonProperty("personalAttribute")
  private String personalAttribute = null;

  @JsonProperty("goodsAttributeId")
  private Integer goodsAttributeId = null;

  public GoodsSetDivideActionDto order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Порядковый номер действия в цепочке.
   * @return order
  **/
  @ApiModelProperty(value = "Порядковый номер действия в цепочке.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public GoodsSetDivideActionDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id действия в цепочке.
   * @return id
  **/
  @ApiModelProperty(value = "Id действия в цепочке.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GoodsSetDivideActionDto event(GoodsSetProcessEventDto event) {
    this.event = event;
    return this;
  }

   /**
   * Зависимое от действия событие.
   * @return event
  **/
  @ApiModelProperty(value = "Зависимое от действия событие.")
  public GoodsSetProcessEventDto getEvent() {
    return event;
  }

  public void setEvent(GoodsSetProcessEventDto event) {
    this.event = event;
  }

  public GoodsSetDivideActionDto compositionInfo(List<GoodsSetItemDto> compositionInfo) {
    this.compositionInfo = compositionInfo;
    return this;
  }

  public GoodsSetDivideActionDto addCompositionInfoItem(GoodsSetItemDto compositionInfoItem) {
    if (this.compositionInfo == null) {
      this.compositionInfo = new ArrayList<>();
    }
    this.compositionInfo.add(compositionInfoItem);
    return this;
  }

   /**
   * Источник данных о товарах, из который будет формироваться набор.
   * @return compositionInfo
  **/
  @ApiModelProperty(value = "Источник данных о товарах, из который будет формироваться набор.")
  public List<GoodsSetItemDto> getCompositionInfo() {
    return compositionInfo;
  }

  public void setCompositionInfo(List<GoodsSetItemDto> compositionInfo) {
    this.compositionInfo = compositionInfo;
  }

  public GoodsSetDivideActionDto targetFieldType(TargetFieldTypeEnum targetFieldType) {
    this.targetFieldType = targetFieldType;
    return this;
  }

   /**
   * Поле, по значениям которого будет формироваться набор.
   * @return targetFieldType
  **/
  @ApiModelProperty(value = "Поле, по значениям которого будет формироваться набор.")
  public TargetFieldTypeEnum getTargetFieldType() {
    return targetFieldType;
  }

  public void setTargetFieldType(TargetFieldTypeEnum targetFieldType) {
    this.targetFieldType = targetFieldType;
  }

  public GoodsSetDivideActionDto chequeGoodsSortType(ChequeGoodsSortTypeEnum chequeGoodsSortType) {
    this.chequeGoodsSortType = chequeGoodsSortType;
    return this;
  }

   /**
   * Тип сортировки.
   * @return chequeGoodsSortType
  **/
  @ApiModelProperty(value = "Тип сортировки.")
  public ChequeGoodsSortTypeEnum getChequeGoodsSortType() {
    return chequeGoodsSortType;
  }

  public void setChequeGoodsSortType(ChequeGoodsSortTypeEnum chequeGoodsSortType) {
    this.chequeGoodsSortType = chequeGoodsSortType;
  }

  public GoodsSetDivideActionDto personalAttribute(String personalAttribute) {
    this.personalAttribute = personalAttribute;
    return this;
  }

   /**
   * Логическое имя персонального атрибута.
   * @return personalAttribute
  **/
  @ApiModelProperty(value = "Логическое имя персонального атрибута.")
  public String getPersonalAttribute() {
    return personalAttribute;
  }

  public void setPersonalAttribute(String personalAttribute) {
    this.personalAttribute = personalAttribute;
  }

  public GoodsSetDivideActionDto goodsAttributeId(Integer goodsAttributeId) {
    this.goodsAttributeId = goodsAttributeId;
    return this;
  }

   /**
   * Идентификатор атрибута товара.
   * @return goodsAttributeId
  **/
  @ApiModelProperty(value = "Идентификатор атрибута товара.")
  public Integer getGoodsAttributeId() {
    return goodsAttributeId;
  }

  public void setGoodsAttributeId(Integer goodsAttributeId) {
    this.goodsAttributeId = goodsAttributeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsSetDivideActionDto goodsSetDivideActionDto = (GoodsSetDivideActionDto) o;
    return Objects.equals(this.order, goodsSetDivideActionDto.order) &&
        Objects.equals(this.id, goodsSetDivideActionDto.id) &&
        Objects.equals(this.event, goodsSetDivideActionDto.event) &&
        Objects.equals(this.compositionInfo, goodsSetDivideActionDto.compositionInfo) &&
        Objects.equals(this.targetFieldType, goodsSetDivideActionDto.targetFieldType) &&
        Objects.equals(this.chequeGoodsSortType, goodsSetDivideActionDto.chequeGoodsSortType) &&
        Objects.equals(this.personalAttribute, goodsSetDivideActionDto.personalAttribute) &&
        Objects.equals(this.goodsAttributeId, goodsSetDivideActionDto.goodsAttributeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, id, event, compositionInfo, targetFieldType, chequeGoodsSortType, personalAttribute, goodsAttributeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsSetDivideActionDto {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    compositionInfo: ").append(toIndentedString(compositionInfo)).append("\n");
    sb.append("    targetFieldType: ").append(toIndentedString(targetFieldType)).append("\n");
    sb.append("    chequeGoodsSortType: ").append(toIndentedString(chequeGoodsSortType)).append("\n");
    sb.append("    personalAttribute: ").append(toIndentedString(personalAttribute)).append("\n");
    sb.append("    goodsAttributeId: ").append(toIndentedString(goodsAttributeId)).append("\n");
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


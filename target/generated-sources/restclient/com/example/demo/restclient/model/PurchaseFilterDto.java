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
import com.example.demo.restclient.model.PurchaseFilterChequeSum;
import com.example.demo.restclient.model.PurchaseFilterDate;
import com.example.demo.restclient.model.PurchaseFilterDateInterval;
import com.example.demo.restclient.model.PurchaseFilterDaysOfWeek;
import com.example.demo.restclient.model.PurchaseFilterMerchants;
import com.example.demo.restclient.model.PurchaseFilterTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Фильтр \&quot;Покупки\&quot;.
 */
@ApiModel(description = "Фильтр \"Покупки\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PurchaseFilterDto {
  @JsonProperty("goodsGroups")
  private List<BaseGoodsGroupDto> goodsGroups = null;

  @JsonProperty("personalOfferAttributeLogicalName")
  private String personalOfferAttributeLogicalName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("merchants")
  private PurchaseFilterMerchants merchants = null;

  @JsonProperty("date")
  private PurchaseFilterDate date = null;

  @JsonProperty("dateInterval")
  private PurchaseFilterDateInterval dateInterval = null;

  @JsonProperty("daysOfWeek")
  private PurchaseFilterDaysOfWeek daysOfWeek = null;

  @JsonProperty("time")
  private PurchaseFilterTime time = null;

  @JsonProperty("chequeSum")
  private PurchaseFilterChequeSum chequeSum = null;

  @JsonProperty("filterPositions")
  private Boolean filterPositions = null;

  @JsonProperty("includeCurrentPurchase")
  private Boolean includeCurrentPurchase = null;

  /**
   * Способ агрегации покупок.
   */
  public enum AggregationTypeEnum {
    PURCHASEAMOUNT("PurchaseAmount"),
    
    PURCHASECOUNT("PurchaseCount"),
    
    POSITIONQUANTITY("PositionQuantity"),
    
    PAYMENTAMOUNT("PaymentAmount"),
    
    CASHBACKAMOUNT("CashbackAmount"),
    
    CHARGINGAMOUNT("ChargingAmount"),
    
    CASHBACKCHARGINGAMOUNT("CashbackChargingAmount"),
    
    AVERAGEPURCHASEAMOUNT("AveragePurchaseAmount"),
    
    DISCOUNTAMOUNT("DiscountAmount");

    private String value;

    AggregationTypeEnum(String value) {
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
    public static AggregationTypeEnum fromValue(String text) {
      for (AggregationTypeEnum b : AggregationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("aggregationType")
  private AggregationTypeEnum aggregationType = null;

  /**
   * Оператор сравнения.
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

  public PurchaseFilterDto goodsGroups(List<BaseGoodsGroupDto> goodsGroups) {
    this.goodsGroups = goodsGroups;
    return this;
  }

  public PurchaseFilterDto addGoodsGroupsItem(BaseGoodsGroupDto goodsGroupsItem) {
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

  public PurchaseFilterDto personalOfferAttributeLogicalName(String personalOfferAttributeLogicalName) {
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

  public PurchaseFilterDto name(String name) {
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

  public PurchaseFilterDto merchants(PurchaseFilterMerchants merchants) {
    this.merchants = merchants;
    return this;
  }

   /**
   * Магазины, в которых совершались покупки.
   * @return merchants
  **/
  @ApiModelProperty(value = "Магазины, в которых совершались покупки.")
  public PurchaseFilterMerchants getMerchants() {
    return merchants;
  }

  public void setMerchants(PurchaseFilterMerchants merchants) {
    this.merchants = merchants;
  }

  public PurchaseFilterDto date(PurchaseFilterDate date) {
    this.date = date;
    return this;
  }

   /**
   * Даты покупок.
   * @return date
  **/
  @ApiModelProperty(value = "Даты покупок.")
  public PurchaseFilterDate getDate() {
    return date;
  }

  public void setDate(PurchaseFilterDate date) {
    this.date = date;
  }

  public PurchaseFilterDto dateInterval(PurchaseFilterDateInterval dateInterval) {
    this.dateInterval = dateInterval;
    return this;
  }

   /**
   * Дата покупок в плавающем периоде.
   * @return dateInterval
  **/
  @ApiModelProperty(value = "Дата покупок в плавающем периоде.")
  public PurchaseFilterDateInterval getDateInterval() {
    return dateInterval;
  }

  public void setDateInterval(PurchaseFilterDateInterval dateInterval) {
    this.dateInterval = dateInterval;
  }

  public PurchaseFilterDto daysOfWeek(PurchaseFilterDaysOfWeek daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

   /**
   * Дни недели покупок.
   * @return daysOfWeek
  **/
  @ApiModelProperty(value = "Дни недели покупок.")
  public PurchaseFilterDaysOfWeek getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(PurchaseFilterDaysOfWeek daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public PurchaseFilterDto time(PurchaseFilterTime time) {
    this.time = time;
    return this;
  }

   /**
   * Время покупок.
   * @return time
  **/
  @ApiModelProperty(value = "Время покупок.")
  public PurchaseFilterTime getTime() {
    return time;
  }

  public void setTime(PurchaseFilterTime time) {
    this.time = time;
  }

  public PurchaseFilterDto chequeSum(PurchaseFilterChequeSum chequeSum) {
    this.chequeSum = chequeSum;
    return this;
  }

   /**
   * Сумма чека.
   * @return chequeSum
  **/
  @ApiModelProperty(value = "Сумма чека.")
  public PurchaseFilterChequeSum getChequeSum() {
    return chequeSum;
  }

  public void setChequeSum(PurchaseFilterChequeSum chequeSum) {
    this.chequeSum = chequeSum;
  }

  public PurchaseFilterDto filterPositions(Boolean filterPositions) {
    this.filterPositions = filterPositions;
    return this;
  }

   /**
   * Фильтровать позиции в соответсвии с выбранными товарами.
   * @return filterPositions
  **/
  @ApiModelProperty(value = "Фильтровать позиции в соответсвии с выбранными товарами.")
  public Boolean isFilterPositions() {
    return filterPositions;
  }

  public void setFilterPositions(Boolean filterPositions) {
    this.filterPositions = filterPositions;
  }

  public PurchaseFilterDto includeCurrentPurchase(Boolean includeCurrentPurchase) {
    this.includeCurrentPurchase = includeCurrentPurchase;
    return this;
  }

   /**
   * Включить текущую покупку в расчет, если она удовлетворяет условиям.
   * @return includeCurrentPurchase
  **/
  @ApiModelProperty(value = "Включить текущую покупку в расчет, если она удовлетворяет условиям.")
  public Boolean isIncludeCurrentPurchase() {
    return includeCurrentPurchase;
  }

  public void setIncludeCurrentPurchase(Boolean includeCurrentPurchase) {
    this.includeCurrentPurchase = includeCurrentPurchase;
  }

  public PurchaseFilterDto aggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

   /**
   * Способ агрегации покупок.
   * @return aggregationType
  **/
  @ApiModelProperty(value = "Способ агрегации покупок.")
  public AggregationTypeEnum getAggregationType() {
    return aggregationType;
  }

  public void setAggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
  }

  public PurchaseFilterDto operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Оператор сравнения.
   * @return operator
  **/
  @ApiModelProperty(value = "Оператор сравнения.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public PurchaseFilterDto firstValue(Double firstValue) {
    this.firstValue = firstValue;
    return this;
  }

   /**
   * Первое значение.
   * @return firstValue
  **/
  @ApiModelProperty(value = "Первое значение.")
  public Double getFirstValue() {
    return firstValue;
  }

  public void setFirstValue(Double firstValue) {
    this.firstValue = firstValue;
  }

  public PurchaseFilterDto secondValue(Double secondValue) {
    this.secondValue = secondValue;
    return this;
  }

   /**
   * Второе значение.
   * @return secondValue
  **/
  @ApiModelProperty(value = "Второе значение.")
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
    PurchaseFilterDto purchaseFilterDto = (PurchaseFilterDto) o;
    return Objects.equals(this.goodsGroups, purchaseFilterDto.goodsGroups) &&
        Objects.equals(this.personalOfferAttributeLogicalName, purchaseFilterDto.personalOfferAttributeLogicalName) &&
        Objects.equals(this.name, purchaseFilterDto.name) &&
        Objects.equals(this.merchants, purchaseFilterDto.merchants) &&
        Objects.equals(this.date, purchaseFilterDto.date) &&
        Objects.equals(this.dateInterval, purchaseFilterDto.dateInterval) &&
        Objects.equals(this.daysOfWeek, purchaseFilterDto.daysOfWeek) &&
        Objects.equals(this.time, purchaseFilterDto.time) &&
        Objects.equals(this.chequeSum, purchaseFilterDto.chequeSum) &&
        Objects.equals(this.filterPositions, purchaseFilterDto.filterPositions) &&
        Objects.equals(this.includeCurrentPurchase, purchaseFilterDto.includeCurrentPurchase) &&
        Objects.equals(this.aggregationType, purchaseFilterDto.aggregationType) &&
        Objects.equals(this.operator, purchaseFilterDto.operator) &&
        Objects.equals(this.firstValue, purchaseFilterDto.firstValue) &&
        Objects.equals(this.secondValue, purchaseFilterDto.secondValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsGroups, personalOfferAttributeLogicalName, name, merchants, date, dateInterval, daysOfWeek, time, chequeSum, filterPositions, includeCurrentPurchase, aggregationType, operator, firstValue, secondValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseFilterDto {\n");
    
    sb.append("    goodsGroups: ").append(toIndentedString(goodsGroups)).append("\n");
    sb.append("    personalOfferAttributeLogicalName: ").append(toIndentedString(personalOfferAttributeLogicalName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateInterval: ").append(toIndentedString(dateInterval)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    chequeSum: ").append(toIndentedString(chequeSum)).append("\n");
    sb.append("    filterPositions: ").append(toIndentedString(filterPositions)).append("\n");
    sb.append("    includeCurrentPurchase: ").append(toIndentedString(includeCurrentPurchase)).append("\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
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


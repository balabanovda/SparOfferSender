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
import com.example.demo.restclient.model.AmountActionViewModelBase;
import com.example.demo.restclient.model.AttributeDiscount;
import com.example.demo.restclient.model.CurrencyViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Модель для редактирования действия начиления бонусов.
 */
@ApiModel(description = "Модель для редактирования действия начиления бонусов.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CashbackActionViewModel {
  @JsonProperty("percent")
  private Double percent = null;

  @JsonProperty("pricePerUnit")
  private Double pricePerUnit = null;

  @JsonProperty("amountPerUnit")
  private Double amountPerUnit = null;

  @JsonProperty("amountPerUniqueSku")
  private Double amountPerUniqueSku = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("amountMeasure")
  private Double amountMeasure = null;

  @JsonProperty("amountPerMeasure")
  private Double amountPerMeasure = null;

  @JsonProperty("amountWeight")
  private Double amountWeight = null;

  @JsonProperty("amountPerWeight")
  private Double amountPerWeight = null;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("attributeDiscount")
  private AttributeDiscount attributeDiscount = null;

  @JsonProperty("distributeToAll")
  private Boolean distributeToAll = null;

  /**
   * Gets or Sets calculationExclusionDiscountTypes
   */
  public enum CalculationExclusionDiscountTypesEnum {
    DISCOUNT("Discount"),
    
    PAYMENTLOYMAXBONUS("PaymentLoymaxBonus"),
    
    PAYMENTEXTERNALBONUS("PaymentExternalBonus");

    private String value;

    CalculationExclusionDiscountTypesEnum(String value) {
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
    public static CalculationExclusionDiscountTypesEnum fromValue(String text) {
      for (CalculationExclusionDiscountTypesEnum b : CalculationExclusionDiscountTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("calculationExclusionDiscountTypes")
  private List<CalculationExclusionDiscountTypesEnum> calculationExclusionDiscountTypes = null;

  @JsonProperty("actionId")
  private Integer actionId = null;

  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("lifeTimeDefinitionId")
  private Integer lifeTimeDefinitionId = null;

  @JsonProperty("currency")
  private CurrencyViewModel currency = null;

  public CashbackActionViewModel percent(Double percent) {
    this.percent = percent;
    return this;
  }

   /**
   * Значение процентов скидки/бонусов.
   * @return percent
  **/
  @ApiModelProperty(value = "Значение процентов скидки/бонусов.")
  public Double getPercent() {
    return percent;
  }

  public void setPercent(Double percent) {
    this.percent = percent;
  }

  public CashbackActionViewModel pricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
    return this;
  }

   /**
   * Значение фиксированной цены на единицу товара.
   * @return pricePerUnit
  **/
  @ApiModelProperty(value = "Значение фиксированной цены на единицу товара.")
  public Double getPricePerUnit() {
    return pricePerUnit;
  }

  public void setPricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
  }

  public CashbackActionViewModel amountPerUnit(Double amountPerUnit) {
    this.amountPerUnit = amountPerUnit;
    return this;
  }

   /**
   * Значение суммы скидки/бонусов за единицу товара.
   * @return amountPerUnit
  **/
  @ApiModelProperty(value = "Значение суммы скидки/бонусов за единицу товара.")
  public Double getAmountPerUnit() {
    return amountPerUnit;
  }

  public void setAmountPerUnit(Double amountPerUnit) {
    this.amountPerUnit = amountPerUnit;
  }

  public CashbackActionViewModel amountPerUniqueSku(Double amountPerUniqueSku) {
    this.amountPerUniqueSku = amountPerUniqueSku;
    return this;
  }

   /**
   * Значение суммы скидки/бонусов на sku.
   * @return amountPerUniqueSku
  **/
  @ApiModelProperty(value = "Значение суммы скидки/бонусов на sku.")
  public Double getAmountPerUniqueSku() {
    return amountPerUniqueSku;
  }

  public void setAmountPerUniqueSku(Double amountPerUniqueSku) {
    this.amountPerUniqueSku = amountPerUniqueSku;
  }

  public CashbackActionViewModel amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Значение фиксированной суммы скидки/бонусов.
   * @return amount
  **/
  @ApiModelProperty(value = "Значение фиксированной суммы скидки/бонусов.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public CashbackActionViewModel amountMeasure(Double amountMeasure) {
    this.amountMeasure = amountMeasure;
    return this;
  }

   /**
   * Сумма, за каждое достижение в чеке которой начисляется фиксированные скидки/бонусов.
   * @return amountMeasure
  **/
  @ApiModelProperty(value = "Сумма, за каждое достижение в чеке которой начисляется фиксированные скидки/бонусов.")
  public Double getAmountMeasure() {
    return amountMeasure;
  }

  public void setAmountMeasure(Double amountMeasure) {
    this.amountMeasure = amountMeasure;
  }

  public CashbackActionViewModel amountPerMeasure(Double amountPerMeasure) {
    this.amountPerMeasure = amountPerMeasure;
    return this;
  }

   /**
   * Сумма фиксированных скидки/бонуса, которая начисляется за каждое достижение в чеке суммы.
   * @return amountPerMeasure
  **/
  @ApiModelProperty(value = "Сумма фиксированных скидки/бонуса, которая начисляется за каждое достижение в чеке суммы.")
  public Double getAmountPerMeasure() {
    return amountPerMeasure;
  }

  public void setAmountPerMeasure(Double amountPerMeasure) {
    this.amountPerMeasure = amountPerMeasure;
  }

  public CashbackActionViewModel amountWeight(Double amountWeight) {
    this.amountWeight = amountWeight;
    return this;
  }

   /**
   * Масса, за каждое достижение в чеке которой начисляется фиксированные скидки/бонусов.
   * @return amountWeight
  **/
  @ApiModelProperty(value = "Масса, за каждое достижение в чеке которой начисляется фиксированные скидки/бонусов.")
  public Double getAmountWeight() {
    return amountWeight;
  }

  public void setAmountWeight(Double amountWeight) {
    this.amountWeight = amountWeight;
  }

  public CashbackActionViewModel amountPerWeight(Double amountPerWeight) {
    this.amountPerWeight = amountPerWeight;
    return this;
  }

   /**
   * Сумма фиксированных скидки/бонуса, которая начисляется за каждое достижение в чеке массы.
   * @return amountPerWeight
  **/
  @ApiModelProperty(value = "Сумма фиксированных скидки/бонуса, которая начисляется за каждое достижение в чеке массы.")
  public Double getAmountPerWeight() {
    return amountPerWeight;
  }

  public void setAmountPerWeight(Double amountPerWeight) {
    this.amountPerWeight = amountPerWeight;
  }

  public CashbackActionViewModel price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Значение фиксированной цены.
   * @return price
  **/
  @ApiModelProperty(value = "Значение фиксированной цены.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public CashbackActionViewModel attributeDiscount(AttributeDiscount attributeDiscount) {
    this.attributeDiscount = attributeDiscount;
    return this;
  }

   /**
   * Скидка из атрибута товара.
   * @return attributeDiscount
  **/
  @ApiModelProperty(value = "Скидка из атрибута товара.")
  public AttributeDiscount getAttributeDiscount() {
    return attributeDiscount;
  }

  public void setAttributeDiscount(AttributeDiscount attributeDiscount) {
    this.attributeDiscount = attributeDiscount;
  }

  public CashbackActionViewModel distributeToAll(Boolean distributeToAll) {
    this.distributeToAll = distributeToAll;
    return this;
  }

   /**
   * Распределить на все.
   * @return distributeToAll
  **/
  @ApiModelProperty(value = "Распределить на все.")
  public Boolean isDistributeToAll() {
    return distributeToAll;
  }

  public void setDistributeToAll(Boolean distributeToAll) {
    this.distributeToAll = distributeToAll;
  }

  public CashbackActionViewModel calculationExclusionDiscountTypes(List<CalculationExclusionDiscountTypesEnum> calculationExclusionDiscountTypes) {
    this.calculationExclusionDiscountTypes = calculationExclusionDiscountTypes;
    return this;
  }

  public CashbackActionViewModel addCalculationExclusionDiscountTypesItem(CalculationExclusionDiscountTypesEnum calculationExclusionDiscountTypesItem) {
    if (this.calculationExclusionDiscountTypes == null) {
      this.calculationExclusionDiscountTypes = new ArrayList<>();
    }
    this.calculationExclusionDiscountTypes.add(calculationExclusionDiscountTypesItem);
    return this;
  }

   /**
   * Типы скидок, которые исключаются при расчете.
   * @return calculationExclusionDiscountTypes
  **/
  @ApiModelProperty(value = "Типы скидок, которые исключаются при расчете.")
  public List<CalculationExclusionDiscountTypesEnum> getCalculationExclusionDiscountTypes() {
    return calculationExclusionDiscountTypes;
  }

  public void setCalculationExclusionDiscountTypes(List<CalculationExclusionDiscountTypesEnum> calculationExclusionDiscountTypes) {
    this.calculationExclusionDiscountTypes = calculationExclusionDiscountTypes;
  }

  public CashbackActionViewModel actionId(Integer actionId) {
    this.actionId = actionId;
    return this;
  }

   /**
   * Id действия. Если указан, редактируется действие, иначе создается новое.
   * @return actionId
  **/
  @ApiModelProperty(value = "Id действия. Если указан, редактируется действие, иначе создается новое.")
  public Integer getActionId() {
    return actionId;
  }

  public void setActionId(Integer actionId) {
    this.actionId = actionId;
  }

  public CashbackActionViewModel order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Порядок действия.
   * @return order
  **/
  @ApiModelProperty(value = "Порядок действия.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public CashbackActionViewModel lifeTimeDefinitionId(Integer lifeTimeDefinitionId) {
    this.lifeTimeDefinitionId = lifeTimeDefinitionId;
    return this;
  }

   /**
   * Id определения времени жизни.
   * @return lifeTimeDefinitionId
  **/
  @ApiModelProperty(value = "Id определения времени жизни.")
  public Integer getLifeTimeDefinitionId() {
    return lifeTimeDefinitionId;
  }

  public void setLifeTimeDefinitionId(Integer lifeTimeDefinitionId) {
    this.lifeTimeDefinitionId = lifeTimeDefinitionId;
  }

  public CashbackActionViewModel currency(CurrencyViewModel currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Валюта.
   * @return currency
  **/
  @ApiModelProperty(value = "Валюта.")
  public CurrencyViewModel getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyViewModel currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashbackActionViewModel cashbackActionViewModel = (CashbackActionViewModel) o;
    return Objects.equals(this.percent, cashbackActionViewModel.percent) &&
        Objects.equals(this.pricePerUnit, cashbackActionViewModel.pricePerUnit) &&
        Objects.equals(this.amountPerUnit, cashbackActionViewModel.amountPerUnit) &&
        Objects.equals(this.amountPerUniqueSku, cashbackActionViewModel.amountPerUniqueSku) &&
        Objects.equals(this.amount, cashbackActionViewModel.amount) &&
        Objects.equals(this.amountMeasure, cashbackActionViewModel.amountMeasure) &&
        Objects.equals(this.amountPerMeasure, cashbackActionViewModel.amountPerMeasure) &&
        Objects.equals(this.amountWeight, cashbackActionViewModel.amountWeight) &&
        Objects.equals(this.amountPerWeight, cashbackActionViewModel.amountPerWeight) &&
        Objects.equals(this.price, cashbackActionViewModel.price) &&
        Objects.equals(this.attributeDiscount, cashbackActionViewModel.attributeDiscount) &&
        Objects.equals(this.distributeToAll, cashbackActionViewModel.distributeToAll) &&
        Objects.equals(this.calculationExclusionDiscountTypes, cashbackActionViewModel.calculationExclusionDiscountTypes) &&
        Objects.equals(this.actionId, cashbackActionViewModel.actionId) &&
        Objects.equals(this.order, cashbackActionViewModel.order) &&
        Objects.equals(this.lifeTimeDefinitionId, cashbackActionViewModel.lifeTimeDefinitionId) &&
        Objects.equals(this.currency, cashbackActionViewModel.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percent, pricePerUnit, amountPerUnit, amountPerUniqueSku, amount, amountMeasure, amountPerMeasure, amountWeight, amountPerWeight, price, attributeDiscount, distributeToAll, calculationExclusionDiscountTypes, actionId, order, lifeTimeDefinitionId, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashbackActionViewModel {\n");
    
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
    sb.append("    amountPerUnit: ").append(toIndentedString(amountPerUnit)).append("\n");
    sb.append("    amountPerUniqueSku: ").append(toIndentedString(amountPerUniqueSku)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountMeasure: ").append(toIndentedString(amountMeasure)).append("\n");
    sb.append("    amountPerMeasure: ").append(toIndentedString(amountPerMeasure)).append("\n");
    sb.append("    amountWeight: ").append(toIndentedString(amountWeight)).append("\n");
    sb.append("    amountPerWeight: ").append(toIndentedString(amountPerWeight)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    attributeDiscount: ").append(toIndentedString(attributeDiscount)).append("\n");
    sb.append("    distributeToAll: ").append(toIndentedString(distributeToAll)).append("\n");
    sb.append("    calculationExclusionDiscountTypes: ").append(toIndentedString(calculationExclusionDiscountTypes)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    lifeTimeDefinitionId: ").append(toIndentedString(lifeTimeDefinitionId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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


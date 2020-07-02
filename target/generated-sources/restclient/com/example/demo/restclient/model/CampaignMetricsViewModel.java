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
import com.example.demo.restclient.model.MetricsViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * View-модель показателей кампании.
 */
@ApiModel(description = "View-модель показателей кампании.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CampaignMetricsViewModel {
  @JsonProperty("turnover")
  private Double turnover = null;

  @JsonProperty("proceeds")
  private Double proceeds = null;

  @JsonProperty("discount")
  private Double discount = null;

  @JsonProperty("discountPercent")
  private Double discountPercent = null;

  @JsonProperty("accruedSum")
  private Double accruedSum = null;

  @JsonProperty("accruedPercent")
  private Double accruedPercent = null;

  @JsonProperty("paymentBonusesSum")
  private Double paymentBonusesSum = null;

  @JsonProperty("paymentMoneySum")
  private Double paymentMoneySum = null;

  @JsonProperty("activeClientsCount")
  private Double activeClientsCount = null;

  @JsonProperty("chequesCount")
  private Double chequesCount = null;

  @JsonProperty("purchasesPerClient")
  private Double purchasesPerClient = null;

  @JsonProperty("averageChequeSum")
  private Double averageChequeSum = null;

  @JsonProperty("purchasesSumPerClient")
  private Double purchasesSumPerClient = null;

  @JsonProperty("discountsSumPerClient")
  private Double discountsSumPerClient = null;

  @JsonProperty("cashbacksSumPerClient")
  private Double cashbacksSumPerClient = null;

  @JsonProperty("paymentsSumPerClient")
  private Double paymentsSumPerClient = null;

  @JsonProperty("withdrawsPercentByTurnover")
  private Double withdrawsPercentByTurnover = null;

  @JsonProperty("withdrawsPercentByAccruals")
  private Double withdrawsPercentByAccruals = null;

  @JsonProperty("targetGroupCapacity")
  private Integer targetGroupCapacity = null;

  @JsonProperty("advertisingExpensesPerClient")
  private Double advertisingExpensesPerClient = null;

  @JsonProperty("advertisingExpensesPerClientPercent")
  private Double advertisingExpensesPerClientPercent = null;

  @JsonProperty("attractionExpensesPerClient")
  private Double attractionExpensesPerClient = null;

  @JsonProperty("attractionExpensesPerClientPercent")
  private Double attractionExpensesPerClientPercent = null;

  @JsonProperty("conversion")
  private Double conversion = null;

  @JsonProperty("expensesSum")
  private Double expensesSum = null;

  @JsonProperty("expensesPercent")
  private Double expensesPercent = null;

  @JsonProperty("communicationExpenses")
  private Double communicationExpenses = null;

  @JsonProperty("advertisingExpenses")
  private Double advertisingExpenses = null;

  public CampaignMetricsViewModel turnover(Double turnover) {
    this.turnover = turnover;
    return this;
  }

   /**
   * Товарооборот.
   * @return turnover
  **/
  @ApiModelProperty(value = "Товарооборот.")
  public Double getTurnover() {
    return turnover;
  }

  public void setTurnover(Double turnover) {
    this.turnover = turnover;
  }

  public CampaignMetricsViewModel proceeds(Double proceeds) {
    this.proceeds = proceeds;
    return this;
  }

   /**
   * Выручка.
   * @return proceeds
  **/
  @ApiModelProperty(value = "Выручка.")
  public Double getProceeds() {
    return proceeds;
  }

  public void setProceeds(Double proceeds) {
    this.proceeds = proceeds;
  }

  public CampaignMetricsViewModel discount(Double discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Скидка.
   * @return discount
  **/
  @ApiModelProperty(value = "Скидка.")
  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public CampaignMetricsViewModel discountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * Скидка в %.
   * @return discountPercent
  **/
  @ApiModelProperty(value = "Скидка в %.")
  public Double getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
  }

  public CampaignMetricsViewModel accruedSum(Double accruedSum) {
    this.accruedSum = accruedSum;
    return this;
  }

   /**
   * Начисленно бонусов.
   * @return accruedSum
  **/
  @ApiModelProperty(value = "Начисленно бонусов.")
  public Double getAccruedSum() {
    return accruedSum;
  }

  public void setAccruedSum(Double accruedSum) {
    this.accruedSum = accruedSum;
  }

  public CampaignMetricsViewModel accruedPercent(Double accruedPercent) {
    this.accruedPercent = accruedPercent;
    return this;
  }

   /**
   * Начислено бонусов в %.
   * @return accruedPercent
  **/
  @ApiModelProperty(value = "Начислено бонусов в %.")
  public Double getAccruedPercent() {
    return accruedPercent;
  }

  public void setAccruedPercent(Double accruedPercent) {
    this.accruedPercent = accruedPercent;
  }

  public CampaignMetricsViewModel paymentBonusesSum(Double paymentBonusesSum) {
    this.paymentBonusesSum = paymentBonusesSum;
    return this;
  }

   /**
   * Оплата бонусами.
   * @return paymentBonusesSum
  **/
  @ApiModelProperty(value = "Оплата бонусами.")
  public Double getPaymentBonusesSum() {
    return paymentBonusesSum;
  }

  public void setPaymentBonusesSum(Double paymentBonusesSum) {
    this.paymentBonusesSum = paymentBonusesSum;
  }

  public CampaignMetricsViewModel paymentMoneySum(Double paymentMoneySum) {
    this.paymentMoneySum = paymentMoneySum;
    return this;
  }

   /**
   * Оплата валютой кассы.
   * @return paymentMoneySum
  **/
  @ApiModelProperty(value = "Оплата валютой кассы.")
  public Double getPaymentMoneySum() {
    return paymentMoneySum;
  }

  public void setPaymentMoneySum(Double paymentMoneySum) {
    this.paymentMoneySum = paymentMoneySum;
  }

  public CampaignMetricsViewModel activeClientsCount(Double activeClientsCount) {
    this.activeClientsCount = activeClientsCount;
    return this;
  }

   /**
   * Кол-во покупателей.
   * @return activeClientsCount
  **/
  @ApiModelProperty(value = "Кол-во покупателей.")
  public Double getActiveClientsCount() {
    return activeClientsCount;
  }

  public void setActiveClientsCount(Double activeClientsCount) {
    this.activeClientsCount = activeClientsCount;
  }

  public CampaignMetricsViewModel chequesCount(Double chequesCount) {
    this.chequesCount = chequesCount;
    return this;
  }

   /**
   * Кол-во чеков.
   * @return chequesCount
  **/
  @ApiModelProperty(value = "Кол-во чеков.")
  public Double getChequesCount() {
    return chequesCount;
  }

  public void setChequesCount(Double chequesCount) {
    this.chequesCount = chequesCount;
  }

  public CampaignMetricsViewModel purchasesPerClient(Double purchasesPerClient) {
    this.purchasesPerClient = purchasesPerClient;
    return this;
  }

   /**
   * Кол-во покупок на 1ого клиента.
   * @return purchasesPerClient
  **/
  @ApiModelProperty(value = "Кол-во покупок на 1ого клиента.")
  public Double getPurchasesPerClient() {
    return purchasesPerClient;
  }

  public void setPurchasesPerClient(Double purchasesPerClient) {
    this.purchasesPerClient = purchasesPerClient;
  }

  public CampaignMetricsViewModel averageChequeSum(Double averageChequeSum) {
    this.averageChequeSum = averageChequeSum;
    return this;
  }

   /**
   * Средняя сумма чека.
   * @return averageChequeSum
  **/
  @ApiModelProperty(value = "Средняя сумма чека.")
  public Double getAverageChequeSum() {
    return averageChequeSum;
  }

  public void setAverageChequeSum(Double averageChequeSum) {
    this.averageChequeSum = averageChequeSum;
  }

  public CampaignMetricsViewModel purchasesSumPerClient(Double purchasesSumPerClient) {
    this.purchasesSumPerClient = purchasesSumPerClient;
    return this;
  }

   /**
   * Сумма покупок на 1ого клиента.
   * @return purchasesSumPerClient
  **/
  @ApiModelProperty(value = "Сумма покупок на 1ого клиента.")
  public Double getPurchasesSumPerClient() {
    return purchasesSumPerClient;
  }

  public void setPurchasesSumPerClient(Double purchasesSumPerClient) {
    this.purchasesSumPerClient = purchasesSumPerClient;
  }

  public CampaignMetricsViewModel discountsSumPerClient(Double discountsSumPerClient) {
    this.discountsSumPerClient = discountsSumPerClient;
    return this;
  }

   /**
   * Сумма скидок на 1ого клиента.
   * @return discountsSumPerClient
  **/
  @ApiModelProperty(value = "Сумма скидок на 1ого клиента.")
  public Double getDiscountsSumPerClient() {
    return discountsSumPerClient;
  }

  public void setDiscountsSumPerClient(Double discountsSumPerClient) {
    this.discountsSumPerClient = discountsSumPerClient;
  }

  public CampaignMetricsViewModel cashbacksSumPerClient(Double cashbacksSumPerClient) {
    this.cashbacksSumPerClient = cashbacksSumPerClient;
    return this;
  }

   /**
   * Сумма начислений на 1ого клиента.
   * @return cashbacksSumPerClient
  **/
  @ApiModelProperty(value = "Сумма начислений на 1ого клиента.")
  public Double getCashbacksSumPerClient() {
    return cashbacksSumPerClient;
  }

  public void setCashbacksSumPerClient(Double cashbacksSumPerClient) {
    this.cashbacksSumPerClient = cashbacksSumPerClient;
  }

  public CampaignMetricsViewModel paymentsSumPerClient(Double paymentsSumPerClient) {
    this.paymentsSumPerClient = paymentsSumPerClient;
    return this;
  }

   /**
   * Сумма оплаты бонусами на 1ого клиента.
   * @return paymentsSumPerClient
  **/
  @ApiModelProperty(value = "Сумма оплаты бонусами на 1ого клиента.")
  public Double getPaymentsSumPerClient() {
    return paymentsSumPerClient;
  }

  public void setPaymentsSumPerClient(Double paymentsSumPerClient) {
    this.paymentsSumPerClient = paymentsSumPerClient;
  }

  public CampaignMetricsViewModel withdrawsPercentByTurnover(Double withdrawsPercentByTurnover) {
    this.withdrawsPercentByTurnover = withdrawsPercentByTurnover;
    return this;
  }

   /**
   * Бонусов списано от товарооборота.
   * @return withdrawsPercentByTurnover
  **/
  @ApiModelProperty(value = "Бонусов списано от товарооборота.")
  public Double getWithdrawsPercentByTurnover() {
    return withdrawsPercentByTurnover;
  }

  public void setWithdrawsPercentByTurnover(Double withdrawsPercentByTurnover) {
    this.withdrawsPercentByTurnover = withdrawsPercentByTurnover;
  }

  public CampaignMetricsViewModel withdrawsPercentByAccruals(Double withdrawsPercentByAccruals) {
    this.withdrawsPercentByAccruals = withdrawsPercentByAccruals;
    return this;
  }

   /**
   * Кол-во списанных бонусов к кол-ву начисленных.
   * @return withdrawsPercentByAccruals
  **/
  @ApiModelProperty(value = "Кол-во списанных бонусов к кол-ву начисленных.")
  public Double getWithdrawsPercentByAccruals() {
    return withdrawsPercentByAccruals;
  }

  public void setWithdrawsPercentByAccruals(Double withdrawsPercentByAccruals) {
    this.withdrawsPercentByAccruals = withdrawsPercentByAccruals;
  }

  public CampaignMetricsViewModel targetGroupCapacity(Integer targetGroupCapacity) {
    this.targetGroupCapacity = targetGroupCapacity;
    return this;
  }

   /**
   * Численность ЦА.
   * @return targetGroupCapacity
  **/
  @ApiModelProperty(value = "Численность ЦА.")
  public Integer getTargetGroupCapacity() {
    return targetGroupCapacity;
  }

  public void setTargetGroupCapacity(Integer targetGroupCapacity) {
    this.targetGroupCapacity = targetGroupCapacity;
  }

  public CampaignMetricsViewModel advertisingExpensesPerClient(Double advertisingExpensesPerClient) {
    this.advertisingExpensesPerClient = advertisingExpensesPerClient;
    return this;
  }

   /**
   * Затраты рекламы и коммуникации на 1ого клиента.
   * @return advertisingExpensesPerClient
  **/
  @ApiModelProperty(value = "Затраты рекламы и коммуникации на 1ого клиента.")
  public Double getAdvertisingExpensesPerClient() {
    return advertisingExpensesPerClient;
  }

  public void setAdvertisingExpensesPerClient(Double advertisingExpensesPerClient) {
    this.advertisingExpensesPerClient = advertisingExpensesPerClient;
  }

  public CampaignMetricsViewModel advertisingExpensesPerClientPercent(Double advertisingExpensesPerClientPercent) {
    this.advertisingExpensesPerClientPercent = advertisingExpensesPerClientPercent;
    return this;
  }

   /**
   * Затраты рекламы и коммуникации на 1ого клиента в %.
   * @return advertisingExpensesPerClientPercent
  **/
  @ApiModelProperty(value = "Затраты рекламы и коммуникации на 1ого клиента в %.")
  public Double getAdvertisingExpensesPerClientPercent() {
    return advertisingExpensesPerClientPercent;
  }

  public void setAdvertisingExpensesPerClientPercent(Double advertisingExpensesPerClientPercent) {
    this.advertisingExpensesPerClientPercent = advertisingExpensesPerClientPercent;
  }

  public CampaignMetricsViewModel attractionExpensesPerClient(Double attractionExpensesPerClient) {
    this.attractionExpensesPerClient = attractionExpensesPerClient;
    return this;
  }

   /**
   * Стоимость привлечения 1ого клиента.
   * @return attractionExpensesPerClient
  **/
  @ApiModelProperty(value = "Стоимость привлечения 1ого клиента.")
  public Double getAttractionExpensesPerClient() {
    return attractionExpensesPerClient;
  }

  public void setAttractionExpensesPerClient(Double attractionExpensesPerClient) {
    this.attractionExpensesPerClient = attractionExpensesPerClient;
  }

  public CampaignMetricsViewModel attractionExpensesPerClientPercent(Double attractionExpensesPerClientPercent) {
    this.attractionExpensesPerClientPercent = attractionExpensesPerClientPercent;
    return this;
  }

   /**
   * Стоимость привлечения 1ого клиента в %.
   * @return attractionExpensesPerClientPercent
  **/
  @ApiModelProperty(value = "Стоимость привлечения 1ого клиента в %.")
  public Double getAttractionExpensesPerClientPercent() {
    return attractionExpensesPerClientPercent;
  }

  public void setAttractionExpensesPerClientPercent(Double attractionExpensesPerClientPercent) {
    this.attractionExpensesPerClientPercent = attractionExpensesPerClientPercent;
  }

  public CampaignMetricsViewModel conversion(Double conversion) {
    this.conversion = conversion;
    return this;
  }

   /**
   * Конверсия.
   * @return conversion
  **/
  @ApiModelProperty(value = "Конверсия.")
  public Double getConversion() {
    return conversion;
  }

  public void setConversion(Double conversion) {
    this.conversion = conversion;
  }

  public CampaignMetricsViewModel expensesSum(Double expensesSum) {
    this.expensesSum = expensesSum;
    return this;
  }

   /**
   * Затраты ИТОГ.
   * @return expensesSum
  **/
  @ApiModelProperty(value = "Затраты ИТОГ.")
  public Double getExpensesSum() {
    return expensesSum;
  }

  public void setExpensesSum(Double expensesSum) {
    this.expensesSum = expensesSum;
  }

  public CampaignMetricsViewModel expensesPercent(Double expensesPercent) {
    this.expensesPercent = expensesPercent;
    return this;
  }

   /**
   * Затраты ИТОГ в %.
   * @return expensesPercent
  **/
  @ApiModelProperty(value = "Затраты ИТОГ в %.")
  public Double getExpensesPercent() {
    return expensesPercent;
  }

  public void setExpensesPercent(Double expensesPercent) {
    this.expensesPercent = expensesPercent;
  }

  public CampaignMetricsViewModel communicationExpenses(Double communicationExpenses) {
    this.communicationExpenses = communicationExpenses;
    return this;
  }

   /**
   * Затраты на коммуникацию.
   * @return communicationExpenses
  **/
  @ApiModelProperty(value = "Затраты на коммуникацию.")
  public Double getCommunicationExpenses() {
    return communicationExpenses;
  }

  public void setCommunicationExpenses(Double communicationExpenses) {
    this.communicationExpenses = communicationExpenses;
  }

  public CampaignMetricsViewModel advertisingExpenses(Double advertisingExpenses) {
    this.advertisingExpenses = advertisingExpenses;
    return this;
  }

   /**
   * Затраты на рекламные материалы.
   * @return advertisingExpenses
  **/
  @ApiModelProperty(value = "Затраты на рекламные материалы.")
  public Double getAdvertisingExpenses() {
    return advertisingExpenses;
  }

  public void setAdvertisingExpenses(Double advertisingExpenses) {
    this.advertisingExpenses = advertisingExpenses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMetricsViewModel campaignMetricsViewModel = (CampaignMetricsViewModel) o;
    return Objects.equals(this.turnover, campaignMetricsViewModel.turnover) &&
        Objects.equals(this.proceeds, campaignMetricsViewModel.proceeds) &&
        Objects.equals(this.discount, campaignMetricsViewModel.discount) &&
        Objects.equals(this.discountPercent, campaignMetricsViewModel.discountPercent) &&
        Objects.equals(this.accruedSum, campaignMetricsViewModel.accruedSum) &&
        Objects.equals(this.accruedPercent, campaignMetricsViewModel.accruedPercent) &&
        Objects.equals(this.paymentBonusesSum, campaignMetricsViewModel.paymentBonusesSum) &&
        Objects.equals(this.paymentMoneySum, campaignMetricsViewModel.paymentMoneySum) &&
        Objects.equals(this.activeClientsCount, campaignMetricsViewModel.activeClientsCount) &&
        Objects.equals(this.chequesCount, campaignMetricsViewModel.chequesCount) &&
        Objects.equals(this.purchasesPerClient, campaignMetricsViewModel.purchasesPerClient) &&
        Objects.equals(this.averageChequeSum, campaignMetricsViewModel.averageChequeSum) &&
        Objects.equals(this.purchasesSumPerClient, campaignMetricsViewModel.purchasesSumPerClient) &&
        Objects.equals(this.discountsSumPerClient, campaignMetricsViewModel.discountsSumPerClient) &&
        Objects.equals(this.cashbacksSumPerClient, campaignMetricsViewModel.cashbacksSumPerClient) &&
        Objects.equals(this.paymentsSumPerClient, campaignMetricsViewModel.paymentsSumPerClient) &&
        Objects.equals(this.withdrawsPercentByTurnover, campaignMetricsViewModel.withdrawsPercentByTurnover) &&
        Objects.equals(this.withdrawsPercentByAccruals, campaignMetricsViewModel.withdrawsPercentByAccruals) &&
        Objects.equals(this.targetGroupCapacity, campaignMetricsViewModel.targetGroupCapacity) &&
        Objects.equals(this.advertisingExpensesPerClient, campaignMetricsViewModel.advertisingExpensesPerClient) &&
        Objects.equals(this.advertisingExpensesPerClientPercent, campaignMetricsViewModel.advertisingExpensesPerClientPercent) &&
        Objects.equals(this.attractionExpensesPerClient, campaignMetricsViewModel.attractionExpensesPerClient) &&
        Objects.equals(this.attractionExpensesPerClientPercent, campaignMetricsViewModel.attractionExpensesPerClientPercent) &&
        Objects.equals(this.conversion, campaignMetricsViewModel.conversion) &&
        Objects.equals(this.expensesSum, campaignMetricsViewModel.expensesSum) &&
        Objects.equals(this.expensesPercent, campaignMetricsViewModel.expensesPercent) &&
        Objects.equals(this.communicationExpenses, campaignMetricsViewModel.communicationExpenses) &&
        Objects.equals(this.advertisingExpenses, campaignMetricsViewModel.advertisingExpenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(turnover, proceeds, discount, discountPercent, accruedSum, accruedPercent, paymentBonusesSum, paymentMoneySum, activeClientsCount, chequesCount, purchasesPerClient, averageChequeSum, purchasesSumPerClient, discountsSumPerClient, cashbacksSumPerClient, paymentsSumPerClient, withdrawsPercentByTurnover, withdrawsPercentByAccruals, targetGroupCapacity, advertisingExpensesPerClient, advertisingExpensesPerClientPercent, attractionExpensesPerClient, attractionExpensesPerClientPercent, conversion, expensesSum, expensesPercent, communicationExpenses, advertisingExpenses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMetricsViewModel {\n");
    
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    proceeds: ").append(toIndentedString(proceeds)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    accruedSum: ").append(toIndentedString(accruedSum)).append("\n");
    sb.append("    accruedPercent: ").append(toIndentedString(accruedPercent)).append("\n");
    sb.append("    paymentBonusesSum: ").append(toIndentedString(paymentBonusesSum)).append("\n");
    sb.append("    paymentMoneySum: ").append(toIndentedString(paymentMoneySum)).append("\n");
    sb.append("    activeClientsCount: ").append(toIndentedString(activeClientsCount)).append("\n");
    sb.append("    chequesCount: ").append(toIndentedString(chequesCount)).append("\n");
    sb.append("    purchasesPerClient: ").append(toIndentedString(purchasesPerClient)).append("\n");
    sb.append("    averageChequeSum: ").append(toIndentedString(averageChequeSum)).append("\n");
    sb.append("    purchasesSumPerClient: ").append(toIndentedString(purchasesSumPerClient)).append("\n");
    sb.append("    discountsSumPerClient: ").append(toIndentedString(discountsSumPerClient)).append("\n");
    sb.append("    cashbacksSumPerClient: ").append(toIndentedString(cashbacksSumPerClient)).append("\n");
    sb.append("    paymentsSumPerClient: ").append(toIndentedString(paymentsSumPerClient)).append("\n");
    sb.append("    withdrawsPercentByTurnover: ").append(toIndentedString(withdrawsPercentByTurnover)).append("\n");
    sb.append("    withdrawsPercentByAccruals: ").append(toIndentedString(withdrawsPercentByAccruals)).append("\n");
    sb.append("    targetGroupCapacity: ").append(toIndentedString(targetGroupCapacity)).append("\n");
    sb.append("    advertisingExpensesPerClient: ").append(toIndentedString(advertisingExpensesPerClient)).append("\n");
    sb.append("    advertisingExpensesPerClientPercent: ").append(toIndentedString(advertisingExpensesPerClientPercent)).append("\n");
    sb.append("    attractionExpensesPerClient: ").append(toIndentedString(attractionExpensesPerClient)).append("\n");
    sb.append("    attractionExpensesPerClientPercent: ").append(toIndentedString(attractionExpensesPerClientPercent)).append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    expensesSum: ").append(toIndentedString(expensesSum)).append("\n");
    sb.append("    expensesPercent: ").append(toIndentedString(expensesPercent)).append("\n");
    sb.append("    communicationExpenses: ").append(toIndentedString(communicationExpenses)).append("\n");
    sb.append("    advertisingExpenses: ").append(toIndentedString(advertisingExpenses)).append("\n");
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


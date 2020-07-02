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
 * Модель представления показателей маркетингово плана.
 */
@ApiModel(description = "Модель представления показателей маркетингово плана.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PlanMetricsViewModel {
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

  @JsonProperty("balance")
  private Double balance = null;

  @JsonProperty("clientsCount")
  private Integer clientsCount = null;

  @JsonProperty("outflowPercent")
  private Double outflowPercent = null;

  @JsonProperty("retentionPercent")
  private Double retentionPercent = null;

  public PlanMetricsViewModel turnover(Double turnover) {
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

  public PlanMetricsViewModel proceeds(Double proceeds) {
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

  public PlanMetricsViewModel discount(Double discount) {
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

  public PlanMetricsViewModel discountPercent(Double discountPercent) {
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

  public PlanMetricsViewModel accruedSum(Double accruedSum) {
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

  public PlanMetricsViewModel accruedPercent(Double accruedPercent) {
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

  public PlanMetricsViewModel paymentBonusesSum(Double paymentBonusesSum) {
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

  public PlanMetricsViewModel paymentMoneySum(Double paymentMoneySum) {
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

  public PlanMetricsViewModel activeClientsCount(Double activeClientsCount) {
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

  public PlanMetricsViewModel chequesCount(Double chequesCount) {
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

  public PlanMetricsViewModel purchasesPerClient(Double purchasesPerClient) {
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

  public PlanMetricsViewModel averageChequeSum(Double averageChequeSum) {
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

  public PlanMetricsViewModel purchasesSumPerClient(Double purchasesSumPerClient) {
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

  public PlanMetricsViewModel discountsSumPerClient(Double discountsSumPerClient) {
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

  public PlanMetricsViewModel cashbacksSumPerClient(Double cashbacksSumPerClient) {
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

  public PlanMetricsViewModel paymentsSumPerClient(Double paymentsSumPerClient) {
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

  public PlanMetricsViewModel withdrawsPercentByTurnover(Double withdrawsPercentByTurnover) {
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

  public PlanMetricsViewModel withdrawsPercentByAccruals(Double withdrawsPercentByAccruals) {
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

  public PlanMetricsViewModel balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Остаток бонусов.
   * @return balance
  **/
  @ApiModelProperty(value = "Остаток бонусов.")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public PlanMetricsViewModel clientsCount(Integer clientsCount) {
    this.clientsCount = clientsCount;
    return this;
  }

   /**
   * Клиентская база.
   * @return clientsCount
  **/
  @ApiModelProperty(value = "Клиентская база.")
  public Integer getClientsCount() {
    return clientsCount;
  }

  public void setClientsCount(Integer clientsCount) {
    this.clientsCount = clientsCount;
  }

  public PlanMetricsViewModel outflowPercent(Double outflowPercent) {
    this.outflowPercent = outflowPercent;
    return this;
  }

   /**
   * Коэффициент оттока.
   * @return outflowPercent
  **/
  @ApiModelProperty(value = "Коэффициент оттока.")
  public Double getOutflowPercent() {
    return outflowPercent;
  }

  public void setOutflowPercent(Double outflowPercent) {
    this.outflowPercent = outflowPercent;
  }

  public PlanMetricsViewModel retentionPercent(Double retentionPercent) {
    this.retentionPercent = retentionPercent;
    return this;
  }

   /**
   * Коэффициент удержания.
   * @return retentionPercent
  **/
  @ApiModelProperty(value = "Коэффициент удержания.")
  public Double getRetentionPercent() {
    return retentionPercent;
  }

  public void setRetentionPercent(Double retentionPercent) {
    this.retentionPercent = retentionPercent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanMetricsViewModel planMetricsViewModel = (PlanMetricsViewModel) o;
    return Objects.equals(this.turnover, planMetricsViewModel.turnover) &&
        Objects.equals(this.proceeds, planMetricsViewModel.proceeds) &&
        Objects.equals(this.discount, planMetricsViewModel.discount) &&
        Objects.equals(this.discountPercent, planMetricsViewModel.discountPercent) &&
        Objects.equals(this.accruedSum, planMetricsViewModel.accruedSum) &&
        Objects.equals(this.accruedPercent, planMetricsViewModel.accruedPercent) &&
        Objects.equals(this.paymentBonusesSum, planMetricsViewModel.paymentBonusesSum) &&
        Objects.equals(this.paymentMoneySum, planMetricsViewModel.paymentMoneySum) &&
        Objects.equals(this.activeClientsCount, planMetricsViewModel.activeClientsCount) &&
        Objects.equals(this.chequesCount, planMetricsViewModel.chequesCount) &&
        Objects.equals(this.purchasesPerClient, planMetricsViewModel.purchasesPerClient) &&
        Objects.equals(this.averageChequeSum, planMetricsViewModel.averageChequeSum) &&
        Objects.equals(this.purchasesSumPerClient, planMetricsViewModel.purchasesSumPerClient) &&
        Objects.equals(this.discountsSumPerClient, planMetricsViewModel.discountsSumPerClient) &&
        Objects.equals(this.cashbacksSumPerClient, planMetricsViewModel.cashbacksSumPerClient) &&
        Objects.equals(this.paymentsSumPerClient, planMetricsViewModel.paymentsSumPerClient) &&
        Objects.equals(this.withdrawsPercentByTurnover, planMetricsViewModel.withdrawsPercentByTurnover) &&
        Objects.equals(this.withdrawsPercentByAccruals, planMetricsViewModel.withdrawsPercentByAccruals) &&
        Objects.equals(this.balance, planMetricsViewModel.balance) &&
        Objects.equals(this.clientsCount, planMetricsViewModel.clientsCount) &&
        Objects.equals(this.outflowPercent, planMetricsViewModel.outflowPercent) &&
        Objects.equals(this.retentionPercent, planMetricsViewModel.retentionPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(turnover, proceeds, discount, discountPercent, accruedSum, accruedPercent, paymentBonusesSum, paymentMoneySum, activeClientsCount, chequesCount, purchasesPerClient, averageChequeSum, purchasesSumPerClient, discountsSumPerClient, cashbacksSumPerClient, paymentsSumPerClient, withdrawsPercentByTurnover, withdrawsPercentByAccruals, balance, clientsCount, outflowPercent, retentionPercent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanMetricsViewModel {\n");
    
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
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    clientsCount: ").append(toIndentedString(clientsCount)).append("\n");
    sb.append("    outflowPercent: ").append(toIndentedString(outflowPercent)).append("\n");
    sb.append("    retentionPercent: ").append(toIndentedString(retentionPercent)).append("\n");
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


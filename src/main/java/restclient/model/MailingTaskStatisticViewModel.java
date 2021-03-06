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
 * Статистика выполнения задачи рассылки.
 */
@ApiModel(description = "Статистика выполнения задачи рассылки.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class MailingTaskStatisticViewModel {
  @JsonProperty("personsCount")
  private Integer personsCount = null;

  @JsonProperty("processedNotificationsCount")
  private Integer processedNotificationsCount = null;

  @JsonProperty("processedSmsCount")
  private Integer processedSmsCount = null;

  @JsonProperty("processedMessagesCount")
  private Integer processedMessagesCount = null;

  @JsonProperty("sentMessagesCount")
  private Integer sentMessagesCount = null;

  @JsonProperty("deliveryInProcessMessagesCount")
  private Integer deliveryInProcessMessagesCount = null;

  @JsonProperty("deliveredOkMessagesCount")
  private Integer deliveredOkMessagesCount = null;

  @JsonProperty("deliveredFailedMessagesCount")
  private Integer deliveredFailedMessagesCount = null;

  @JsonProperty("deliveredReadMessagesCount")
  private Integer deliveredReadMessagesCount = null;

  @JsonProperty("deliveredUnknownMessagesCount")
  private Integer deliveredUnknownMessagesCount = null;

  @JsonProperty("sentMessagesAmount")
  private Double sentMessagesAmount = null;

  public MailingTaskStatisticViewModel personsCount(Integer personsCount) {
    this.personsCount = personsCount;
    return this;
  }

   /**
   * Количество клиентов всего.
   * @return personsCount
  **/
  @ApiModelProperty(value = "Количество клиентов всего.")
  public Integer getPersonsCount() {
    return personsCount;
  }

  public void setPersonsCount(Integer personsCount) {
    this.personsCount = personsCount;
  }

  public MailingTaskStatisticViewModel processedNotificationsCount(Integer processedNotificationsCount) {
    this.processedNotificationsCount = processedNotificationsCount;
    return this;
  }

   /**
   * Количество сформированных оповещений.
   * @return processedNotificationsCount
  **/
  @ApiModelProperty(value = "Количество сформированных оповещений.")
  public Integer getProcessedNotificationsCount() {
    return processedNotificationsCount;
  }

  public void setProcessedNotificationsCount(Integer processedNotificationsCount) {
    this.processedNotificationsCount = processedNotificationsCount;
  }

  public MailingTaskStatisticViewModel processedSmsCount(Integer processedSmsCount) {
    this.processedSmsCount = processedSmsCount;
    return this;
  }

   /**
   * Количество сформированных sms.
   * @return processedSmsCount
  **/
  @ApiModelProperty(value = "Количество сформированных sms.")
  public Integer getProcessedSmsCount() {
    return processedSmsCount;
  }

  public void setProcessedSmsCount(Integer processedSmsCount) {
    this.processedSmsCount = processedSmsCount;
  }

  public MailingTaskStatisticViewModel processedMessagesCount(Integer processedMessagesCount) {
    this.processedMessagesCount = processedMessagesCount;
    return this;
  }

   /**
   * Количество сформированных сообщений.
   * @return processedMessagesCount
  **/
  @ApiModelProperty(value = "Количество сформированных сообщений.")
  public Integer getProcessedMessagesCount() {
    return processedMessagesCount;
  }

  public void setProcessedMessagesCount(Integer processedMessagesCount) {
    this.processedMessagesCount = processedMessagesCount;
  }

  public MailingTaskStatisticViewModel sentMessagesCount(Integer sentMessagesCount) {
    this.sentMessagesCount = sentMessagesCount;
    return this;
  }

   /**
   * Количество отправленных сообщений.
   * @return sentMessagesCount
  **/
  @ApiModelProperty(value = "Количество отправленных сообщений.")
  public Integer getSentMessagesCount() {
    return sentMessagesCount;
  }

  public void setSentMessagesCount(Integer sentMessagesCount) {
    this.sentMessagesCount = sentMessagesCount;
  }

  public MailingTaskStatisticViewModel deliveryInProcessMessagesCount(Integer deliveryInProcessMessagesCount) {
    this.deliveryInProcessMessagesCount = deliveryInProcessMessagesCount;
    return this;
  }

   /**
   * Количество сообщений, которые находятся на обработке внешним шлюзом.
   * @return deliveryInProcessMessagesCount
  **/
  @ApiModelProperty(value = "Количество сообщений, которые находятся на обработке внешним шлюзом.")
  public Integer getDeliveryInProcessMessagesCount() {
    return deliveryInProcessMessagesCount;
  }

  public void setDeliveryInProcessMessagesCount(Integer deliveryInProcessMessagesCount) {
    this.deliveryInProcessMessagesCount = deliveryInProcessMessagesCount;
  }

  public MailingTaskStatisticViewModel deliveredOkMessagesCount(Integer deliveredOkMessagesCount) {
    this.deliveredOkMessagesCount = deliveredOkMessagesCount;
    return this;
  }

   /**
   * Количество успешно доставленных сообщений.
   * @return deliveredOkMessagesCount
  **/
  @ApiModelProperty(value = "Количество успешно доставленных сообщений.")
  public Integer getDeliveredOkMessagesCount() {
    return deliveredOkMessagesCount;
  }

  public void setDeliveredOkMessagesCount(Integer deliveredOkMessagesCount) {
    this.deliveredOkMessagesCount = deliveredOkMessagesCount;
  }

  public MailingTaskStatisticViewModel deliveredFailedMessagesCount(Integer deliveredFailedMessagesCount) {
    this.deliveredFailedMessagesCount = deliveredFailedMessagesCount;
    return this;
  }

   /**
   * Количество сообщений, доставка которых не удалась.
   * @return deliveredFailedMessagesCount
  **/
  @ApiModelProperty(value = "Количество сообщений, доставка которых не удалась.")
  public Integer getDeliveredFailedMessagesCount() {
    return deliveredFailedMessagesCount;
  }

  public void setDeliveredFailedMessagesCount(Integer deliveredFailedMessagesCount) {
    this.deliveredFailedMessagesCount = deliveredFailedMessagesCount;
  }

  public MailingTaskStatisticViewModel deliveredReadMessagesCount(Integer deliveredReadMessagesCount) {
    this.deliveredReadMessagesCount = deliveredReadMessagesCount;
    return this;
  }

   /**
   * Количество сообщений, которые прочитаны.
   * @return deliveredReadMessagesCount
  **/
  @ApiModelProperty(value = "Количество сообщений, которые прочитаны.")
  public Integer getDeliveredReadMessagesCount() {
    return deliveredReadMessagesCount;
  }

  public void setDeliveredReadMessagesCount(Integer deliveredReadMessagesCount) {
    this.deliveredReadMessagesCount = deliveredReadMessagesCount;
  }

  public MailingTaskStatisticViewModel deliveredUnknownMessagesCount(Integer deliveredUnknownMessagesCount) {
    this.deliveredUnknownMessagesCount = deliveredUnknownMessagesCount;
    return this;
  }

   /**
   * Количество сообщений, у которых неизвестен статус доставки.
   * @return deliveredUnknownMessagesCount
  **/
  @ApiModelProperty(value = "Количество сообщений, у которых неизвестен статус доставки.")
  public Integer getDeliveredUnknownMessagesCount() {
    return deliveredUnknownMessagesCount;
  }

  public void setDeliveredUnknownMessagesCount(Integer deliveredUnknownMessagesCount) {
    this.deliveredUnknownMessagesCount = deliveredUnknownMessagesCount;
  }

  public MailingTaskStatisticViewModel sentMessagesAmount(Double sentMessagesAmount) {
    this.sentMessagesAmount = sentMessagesAmount;
    return this;
  }

   /**
   * Фактическая стоимость рассылки.
   * @return sentMessagesAmount
  **/
  @ApiModelProperty(value = "Фактическая стоимость рассылки.")
  public Double getSentMessagesAmount() {
    return sentMessagesAmount;
  }

  public void setSentMessagesAmount(Double sentMessagesAmount) {
    this.sentMessagesAmount = sentMessagesAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailingTaskStatisticViewModel mailingTaskStatisticViewModel = (MailingTaskStatisticViewModel) o;
    return Objects.equals(this.personsCount, mailingTaskStatisticViewModel.personsCount) &&
        Objects.equals(this.processedNotificationsCount, mailingTaskStatisticViewModel.processedNotificationsCount) &&
        Objects.equals(this.processedSmsCount, mailingTaskStatisticViewModel.processedSmsCount) &&
        Objects.equals(this.processedMessagesCount, mailingTaskStatisticViewModel.processedMessagesCount) &&
        Objects.equals(this.sentMessagesCount, mailingTaskStatisticViewModel.sentMessagesCount) &&
        Objects.equals(this.deliveryInProcessMessagesCount, mailingTaskStatisticViewModel.deliveryInProcessMessagesCount) &&
        Objects.equals(this.deliveredOkMessagesCount, mailingTaskStatisticViewModel.deliveredOkMessagesCount) &&
        Objects.equals(this.deliveredFailedMessagesCount, mailingTaskStatisticViewModel.deliveredFailedMessagesCount) &&
        Objects.equals(this.deliveredReadMessagesCount, mailingTaskStatisticViewModel.deliveredReadMessagesCount) &&
        Objects.equals(this.deliveredUnknownMessagesCount, mailingTaskStatisticViewModel.deliveredUnknownMessagesCount) &&
        Objects.equals(this.sentMessagesAmount, mailingTaskStatisticViewModel.sentMessagesAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personsCount, processedNotificationsCount, processedSmsCount, processedMessagesCount, sentMessagesCount, deliveryInProcessMessagesCount, deliveredOkMessagesCount, deliveredFailedMessagesCount, deliveredReadMessagesCount, deliveredUnknownMessagesCount, sentMessagesAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingTaskStatisticViewModel {\n");
    
    sb.append("    personsCount: ").append(toIndentedString(personsCount)).append("\n");
    sb.append("    processedNotificationsCount: ").append(toIndentedString(processedNotificationsCount)).append("\n");
    sb.append("    processedSmsCount: ").append(toIndentedString(processedSmsCount)).append("\n");
    sb.append("    processedMessagesCount: ").append(toIndentedString(processedMessagesCount)).append("\n");
    sb.append("    sentMessagesCount: ").append(toIndentedString(sentMessagesCount)).append("\n");
    sb.append("    deliveryInProcessMessagesCount: ").append(toIndentedString(deliveryInProcessMessagesCount)).append("\n");
    sb.append("    deliveredOkMessagesCount: ").append(toIndentedString(deliveredOkMessagesCount)).append("\n");
    sb.append("    deliveredFailedMessagesCount: ").append(toIndentedString(deliveredFailedMessagesCount)).append("\n");
    sb.append("    deliveredReadMessagesCount: ").append(toIndentedString(deliveredReadMessagesCount)).append("\n");
    sb.append("    deliveredUnknownMessagesCount: ").append(toIndentedString(deliveredUnknownMessagesCount)).append("\n");
    sb.append("    sentMessagesAmount: ").append(toIndentedString(sentMessagesAmount)).append("\n");
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


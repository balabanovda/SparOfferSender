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
import com.example.demo.restclient.model.MailingMessageViewModel;
import com.example.demo.restclient.model.MailingTaskStatisticViewModel;
import com.example.demo.restclient.model.TargetGroupBriefViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * Задача рассылки.
 */
@ApiModel(description = "Задача рассылки.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class MailingTaskViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("mailingId")
  private Integer mailingId = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("gateway")
  private String gateway = null;

  /**
   * Статус задачи.
   */
  public enum StateEnum {
    DONE("Done"),
    
    INPROCESS("InProcess"),
    
    PLANNED("Planned"),
    
    CANCELLED("Cancelled"),
    
    FORINITIALIZE("ForInitialize");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("statistic")
  private MailingTaskStatisticViewModel statistic = null;

  @JsonProperty("isAbleToCancel")
  private Boolean isAbleToCancel = null;

  @JsonProperty("isTest")
  private Boolean isTest = null;

  @JsonProperty("message")
  private MailingMessageViewModel message = null;

  @JsonProperty("targetGroup")
  private TargetGroupBriefViewModel targetGroup = null;

  public MailingTaskViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор задачи.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор задачи.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MailingTaskViewModel mailingId(Integer mailingId) {
    this.mailingId = mailingId;
    return this;
  }

   /**
   * Идентификатор рассылки.
   * @return mailingId
  **/
  @ApiModelProperty(value = "Идентификатор рассылки.")
  public Integer getMailingId() {
    return mailingId;
  }

  public void setMailingId(Integer mailingId) {
    this.mailingId = mailingId;
  }

  public MailingTaskViewModel startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Дата старта.
   * @return startDate
  **/
  @ApiModelProperty(value = "Дата старта.")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public MailingTaskViewModel gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

   /**
   * Шлюз.
   * @return gateway
  **/
  @ApiModelProperty(value = "Шлюз.")
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public MailingTaskViewModel state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Статус задачи.
   * @return state
  **/
  @ApiModelProperty(value = "Статус задачи.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public MailingTaskViewModel statistic(MailingTaskStatisticViewModel statistic) {
    this.statistic = statistic;
    return this;
  }

   /**
   * Статистика отправки.
   * @return statistic
  **/
  @ApiModelProperty(value = "Статистика отправки.")
  public MailingTaskStatisticViewModel getStatistic() {
    return statistic;
  }

  public void setStatistic(MailingTaskStatisticViewModel statistic) {
    this.statistic = statistic;
  }

  public MailingTaskViewModel isAbleToCancel(Boolean isAbleToCancel) {
    this.isAbleToCancel = isAbleToCancel;
    return this;
  }

   /**
   * Возможно ли отменить задачу.
   * @return isAbleToCancel
  **/
  @ApiModelProperty(value = "Возможно ли отменить задачу.")
  public Boolean isIsAbleToCancel() {
    return isAbleToCancel;
  }

  public void setIsAbleToCancel(Boolean isAbleToCancel) {
    this.isAbleToCancel = isAbleToCancel;
  }

  public MailingTaskViewModel isTest(Boolean isTest) {
    this.isTest = isTest;
    return this;
  }

   /**
   * Тестовая ли задача.
   * @return isTest
  **/
  @ApiModelProperty(value = "Тестовая ли задача.")
  public Boolean isIsTest() {
    return isTest;
  }

  public void setIsTest(Boolean isTest) {
    this.isTest = isTest;
  }

  public MailingTaskViewModel message(MailingMessageViewModel message) {
    this.message = message;
    return this;
  }

   /**
   * Текст сообщения.
   * @return message
  **/
  @ApiModelProperty(value = "Текст сообщения.")
  public MailingMessageViewModel getMessage() {
    return message;
  }

  public void setMessage(MailingMessageViewModel message) {
    this.message = message;
  }

  public MailingTaskViewModel targetGroup(TargetGroupBriefViewModel targetGroup) {
    this.targetGroup = targetGroup;
    return this;
  }

   /**
   * Целевая группа.
   * @return targetGroup
  **/
  @ApiModelProperty(value = "Целевая группа.")
  public TargetGroupBriefViewModel getTargetGroup() {
    return targetGroup;
  }

  public void setTargetGroup(TargetGroupBriefViewModel targetGroup) {
    this.targetGroup = targetGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailingTaskViewModel mailingTaskViewModel = (MailingTaskViewModel) o;
    return Objects.equals(this.id, mailingTaskViewModel.id) &&
        Objects.equals(this.mailingId, mailingTaskViewModel.mailingId) &&
        Objects.equals(this.startDate, mailingTaskViewModel.startDate) &&
        Objects.equals(this.gateway, mailingTaskViewModel.gateway) &&
        Objects.equals(this.state, mailingTaskViewModel.state) &&
        Objects.equals(this.statistic, mailingTaskViewModel.statistic) &&
        Objects.equals(this.isAbleToCancel, mailingTaskViewModel.isAbleToCancel) &&
        Objects.equals(this.isTest, mailingTaskViewModel.isTest) &&
        Objects.equals(this.message, mailingTaskViewModel.message) &&
        Objects.equals(this.targetGroup, mailingTaskViewModel.targetGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mailingId, startDate, gateway, state, statistic, isAbleToCancel, isTest, message, targetGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingTaskViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mailingId: ").append(toIndentedString(mailingId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    isAbleToCancel: ").append(toIndentedString(isAbleToCancel)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    targetGroup: ").append(toIndentedString(targetGroup)).append("\n");
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

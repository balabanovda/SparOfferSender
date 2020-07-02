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
import com.example.demo.restclient.model.CurrencyBaseModel;
import com.example.demo.restclient.model.DeviceBaseViewModel;
import com.example.demo.restclient.model.LimitBorderModel;
import com.example.demo.restclient.model.LimitTypeModel;
import com.example.demo.restclient.model.TimeModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ViewModel правила лимита.
 */
@ApiModel(description = "ViewModel правила лимита.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class LimitRuleModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("limitType")
  private LimitTypeModel limitType = null;

  /**
   * Период ограничения.
   */
  public enum PeriodEnum {
    ONCE("Once"),
    
    HOUR("Hour"),
    
    DAY("Day"),
    
    WEEK("Week"),
    
    MONTH("Month"),
    
    UNLIMITED("Unlimited");

    private String value;

    PeriodEnum(String value) {
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
    public static PeriodEnum fromValue(String text) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("period")
  private PeriodEnum period = null;

  @JsonProperty("currency")
  private CurrencyBaseModel currency = null;

  @JsonProperty("cardId")
  private Integer cardId = null;

  @JsonProperty("device")
  private DeviceBaseViewModel device = null;

  @JsonProperty("blockTimeInSeconds")
  private Integer blockTimeInSeconds = null;

  @JsonProperty("timeModel")
  private TimeModel timeModel = null;

  @JsonProperty("limitBorders")
  private List<LimitBorderModel> limitBorders = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("isArchived")
  private Boolean isArchived = null;

  @JsonProperty("apiMethodName")
  private String apiMethodName = null;

  public LimitRuleModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор правила.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор правила.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LimitRuleModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Имя правила.
   * @return name
  **/
  @ApiModelProperty(value = "Имя правила.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LimitRuleModel limitType(LimitTypeModel limitType) {
    this.limitType = limitType;
    return this;
  }

   /**
   * Тип лимита.
   * @return limitType
  **/
  @ApiModelProperty(value = "Тип лимита.")
  public LimitTypeModel getLimitType() {
    return limitType;
  }

  public void setLimitType(LimitTypeModel limitType) {
    this.limitType = limitType;
  }

  public LimitRuleModel period(PeriodEnum period) {
    this.period = period;
    return this;
  }

   /**
   * Период ограничения.
   * @return period
  **/
  @ApiModelProperty(value = "Период ограничения.")
  public PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public LimitRuleModel currency(CurrencyBaseModel currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Валюта.
   * @return currency
  **/
  @ApiModelProperty(value = "Валюта.")
  public CurrencyBaseModel getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyBaseModel currency) {
    this.currency = currency;
  }

  public LimitRuleModel cardId(Integer cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Идентификатор карты.
   * @return cardId
  **/
  @ApiModelProperty(value = "Идентификатор карты.")
  public Integer getCardId() {
    return cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  public LimitRuleModel device(DeviceBaseViewModel device) {
    this.device = device;
    return this;
  }

   /**
   * Информация о кассе.
   * @return device
  **/
  @ApiModelProperty(value = "Информация о кассе.")
  public DeviceBaseViewModel getDevice() {
    return device;
  }

  public void setDevice(DeviceBaseViewModel device) {
    this.device = device;
  }

  public LimitRuleModel blockTimeInSeconds(Integer blockTimeInSeconds) {
    this.blockTimeInSeconds = blockTimeInSeconds;
    return this;
  }

   /**
   * Время блокировки при превышении лимита.
   * @return blockTimeInSeconds
  **/
  @ApiModelProperty(value = "Время блокировки при превышении лимита.")
  public Integer getBlockTimeInSeconds() {
    return blockTimeInSeconds;
  }

  public void setBlockTimeInSeconds(Integer blockTimeInSeconds) {
    this.blockTimeInSeconds = blockTimeInSeconds;
  }

  public LimitRuleModel timeModel(TimeModel timeModel) {
    this.timeModel = timeModel;
    return this;
  }

   /**
   * Модель для времени блокировки.
   * @return timeModel
  **/
  @ApiModelProperty(value = "Модель для времени блокировки.")
  public TimeModel getTimeModel() {
    return timeModel;
  }

  public void setTimeModel(TimeModel timeModel) {
    this.timeModel = timeModel;
  }

  public LimitRuleModel limitBorders(List<LimitBorderModel> limitBorders) {
    this.limitBorders = limitBorders;
    return this;
  }

  public LimitRuleModel addLimitBordersItem(LimitBorderModel limitBordersItem) {
    if (this.limitBorders == null) {
      this.limitBorders = new ArrayList<>();
    }
    this.limitBorders.add(limitBordersItem);
    return this;
  }

   /**
   * Значение лимита.
   * @return limitBorders
  **/
  @ApiModelProperty(value = "Значение лимита.")
  public List<LimitBorderModel> getLimitBorders() {
    return limitBorders;
  }

  public void setLimitBorders(List<LimitBorderModel> limitBorders) {
    this.limitBorders = limitBorders;
  }

  public LimitRuleModel phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Номер телефона  {Loymax.Limits.Implementation.OtherLimits.Rules.LimitSmsRule.Phone}.
   * @return phone
  **/
  @ApiModelProperty(value = "Номер телефона  {Loymax.Limits.Implementation.OtherLimits.Rules.LimitSmsRule.Phone}.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public LimitRuleModel userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Идентификатор пользователя {Loymax.Limits.Implementation.OperationsWithCardLimits.Rules.LimitGetCardInfoRule.PersonId}.
   * @return userId
  **/
  @ApiModelProperty(value = "Идентификатор пользователя {Loymax.Limits.Implementation.OperationsWithCardLimits.Rules.LimitGetCardInfoRule.PersonId}.")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public LimitRuleModel isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Заархивировано или нет.
   * @return isArchived
  **/
  @ApiModelProperty(value = "Заархивировано или нет.")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public LimitRuleModel apiMethodName(String apiMethodName) {
    this.apiMethodName = apiMethodName;
    return this;
  }

   /**
   * Название метода API.
   * @return apiMethodName
  **/
  @ApiModelProperty(value = "Название метода API.")
  public String getApiMethodName() {
    return apiMethodName;
  }

  public void setApiMethodName(String apiMethodName) {
    this.apiMethodName = apiMethodName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitRuleModel limitRuleModel = (LimitRuleModel) o;
    return Objects.equals(this.id, limitRuleModel.id) &&
        Objects.equals(this.name, limitRuleModel.name) &&
        Objects.equals(this.limitType, limitRuleModel.limitType) &&
        Objects.equals(this.period, limitRuleModel.period) &&
        Objects.equals(this.currency, limitRuleModel.currency) &&
        Objects.equals(this.cardId, limitRuleModel.cardId) &&
        Objects.equals(this.device, limitRuleModel.device) &&
        Objects.equals(this.blockTimeInSeconds, limitRuleModel.blockTimeInSeconds) &&
        Objects.equals(this.timeModel, limitRuleModel.timeModel) &&
        Objects.equals(this.limitBorders, limitRuleModel.limitBorders) &&
        Objects.equals(this.phone, limitRuleModel.phone) &&
        Objects.equals(this.userId, limitRuleModel.userId) &&
        Objects.equals(this.isArchived, limitRuleModel.isArchived) &&
        Objects.equals(this.apiMethodName, limitRuleModel.apiMethodName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, limitType, period, currency, cardId, device, blockTimeInSeconds, timeModel, limitBorders, phone, userId, isArchived, apiMethodName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitRuleModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    blockTimeInSeconds: ").append(toIndentedString(blockTimeInSeconds)).append("\n");
    sb.append("    timeModel: ").append(toIndentedString(timeModel)).append("\n");
    sb.append("    limitBorders: ").append(toIndentedString(limitBorders)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    apiMethodName: ").append(toIndentedString(apiMethodName)).append("\n");
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

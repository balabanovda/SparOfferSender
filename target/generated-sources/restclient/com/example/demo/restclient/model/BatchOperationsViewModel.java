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
import com.example.demo.restclient.model.BatchOperationsBriefViewModel;
import com.example.demo.restclient.model.BatchOperationsQueueInfo;
import com.example.demo.restclient.model.CreatorModel;
import com.example.demo.restclient.model.CurrencyBaseModel;
import com.example.demo.restclient.model.DeviceBriefViewModel;
import com.example.demo.restclient.model.LifeTimeDefinitionViewModel;
import com.example.demo.restclient.model.MarketingCampaignSimpleViewModel;
import com.example.demo.restclient.model.OperationDataModel;
import com.example.demo.restclient.model.PartnerLoyaltyProgramModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Модель отправляемых данных для пакетных операций.
 */
@ApiModel(description = "Модель отправляемых данных для пакетных операций.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class BatchOperationsViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("internalDescription")
  private String internalDescription = null;

  /**
   * Тип операции.
   */
  public enum TypeEnum {
    WITHDRAW("Withdraw"),
    
    DEPOSIT("Deposit");

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
   * Состояние обработки операций.
   */
  public enum StateEnum {
    NOTPROCESSED("NotProcessed"),
    
    PROCESSED("Processed");

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

  @JsonProperty("deviceInfo")
  private DeviceBriefViewModel deviceInfo = null;

  @JsonProperty("deferredOperationsAmmountSum")
  private Double deferredOperationsAmmountSum = null;

  @JsonProperty("loyaltyProgram")
  private PartnerLoyaltyProgramModel loyaltyProgram = null;

  @JsonProperty("marketingCampaign")
  private MarketingCampaignSimpleViewModel marketingCampaign = null;

  @JsonProperty("creator")
  private CreatorModel creator = null;

  /**
   * Тип обработчика ошибок при выполнении операции.
   */
  public enum ErrorHandlingTypeEnum {
    ERROR("Error"),
    
    NEGATIVEBALANCE("NegativeBalance"),
    
    ZEROBALANCE("ZeroBalance");

    private String value;

    ErrorHandlingTypeEnum(String value) {
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
    public static ErrorHandlingTypeEnum fromValue(String text) {
      for (ErrorHandlingTypeEnum b : ErrorHandlingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("errorHandlingType")
  private ErrorHandlingTypeEnum errorHandlingType = null;

  @JsonProperty("operations")
  private List<OperationDataModel> operations = null;

  @JsonProperty("queueInfo")
  private BatchOperationsQueueInfo queueInfo = null;

  @JsonProperty("lifeTimeDefinition")
  private LifeTimeDefinitionViewModel lifeTimeDefinition = null;

  @JsonProperty("currency")
  private CurrencyBaseModel currency = null;

  public BatchOperationsViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID групповой операции.
   * @return id
  **/
  @ApiModelProperty(value = "ID групповой операции.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BatchOperationsViewModel creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Дата создания.
   * @return creationDate
  **/
  @ApiModelProperty(value = "Дата создания.")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public BatchOperationsViewModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Описание для пользователя.
   * @return description
  **/
  @ApiModelProperty(value = "Описание для пользователя.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BatchOperationsViewModel internalDescription(String internalDescription) {
    this.internalDescription = internalDescription;
    return this;
  }

   /**
   * Внутреннее описание.
   * @return internalDescription
  **/
  @ApiModelProperty(value = "Внутреннее описание.")
  public String getInternalDescription() {
    return internalDescription;
  }

  public void setInternalDescription(String internalDescription) {
    this.internalDescription = internalDescription;
  }

  public BatchOperationsViewModel type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Тип операции.
   * @return type
  **/
  @ApiModelProperty(value = "Тип операции.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BatchOperationsViewModel state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Состояние обработки операций.
   * @return state
  **/
  @ApiModelProperty(value = "Состояние обработки операций.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public BatchOperationsViewModel deviceInfo(DeviceBriefViewModel deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

   /**
   * Информация о кассе.
   * @return deviceInfo
  **/
  @ApiModelProperty(value = "Информация о кассе.")
  public DeviceBriefViewModel getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(DeviceBriefViewModel deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  public BatchOperationsViewModel deferredOperationsAmmountSum(Double deferredOperationsAmmountSum) {
    this.deferredOperationsAmmountSum = deferredOperationsAmmountSum;
    return this;
  }

   /**
   * Сумма операций.
   * @return deferredOperationsAmmountSum
  **/
  @ApiModelProperty(value = "Сумма операций.")
  public Double getDeferredOperationsAmmountSum() {
    return deferredOperationsAmmountSum;
  }

  public void setDeferredOperationsAmmountSum(Double deferredOperationsAmmountSum) {
    this.deferredOperationsAmmountSum = deferredOperationsAmmountSum;
  }

  public BatchOperationsViewModel loyaltyProgram(PartnerLoyaltyProgramModel loyaltyProgram) {
    this.loyaltyProgram = loyaltyProgram;
    return this;
  }

   /**
   * Программа лояльности.
   * @return loyaltyProgram
  **/
  @ApiModelProperty(value = "Программа лояльности.")
  public PartnerLoyaltyProgramModel getLoyaltyProgram() {
    return loyaltyProgram;
  }

  public void setLoyaltyProgram(PartnerLoyaltyProgramModel loyaltyProgram) {
    this.loyaltyProgram = loyaltyProgram;
  }

  public BatchOperationsViewModel marketingCampaign(MarketingCampaignSimpleViewModel marketingCampaign) {
    this.marketingCampaign = marketingCampaign;
    return this;
  }

   /**
   * Маркетинговая компания.
   * @return marketingCampaign
  **/
  @ApiModelProperty(value = "Маркетинговая компания.")
  public MarketingCampaignSimpleViewModel getMarketingCampaign() {
    return marketingCampaign;
  }

  public void setMarketingCampaign(MarketingCampaignSimpleViewModel marketingCampaign) {
    this.marketingCampaign = marketingCampaign;
  }

  public BatchOperationsViewModel creator(CreatorModel creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Создатель.
   * @return creator
  **/
  @ApiModelProperty(value = "Создатель.")
  public CreatorModel getCreator() {
    return creator;
  }

  public void setCreator(CreatorModel creator) {
    this.creator = creator;
  }

  public BatchOperationsViewModel errorHandlingType(ErrorHandlingTypeEnum errorHandlingType) {
    this.errorHandlingType = errorHandlingType;
    return this;
  }

   /**
   * Тип обработчика ошибок при выполнении операции.
   * @return errorHandlingType
  **/
  @ApiModelProperty(value = "Тип обработчика ошибок при выполнении операции.")
  public ErrorHandlingTypeEnum getErrorHandlingType() {
    return errorHandlingType;
  }

  public void setErrorHandlingType(ErrorHandlingTypeEnum errorHandlingType) {
    this.errorHandlingType = errorHandlingType;
  }

  public BatchOperationsViewModel operations(List<OperationDataModel> operations) {
    this.operations = operations;
    return this;
  }

  public BatchOperationsViewModel addOperationsItem(OperationDataModel operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Коллекция операций.
   * @return operations
  **/
  @ApiModelProperty(value = "Коллекция операций.")
  public List<OperationDataModel> getOperations() {
    return operations;
  }

  public void setOperations(List<OperationDataModel> operations) {
    this.operations = operations;
  }

  public BatchOperationsViewModel queueInfo(BatchOperationsQueueInfo queueInfo) {
    this.queueInfo = queueInfo;
    return this;
  }

   /**
   * Информация о состоянии фоновой обработки операций.
   * @return queueInfo
  **/
  @ApiModelProperty(value = "Информация о состоянии фоновой обработки операций.")
  public BatchOperationsQueueInfo getQueueInfo() {
    return queueInfo;
  }

  public void setQueueInfo(BatchOperationsQueueInfo queueInfo) {
    this.queueInfo = queueInfo;
  }

  public BatchOperationsViewModel lifeTimeDefinition(LifeTimeDefinitionViewModel lifeTimeDefinition) {
    this.lifeTimeDefinition = lifeTimeDefinition;
    return this;
  }

   /**
   * Определение времени жизни бонусов (при операциях зачисления).
   * @return lifeTimeDefinition
  **/
  @ApiModelProperty(value = "Определение времени жизни бонусов (при операциях зачисления).")
  public LifeTimeDefinitionViewModel getLifeTimeDefinition() {
    return lifeTimeDefinition;
  }

  public void setLifeTimeDefinition(LifeTimeDefinitionViewModel lifeTimeDefinition) {
    this.lifeTimeDefinition = lifeTimeDefinition;
  }

  public BatchOperationsViewModel currency(CurrencyBaseModel currency) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchOperationsViewModel batchOperationsViewModel = (BatchOperationsViewModel) o;
    return Objects.equals(this.id, batchOperationsViewModel.id) &&
        Objects.equals(this.creationDate, batchOperationsViewModel.creationDate) &&
        Objects.equals(this.description, batchOperationsViewModel.description) &&
        Objects.equals(this.internalDescription, batchOperationsViewModel.internalDescription) &&
        Objects.equals(this.type, batchOperationsViewModel.type) &&
        Objects.equals(this.state, batchOperationsViewModel.state) &&
        Objects.equals(this.deviceInfo, batchOperationsViewModel.deviceInfo) &&
        Objects.equals(this.deferredOperationsAmmountSum, batchOperationsViewModel.deferredOperationsAmmountSum) &&
        Objects.equals(this.loyaltyProgram, batchOperationsViewModel.loyaltyProgram) &&
        Objects.equals(this.marketingCampaign, batchOperationsViewModel.marketingCampaign) &&
        Objects.equals(this.creator, batchOperationsViewModel.creator) &&
        Objects.equals(this.errorHandlingType, batchOperationsViewModel.errorHandlingType) &&
        Objects.equals(this.operations, batchOperationsViewModel.operations) &&
        Objects.equals(this.queueInfo, batchOperationsViewModel.queueInfo) &&
        Objects.equals(this.lifeTimeDefinition, batchOperationsViewModel.lifeTimeDefinition) &&
        Objects.equals(this.currency, batchOperationsViewModel.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, description, internalDescription, type, state, deviceInfo, deferredOperationsAmmountSum, loyaltyProgram, marketingCampaign, creator, errorHandlingType, operations, queueInfo, lifeTimeDefinition, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchOperationsViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    internalDescription: ").append(toIndentedString(internalDescription)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
    sb.append("    deferredOperationsAmmountSum: ").append(toIndentedString(deferredOperationsAmmountSum)).append("\n");
    sb.append("    loyaltyProgram: ").append(toIndentedString(loyaltyProgram)).append("\n");
    sb.append("    marketingCampaign: ").append(toIndentedString(marketingCampaign)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    errorHandlingType: ").append(toIndentedString(errorHandlingType)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    queueInfo: ").append(toIndentedString(queueInfo)).append("\n");
    sb.append("    lifeTimeDefinition: ").append(toIndentedString(lifeTimeDefinition)).append("\n");
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


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
import com.example.demo.restclient.model.DeviceBriefViewModel;
import com.example.demo.restclient.model.MarketingCampaignSimpleViewModel;
import com.example.demo.restclient.model.PartnerLoyaltyProgramModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * Облегченная модель пакета операций.
 */
@ApiModel(description = "Облегченная модель пакета операций.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class BatchOperationsBriefViewModel {
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

  public BatchOperationsBriefViewModel id(Integer id) {
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

  public BatchOperationsBriefViewModel creationDate(OffsetDateTime creationDate) {
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

  public BatchOperationsBriefViewModel description(String description) {
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

  public BatchOperationsBriefViewModel internalDescription(String internalDescription) {
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

  public BatchOperationsBriefViewModel type(TypeEnum type) {
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

  public BatchOperationsBriefViewModel state(StateEnum state) {
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

  public BatchOperationsBriefViewModel deviceInfo(DeviceBriefViewModel deviceInfo) {
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

  public BatchOperationsBriefViewModel deferredOperationsAmmountSum(Double deferredOperationsAmmountSum) {
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

  public BatchOperationsBriefViewModel loyaltyProgram(PartnerLoyaltyProgramModel loyaltyProgram) {
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

  public BatchOperationsBriefViewModel marketingCampaign(MarketingCampaignSimpleViewModel marketingCampaign) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchOperationsBriefViewModel batchOperationsBriefViewModel = (BatchOperationsBriefViewModel) o;
    return Objects.equals(this.id, batchOperationsBriefViewModel.id) &&
        Objects.equals(this.creationDate, batchOperationsBriefViewModel.creationDate) &&
        Objects.equals(this.description, batchOperationsBriefViewModel.description) &&
        Objects.equals(this.internalDescription, batchOperationsBriefViewModel.internalDescription) &&
        Objects.equals(this.type, batchOperationsBriefViewModel.type) &&
        Objects.equals(this.state, batchOperationsBriefViewModel.state) &&
        Objects.equals(this.deviceInfo, batchOperationsBriefViewModel.deviceInfo) &&
        Objects.equals(this.deferredOperationsAmmountSum, batchOperationsBriefViewModel.deferredOperationsAmmountSum) &&
        Objects.equals(this.loyaltyProgram, batchOperationsBriefViewModel.loyaltyProgram) &&
        Objects.equals(this.marketingCampaign, batchOperationsBriefViewModel.marketingCampaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, description, internalDescription, type, state, deviceInfo, deferredOperationsAmmountSum, loyaltyProgram, marketingCampaign);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchOperationsBriefViewModel {\n");
    
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


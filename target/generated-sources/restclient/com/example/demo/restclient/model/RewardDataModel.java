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
import com.example.demo.restclient.model.ChangeBalanceDataModel;
import com.example.demo.restclient.model.KeyValuePairOfInt32AndDecimal;
import com.example.demo.restclient.model.MoneyViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ViewModel данных о вознаграждении.
 */
@ApiModel(description = "ViewModel данных о вознаграждении.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class RewardDataModel {
  @JsonProperty("positionInfo")
  private List<KeyValuePairOfInt32AndDecimal> positionInfo = null;

  @JsonProperty("amount")
  private MoneyViewModel amount = null;

  @JsonProperty("offerExternalId")
  private String offerExternalId = null;

  /**
   * Тип вознаграждения.
   */
  public enum RewardTypeEnum {
    BONUS("Bonus"),
    
    DISCOUNT("Discount"),
    
    GIFT("Gift"),
    
    CHARGING("Charging");

    private String value;

    RewardTypeEnum(String value) {
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
    public static RewardTypeEnum fromValue(String text) {
      for (RewardTypeEnum b : RewardTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("rewardType")
  private RewardTypeEnum rewardType = null;

  @JsonProperty("description")
  private String description = null;

  public RewardDataModel positionInfo(List<KeyValuePairOfInt32AndDecimal> positionInfo) {
    this.positionInfo = positionInfo;
    return this;
  }

  public RewardDataModel addPositionInfoItem(KeyValuePairOfInt32AndDecimal positionInfoItem) {
    if (this.positionInfo == null) {
      this.positionInfo = new ArrayList<>();
    }
    this.positionInfo.add(positionInfoItem);
    return this;
  }

   /**
   * Распределение изменения баланса по позициям.
   * @return positionInfo
  **/
  @ApiModelProperty(value = "Распределение изменения баланса по позициям.")
  public List<KeyValuePairOfInt32AndDecimal> getPositionInfo() {
    return positionInfo;
  }

  public void setPositionInfo(List<KeyValuePairOfInt32AndDecimal> positionInfo) {
    this.positionInfo = positionInfo;
  }

  public RewardDataModel amount(MoneyViewModel amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Сумма.
   * @return amount
  **/
  @ApiModelProperty(value = "Сумма.")
  public MoneyViewModel getAmount() {
    return amount;
  }

  public void setAmount(MoneyViewModel amount) {
    this.amount = amount;
  }

  public RewardDataModel offerExternalId(String offerExternalId) {
    this.offerExternalId = offerExternalId;
    return this;
  }

   /**
   * Идентификатор акции.
   * @return offerExternalId
  **/
  @ApiModelProperty(value = "Идентификатор акции.")
  public String getOfferExternalId() {
    return offerExternalId;
  }

  public void setOfferExternalId(String offerExternalId) {
    this.offerExternalId = offerExternalId;
  }

  public RewardDataModel rewardType(RewardTypeEnum rewardType) {
    this.rewardType = rewardType;
    return this;
  }

   /**
   * Тип вознаграждения.
   * @return rewardType
  **/
  @ApiModelProperty(value = "Тип вознаграждения.")
  public RewardTypeEnum getRewardType() {
    return rewardType;
  }

  public void setRewardType(RewardTypeEnum rewardType) {
    this.rewardType = rewardType;
  }

  public RewardDataModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Описание вознаграждения.
   * @return description
  **/
  @ApiModelProperty(value = "Описание вознаграждения.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardDataModel rewardDataModel = (RewardDataModel) o;
    return Objects.equals(this.positionInfo, rewardDataModel.positionInfo) &&
        Objects.equals(this.amount, rewardDataModel.amount) &&
        Objects.equals(this.offerExternalId, rewardDataModel.offerExternalId) &&
        Objects.equals(this.rewardType, rewardDataModel.rewardType) &&
        Objects.equals(this.description, rewardDataModel.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionInfo, amount, offerExternalId, rewardType, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardDataModel {\n");
    
    sb.append("    positionInfo: ").append(toIndentedString(positionInfo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    offerExternalId: ").append(toIndentedString(offerExternalId)).append("\n");
    sb.append("    rewardType: ").append(toIndentedString(rewardType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


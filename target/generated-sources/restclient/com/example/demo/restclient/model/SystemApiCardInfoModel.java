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
import com.example.demo.restclient.model.CardCategoryInfo;
import com.example.demo.restclient.model.CardInfoModel;
import com.example.demo.restclient.model.StripNumbers;
import com.example.demo.restclient.model.UserInfoBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * Инофрмация о карте для system api.
 */
@ApiModel(description = "Инофрмация о карте для system api.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class SystemApiCardInfoModel {
  @JsonProperty("passwordRequired")
  private Boolean passwordRequired = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = null;

  @JsonProperty("replacementDate")
  private OffsetDateTime replacementDate = null;

  /**
   * Источник замены.
   */
  public enum ReplacementSourceEnum {
    USERPORTAL("UserPortal"),
    
    CALLCENTER("CallCenter"),
    
    DEVICE("Device");

    private String value;

    ReplacementSourceEnum(String value) {
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
    public static ReplacementSourceEnum fromValue(String text) {
      for (ReplacementSourceEnum b : ReplacementSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("replacementSource")
  private ReplacementSourceEnum replacementSource = null;

  @JsonProperty("cardCategory")
  private CardCategoryInfo cardCategory = null;

  @JsonProperty("cardOwnerInfo")
  private UserInfoBase cardOwnerInfo = null;

  @JsonProperty("id")
  private Integer id = null;

  /**
   * Статус.
   */
  public enum StateEnum {
    EMITTED("Emitted"),
    
    PACKED("Packed"),
    
    ACTIVATED("Activated"),
    
    REPLACED("Replaced"),
    
    CREATING("Creating"),
    
    CREATED("Created"),
    
    PREPARED("Prepared"),
    
    ISSUED("Issued");

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

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("barCode")
  private String barCode = null;

  @JsonProperty("block")
  private Boolean block = null;

  @JsonProperty("pinCode")
  private String pinCode = null;

  @JsonProperty("strips")
  private StripNumbers strips = null;

  @JsonProperty("canUnBlocking")
  private Boolean canUnBlocking = null;

  public SystemApiCardInfoModel passwordRequired(Boolean passwordRequired) {
    this.passwordRequired = passwordRequired;
    return this;
  }

   /**
   * Нужна ли проверка пароля.
   * @return passwordRequired
  **/
  @ApiModelProperty(value = "Нужна ли проверка пароля.")
  public Boolean isPasswordRequired() {
    return passwordRequired;
  }

  public void setPasswordRequired(Boolean passwordRequired) {
    this.passwordRequired = passwordRequired;
  }

  public SystemApiCardInfoModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Удалена или нет.
   * @return isDeleted
  **/
  @ApiModelProperty(value = "Удалена или нет.")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public SystemApiCardInfoModel replacementDate(OffsetDateTime replacementDate) {
    this.replacementDate = replacementDate;
    return this;
  }

   /**
   * Дата замены.
   * @return replacementDate
  **/
  @ApiModelProperty(value = "Дата замены.")
  public OffsetDateTime getReplacementDate() {
    return replacementDate;
  }

  public void setReplacementDate(OffsetDateTime replacementDate) {
    this.replacementDate = replacementDate;
  }

  public SystemApiCardInfoModel replacementSource(ReplacementSourceEnum replacementSource) {
    this.replacementSource = replacementSource;
    return this;
  }

   /**
   * Источник замены.
   * @return replacementSource
  **/
  @ApiModelProperty(value = "Источник замены.")
  public ReplacementSourceEnum getReplacementSource() {
    return replacementSource;
  }

  public void setReplacementSource(ReplacementSourceEnum replacementSource) {
    this.replacementSource = replacementSource;
  }

  public SystemApiCardInfoModel cardCategory(CardCategoryInfo cardCategory) {
    this.cardCategory = cardCategory;
    return this;
  }

   /**
   * Информация о категории карты.
   * @return cardCategory
  **/
  @ApiModelProperty(value = "Информация о категории карты.")
  public CardCategoryInfo getCardCategory() {
    return cardCategory;
  }

  public void setCardCategory(CardCategoryInfo cardCategory) {
    this.cardCategory = cardCategory;
  }

  public SystemApiCardInfoModel cardOwnerInfo(UserInfoBase cardOwnerInfo) {
    this.cardOwnerInfo = cardOwnerInfo;
    return this;
  }

   /**
   * Информация о владельце карты.
   * @return cardOwnerInfo
  **/
  @ApiModelProperty(value = "Информация о владельце карты.")
  public UserInfoBase getCardOwnerInfo() {
    return cardOwnerInfo;
  }

  public void setCardOwnerInfo(UserInfoBase cardOwnerInfo) {
    this.cardOwnerInfo = cardOwnerInfo;
  }

  public SystemApiCardInfoModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Ифентификатор.
   * @return id
  **/
  @ApiModelProperty(value = "Ифентификатор.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SystemApiCardInfoModel state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Статус.
   * @return state
  **/
  @ApiModelProperty(value = "Статус.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public SystemApiCardInfoModel number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Номер карты.
   * @return number
  **/
  @ApiModelProperty(value = "Номер карты.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public SystemApiCardInfoModel barCode(String barCode) {
    this.barCode = barCode;
    return this;
  }

   /**
   * Баркод.
   * @return barCode
  **/
  @ApiModelProperty(value = "Баркод.")
  public String getBarCode() {
    return barCode;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }

  public SystemApiCardInfoModel block(Boolean block) {
    this.block = block;
    return this;
  }

   /**
   * Заблокирована или нет.
   * @return block
  **/
  @ApiModelProperty(value = "Заблокирована или нет.")
  public Boolean isBlock() {
    return block;
  }

  public void setBlock(Boolean block) {
    this.block = block;
  }

  public SystemApiCardInfoModel pinCode(String pinCode) {
    this.pinCode = pinCode;
    return this;
  }

   /**
   * Пинкод.
   * @return pinCode
  **/
  @ApiModelProperty(value = "Пинкод.")
  public String getPinCode() {
    return pinCode;
  }

  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }

  public SystemApiCardInfoModel strips(StripNumbers strips) {
    this.strips = strips;
    return this;
  }

   /**
   * Номера магнитной полосы.
   * @return strips
  **/
  @ApiModelProperty(value = "Номера магнитной полосы.")
  public StripNumbers getStrips() {
    return strips;
  }

  public void setStrips(StripNumbers strips) {
    this.strips = strips;
  }

  public SystemApiCardInfoModel canUnBlocking(Boolean canUnBlocking) {
    this.canUnBlocking = canUnBlocking;
    return this;
  }

   /**
   * Возможна ли разблокировка карты.
   * @return canUnBlocking
  **/
  @ApiModelProperty(value = "Возможна ли разблокировка карты.")
  public Boolean isCanUnBlocking() {
    return canUnBlocking;
  }

  public void setCanUnBlocking(Boolean canUnBlocking) {
    this.canUnBlocking = canUnBlocking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemApiCardInfoModel systemApiCardInfoModel = (SystemApiCardInfoModel) o;
    return Objects.equals(this.passwordRequired, systemApiCardInfoModel.passwordRequired) &&
        Objects.equals(this.isDeleted, systemApiCardInfoModel.isDeleted) &&
        Objects.equals(this.replacementDate, systemApiCardInfoModel.replacementDate) &&
        Objects.equals(this.replacementSource, systemApiCardInfoModel.replacementSource) &&
        Objects.equals(this.cardCategory, systemApiCardInfoModel.cardCategory) &&
        Objects.equals(this.cardOwnerInfo, systemApiCardInfoModel.cardOwnerInfo) &&
        Objects.equals(this.id, systemApiCardInfoModel.id) &&
        Objects.equals(this.state, systemApiCardInfoModel.state) &&
        Objects.equals(this.number, systemApiCardInfoModel.number) &&
        Objects.equals(this.barCode, systemApiCardInfoModel.barCode) &&
        Objects.equals(this.block, systemApiCardInfoModel.block) &&
        Objects.equals(this.pinCode, systemApiCardInfoModel.pinCode) &&
        Objects.equals(this.strips, systemApiCardInfoModel.strips) &&
        Objects.equals(this.canUnBlocking, systemApiCardInfoModel.canUnBlocking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordRequired, isDeleted, replacementDate, replacementSource, cardCategory, cardOwnerInfo, id, state, number, barCode, block, pinCode, strips, canUnBlocking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemApiCardInfoModel {\n");
    
    sb.append("    passwordRequired: ").append(toIndentedString(passwordRequired)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    replacementDate: ").append(toIndentedString(replacementDate)).append("\n");
    sb.append("    replacementSource: ").append(toIndentedString(replacementSource)).append("\n");
    sb.append("    cardCategory: ").append(toIndentedString(cardCategory)).append("\n");
    sb.append("    cardOwnerInfo: ").append(toIndentedString(cardOwnerInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    barCode: ").append(toIndentedString(barCode)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    pinCode: ").append(toIndentedString(pinCode)).append("\n");
    sb.append("    strips: ").append(toIndentedString(strips)).append("\n");
    sb.append("    canUnBlocking: ").append(toIndentedString(canUnBlocking)).append("\n");
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


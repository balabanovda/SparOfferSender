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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * Модель с информацией об акции.
 */
@ApiModel(description = "Модель с информацией об акции.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class OfferInfoModel {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("beginTime")
  private OffsetDateTime beginTime = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isSum")
  private Boolean isSum = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("partner")
  private PartnerModel partner = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("lastChangeDate")
  private OffsetDateTime lastChangeDate = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("lastChangeUser")
  private String lastChangeUser = null;

  @JsonProperty("externalID")
  private String externalID = null;

  @JsonProperty("applyChangesDate")
  private OffsetDateTime applyChangesDate = null;

  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  /**
   * Состояние акции.
   */
  public enum StateEnum {
    RUN("Run"),
    
    STOP("Stop"),
    
    ARCHIVED("Archived");

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

  @JsonProperty("offerCategory")
  private OfferCategoryViewModel offerCategory = null;

  @JsonProperty("marketingCampaign")
  private MarketingCampaignViewModel marketingCampaign = null;

  @JsonProperty("loyaltyProgram")
  private LoyaltyProgramInfoViewModel loyaltyProgram = null;

  public OfferInfoModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название.
   * @return name
  **/
  @ApiModelProperty(value = "Название.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OfferInfoModel beginTime(OffsetDateTime beginTime) {
    this.beginTime = beginTime;
    return this;
  }

   /**
   * Дата начала.
   * @return beginTime
  **/
  @ApiModelProperty(value = "Дата начала.")
  public OffsetDateTime getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(OffsetDateTime beginTime) {
    this.beginTime = beginTime;
  }

  public OfferInfoModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Описание.
   * @return description
  **/
  @ApiModelProperty(value = "Описание.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OfferInfoModel isSum(Boolean isSum) {
    this.isSum = isSum;
    return this;
  }

   /**
   * Суммируемая.
   * @return isSum
  **/
  @ApiModelProperty(value = "Суммируемая.")
  public Boolean isIsSum() {
    return isSum;
  }

  public void setIsSum(Boolean isSum) {
    this.isSum = isSum;
  }

  public OfferInfoModel priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Приоритет.
   * @return priority
  **/
  @ApiModelProperty(value = "Приоритет.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public OfferInfoModel partner(PartnerModel partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Партнер.
   * @return partner
  **/
  @ApiModelProperty(value = "Партнер.")
  public PartnerModel getPartner() {
    return partner;
  }

  public void setPartner(PartnerModel partner) {
    this.partner = partner;
  }

  public OfferInfoModel creationDate(OffsetDateTime creationDate) {
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

  public OfferInfoModel lastChangeDate(OffsetDateTime lastChangeDate) {
    this.lastChangeDate = lastChangeDate;
    return this;
  }

   /**
   * Дата последнего изменения.
   * @return lastChangeDate
  **/
  @ApiModelProperty(value = "Дата последнего изменения.")
  public OffsetDateTime getLastChangeDate() {
    return lastChangeDate;
  }

  public void setLastChangeDate(OffsetDateTime lastChangeDate) {
    this.lastChangeDate = lastChangeDate;
  }

  public OfferInfoModel creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Создатель.
   * @return creator
  **/
  @ApiModelProperty(value = "Создатель.")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public OfferInfoModel lastChangeUser(String lastChangeUser) {
    this.lastChangeUser = lastChangeUser;
    return this;
  }

   /**
   * Автор последних изменений.
   * @return lastChangeUser
  **/
  @ApiModelProperty(value = "Автор последних изменений.")
  public String getLastChangeUser() {
    return lastChangeUser;
  }

  public void setLastChangeUser(String lastChangeUser) {
    this.lastChangeUser = lastChangeUser;
  }

  public OfferInfoModel externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

   /**
   * Внешний ID.
   * @return externalID
  **/
  @ApiModelProperty(value = "Внешний ID.")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }

  public OfferInfoModel applyChangesDate(OffsetDateTime applyChangesDate) {
    this.applyChangesDate = applyChangesDate;
    return this;
  }

   /**
   * Дата подтверждения.
   * @return applyChangesDate
  **/
  @ApiModelProperty(value = "Дата подтверждения.")
  public OffsetDateTime getApplyChangesDate() {
    return applyChangesDate;
  }

  public void setApplyChangesDate(OffsetDateTime applyChangesDate) {
    this.applyChangesDate = applyChangesDate;
  }

  public OfferInfoModel expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Дата завершения.
   * @return expirationDate
  **/
  @ApiModelProperty(value = "Дата завершения.")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public OfferInfoModel state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Состояние акции.
   * @return state
  **/
  @ApiModelProperty(value = "Состояние акции.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public OfferInfoModel offerCategory(OfferCategoryViewModel offerCategory) {
    this.offerCategory = offerCategory;
    return this;
  }

   /**
   * Категория акции.
   * @return offerCategory
  **/
  @ApiModelProperty(value = "Категория акции.")
  public OfferCategoryViewModel getOfferCategory() {
    return offerCategory;
  }

  public void setOfferCategory(OfferCategoryViewModel offerCategory) {
    this.offerCategory = offerCategory;
  }

  public OfferInfoModel marketingCampaign(MarketingCampaignViewModel marketingCampaign) {
    this.marketingCampaign = marketingCampaign;
    return this;
  }

   /**
   * Маркетинговая кампания.
   * @return marketingCampaign
  **/
  @ApiModelProperty(value = "Маркетинговая кампания.")
  public MarketingCampaignViewModel getMarketingCampaign() {
    return marketingCampaign;
  }

  public void setMarketingCampaign(MarketingCampaignViewModel marketingCampaign) {
    this.marketingCampaign = marketingCampaign;
  }

  public OfferInfoModel loyaltyProgram(LoyaltyProgramInfoViewModel loyaltyProgram) {
    this.loyaltyProgram = loyaltyProgram;
    return this;
  }

   /**
   * Программа лояльности.
   * @return loyaltyProgram
  **/
  @ApiModelProperty(value = "Программа лояльности.")
  public LoyaltyProgramInfoViewModel getLoyaltyProgram() {
    return loyaltyProgram;
  }

  public void setLoyaltyProgram(LoyaltyProgramInfoViewModel loyaltyProgram) {
    this.loyaltyProgram = loyaltyProgram;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferInfoModel offerInfoModel = (OfferInfoModel) o;
    return Objects.equals(this.name, offerInfoModel.name) &&
        Objects.equals(this.beginTime, offerInfoModel.beginTime) &&
        Objects.equals(this.description, offerInfoModel.description) &&
        Objects.equals(this.isSum, offerInfoModel.isSum) &&
        Objects.equals(this.priority, offerInfoModel.priority) &&
        Objects.equals(this.partner, offerInfoModel.partner) &&
        Objects.equals(this.creationDate, offerInfoModel.creationDate) &&
        Objects.equals(this.lastChangeDate, offerInfoModel.lastChangeDate) &&
        Objects.equals(this.creator, offerInfoModel.creator) &&
        Objects.equals(this.lastChangeUser, offerInfoModel.lastChangeUser) &&
        Objects.equals(this.externalID, offerInfoModel.externalID) &&
        Objects.equals(this.applyChangesDate, offerInfoModel.applyChangesDate) &&
        Objects.equals(this.expirationDate, offerInfoModel.expirationDate) &&
        Objects.equals(this.state, offerInfoModel.state) &&
        Objects.equals(this.offerCategory, offerInfoModel.offerCategory) &&
        Objects.equals(this.marketingCampaign, offerInfoModel.marketingCampaign) &&
        Objects.equals(this.loyaltyProgram, offerInfoModel.loyaltyProgram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, beginTime, description, isSum, priority, partner, creationDate, lastChangeDate, creator, lastChangeUser, externalID, applyChangesDate, expirationDate, state, offerCategory, marketingCampaign, loyaltyProgram);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferInfoModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isSum: ").append(toIndentedString(isSum)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastChangeDate: ").append(toIndentedString(lastChangeDate)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    lastChangeUser: ").append(toIndentedString(lastChangeUser)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    applyChangesDate: ").append(toIndentedString(applyChangesDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    offerCategory: ").append(toIndentedString(offerCategory)).append("\n");
    sb.append("    marketingCampaign: ").append(toIndentedString(marketingCampaign)).append("\n");
    sb.append("    loyaltyProgram: ").append(toIndentedString(loyaltyProgram)).append("\n");
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


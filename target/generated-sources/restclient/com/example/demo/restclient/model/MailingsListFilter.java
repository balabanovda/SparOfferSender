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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Модель фильтра для списка рассылок.
 */
@ApiModel(description = "Модель фильтра для списка рассылок.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class MailingsListFilter {
  @JsonProperty("fromDate")
  private OffsetDateTime fromDate = null;

  @JsonProperty("toDate")
  private OffsetDateTime toDate = null;

  @JsonProperty("from")
  private Integer from = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("creatorIds")
  private List<Integer> creatorIds = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Тип рассылки.
   */
  public enum MailingTypeEnum {
    MAIL("Mail"),
    
    SMS("Sms"),
    
    PUSH("Push"),
    
    VIBER("Viber"),
    
    SOCIALNETWORKS("SocialNetworks"),
    
    CHATBOT("ChatBot");

    private String value;

    MailingTypeEnum(String value) {
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
    public static MailingTypeEnum fromValue(String text) {
      for (MailingTypeEnum b : MailingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mailingType")
  private MailingTypeEnum mailingType = null;

  @JsonProperty("marketingCampaignId")
  private Integer marketingCampaignId = null;

  @JsonProperty("sortByAttachDate")
  private Boolean sortByAttachDate = null;

  @JsonProperty("loyaltyProgramIds")
  private List<Integer> loyaltyProgramIds = null;

  public MailingsListFilter fromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Дата С.
   * @return fromDate
  **/
  @ApiModelProperty(value = "Дата С.")
  public OffsetDateTime getFromDate() {
    return fromDate;
  }

  public void setFromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
  }

  public MailingsListFilter toDate(OffsetDateTime toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Дата По.
   * @return toDate
  **/
  @ApiModelProperty(value = "Дата По.")
  public OffsetDateTime getToDate() {
    return toDate;
  }

  public void setToDate(OffsetDateTime toDate) {
    this.toDate = toDate;
  }

  public MailingsListFilter from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * С какого элемента брать.
   * @return from
  **/
  @ApiModelProperty(value = "С какого элемента брать.")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public MailingsListFilter count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Сколько элементов брать.
   * @return count
  **/
  @ApiModelProperty(value = "Сколько элементов брать.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public MailingsListFilter creatorIds(List<Integer> creatorIds) {
    this.creatorIds = creatorIds;
    return this;
  }

  public MailingsListFilter addCreatorIdsItem(Integer creatorIdsItem) {
    if (this.creatorIds == null) {
      this.creatorIds = new ArrayList<>();
    }
    this.creatorIds.add(creatorIdsItem);
    return this;
  }

   /**
   * Список id создателей акций для фильтрации.
   * @return creatorIds
  **/
  @ApiModelProperty(value = "Список id создателей акций для фильтрации.")
  public List<Integer> getCreatorIds() {
    return creatorIds;
  }

  public void setCreatorIds(List<Integer> creatorIds) {
    this.creatorIds = creatorIds;
  }

  public MailingsListFilter name(String name) {
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

  public MailingsListFilter mailingType(MailingTypeEnum mailingType) {
    this.mailingType = mailingType;
    return this;
  }

   /**
   * Тип рассылки.
   * @return mailingType
  **/
  @ApiModelProperty(value = "Тип рассылки.")
  public MailingTypeEnum getMailingType() {
    return mailingType;
  }

  public void setMailingType(MailingTypeEnum mailingType) {
    this.mailingType = mailingType;
  }

  public MailingsListFilter marketingCampaignId(Integer marketingCampaignId) {
    this.marketingCampaignId = marketingCampaignId;
    return this;
  }

   /**
   * ID маркетинговой кампании.
   * @return marketingCampaignId
  **/
  @ApiModelProperty(value = "ID маркетинговой кампании.")
  public Integer getMarketingCampaignId() {
    return marketingCampaignId;
  }

  public void setMarketingCampaignId(Integer marketingCampaignId) {
    this.marketingCampaignId = marketingCampaignId;
  }

  public MailingsListFilter sortByAttachDate(Boolean sortByAttachDate) {
    this.sortByAttachDate = sortByAttachDate;
    return this;
  }

   /**
   * Значение, указывающее, нужно ли сортировать рассылки по дате прикрепления.
   * @return sortByAttachDate
  **/
  @ApiModelProperty(value = "Значение, указывающее, нужно ли сортировать рассылки по дате прикрепления.")
  public Boolean isSortByAttachDate() {
    return sortByAttachDate;
  }

  public void setSortByAttachDate(Boolean sortByAttachDate) {
    this.sortByAttachDate = sortByAttachDate;
  }

  public MailingsListFilter loyaltyProgramIds(List<Integer> loyaltyProgramIds) {
    this.loyaltyProgramIds = loyaltyProgramIds;
    return this;
  }

  public MailingsListFilter addLoyaltyProgramIdsItem(Integer loyaltyProgramIdsItem) {
    if (this.loyaltyProgramIds == null) {
      this.loyaltyProgramIds = new ArrayList<>();
    }
    this.loyaltyProgramIds.add(loyaltyProgramIdsItem);
    return this;
  }

   /**
   * Идентификаторы программ лояльности.
   * @return loyaltyProgramIds
  **/
  @ApiModelProperty(value = "Идентификаторы программ лояльности.")
  public List<Integer> getLoyaltyProgramIds() {
    return loyaltyProgramIds;
  }

  public void setLoyaltyProgramIds(List<Integer> loyaltyProgramIds) {
    this.loyaltyProgramIds = loyaltyProgramIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailingsListFilter mailingsListFilter = (MailingsListFilter) o;
    return Objects.equals(this.fromDate, mailingsListFilter.fromDate) &&
        Objects.equals(this.toDate, mailingsListFilter.toDate) &&
        Objects.equals(this.from, mailingsListFilter.from) &&
        Objects.equals(this.count, mailingsListFilter.count) &&
        Objects.equals(this.creatorIds, mailingsListFilter.creatorIds) &&
        Objects.equals(this.name, mailingsListFilter.name) &&
        Objects.equals(this.mailingType, mailingsListFilter.mailingType) &&
        Objects.equals(this.marketingCampaignId, mailingsListFilter.marketingCampaignId) &&
        Objects.equals(this.sortByAttachDate, mailingsListFilter.sortByAttachDate) &&
        Objects.equals(this.loyaltyProgramIds, mailingsListFilter.loyaltyProgramIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDate, toDate, from, count, creatorIds, name, mailingType, marketingCampaignId, sortByAttachDate, loyaltyProgramIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingsListFilter {\n");
    
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    creatorIds: ").append(toIndentedString(creatorIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mailingType: ").append(toIndentedString(mailingType)).append("\n");
    sb.append("    marketingCampaignId: ").append(toIndentedString(marketingCampaignId)).append("\n");
    sb.append("    sortByAttachDate: ").append(toIndentedString(sortByAttachDate)).append("\n");
    sb.append("    loyaltyProgramIds: ").append(toIndentedString(loyaltyProgramIds)).append("\n");
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


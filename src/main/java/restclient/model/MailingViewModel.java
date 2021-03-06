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
 * Модель для рассылки.
 */
@ApiModel(description = "Модель для рассылки.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class MailingViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("gateway")
  private NotificationGatewayBriefViewModel gateway = null;

  @JsonProperty("legal")
  private LegalViewModel legal = null;

  @JsonProperty("mailingTypeId")
  private Integer mailingTypeId = null;

  @JsonProperty("targetGroup")
  private TargetGroupBriefViewModel targetGroup = null;

  /**
   * Тип получателей рассылки.
   */
  public enum DestinationTypeEnum {
    TARGETGROUP("TargetGroup"),
    
    ADDRESSLIST("AddressList"),
    
    PERSON("Person");

    private String value;

    DestinationTypeEnum(String value) {
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
    public static DestinationTypeEnum fromValue(String text) {
      for (DestinationTypeEnum b : DestinationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("destinationType")
  private DestinationTypeEnum destinationType = null;

  @JsonProperty("isAbleToStart")
  private Boolean isAbleToStart = null;

  @JsonProperty("isAbleToEdit")
  private Boolean isAbleToEdit = null;

  /**
   * Способ отправки.
   */
  public enum WaySendTypeEnum {
    MAIL("Mail"),
    
    SMS("Sms"),
    
    PUSH("Push"),
    
    VIBER("Viber"),
    
    SOCIALNETWORKS("SocialNetworks"),
    
    CHATBOT("ChatBot");

    private String value;

    WaySendTypeEnum(String value) {
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
    public static WaySendTypeEnum fromValue(String text) {
      for (WaySendTypeEnum b : WaySendTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("waySendType")
  private WaySendTypeEnum waySendType = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("lastChangeUser")
  private String lastChangeUser = null;

  @JsonProperty("changeDate")
  private OffsetDateTime changeDate = null;

  /**
   * Тип Push-уведомления (для соответствующего типа).
   */
  public enum MessageTypeEnum {
    GENERAL("General"),
    
    ECHO("Echo"),
    
    PERSONALOFFER("PersonalOffer");

    private String value;

    MessageTypeEnum(String value) {
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
    public static MessageTypeEnum fromValue(String text) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("messageType")
  private MessageTypeEnum messageType = null;

  @JsonProperty("mailingMessage")
  private MailingMessageViewModel mailingMessage = null;

  @JsonProperty("priceOneMessage")
  private Double priceOneMessage = null;

  @JsonProperty("usersCount")
  private Integer usersCount = null;

  @JsonProperty("marketingCampaign")
  private MarketingCampaignSimpleViewModel marketingCampaign = null;

  @JsonProperty("loyaltyProgram")
  private LoyaltyProgramInfoViewModel loyaltyProgram = null;

  public MailingViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор рассылки.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор рассылки.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MailingViewModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название рассылки.
   * @return name
  **/
  @ApiModelProperty(value = "Название рассылки.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MailingViewModel gateway(NotificationGatewayBriefViewModel gateway) {
    this.gateway = gateway;
    return this;
  }

   /**
   * Идентификатор шлюза.
   * @return gateway
  **/
  @ApiModelProperty(value = "Идентификатор шлюза.")
  public NotificationGatewayBriefViewModel getGateway() {
    return gateway;
  }

  public void setGateway(NotificationGatewayBriefViewModel gateway) {
    this.gateway = gateway;
  }

  public MailingViewModel legal(LegalViewModel legal) {
    this.legal = legal;
    return this;
  }

   /**
   * Юр.лицо.
   * @return legal
  **/
  @ApiModelProperty(value = "Юр.лицо.")
  public LegalViewModel getLegal() {
    return legal;
  }

  public void setLegal(LegalViewModel legal) {
    this.legal = legal;
  }

  public MailingViewModel mailingTypeId(Integer mailingTypeId) {
    this.mailingTypeId = mailingTypeId;
    return this;
  }

   /**
   * Тип рассылки (моментальная или плановая).
   * @return mailingTypeId
  **/
  @ApiModelProperty(value = "Тип рассылки (моментальная или плановая).")
  public Integer getMailingTypeId() {
    return mailingTypeId;
  }

  public void setMailingTypeId(Integer mailingTypeId) {
    this.mailingTypeId = mailingTypeId;
  }

  public MailingViewModel targetGroup(TargetGroupBriefViewModel targetGroup) {
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

  public MailingViewModel destinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Тип получателей рассылки.
   * @return destinationType
  **/
  @ApiModelProperty(value = "Тип получателей рассылки.")
  public DestinationTypeEnum getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
  }

  public MailingViewModel isAbleToStart(Boolean isAbleToStart) {
    this.isAbleToStart = isAbleToStart;
    return this;
  }

   /**
   * Возможно ли начать рассылку.
   * @return isAbleToStart
  **/
  @ApiModelProperty(value = "Возможно ли начать рассылку.")
  public Boolean isIsAbleToStart() {
    return isAbleToStart;
  }

  public void setIsAbleToStart(Boolean isAbleToStart) {
    this.isAbleToStart = isAbleToStart;
  }

  public MailingViewModel isAbleToEdit(Boolean isAbleToEdit) {
    this.isAbleToEdit = isAbleToEdit;
    return this;
  }

   /**
   * Возможно ли редактировать рассылку.
   * @return isAbleToEdit
  **/
  @ApiModelProperty(value = "Возможно ли редактировать рассылку.")
  public Boolean isIsAbleToEdit() {
    return isAbleToEdit;
  }

  public void setIsAbleToEdit(Boolean isAbleToEdit) {
    this.isAbleToEdit = isAbleToEdit;
  }

  public MailingViewModel waySendType(WaySendTypeEnum waySendType) {
    this.waySendType = waySendType;
    return this;
  }

   /**
   * Способ отправки.
   * @return waySendType
  **/
  @ApiModelProperty(value = "Способ отправки.")
  public WaySendTypeEnum getWaySendType() {
    return waySendType;
  }

  public void setWaySendType(WaySendTypeEnum waySendType) {
    this.waySendType = waySendType;
  }

  public MailingViewModel creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Автор рассылки.
   * @return creator
  **/
  @ApiModelProperty(value = "Автор рассылки.")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public MailingViewModel creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Дата создания рассылки.
   * @return creationDate
  **/
  @ApiModelProperty(value = "Дата создания рассылки.")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public MailingViewModel lastChangeUser(String lastChangeUser) {
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

  public MailingViewModel changeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
    return this;
  }

   /**
   * Дата изменения.
   * @return changeDate
  **/
  @ApiModelProperty(value = "Дата изменения.")
  public OffsetDateTime getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
  }

  public MailingViewModel messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Тип Push-уведомления (для соответствующего типа).
   * @return messageType
  **/
  @ApiModelProperty(value = "Тип Push-уведомления (для соответствующего типа).")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  public MailingViewModel mailingMessage(MailingMessageViewModel mailingMessage) {
    this.mailingMessage = mailingMessage;
    return this;
  }

   /**
   * Модель сообщения рассылки.
   * @return mailingMessage
  **/
  @ApiModelProperty(value = "Модель сообщения рассылки.")
  public MailingMessageViewModel getMailingMessage() {
    return mailingMessage;
  }

  public void setMailingMessage(MailingMessageViewModel mailingMessage) {
    this.mailingMessage = mailingMessage;
  }

  public MailingViewModel priceOneMessage(Double priceOneMessage) {
    this.priceOneMessage = priceOneMessage;
    return this;
  }

   /**
   * Стоимость одного сообщения.
   * @return priceOneMessage
  **/
  @ApiModelProperty(value = "Стоимость одного сообщения.")
  public Double getPriceOneMessage() {
    return priceOneMessage;
  }

  public void setPriceOneMessage(Double priceOneMessage) {
    this.priceOneMessage = priceOneMessage;
  }

  public MailingViewModel usersCount(Integer usersCount) {
    this.usersCount = usersCount;
    return this;
  }

   /**
   * Количество пользователей.
   * @return usersCount
  **/
  @ApiModelProperty(value = "Количество пользователей.")
  public Integer getUsersCount() {
    return usersCount;
  }

  public void setUsersCount(Integer usersCount) {
    this.usersCount = usersCount;
  }

  public MailingViewModel marketingCampaign(MarketingCampaignSimpleViewModel marketingCampaign) {
    this.marketingCampaign = marketingCampaign;
    return this;
  }

   /**
   * Маркетинговая кампания.
   * @return marketingCampaign
  **/
  @ApiModelProperty(value = "Маркетинговая кампания.")
  public MarketingCampaignSimpleViewModel getMarketingCampaign() {
    return marketingCampaign;
  }

  public void setMarketingCampaign(MarketingCampaignSimpleViewModel marketingCampaign) {
    this.marketingCampaign = marketingCampaign;
  }

  public MailingViewModel loyaltyProgram(LoyaltyProgramInfoViewModel loyaltyProgram) {
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
    MailingViewModel mailingViewModel = (MailingViewModel) o;
    return Objects.equals(this.id, mailingViewModel.id) &&
        Objects.equals(this.name, mailingViewModel.name) &&
        Objects.equals(this.gateway, mailingViewModel.gateway) &&
        Objects.equals(this.legal, mailingViewModel.legal) &&
        Objects.equals(this.mailingTypeId, mailingViewModel.mailingTypeId) &&
        Objects.equals(this.targetGroup, mailingViewModel.targetGroup) &&
        Objects.equals(this.destinationType, mailingViewModel.destinationType) &&
        Objects.equals(this.isAbleToStart, mailingViewModel.isAbleToStart) &&
        Objects.equals(this.isAbleToEdit, mailingViewModel.isAbleToEdit) &&
        Objects.equals(this.waySendType, mailingViewModel.waySendType) &&
        Objects.equals(this.creator, mailingViewModel.creator) &&
        Objects.equals(this.creationDate, mailingViewModel.creationDate) &&
        Objects.equals(this.lastChangeUser, mailingViewModel.lastChangeUser) &&
        Objects.equals(this.changeDate, mailingViewModel.changeDate) &&
        Objects.equals(this.messageType, mailingViewModel.messageType) &&
        Objects.equals(this.mailingMessage, mailingViewModel.mailingMessage) &&
        Objects.equals(this.priceOneMessage, mailingViewModel.priceOneMessage) &&
        Objects.equals(this.usersCount, mailingViewModel.usersCount) &&
        Objects.equals(this.marketingCampaign, mailingViewModel.marketingCampaign) &&
        Objects.equals(this.loyaltyProgram, mailingViewModel.loyaltyProgram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, gateway, legal, mailingTypeId, targetGroup, destinationType, isAbleToStart, isAbleToEdit, waySendType, creator, creationDate, lastChangeUser, changeDate, messageType, mailingMessage, priceOneMessage, usersCount, marketingCampaign, loyaltyProgram);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    legal: ").append(toIndentedString(legal)).append("\n");
    sb.append("    mailingTypeId: ").append(toIndentedString(mailingTypeId)).append("\n");
    sb.append("    targetGroup: ").append(toIndentedString(targetGroup)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    isAbleToStart: ").append(toIndentedString(isAbleToStart)).append("\n");
    sb.append("    isAbleToEdit: ").append(toIndentedString(isAbleToEdit)).append("\n");
    sb.append("    waySendType: ").append(toIndentedString(waySendType)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastChangeUser: ").append(toIndentedString(lastChangeUser)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    mailingMessage: ").append(toIndentedString(mailingMessage)).append("\n");
    sb.append("    priceOneMessage: ").append(toIndentedString(priceOneMessage)).append("\n");
    sb.append("    usersCount: ").append(toIndentedString(usersCount)).append("\n");
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


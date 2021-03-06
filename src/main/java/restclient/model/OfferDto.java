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
import java.util.ArrayList;
import java.util.List;

/**
 * Акция.
 */
@ApiModel(description = "Акция.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class OfferDto {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("applyChangesDateValue")
  private String applyChangesDateValue = null;

  @JsonProperty("expirationDateValue")
  private String expirationDateValue = null;

  /**
   * Рабочее состояние акции.
   */
  public enum WorkingStateEnum {
    STOPPED("Stopped"),
    
    RUNNING("Running");

    private String value;

    WorkingStateEnum(String value) {
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
    public static WorkingStateEnum fromValue(String text) {
      for (WorkingStateEnum b : WorkingStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("workingState")
  private WorkingStateEnum workingState = null;

  /**
   * Состояние изменений в акции.
   */
  public enum ChangesStateEnum {
    EDITING("Editing"),
    
    ONAPPROVAL("OnApproval"),
    
    APPROVED("Approved");

    private String value;

    ChangesStateEnum(String value) {
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
    public static ChangesStateEnum fromValue(String text) {
      for (ChangesStateEnum b : ChangesStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("changesState")
  private ChangesStateEnum changesState = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("isSum")
  private Boolean isSum = null;

  @JsonProperty("timeRefinement")
  private TimeRefinementDto timeRefinement = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("marketingCampaign")
  private Integer marketingCampaign = null;

  @JsonProperty("partners")
  private OfferPartners partners = null;

  @JsonProperty("loyaltyPrograms")
  private OfferLoyaltyPrograms loyaltyPrograms = null;

  @JsonProperty("pointsOfSales")
  private PointsOfSales pointsOfSales = null;

  @JsonProperty("targetGroups")
  private List<BaseTargetGroupDto> targetGroups = null;

  @JsonProperty("rules")
  private OfferRules rules = null;

  @JsonProperty("applyChangesDate")
  private String applyChangesDate = null;

  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  public OfferDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Внешний идентификатор акции.
   * @return id
  **/
  @ApiModelProperty(value = "Внешний идентификатор акции.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OfferDto title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Наименование.
   * @return title
  **/
  @ApiModelProperty(value = "Наименование.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OfferDto applyChangesDateValue(String applyChangesDateValue) {
    this.applyChangesDateValue = applyChangesDateValue;
    return this;
  }

   /**
   * Дата, начиная с которой акция начинает действовать, если она в состоянии \&quot;Running\&quot; (pure xml).  TODO: в xsd определить свой тип для даты (строка с регулярным выражением \\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.
   * @return applyChangesDateValue
  **/
  @ApiModelProperty(value = "Дата, начиная с которой акция начинает действовать, если она в состоянии \"Running\" (pure xml).  TODO: в xsd определить свой тип для даты (строка с регулярным выражением \\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.")
  public String getApplyChangesDateValue() {
    return applyChangesDateValue;
  }

  public void setApplyChangesDateValue(String applyChangesDateValue) {
    this.applyChangesDateValue = applyChangesDateValue;
  }

  public OfferDto expirationDateValue(String expirationDateValue) {
    this.expirationDateValue = expirationDateValue;
    return this;
  }

   /**
   * Дата, начиная с которой акция заканчивает действовать (pure xml).  TODO: в xsd определить свой тип для даты (строка с регулярным выражением \\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.
   * @return expirationDateValue
  **/
  @ApiModelProperty(value = "Дата, начиная с которой акция заканчивает действовать (pure xml).  TODO: в xsd определить свой тип для даты (строка с регулярным выражением \\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.")
  public String getExpirationDateValue() {
    return expirationDateValue;
  }

  public void setExpirationDateValue(String expirationDateValue) {
    this.expirationDateValue = expirationDateValue;
  }

  public OfferDto workingState(WorkingStateEnum workingState) {
    this.workingState = workingState;
    return this;
  }

   /**
   * Рабочее состояние акции.
   * @return workingState
  **/
  @ApiModelProperty(value = "Рабочее состояние акции.")
  public WorkingStateEnum getWorkingState() {
    return workingState;
  }

  public void setWorkingState(WorkingStateEnum workingState) {
    this.workingState = workingState;
  }

  public OfferDto changesState(ChangesStateEnum changesState) {
    this.changesState = changesState;
    return this;
  }

   /**
   * Состояние изменений в акции.
   * @return changesState
  **/
  @ApiModelProperty(value = "Состояние изменений в акции.")
  public ChangesStateEnum getChangesState() {
    return changesState;
  }

  public void setChangesState(ChangesStateEnum changesState) {
    this.changesState = changesState;
  }

  public OfferDto priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Приоритет акции.
   * @return priority
  **/
  @ApiModelProperty(value = "Приоритет акции.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public OfferDto isSum(Boolean isSum) {
    this.isSum = isSum;
    return this;
  }

   /**
   * Суммируемая акция.
   * @return isSum
  **/
  @ApiModelProperty(value = "Суммируемая акция.")
  public Boolean isIsSum() {
    return isSum;
  }

  public void setIsSum(Boolean isSum) {
    this.isSum = isSum;
  }

  public OfferDto timeRefinement(TimeRefinementDto timeRefinement) {
    this.timeRefinement = timeRefinement;
    return this;
  }

   /**
   * Уточнение времени действия акции.
   * @return timeRefinement
  **/
  @ApiModelProperty(value = "Уточнение времени действия акции.")
  public TimeRefinementDto getTimeRefinement() {
    return timeRefinement;
  }

  public void setTimeRefinement(TimeRefinementDto timeRefinement) {
    this.timeRefinement = timeRefinement;
  }

  public OfferDto description(String description) {
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

  public OfferDto category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Категория.
   * @return category
  **/
  @ApiModelProperty(value = "Категория.")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public OfferDto marketingCampaign(Integer marketingCampaign) {
    this.marketingCampaign = marketingCampaign;
    return this;
  }

   /**
   * Маркетинговая кампания.
   * @return marketingCampaign
  **/
  @ApiModelProperty(value = "Маркетинговая кампания.")
  public Integer getMarketingCampaign() {
    return marketingCampaign;
  }

  public void setMarketingCampaign(Integer marketingCampaign) {
    this.marketingCampaign = marketingCampaign;
  }

  public OfferDto partners(OfferPartners partners) {
    this.partners = partners;
    return this;
  }

   /**
   * Партнеры, участвующие в акции.
   * @return partners
  **/
  @ApiModelProperty(value = "Партнеры, участвующие в акции.")
  public OfferPartners getPartners() {
    return partners;
  }

  public void setPartners(OfferPartners partners) {
    this.partners = partners;
  }

  public OfferDto loyaltyPrograms(OfferLoyaltyPrograms loyaltyPrograms) {
    this.loyaltyPrograms = loyaltyPrograms;
    return this;
  }

   /**
   * Программы лояльности, в которых действует акция.
   * @return loyaltyPrograms
  **/
  @ApiModelProperty(value = "Программы лояльности, в которых действует акция.")
  public OfferLoyaltyPrograms getLoyaltyPrograms() {
    return loyaltyPrograms;
  }

  public void setLoyaltyPrograms(OfferLoyaltyPrograms loyaltyPrograms) {
    this.loyaltyPrograms = loyaltyPrograms;
  }

  public OfferDto pointsOfSales(PointsOfSales pointsOfSales) {
    this.pointsOfSales = pointsOfSales;
    return this;
  }

   /**
   * Магазины, участвующие в акции.
   * @return pointsOfSales
  **/
  @ApiModelProperty(value = "Магазины, участвующие в акции.")
  public PointsOfSales getPointsOfSales() {
    return pointsOfSales;
  }

  public void setPointsOfSales(PointsOfSales pointsOfSales) {
    this.pointsOfSales = pointsOfSales;
  }

  public OfferDto targetGroups(List<BaseTargetGroupDto> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public OfferDto addTargetGroupsItem(BaseTargetGroupDto targetGroupsItem) {
    if (this.targetGroups == null) {
      this.targetGroups = new ArrayList<>();
    }
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * Список ЦА.
   * @return targetGroups
  **/
  @ApiModelProperty(value = "Список ЦА.")
  public List<BaseTargetGroupDto> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<BaseTargetGroupDto> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public OfferDto rules(OfferRules rules) {
    this.rules = rules;
    return this;
  }

   /**
   * Правила для акции.
   * @return rules
  **/
  @ApiModelProperty(value = "Правила для акции.")
  public OfferRules getRules() {
    return rules;
  }

  public void setRules(OfferRules rules) {
    this.rules = rules;
  }

  public OfferDto applyChangesDate(String applyChangesDate) {
    this.applyChangesDate = applyChangesDate;
    return this;
  }

   /**
   * Дата, начиная с которой акция начинает действовать, если она в состоянии \&quot;Running\&quot;.
   * @return applyChangesDate
  **/
  @ApiModelProperty(value = "Дата, начиная с которой акция начинает действовать, если она в состоянии \"Running\".")
  public String getApplyChangesDate() {
    return applyChangesDate;
  }

  public void setApplyChangesDate(String applyChangesDate) {
    this.applyChangesDate = applyChangesDate;
  }

  public OfferDto expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Дата, начиная с которой акция заканчивает действовать.
   * @return expirationDate
  **/
  @ApiModelProperty(value = "Дата, начиная с которой акция заканчивает действовать.")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDto offerDto = (OfferDto) o;
    return Objects.equals(this.id, offerDto.id) &&
        Objects.equals(this.title, offerDto.title) &&
        Objects.equals(this.applyChangesDateValue, offerDto.applyChangesDateValue) &&
        Objects.equals(this.expirationDateValue, offerDto.expirationDateValue) &&
        Objects.equals(this.workingState, offerDto.workingState) &&
        Objects.equals(this.changesState, offerDto.changesState) &&
        Objects.equals(this.priority, offerDto.priority) &&
        Objects.equals(this.isSum, offerDto.isSum) &&
        Objects.equals(this.timeRefinement, offerDto.timeRefinement) &&
        Objects.equals(this.description, offerDto.description) &&
        Objects.equals(this.category, offerDto.category) &&
        Objects.equals(this.marketingCampaign, offerDto.marketingCampaign) &&
        Objects.equals(this.partners, offerDto.partners) &&
        Objects.equals(this.loyaltyPrograms, offerDto.loyaltyPrograms) &&
        Objects.equals(this.pointsOfSales, offerDto.pointsOfSales) &&
        Objects.equals(this.targetGroups, offerDto.targetGroups) &&
        Objects.equals(this.rules, offerDto.rules) &&
        Objects.equals(this.applyChangesDate, offerDto.applyChangesDate) &&
        Objects.equals(this.expirationDate, offerDto.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, applyChangesDateValue, expirationDateValue, workingState, changesState, priority, isSum, timeRefinement, description, category, marketingCampaign, partners, loyaltyPrograms, pointsOfSales, targetGroups, rules, applyChangesDate, expirationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    applyChangesDateValue: ").append(toIndentedString(applyChangesDateValue)).append("\n");
    sb.append("    expirationDateValue: ").append(toIndentedString(expirationDateValue)).append("\n");
    sb.append("    workingState: ").append(toIndentedString(workingState)).append("\n");
    sb.append("    changesState: ").append(toIndentedString(changesState)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    isSum: ").append(toIndentedString(isSum)).append("\n");
    sb.append("    timeRefinement: ").append(toIndentedString(timeRefinement)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    marketingCampaign: ").append(toIndentedString(marketingCampaign)).append("\n");
    sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
    sb.append("    loyaltyPrograms: ").append(toIndentedString(loyaltyPrograms)).append("\n");
    sb.append("    pointsOfSales: ").append(toIndentedString(pointsOfSales)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    applyChangesDate: ").append(toIndentedString(applyChangesDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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


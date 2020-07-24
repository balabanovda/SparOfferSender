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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ViewModel публичного выпуска купонов.
 */
@ApiModel(description = "ViewModel публичного выпуска купонов.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PublicCouponEmissionViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("partner")
  private PartnerViewModel partner = null;

  @JsonProperty("isArchived")
  private Boolean isArchived = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("changeDate")
  private OffsetDateTime changeDate = null;

  @JsonProperty("createdByPerson")
  private UserViewModel createdByPerson = null;

  @JsonProperty("lastEditByPerson")
  private UserViewModel lastEditByPerson = null;

  @JsonProperty("counts")
  private List<KeyValuePairOfCouponStateAndInt32> counts = null;

  @JsonProperty("loyaltyProgram")
  private LoyaltyProgramInfoViewModel loyaltyProgram = null;

  @JsonProperty("code")
  private String code = null;

  public PublicCouponEmissionViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PublicCouponEmissionViewModel title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Название.
   * @return title
  **/
  @ApiModelProperty(value = "Название.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PublicCouponEmissionViewModel partner(PartnerViewModel partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Партнер.
   * @return partner
  **/
  @ApiModelProperty(value = "Партнер.")
  public PartnerViewModel getPartner() {
    return partner;
  }

  public void setPartner(PartnerViewModel partner) {
    this.partner = partner;
  }

  public PublicCouponEmissionViewModel isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Заархивирован ли выпуск.
   * @return isArchived
  **/
  @ApiModelProperty(value = "Заархивирован ли выпуск.")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public PublicCouponEmissionViewModel creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Время создания.
   * @return creationDate
  **/
  @ApiModelProperty(value = "Время создания.")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public PublicCouponEmissionViewModel changeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
    return this;
  }

   /**
   * Время изменения.
   * @return changeDate
  **/
  @ApiModelProperty(value = "Время изменения.")
  public OffsetDateTime getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
  }

  public PublicCouponEmissionViewModel createdByPerson(UserViewModel createdByPerson) {
    this.createdByPerson = createdByPerson;
    return this;
  }

   /**
   * Автор.
   * @return createdByPerson
  **/
  @ApiModelProperty(value = "Автор.")
  public UserViewModel getCreatedByPerson() {
    return createdByPerson;
  }

  public void setCreatedByPerson(UserViewModel createdByPerson) {
    this.createdByPerson = createdByPerson;
  }

  public PublicCouponEmissionViewModel lastEditByPerson(UserViewModel lastEditByPerson) {
    this.lastEditByPerson = lastEditByPerson;
    return this;
  }

   /**
   * Последний редактор.
   * @return lastEditByPerson
  **/
  @ApiModelProperty(value = "Последний редактор.")
  public UserViewModel getLastEditByPerson() {
    return lastEditByPerson;
  }

  public void setLastEditByPerson(UserViewModel lastEditByPerson) {
    this.lastEditByPerson = lastEditByPerson;
  }

  public PublicCouponEmissionViewModel counts(List<KeyValuePairOfCouponStateAndInt32> counts) {
    this.counts = counts;
    return this;
  }

  public PublicCouponEmissionViewModel addCountsItem(KeyValuePairOfCouponStateAndInt32 countsItem) {
    if (this.counts == null) {
      this.counts = new ArrayList<>();
    }
    this.counts.add(countsItem);
    return this;
  }

   /**
   * Количество купонов в эмиссии в разрезе состояний.
   * @return counts
  **/
  @ApiModelProperty(value = "Количество купонов в эмиссии в разрезе состояний.")
  public List<KeyValuePairOfCouponStateAndInt32> getCounts() {
    return counts;
  }

  public void setCounts(List<KeyValuePairOfCouponStateAndInt32> counts) {
    this.counts = counts;
  }

  public PublicCouponEmissionViewModel loyaltyProgram(LoyaltyProgramInfoViewModel loyaltyProgram) {
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

  public PublicCouponEmissionViewModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Код.
   * @return code
  **/
  @ApiModelProperty(value = "Код.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicCouponEmissionViewModel publicCouponEmissionViewModel = (PublicCouponEmissionViewModel) o;
    return Objects.equals(this.id, publicCouponEmissionViewModel.id) &&
        Objects.equals(this.title, publicCouponEmissionViewModel.title) &&
        Objects.equals(this.partner, publicCouponEmissionViewModel.partner) &&
        Objects.equals(this.isArchived, publicCouponEmissionViewModel.isArchived) &&
        Objects.equals(this.creationDate, publicCouponEmissionViewModel.creationDate) &&
        Objects.equals(this.changeDate, publicCouponEmissionViewModel.changeDate) &&
        Objects.equals(this.createdByPerson, publicCouponEmissionViewModel.createdByPerson) &&
        Objects.equals(this.lastEditByPerson, publicCouponEmissionViewModel.lastEditByPerson) &&
        Objects.equals(this.counts, publicCouponEmissionViewModel.counts) &&
        Objects.equals(this.loyaltyProgram, publicCouponEmissionViewModel.loyaltyProgram) &&
        Objects.equals(this.code, publicCouponEmissionViewModel.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, partner, isArchived, creationDate, changeDate, createdByPerson, lastEditByPerson, counts, loyaltyProgram, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicCouponEmissionViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    createdByPerson: ").append(toIndentedString(createdByPerson)).append("\n");
    sb.append("    lastEditByPerson: ").append(toIndentedString(lastEditByPerson)).append("\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    loyaltyProgram: ").append(toIndentedString(loyaltyProgram)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

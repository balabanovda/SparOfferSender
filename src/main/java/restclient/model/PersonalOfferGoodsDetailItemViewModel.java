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
import java.util.UUID;

/**
 * Детальная информация, связанная с товаром из персонального предложения.
 */
@ApiModel(description = "Детальная информация, связанная с товаром из персонального предложения.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PersonalOfferGoodsDetailItemViewModel {
  @JsonProperty("goodsId")
  private Integer goodsId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("rewardThumbnail")
  private RewardThumbnail rewardThumbnail = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("picture")
  private UUID picture = null;

  @JsonProperty("discount")
  private PersonalOfferDiscountViewModel discount = null;

  @JsonProperty("codes")
  private List<PersonalOfferGoodsCodeViewModel> codes = null;

  @JsonProperty("annotation")
  private String annotation = null;

  @JsonProperty("hasMerchants")
  private Boolean hasMerchants = null;

  @JsonProperty("detailBeginLocalDate")
  private OffsetDateTime detailBeginLocalDate = null;

  @JsonProperty("detailEndLocalDate")
  private OffsetDateTime detailEndLocalDate = null;

  public PersonalOfferGoodsDetailItemViewModel goodsId(Integer goodsId) {
    this.goodsId = goodsId;
    return this;
  }

   /**
   * Идентификатор товара.
   * @return goodsId
  **/
  @ApiModelProperty(value = "Идентификатор товара.")
  public Integer getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(Integer goodsId) {
    this.goodsId = goodsId;
  }

  public PersonalOfferGoodsDetailItemViewModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор детали.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор детали.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PersonalOfferGoodsDetailItemViewModel rewardThumbnail(RewardThumbnail rewardThumbnail) {
    this.rewardThumbnail = rewardThumbnail;
    return this;
  }

   /**
   * Вознаграждение.
   * @return rewardThumbnail
  **/
  @ApiModelProperty(value = "Вознаграждение.")
  public RewardThumbnail getRewardThumbnail() {
    return rewardThumbnail;
  }

  public void setRewardThumbnail(RewardThumbnail rewardThumbnail) {
    this.rewardThumbnail = rewardThumbnail;
  }

  public PersonalOfferGoodsDetailItemViewModel title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Заголовок.
   * @return title
  **/
  @ApiModelProperty(value = "Заголовок.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PersonalOfferGoodsDetailItemViewModel description(String description) {
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

  public PersonalOfferGoodsDetailItemViewModel picture(UUID picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Изображение.
   * @return picture
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Изображение.")
  public UUID getPicture() {
    return picture;
  }

  public void setPicture(UUID picture) {
    this.picture = picture;
  }

  public PersonalOfferGoodsDetailItemViewModel discount(PersonalOfferDiscountViewModel discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Скидка.
   * @return discount
  **/
  @ApiModelProperty(value = "Скидка.")
  public PersonalOfferDiscountViewModel getDiscount() {
    return discount;
  }

  public void setDiscount(PersonalOfferDiscountViewModel discount) {
    this.discount = discount;
  }

  public PersonalOfferGoodsDetailItemViewModel codes(List<PersonalOfferGoodsCodeViewModel> codes) {
    this.codes = codes;
    return this;
  }

  public PersonalOfferGoodsDetailItemViewModel addCodesItem(PersonalOfferGoodsCodeViewModel codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<>();
    }
    this.codes.add(codesItem);
    return this;
  }

   /**
   * Коды товара.
   * @return codes
  **/
  @ApiModelProperty(value = "Коды товара.")
  public List<PersonalOfferGoodsCodeViewModel> getCodes() {
    return codes;
  }

  public void setCodes(List<PersonalOfferGoodsCodeViewModel> codes) {
    this.codes = codes;
  }

  public PersonalOfferGoodsDetailItemViewModel annotation(String annotation) {
    this.annotation = annotation;
    return this;
  }

   /**
   * Примечание.
   * @return annotation
  **/
  @ApiModelProperty(value = "Примечание.")
  public String getAnnotation() {
    return annotation;
  }

  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }

  public PersonalOfferGoodsDetailItemViewModel hasMerchants(Boolean hasMerchants) {
    this.hasMerchants = hasMerchants;
    return this;
  }

   /**
   * Для детали определены магазины.
   * @return hasMerchants
  **/
  @ApiModelProperty(value = "Для детали определены магазины.")
  public Boolean isHasMerchants() {
    return hasMerchants;
  }

  public void setHasMerchants(Boolean hasMerchants) {
    this.hasMerchants = hasMerchants;
  }

  public PersonalOfferGoodsDetailItemViewModel detailBeginLocalDate(OffsetDateTime detailBeginLocalDate) {
    this.detailBeginLocalDate = detailBeginLocalDate;
    return this;
  }

   /**
   * Дата начала действия акции для детали. Если совпадает с акцией, то пусто.
   * @return detailBeginLocalDate
  **/
  @ApiModelProperty(value = "Дата начала действия акции для детали. Если совпадает с акцией, то пусто.")
  public OffsetDateTime getDetailBeginLocalDate() {
    return detailBeginLocalDate;
  }

  public void setDetailBeginLocalDate(OffsetDateTime detailBeginLocalDate) {
    this.detailBeginLocalDate = detailBeginLocalDate;
  }

  public PersonalOfferGoodsDetailItemViewModel detailEndLocalDate(OffsetDateTime detailEndLocalDate) {
    this.detailEndLocalDate = detailEndLocalDate;
    return this;
  }

   /**
   * Дата окончания действия акции для детали. Если совпадает с акцией, то пусто.
   * @return detailEndLocalDate
  **/
  @ApiModelProperty(value = "Дата окончания действия акции для детали. Если совпадает с акцией, то пусто.")
  public OffsetDateTime getDetailEndLocalDate() {
    return detailEndLocalDate;
  }

  public void setDetailEndLocalDate(OffsetDateTime detailEndLocalDate) {
    this.detailEndLocalDate = detailEndLocalDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalOfferGoodsDetailItemViewModel personalOfferGoodsDetailItemViewModel = (PersonalOfferGoodsDetailItemViewModel) o;
    return Objects.equals(this.goodsId, personalOfferGoodsDetailItemViewModel.goodsId) &&
        Objects.equals(this.id, personalOfferGoodsDetailItemViewModel.id) &&
        Objects.equals(this.rewardThumbnail, personalOfferGoodsDetailItemViewModel.rewardThumbnail) &&
        Objects.equals(this.title, personalOfferGoodsDetailItemViewModel.title) &&
        Objects.equals(this.description, personalOfferGoodsDetailItemViewModel.description) &&
        Objects.equals(this.picture, personalOfferGoodsDetailItemViewModel.picture) &&
        Objects.equals(this.discount, personalOfferGoodsDetailItemViewModel.discount) &&
        Objects.equals(this.codes, personalOfferGoodsDetailItemViewModel.codes) &&
        Objects.equals(this.annotation, personalOfferGoodsDetailItemViewModel.annotation) &&
        Objects.equals(this.hasMerchants, personalOfferGoodsDetailItemViewModel.hasMerchants) &&
        Objects.equals(this.detailBeginLocalDate, personalOfferGoodsDetailItemViewModel.detailBeginLocalDate) &&
        Objects.equals(this.detailEndLocalDate, personalOfferGoodsDetailItemViewModel.detailEndLocalDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsId, id, rewardThumbnail, title, description, picture, discount, codes, annotation, hasMerchants, detailBeginLocalDate, detailEndLocalDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalOfferGoodsDetailItemViewModel {\n");
    
    sb.append("    goodsId: ").append(toIndentedString(goodsId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rewardThumbnail: ").append(toIndentedString(rewardThumbnail)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    hasMerchants: ").append(toIndentedString(hasMerchants)).append("\n");
    sb.append("    detailBeginLocalDate: ").append(toIndentedString(detailBeginLocalDate)).append("\n");
    sb.append("    detailEndLocalDate: ").append(toIndentedString(detailEndLocalDate)).append("\n");
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


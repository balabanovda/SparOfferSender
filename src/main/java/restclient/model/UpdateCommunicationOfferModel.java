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
 * Модель акции, отображаемой клиентам.
 */
@ApiModel(description = "Модель акции, отображаемой клиентам.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class UpdateCommunicationOfferModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("shortDescription")
  private String shortDescription = null;

  @JsonProperty("begin")
  private OffsetDateTime begin = null;

  @JsonProperty("end")
  private OffsetDateTime end = null;

  @JsonProperty("rewardThumbnail")
  private RewardThumbnailModel rewardThumbnail = null;

  @JsonProperty("images")
  private List<ImageViewModel> images = null;

  @JsonProperty("rewardImage")
  private FileViewModel rewardImage = null;

  @JsonProperty("merchantIds")
  private List<Integer> merchantIds = null;

  @JsonProperty("targetGroupIds")
  private List<Integer> targetGroupIds = null;

  @JsonProperty("isArchived")
  private Boolean isArchived = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("categories")
  private List<SimpleCategoryViewModel> categories = null;

  public UpdateCommunicationOfferModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентефикатор.
   * @return id
  **/
  @ApiModelProperty(value = "Идентефикатор.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UpdateCommunicationOfferModel title(String title) {
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

  public UpdateCommunicationOfferModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Детальное описание.
   * @return description
  **/
  @ApiModelProperty(value = "Детальное описание.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateCommunicationOfferModel shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Краткое описание.
   * @return shortDescription
  **/
  @ApiModelProperty(value = "Краткое описание.")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public UpdateCommunicationOfferModel begin(OffsetDateTime begin) {
    this.begin = begin;
    return this;
  }

   /**
   * Дата начала.
   * @return begin
  **/
  @ApiModelProperty(value = "Дата начала.")
  public OffsetDateTime getBegin() {
    return begin;
  }

  public void setBegin(OffsetDateTime begin) {
    this.begin = begin;
  }

  public UpdateCommunicationOfferModel end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Дата окончания.
   * @return end
  **/
  @ApiModelProperty(value = "Дата окончания.")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public UpdateCommunicationOfferModel rewardThumbnail(RewardThumbnailModel rewardThumbnail) {
    this.rewardThumbnail = rewardThumbnail;
    return this;
  }

   /**
   * Описание вознаграждения.
   * @return rewardThumbnail
  **/
  @ApiModelProperty(value = "Описание вознаграждения.")
  public RewardThumbnailModel getRewardThumbnail() {
    return rewardThumbnail;
  }

  public void setRewardThumbnail(RewardThumbnailModel rewardThumbnail) {
    this.rewardThumbnail = rewardThumbnail;
  }

  public UpdateCommunicationOfferModel images(List<ImageViewModel> images) {
    this.images = images;
    return this;
  }

  public UpdateCommunicationOfferModel addImagesItem(ImageViewModel imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Изображения акции.
   * @return images
  **/
  @ApiModelProperty(value = "Изображения акции.")
  public List<ImageViewModel> getImages() {
    return images;
  }

  public void setImages(List<ImageViewModel> images) {
    this.images = images;
  }

  public UpdateCommunicationOfferModel rewardImage(FileViewModel rewardImage) {
    this.rewardImage = rewardImage;
    return this;
  }

   /**
   * Изображение вознаграждения.
   * @return rewardImage
  **/
  @ApiModelProperty(value = "Изображение вознаграждения.")
  public FileViewModel getRewardImage() {
    return rewardImage;
  }

  public void setRewardImage(FileViewModel rewardImage) {
    this.rewardImage = rewardImage;
  }

  public UpdateCommunicationOfferModel merchantIds(List<Integer> merchantIds) {
    this.merchantIds = merchantIds;
    return this;
  }

  public UpdateCommunicationOfferModel addMerchantIdsItem(Integer merchantIdsItem) {
    if (this.merchantIds == null) {
      this.merchantIds = new ArrayList<>();
    }
    this.merchantIds.add(merchantIdsItem);
    return this;
  }

   /**
   * Список магазинов.
   * @return merchantIds
  **/
  @ApiModelProperty(value = "Список магазинов.")
  public List<Integer> getMerchantIds() {
    return merchantIds;
  }

  public void setMerchantIds(List<Integer> merchantIds) {
    this.merchantIds = merchantIds;
  }

  public UpdateCommunicationOfferModel targetGroupIds(List<Integer> targetGroupIds) {
    this.targetGroupIds = targetGroupIds;
    return this;
  }

  public UpdateCommunicationOfferModel addTargetGroupIdsItem(Integer targetGroupIdsItem) {
    if (this.targetGroupIds == null) {
      this.targetGroupIds = new ArrayList<>();
    }
    this.targetGroupIds.add(targetGroupIdsItem);
    return this;
  }

   /**
   * Список ЦА.
   * @return targetGroupIds
  **/
  @ApiModelProperty(value = "Список ЦА.")
  public List<Integer> getTargetGroupIds() {
    return targetGroupIds;
  }

  public void setTargetGroupIds(List<Integer> targetGroupIds) {
    this.targetGroupIds = targetGroupIds;
  }

  public UpdateCommunicationOfferModel isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Признак удаления.
   * @return isArchived
  **/
  @ApiModelProperty(value = "Признак удаления.")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public UpdateCommunicationOfferModel priority(Integer priority) {
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

  public UpdateCommunicationOfferModel categories(List<SimpleCategoryViewModel> categories) {
    this.categories = categories;
    return this;
  }

  public UpdateCommunicationOfferModel addCategoriesItem(SimpleCategoryViewModel categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Список идентификаторов категорий рекламных материалов.
   * @return categories
  **/
  @ApiModelProperty(value = "Список идентификаторов категорий рекламных материалов.")
  public List<SimpleCategoryViewModel> getCategories() {
    return categories;
  }

  public void setCategories(List<SimpleCategoryViewModel> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCommunicationOfferModel updateCommunicationOfferModel = (UpdateCommunicationOfferModel) o;
    return Objects.equals(this.id, updateCommunicationOfferModel.id) &&
        Objects.equals(this.title, updateCommunicationOfferModel.title) &&
        Objects.equals(this.description, updateCommunicationOfferModel.description) &&
        Objects.equals(this.shortDescription, updateCommunicationOfferModel.shortDescription) &&
        Objects.equals(this.begin, updateCommunicationOfferModel.begin) &&
        Objects.equals(this.end, updateCommunicationOfferModel.end) &&
        Objects.equals(this.rewardThumbnail, updateCommunicationOfferModel.rewardThumbnail) &&
        Objects.equals(this.images, updateCommunicationOfferModel.images) &&
        Objects.equals(this.rewardImage, updateCommunicationOfferModel.rewardImage) &&
        Objects.equals(this.merchantIds, updateCommunicationOfferModel.merchantIds) &&
        Objects.equals(this.targetGroupIds, updateCommunicationOfferModel.targetGroupIds) &&
        Objects.equals(this.isArchived, updateCommunicationOfferModel.isArchived) &&
        Objects.equals(this.priority, updateCommunicationOfferModel.priority) &&
        Objects.equals(this.categories, updateCommunicationOfferModel.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, shortDescription, begin, end, rewardThumbnail, images, rewardImage, merchantIds, targetGroupIds, isArchived, priority, categories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCommunicationOfferModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    rewardThumbnail: ").append(toIndentedString(rewardThumbnail)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    rewardImage: ").append(toIndentedString(rewardImage)).append("\n");
    sb.append("    merchantIds: ").append(toIndentedString(merchantIds)).append("\n");
    sb.append("    targetGroupIds: ").append(toIndentedString(targetGroupIds)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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


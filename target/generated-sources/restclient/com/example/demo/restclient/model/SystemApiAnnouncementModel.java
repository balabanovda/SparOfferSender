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
import com.example.demo.restclient.model.AttributeValueModelBase;
import com.example.demo.restclient.model.BaseAnnouncementModel;
import com.example.demo.restclient.model.PartnerViewModel;
import com.example.demo.restclient.model.SpaceModel;
import com.example.demo.restclient.model.UserViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Модель рекламного материала.
 */
@ApiModel(description = "Модель рекламного материала.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class SystemApiAnnouncementModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = null;

  @JsonProperty("beginDate")
  private OffsetDateTime beginDate = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  /**
   * Статус.
   */
  public enum StateEnum {
    DRAFT("Draft"),
    
    READY("Ready"),
    
    PUBLISHED("Published");

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

  @JsonProperty("attributes")
  private List<AttributeValueModelBase> attributes = null;

  /**
   * Тип сущности.
   */
  public enum RelatedAnnouncementTypeEnum {
    OFFER("Offer");

    private String value;

    RelatedAnnouncementTypeEnum(String value) {
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
    public static RelatedAnnouncementTypeEnum fromValue(String text) {
      for (RelatedAnnouncementTypeEnum b : RelatedAnnouncementTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("relatedAnnouncementType")
  private RelatedAnnouncementTypeEnum relatedAnnouncementType = null;

  @JsonProperty("permissions")
  private List<String> permissions = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("space")
  private SpaceModel space = null;

  @JsonProperty("partner")
  private PartnerViewModel partner = null;

  @JsonProperty("author")
  private UserViewModel author = null;

  @JsonProperty("permissionValues")
  private List<String> permissionValues = null;

  public SystemApiAnnouncementModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id рекламного материала.
   * @return id
  **/
  @ApiModelProperty(value = "Id рекламного материала.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SystemApiAnnouncementModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Определят находится ли сущность в архиве.
   * @return isDeleted
  **/
  @ApiModelProperty(value = "Определят находится ли сущность в архиве.")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public SystemApiAnnouncementModel beginDate(OffsetDateTime beginDate) {
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Дата начала.
   * @return beginDate
  **/
  @ApiModelProperty(value = "Дата начала.")
  public OffsetDateTime getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(OffsetDateTime beginDate) {
    this.beginDate = beginDate;
  }

  public SystemApiAnnouncementModel endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Дата окончания.
   * @return endDate
  **/
  @ApiModelProperty(value = "Дата окончания.")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public SystemApiAnnouncementModel creationDate(OffsetDateTime creationDate) {
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

  public SystemApiAnnouncementModel state(StateEnum state) {
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

  public SystemApiAnnouncementModel attributes(List<AttributeValueModelBase> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SystemApiAnnouncementModel addAttributesItem(AttributeValueModelBase attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Атрибуты.
   * @return attributes
  **/
  @ApiModelProperty(value = "Атрибуты.")
  public List<AttributeValueModelBase> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributeValueModelBase> attributes) {
    this.attributes = attributes;
  }

  public SystemApiAnnouncementModel relatedAnnouncementType(RelatedAnnouncementTypeEnum relatedAnnouncementType) {
    this.relatedAnnouncementType = relatedAnnouncementType;
    return this;
  }

   /**
   * Тип сущности.
   * @return relatedAnnouncementType
  **/
  @ApiModelProperty(value = "Тип сущности.")
  public RelatedAnnouncementTypeEnum getRelatedAnnouncementType() {
    return relatedAnnouncementType;
  }

  public void setRelatedAnnouncementType(RelatedAnnouncementTypeEnum relatedAnnouncementType) {
    this.relatedAnnouncementType = relatedAnnouncementType;
  }

  public SystemApiAnnouncementModel permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public SystemApiAnnouncementModel addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Список прав.
   * @return permissions
  **/
  @ApiModelProperty(value = "Список прав.")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public SystemApiAnnouncementModel title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Название рекламы.
   * @return title
  **/
  @ApiModelProperty(value = "Название рекламы.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SystemApiAnnouncementModel space(SpaceModel space) {
    this.space = space;
    return this;
  }

   /**
   * Рекламное место.
   * @return space
  **/
  @ApiModelProperty(value = "Рекламное место.")
  public SpaceModel getSpace() {
    return space;
  }

  public void setSpace(SpaceModel space) {
    this.space = space;
  }

  public SystemApiAnnouncementModel partner(PartnerViewModel partner) {
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

  public SystemApiAnnouncementModel author(UserViewModel author) {
    this.author = author;
    return this;
  }

   /**
   * Автор.
   * @return author
  **/
  @ApiModelProperty(value = "Автор.")
  public UserViewModel getAuthor() {
    return author;
  }

  public void setAuthor(UserViewModel author) {
    this.author = author;
  }

  public SystemApiAnnouncementModel permissionValues(List<String> permissionValues) {
    this.permissionValues = permissionValues;
    return this;
  }

  public SystemApiAnnouncementModel addPermissionValuesItem(String permissionValuesItem) {
    if (this.permissionValues == null) {
      this.permissionValues = new ArrayList<>();
    }
    this.permissionValues.add(permissionValuesItem);
    return this;
  }

   /**
   * Список прав.
   * @return permissionValues
  **/
  @ApiModelProperty(value = "Список прав.")
  public List<String> getPermissionValues() {
    return permissionValues;
  }

  public void setPermissionValues(List<String> permissionValues) {
    this.permissionValues = permissionValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemApiAnnouncementModel systemApiAnnouncementModel = (SystemApiAnnouncementModel) o;
    return Objects.equals(this.id, systemApiAnnouncementModel.id) &&
        Objects.equals(this.isDeleted, systemApiAnnouncementModel.isDeleted) &&
        Objects.equals(this.beginDate, systemApiAnnouncementModel.beginDate) &&
        Objects.equals(this.endDate, systemApiAnnouncementModel.endDate) &&
        Objects.equals(this.creationDate, systemApiAnnouncementModel.creationDate) &&
        Objects.equals(this.state, systemApiAnnouncementModel.state) &&
        Objects.equals(this.attributes, systemApiAnnouncementModel.attributes) &&
        Objects.equals(this.relatedAnnouncementType, systemApiAnnouncementModel.relatedAnnouncementType) &&
        Objects.equals(this.permissions, systemApiAnnouncementModel.permissions) &&
        Objects.equals(this.title, systemApiAnnouncementModel.title) &&
        Objects.equals(this.space, systemApiAnnouncementModel.space) &&
        Objects.equals(this.partner, systemApiAnnouncementModel.partner) &&
        Objects.equals(this.author, systemApiAnnouncementModel.author) &&
        Objects.equals(this.permissionValues, systemApiAnnouncementModel.permissionValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isDeleted, beginDate, endDate, creationDate, state, attributes, relatedAnnouncementType, permissions, title, space, partner, author, permissionValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemApiAnnouncementModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relatedAnnouncementType: ").append(toIndentedString(relatedAnnouncementType)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    permissionValues: ").append(toIndentedString(permissionValues)).append("\n");
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

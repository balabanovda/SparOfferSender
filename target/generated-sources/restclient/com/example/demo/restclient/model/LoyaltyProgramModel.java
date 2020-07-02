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
import com.example.demo.restclient.model.ImageViewModel;
import com.example.demo.restclient.model.LoyaltyProgramInfoViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * View-модель создания программы лояльности.
 */
@ApiModel(description = "View-модель создания программы лояльности.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class LoyaltyProgramModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("images")
  private List<ImageViewModel> images = null;

  public LoyaltyProgramModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Системный идентификатор.
   * @return id
  **/
  @ApiModelProperty(value = "Системный идентификатор.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LoyaltyProgramModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Логическое имя.
   * @return name
  **/
  @ApiModelProperty(value = "Логическое имя.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LoyaltyProgramModel externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Уникальный идентификатор.
   * @return externalId
  **/
  @ApiModelProperty(value = "Уникальный идентификатор.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public LoyaltyProgramModel description(String description) {
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

  public LoyaltyProgramModel images(List<ImageViewModel> images) {
    this.images = images;
    return this;
  }

  public LoyaltyProgramModel addImagesItem(ImageViewModel imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Изображения.
   * @return images
  **/
  @ApiModelProperty(value = "Изображения.")
  public List<ImageViewModel> getImages() {
    return images;
  }

  public void setImages(List<ImageViewModel> images) {
    this.images = images;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyProgramModel loyaltyProgramModel = (LoyaltyProgramModel) o;
    return Objects.equals(this.id, loyaltyProgramModel.id) &&
        Objects.equals(this.name, loyaltyProgramModel.name) &&
        Objects.equals(this.externalId, loyaltyProgramModel.externalId) &&
        Objects.equals(this.description, loyaltyProgramModel.description) &&
        Objects.equals(this.images, loyaltyProgramModel.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, externalId, description, images);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyProgramModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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


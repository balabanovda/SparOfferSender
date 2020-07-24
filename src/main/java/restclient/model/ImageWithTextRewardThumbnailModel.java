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

/**
 * Модель описания акции, состоящей из изображения и двух надписей.
 */
@ApiModel(description = "Модель описания акции, состоящей из изображения и двух надписей.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ImageWithTextRewardThumbnailModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("header")
  private String header = null;

  @JsonProperty("footer")
  private String footer = null;

  @JsonProperty("image")
  private FileViewModel image = null;

  public ImageWithTextRewardThumbnailModel id(Integer id) {
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

  public ImageWithTextRewardThumbnailModel header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Заголовок.
   * @return header
  **/
  @ApiModelProperty(value = "Заголовок.")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public ImageWithTextRewardThumbnailModel footer(String footer) {
    this.footer = footer;
    return this;
  }

   /**
   * Подпись.
   * @return footer
  **/
  @ApiModelProperty(value = "Подпись.")
  public String getFooter() {
    return footer;
  }

  public void setFooter(String footer) {
    this.footer = footer;
  }

  public ImageWithTextRewardThumbnailModel image(FileViewModel image) {
    this.image = image;
    return this;
  }

   /**
   * Изображение.
   * @return image
  **/
  @ApiModelProperty(value = "Изображение.")
  public FileViewModel getImage() {
    return image;
  }

  public void setImage(FileViewModel image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageWithTextRewardThumbnailModel imageWithTextRewardThumbnailModel = (ImageWithTextRewardThumbnailModel) o;
    return Objects.equals(this.id, imageWithTextRewardThumbnailModel.id) &&
        Objects.equals(this.header, imageWithTextRewardThumbnailModel.header) &&
        Objects.equals(this.footer, imageWithTextRewardThumbnailModel.footer) &&
        Objects.equals(this.image, imageWithTextRewardThumbnailModel.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, header, footer, image);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageWithTextRewardThumbnailModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

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
 * Модель описания акции, состоящей из старой и новой цены.
 */
@ApiModel(description = "Модель описания акции, состоящей из старой и новой цены.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class OldNewPriceRewardThumbnailModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("oldPrice")
  private String oldPrice = null;

  @JsonProperty("newPrice")
  private String newPrice = null;

  public OldNewPriceRewardThumbnailModel id(Integer id) {
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

  public OldNewPriceRewardThumbnailModel oldPrice(String oldPrice) {
    this.oldPrice = oldPrice;
    return this;
  }

   /**
   * Старая цена.
   * @return oldPrice
  **/
  @ApiModelProperty(value = "Старая цена.")
  public String getOldPrice() {
    return oldPrice;
  }

  public void setOldPrice(String oldPrice) {
    this.oldPrice = oldPrice;
  }

  public OldNewPriceRewardThumbnailModel newPrice(String newPrice) {
    this.newPrice = newPrice;
    return this;
  }

   /**
   * Новая цена.
   * @return newPrice
  **/
  @ApiModelProperty(value = "Новая цена.")
  public String getNewPrice() {
    return newPrice;
  }

  public void setNewPrice(String newPrice) {
    this.newPrice = newPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OldNewPriceRewardThumbnailModel oldNewPriceRewardThumbnailModel = (OldNewPriceRewardThumbnailModel) o;
    return Objects.equals(this.id, oldNewPriceRewardThumbnailModel.id) &&
        Objects.equals(this.oldPrice, oldNewPriceRewardThumbnailModel.oldPrice) &&
        Objects.equals(this.newPrice, oldNewPriceRewardThumbnailModel.newPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, oldPrice, newPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OldNewPriceRewardThumbnailModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oldPrice: ").append(toIndentedString(oldPrice)).append("\n");
    sb.append("    newPrice: ").append(toIndentedString(newPrice)).append("\n");
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

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
 * Модель для создания чековой позиции.
 */
@ApiModel(description = "Модель для создания чековой позиции.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class DeviceEmulationCreateChequePositionModel {
  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  @JsonProperty("partnerDiscount")
  private Double partnerDiscount = null;

  @JsonProperty("partnerCashback")
  private Double partnerCashback = null;

  @JsonProperty("goodID")
  private Integer goodID = null;

  public DeviceEmulationCreateChequePositionModel price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Цена.
   * @return price
  **/
  @ApiModelProperty(value = "Цена.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public DeviceEmulationCreateChequePositionModel quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Количество.
   * @return quantity
  **/
  @ApiModelProperty(value = "Количество.")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public DeviceEmulationCreateChequePositionModel partnerDiscount(Double partnerDiscount) {
    this.partnerDiscount = partnerDiscount;
    return this;
  }

   /**
   * Партнерская скидка.
   * @return partnerDiscount
  **/
  @ApiModelProperty(value = "Партнерская скидка.")
  public Double getPartnerDiscount() {
    return partnerDiscount;
  }

  public void setPartnerDiscount(Double partnerDiscount) {
    this.partnerDiscount = partnerDiscount;
  }

  public DeviceEmulationCreateChequePositionModel partnerCashback(Double partnerCashback) {
    this.partnerCashback = partnerCashback;
    return this;
  }

   /**
   * Партнерский кешбек.
   * @return partnerCashback
  **/
  @ApiModelProperty(value = "Партнерский кешбек.")
  public Double getPartnerCashback() {
    return partnerCashback;
  }

  public void setPartnerCashback(Double partnerCashback) {
    this.partnerCashback = partnerCashback;
  }

  public DeviceEmulationCreateChequePositionModel goodID(Integer goodID) {
    this.goodID = goodID;
    return this;
  }

   /**
   * Идентификатор товара.
   * @return goodID
  **/
  @ApiModelProperty(value = "Идентификатор товара.")
  public Integer getGoodID() {
    return goodID;
  }

  public void setGoodID(Integer goodID) {
    this.goodID = goodID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEmulationCreateChequePositionModel deviceEmulationCreateChequePositionModel = (DeviceEmulationCreateChequePositionModel) o;
    return Objects.equals(this.price, deviceEmulationCreateChequePositionModel.price) &&
        Objects.equals(this.quantity, deviceEmulationCreateChequePositionModel.quantity) &&
        Objects.equals(this.partnerDiscount, deviceEmulationCreateChequePositionModel.partnerDiscount) &&
        Objects.equals(this.partnerCashback, deviceEmulationCreateChequePositionModel.partnerCashback) &&
        Objects.equals(this.goodID, deviceEmulationCreateChequePositionModel.goodID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, quantity, partnerDiscount, partnerCashback, goodID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEmulationCreateChequePositionModel {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    partnerDiscount: ").append(toIndentedString(partnerDiscount)).append("\n");
    sb.append("    partnerCashback: ").append(toIndentedString(partnerCashback)).append("\n");
    sb.append("    goodID: ").append(toIndentedString(goodID)).append("\n");
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


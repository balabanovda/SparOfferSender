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
import com.example.demo.restclient.model.ActionDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Действие \&quot;Расчет скидки по купону\&quot;.
 */
@ApiModel(description = "Действие \"Расчет скидки по купону\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PartnerCouponDiscountActionDto {
  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("id")
  private String id = null;

  public PartnerCouponDiscountActionDto order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Порядковый номер действия в цепочке.
   * @return order
  **/
  @ApiModelProperty(value = "Порядковый номер действия в цепочке.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public PartnerCouponDiscountActionDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id действия в цепочке.
   * @return id
  **/
  @ApiModelProperty(value = "Id действия в цепочке.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerCouponDiscountActionDto partnerCouponDiscountActionDto = (PartnerCouponDiscountActionDto) o;
    return Objects.equals(this.order, partnerCouponDiscountActionDto.order) &&
        Objects.equals(this.id, partnerCouponDiscountActionDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerCouponDiscountActionDto {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


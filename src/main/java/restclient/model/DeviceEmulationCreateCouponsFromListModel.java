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
import java.util.ArrayList;
import java.util.List;

/**
 * Модкль для создания купонов из списка.
 */
@ApiModel(description = "Модкль для создания купонов из списка.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class DeviceEmulationCreateCouponsFromListModel {
  @JsonProperty("coupons")
  private List<DeviceEmulationCouponModel> coupons = null;

  public DeviceEmulationCreateCouponsFromListModel coupons(List<DeviceEmulationCouponModel> coupons) {
    this.coupons = coupons;
    return this;
  }

  public DeviceEmulationCreateCouponsFromListModel addCouponsItem(DeviceEmulationCouponModel couponsItem) {
    if (this.coupons == null) {
      this.coupons = new ArrayList<>();
    }
    this.coupons.add(couponsItem);
    return this;
  }

   /**
   * Список купонов.
   * @return coupons
  **/
  @ApiModelProperty(value = "Список купонов.")
  public List<DeviceEmulationCouponModel> getCoupons() {
    return coupons;
  }

  public void setCoupons(List<DeviceEmulationCouponModel> coupons) {
    this.coupons = coupons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEmulationCreateCouponsFromListModel deviceEmulationCreateCouponsFromListModel = (DeviceEmulationCreateCouponsFromListModel) o;
    return Objects.equals(this.coupons, deviceEmulationCreateCouponsFromListModel.coupons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coupons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEmulationCreateCouponsFromListModel {\n");
    
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
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


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
import com.example.demo.restclient.model.DeviceBaseViewModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Информация о тестовой кассе.
 */
@ApiModel(description = "Информация о тестовой кассе.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class TestDeviceViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("logicalId")
  private String logicalId = null;

  @JsonProperty("merchantInfo")
  private String merchantInfo = null;

  @JsonProperty("currency")
  private String currency = null;

  public TestDeviceViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id девайса.
   * @return id
  **/
  @ApiModelProperty(value = "Id девайса.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TestDeviceViewModel logicalId(String logicalId) {
    this.logicalId = logicalId;
    return this;
  }

   /**
   * Логическое имя устройства.
   * @return logicalId
  **/
  @ApiModelProperty(value = "Логическое имя устройства.")
  public String getLogicalId() {
    return logicalId;
  }

  public void setLogicalId(String logicalId) {
    this.logicalId = logicalId;
  }

  public TestDeviceViewModel merchantInfo(String merchantInfo) {
    this.merchantInfo = merchantInfo;
    return this;
  }

   /**
   * Магазин.
   * @return merchantInfo
  **/
  @ApiModelProperty(value = "Магазин.")
  public String getMerchantInfo() {
    return merchantInfo;
  }

  public void setMerchantInfo(String merchantInfo) {
    this.merchantInfo = merchantInfo;
  }

  public TestDeviceViewModel currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Валюты кассы.
   * @return currency
  **/
  @ApiModelProperty(value = "Валюты кассы.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestDeviceViewModel testDeviceViewModel = (TestDeviceViewModel) o;
    return Objects.equals(this.id, testDeviceViewModel.id) &&
        Objects.equals(this.logicalId, testDeviceViewModel.logicalId) &&
        Objects.equals(this.merchantInfo, testDeviceViewModel.merchantInfo) &&
        Objects.equals(this.currency, testDeviceViewModel.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logicalId, merchantInfo, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestDeviceViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logicalId: ").append(toIndentedString(logicalId)).append("\n");
    sb.append("    merchantInfo: ").append(toIndentedString(merchantInfo)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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


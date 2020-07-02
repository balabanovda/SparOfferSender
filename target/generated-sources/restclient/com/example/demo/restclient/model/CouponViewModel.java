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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * ViewModel для купона.
 */
@ApiModel(description = "ViewModel для купона.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CouponViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("qrContent")
  private String qrContent = null;

  @JsonProperty("createDate")
  private OffsetDateTime createDate = null;

  @JsonProperty("updateDate")
  private OffsetDateTime updateDate = null;

  /**
   * Статус купона.
   */
  public enum CouponStateEnum {
    CREATED("Created"),
    
    ISSUED("Issued"),
    
    USED("Used"),
    
    REJECTED("Rejected"),
    
    QUEUEDTOUSE("QueuedToUse"),
    
    QUEUEDTOISSUE("QueuedToIssue");

    private String value;

    CouponStateEnum(String value) {
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
    public static CouponStateEnum fromValue(String text) {
      for (CouponStateEnum b : CouponStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("couponState")
  private CouponStateEnum couponState = null;

  @JsonProperty("emissionTitle")
  private String emissionTitle = null;

  public CouponViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор купона.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор купона.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CouponViewModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Код.
   * @return code
  **/
  @ApiModelProperty(value = "Код.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CouponViewModel qrContent(String qrContent) {
    this.qrContent = qrContent;
    return this;
  }

   /**
   * Qr код.
   * @return qrContent
  **/
  @ApiModelProperty(value = "Qr код.")
  public String getQrContent() {
    return qrContent;
  }

  public void setQrContent(String qrContent) {
    this.qrContent = qrContent;
  }

  public CouponViewModel createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Дата создания.
   * @return createDate
  **/
  @ApiModelProperty(value = "Дата создания.")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public CouponViewModel updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Дата обновления.
   * @return updateDate
  **/
  @ApiModelProperty(value = "Дата обновления.")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public CouponViewModel couponState(CouponStateEnum couponState) {
    this.couponState = couponState;
    return this;
  }

   /**
   * Статус купона.
   * @return couponState
  **/
  @ApiModelProperty(value = "Статус купона.")
  public CouponStateEnum getCouponState() {
    return couponState;
  }

  public void setCouponState(CouponStateEnum couponState) {
    this.couponState = couponState;
  }

  public CouponViewModel emissionTitle(String emissionTitle) {
    this.emissionTitle = emissionTitle;
    return this;
  }

   /**
   * Название эмиссии.
   * @return emissionTitle
  **/
  @ApiModelProperty(value = "Название эмиссии.")
  public String getEmissionTitle() {
    return emissionTitle;
  }

  public void setEmissionTitle(String emissionTitle) {
    this.emissionTitle = emissionTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponViewModel couponViewModel = (CouponViewModel) o;
    return Objects.equals(this.id, couponViewModel.id) &&
        Objects.equals(this.code, couponViewModel.code) &&
        Objects.equals(this.qrContent, couponViewModel.qrContent) &&
        Objects.equals(this.createDate, couponViewModel.createDate) &&
        Objects.equals(this.updateDate, couponViewModel.updateDate) &&
        Objects.equals(this.couponState, couponViewModel.couponState) &&
        Objects.equals(this.emissionTitle, couponViewModel.emissionTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, qrContent, createDate, updateDate, couponState, emissionTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    qrContent: ").append(toIndentedString(qrContent)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    couponState: ").append(toIndentedString(couponState)).append("\n");
    sb.append("    emissionTitle: ").append(toIndentedString(emissionTitle)).append("\n");
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

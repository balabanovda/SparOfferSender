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
import com.example.demo.restclient.model.AuthResultModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Результат окончания регистрации.
 */
@ApiModel(description = "Результат окончания регистрации.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class FinishRegistrationResultModel {
  @JsonProperty("token_type")
  private String tokenType = null;

  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("expires_in")
  private Integer expiresIn = null;

  @JsonProperty("registrationCompleted")
  private Boolean registrationCompleted = null;

  public FinishRegistrationResultModel tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Тип маркера доступа.
   * @return tokenType
  **/
  @ApiModelProperty(value = "Тип маркера доступа.")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public FinishRegistrationResultModel accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Маркер доступа.
   * @return accessToken
  **/
  @ApiModelProperty(value = "Маркер доступа.")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public FinishRegistrationResultModel refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Маркер обновления доступа.
   * @return refreshToken
  **/
  @ApiModelProperty(value = "Маркер обновления доступа.")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public FinishRegistrationResultModel expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Срок действия маркера доступа.
   * @return expiresIn
  **/
  @ApiModelProperty(value = "Срок действия маркера доступа.")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public FinishRegistrationResultModel registrationCompleted(Boolean registrationCompleted) {
    this.registrationCompleted = registrationCompleted;
    return this;
  }

   /**
   * Закончена ли регистрация пользователя.
   * @return registrationCompleted
  **/
  @ApiModelProperty(value = "Закончена ли регистрация пользователя.")
  public Boolean isRegistrationCompleted() {
    return registrationCompleted;
  }

  public void setRegistrationCompleted(Boolean registrationCompleted) {
    this.registrationCompleted = registrationCompleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinishRegistrationResultModel finishRegistrationResultModel = (FinishRegistrationResultModel) o;
    return Objects.equals(this.tokenType, finishRegistrationResultModel.tokenType) &&
        Objects.equals(this.accessToken, finishRegistrationResultModel.accessToken) &&
        Objects.equals(this.refreshToken, finishRegistrationResultModel.refreshToken) &&
        Objects.equals(this.expiresIn, finishRegistrationResultModel.expiresIn) &&
        Objects.equals(this.registrationCompleted, finishRegistrationResultModel.registrationCompleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenType, accessToken, refreshToken, expiresIn, registrationCompleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinishRegistrationResultModel {\n");
    
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    registrationCompleted: ").append(toIndentedString(registrationCompleted)).append("\n");
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


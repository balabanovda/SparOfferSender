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

/**
 * Краткая информация о карте.
 */
@ApiModel(description = "Краткая информация о карте.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CardShortInfo {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("balance")
  private String balance = null;

  @JsonProperty("isBlocked")
  private Boolean isBlocked = null;

  public CardShortInfo id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор карты.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор карты.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CardShortInfo balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Баланс карты.
   * @return balance
  **/
  @ApiModelProperty(value = "Баланс карты.")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public CardShortInfo isBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
    return this;
  }

   /**
   * Заблокирована ли карта.
   * @return isBlocked
  **/
  @ApiModelProperty(value = "Заблокирована ли карта.")
  public Boolean isIsBlocked() {
    return isBlocked;
  }

  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardShortInfo cardShortInfo = (CardShortInfo) o;
    return Objects.equals(this.id, cardShortInfo.id) &&
        Objects.equals(this.balance, cardShortInfo.balance) &&
        Objects.equals(this.isBlocked, cardShortInfo.isBlocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, balance, isBlocked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardShortInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    isBlocked: ").append(toIndentedString(isBlocked)).append("\n");
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


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
 * ViewModel базовой информации о карте.
 */
@ApiModel(description = "ViewModel базовой информации о карте.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CardCompactInfoModel {
  @JsonProperty("id")
  private Integer id = null;

  /**
   * Статус.
   */
  public enum StateEnum {
    EMITTED("Emitted"),
    
    PACKED("Packed"),
    
    ACTIVATED("Activated"),
    
    REPLACED("Replaced"),
    
    CREATING("Creating"),
    
    CREATED("Created"),
    
    PREPARED("Prepared"),
    
    ISSUED("Issued");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("barCode")
  private String barCode = null;

  @JsonProperty("block")
  private Boolean block = null;

  public CardCompactInfoModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Ифентификатор.
   * @return id
  **/
  @ApiModelProperty(value = "Ифентификатор.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CardCompactInfoModel state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Статус.
   * @return state
  **/
  @ApiModelProperty(value = "Статус.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public CardCompactInfoModel number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Номер карты.
   * @return number
  **/
  @ApiModelProperty(value = "Номер карты.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CardCompactInfoModel barCode(String barCode) {
    this.barCode = barCode;
    return this;
  }

   /**
   * Баркод.
   * @return barCode
  **/
  @ApiModelProperty(value = "Баркод.")
  public String getBarCode() {
    return barCode;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }

  public CardCompactInfoModel block(Boolean block) {
    this.block = block;
    return this;
  }

   /**
   * Заблокирована или нет.
   * @return block
  **/
  @ApiModelProperty(value = "Заблокирована или нет.")
  public Boolean isBlock() {
    return block;
  }

  public void setBlock(Boolean block) {
    this.block = block;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardCompactInfoModel cardCompactInfoModel = (CardCompactInfoModel) o;
    return Objects.equals(this.id, cardCompactInfoModel.id) &&
        Objects.equals(this.state, cardCompactInfoModel.state) &&
        Objects.equals(this.number, cardCompactInfoModel.number) &&
        Objects.equals(this.barCode, cardCompactInfoModel.barCode) &&
        Objects.equals(this.block, cardCompactInfoModel.block);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, number, barCode, block);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardCompactInfoModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    barCode: ").append(toIndentedString(barCode)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
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


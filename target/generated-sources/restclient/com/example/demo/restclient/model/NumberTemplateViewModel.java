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
 * ViewModel шаблона для номера.
 */
@ApiModel(description = "ViewModel шаблона для номера.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class NumberTemplateViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("text")
  private String text = null;

  /**
   * Тип эмиссии.
   */
  public enum EmissionTypeEnum {
    CARDEMISSION("CardEmission"),
    
    BOOKLETEMISSION("BookletEmission"),
    
    COUPONEMISSION("CouponEmission");

    private String value;

    EmissionTypeEnum(String value) {
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
    public static EmissionTypeEnum fromValue(String text) {
      for (EmissionTypeEnum b : EmissionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("emissionType")
  private EmissionTypeEnum emissionType = null;

  /**
   * Тип номера эмиссии (Название алгоритма вычисления контрольной цифры номера).
   */
  public enum NumberTypeEnum {
    EAN13("EAN13"),
    
    LUHN16("Luhn16"),
    
    LUHN("Luhn");

    private String value;

    NumberTypeEnum(String value) {
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
    public static NumberTypeEnum fromValue(String text) {
      for (NumberTypeEnum b : NumberTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("numberType")
  private NumberTypeEnum numberType = null;

  /**
   * Состояние  шаблона для генерации номеров выпусков.
   */
  public enum StateEnum {
    NORMAL("Normal"),
    
    DELETED("Deleted");

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

  public NumberTemplateViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор шаблона для генерации номеров выпусков.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор шаблона для генерации номеров выпусков.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public NumberTemplateViewModel text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Текст шаблона для генерации номеров выпусков .
   * @return text
  **/
  @ApiModelProperty(value = "Текст шаблона для генерации номеров выпусков .")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public NumberTemplateViewModel emissionType(EmissionTypeEnum emissionType) {
    this.emissionType = emissionType;
    return this;
  }

   /**
   * Тип эмиссии.
   * @return emissionType
  **/
  @ApiModelProperty(value = "Тип эмиссии.")
  public EmissionTypeEnum getEmissionType() {
    return emissionType;
  }

  public void setEmissionType(EmissionTypeEnum emissionType) {
    this.emissionType = emissionType;
  }

  public NumberTemplateViewModel numberType(NumberTypeEnum numberType) {
    this.numberType = numberType;
    return this;
  }

   /**
   * Тип номера эмиссии (Название алгоритма вычисления контрольной цифры номера).
   * @return numberType
  **/
  @ApiModelProperty(value = "Тип номера эмиссии (Название алгоритма вычисления контрольной цифры номера).")
  public NumberTypeEnum getNumberType() {
    return numberType;
  }

  public void setNumberType(NumberTypeEnum numberType) {
    this.numberType = numberType;
  }

  public NumberTemplateViewModel state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Состояние  шаблона для генерации номеров выпусков.
   * @return state
  **/
  @ApiModelProperty(value = "Состояние  шаблона для генерации номеров выпусков.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberTemplateViewModel numberTemplateViewModel = (NumberTemplateViewModel) o;
    return Objects.equals(this.id, numberTemplateViewModel.id) &&
        Objects.equals(this.text, numberTemplateViewModel.text) &&
        Objects.equals(this.emissionType, numberTemplateViewModel.emissionType) &&
        Objects.equals(this.numberType, numberTemplateViewModel.numberType) &&
        Objects.equals(this.state, numberTemplateViewModel.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, emissionType, numberType, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberTemplateViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    emissionType: ").append(toIndentedString(emissionType)).append("\n");
    sb.append("    numberType: ").append(toIndentedString(numberType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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


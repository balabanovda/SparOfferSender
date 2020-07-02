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
 * Фильтр для шаблонов для генерации номеров выпусков.
 */
@ApiModel(description = "Фильтр для шаблонов для генерации номеров выпусков.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class EmissionNumberTemplateFilter {
  @JsonProperty("from")
  private Integer from = null;

  @JsonProperty("count")
  private Integer count = null;

  /**
   * Тип шаблона уведомлений.
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

  @JsonProperty("textSubStr")
  private String textSubStr = null;

  /**
   * Режим отображения архивных шаблонов.
   */
  public enum ShowModeEnum {
    ARCHIVED("Archived"),
    
    NONARCHIVED("NonArchived");

    private String value;

    ShowModeEnum(String value) {
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
    public static ShowModeEnum fromValue(String text) {
      for (ShowModeEnum b : ShowModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("showMode")
  private ShowModeEnum showMode = null;

  public EmissionNumberTemplateFilter from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * Начало выборки.
   * @return from
  **/
  @ApiModelProperty(value = "Начало выборки.")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public EmissionNumberTemplateFilter count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Количество.
   * @return count
  **/
  @ApiModelProperty(value = "Количество.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public EmissionNumberTemplateFilter emissionType(EmissionTypeEnum emissionType) {
    this.emissionType = emissionType;
    return this;
  }

   /**
   * Тип шаблона уведомлений.
   * @return emissionType
  **/
  @ApiModelProperty(value = "Тип шаблона уведомлений.")
  public EmissionTypeEnum getEmissionType() {
    return emissionType;
  }

  public void setEmissionType(EmissionTypeEnum emissionType) {
    this.emissionType = emissionType;
  }

  public EmissionNumberTemplateFilter textSubStr(String textSubStr) {
    this.textSubStr = textSubStr;
    return this;
  }

   /**
   * Подстрока текстового описания шаблона.
   * @return textSubStr
  **/
  @ApiModelProperty(value = "Подстрока текстового описания шаблона.")
  public String getTextSubStr() {
    return textSubStr;
  }

  public void setTextSubStr(String textSubStr) {
    this.textSubStr = textSubStr;
  }

  public EmissionNumberTemplateFilter showMode(ShowModeEnum showMode) {
    this.showMode = showMode;
    return this;
  }

   /**
   * Режим отображения архивных шаблонов.
   * @return showMode
  **/
  @ApiModelProperty(value = "Режим отображения архивных шаблонов.")
  public ShowModeEnum getShowMode() {
    return showMode;
  }

  public void setShowMode(ShowModeEnum showMode) {
    this.showMode = showMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmissionNumberTemplateFilter emissionNumberTemplateFilter = (EmissionNumberTemplateFilter) o;
    return Objects.equals(this.from, emissionNumberTemplateFilter.from) &&
        Objects.equals(this.count, emissionNumberTemplateFilter.count) &&
        Objects.equals(this.emissionType, emissionNumberTemplateFilter.emissionType) &&
        Objects.equals(this.textSubStr, emissionNumberTemplateFilter.textSubStr) &&
        Objects.equals(this.showMode, emissionNumberTemplateFilter.showMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, count, emissionType, textSubStr, showMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmissionNumberTemplateFilter {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    emissionType: ").append(toIndentedString(emissionType)).append("\n");
    sb.append("    textSubStr: ").append(toIndentedString(textSubStr)).append("\n");
    sb.append("    showMode: ").append(toIndentedString(showMode)).append("\n");
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

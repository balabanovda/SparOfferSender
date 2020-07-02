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
import com.example.demo.restclient.model.FilterDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Фильтр \&quot;Привязан viber аккаунт\&quot;.
 */
@ApiModel(description = "Фильтр \"Привязан viber аккаунт\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ViberAccountFilterDto {
  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets viberStates
   */
  public enum ViberStatesEnum {
    EXIST("Exist"),
    
    NOEXIST("NoExist"),
    
    UNKNOWN("Unknown");

    private String value;

    ViberStatesEnum(String value) {
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
    public static ViberStatesEnum fromValue(String text) {
      for (ViberStatesEnum b : ViberStatesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("viberStates")
  private List<ViberStatesEnum> viberStates = null;

  public ViberAccountFilterDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Имя фильтра.
   * @return name
  **/
  @ApiModelProperty(value = "Имя фильтра.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ViberAccountFilterDto viberStates(List<ViberStatesEnum> viberStates) {
    this.viberStates = viberStates;
    return this;
  }

  public ViberAccountFilterDto addViberStatesItem(ViberStatesEnum viberStatesItem) {
    if (this.viberStates == null) {
      this.viberStates = new ArrayList<>();
    }
    this.viberStates.add(viberStatesItem);
    return this;
  }

   /**
   * Привязан ли viber аккаунт.
   * @return viberStates
  **/
  @ApiModelProperty(value = "Привязан ли viber аккаунт.")
  public List<ViberStatesEnum> getViberStates() {
    return viberStates;
  }

  public void setViberStates(List<ViberStatesEnum> viberStates) {
    this.viberStates = viberStates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViberAccountFilterDto viberAccountFilterDto = (ViberAccountFilterDto) o;
    return Objects.equals(this.name, viberAccountFilterDto.name) &&
        Objects.equals(this.viberStates, viberAccountFilterDto.viberStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, viberStates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViberAccountFilterDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    viberStates: ").append(toIndentedString(viberStates)).append("\n");
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


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
 * Информацию о менеджерах пользователя.
 */
@ApiModel(description = "Информацию о менеджерах пользователя.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class UserMessengersViewModel {
  @JsonProperty("hasViber")
  private Boolean hasViber = null;

  public UserMessengersViewModel hasViber(Boolean hasViber) {
    this.hasViber = hasViber;
    return this;
  }

   /**
   * Наличие активного аккаунта Viber.
   * @return hasViber
  **/
  @ApiModelProperty(value = "Наличие активного аккаунта Viber.")
  public Boolean isHasViber() {
    return hasViber;
  }

  public void setHasViber(Boolean hasViber) {
    this.hasViber = hasViber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMessengersViewModel userMessengersViewModel = (UserMessengersViewModel) o;
    return Objects.equals(this.hasViber, userMessengersViewModel.hasViber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasViber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMessengersViewModel {\n");
    
    sb.append("    hasViber: ").append(toIndentedString(hasViber)).append("\n");
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


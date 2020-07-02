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
 * Имя пользователя.
 */
@ApiModel(description = "Имя пользователя.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class UserName {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("patronymicName")
  private String patronymicName = null;

  public UserName firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Имя.
   * @return firstName
  **/
  @ApiModelProperty(value = "Имя.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserName lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Фамилия.
   * @return lastName
  **/
  @ApiModelProperty(value = "Фамилия.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserName patronymicName(String patronymicName) {
    this.patronymicName = patronymicName;
    return this;
  }

   /**
   * Отчество.
   * @return patronymicName
  **/
  @ApiModelProperty(value = "Отчество.")
  public String getPatronymicName() {
    return patronymicName;
  }

  public void setPatronymicName(String patronymicName) {
    this.patronymicName = patronymicName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserName userName = (UserName) o;
    return Objects.equals(this.firstName, userName.firstName) &&
        Objects.equals(this.lastName, userName.lastName) &&
        Objects.equals(this.patronymicName, userName.patronymicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, patronymicName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserName {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    patronymicName: ").append(toIndentedString(patronymicName)).append("\n");
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


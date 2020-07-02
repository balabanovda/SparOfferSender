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
import com.example.demo.restclient.model.PersonInfoModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PersonsGroupInfoModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PersonsGroupInfoModel {
  @JsonProperty("persons")
  private List<PersonInfoModel> persons = null;

  public PersonsGroupInfoModel persons(List<PersonInfoModel> persons) {
    this.persons = persons;
    return this;
  }

  public PersonsGroupInfoModel addPersonsItem(PersonInfoModel personsItem) {
    if (this.persons == null) {
      this.persons = new ArrayList<>();
    }
    this.persons.add(personsItem);
    return this;
  }

   /**
   * Get persons
   * @return persons
  **/
  @ApiModelProperty(value = "")
  public List<PersonInfoModel> getPersons() {
    return persons;
  }

  public void setPersons(List<PersonInfoModel> persons) {
    this.persons = persons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonsGroupInfoModel personsGroupInfoModel = (PersonsGroupInfoModel) o;
    return Objects.equals(this.persons, personsGroupInfoModel.persons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonsGroupInfoModel {\n");
    
    sb.append("    persons: ").append(toIndentedString(persons)).append("\n");
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


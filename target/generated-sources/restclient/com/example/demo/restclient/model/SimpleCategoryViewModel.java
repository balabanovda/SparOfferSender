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
 * Простая модель категории рекламных материалов.
 */
@ApiModel(description = "Простая модель категории рекламных материалов.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class SimpleCategoryViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isArchived")
  private Boolean isArchived = null;

  public SimpleCategoryViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор категории.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор категории.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SimpleCategoryViewModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Имя категории.
   * @return name
  **/
  @ApiModelProperty(value = "Имя категории.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SimpleCategoryViewModel isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Находится ли в архиве.
   * @return isArchived
  **/
  @ApiModelProperty(value = "Находится ли в архиве.")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleCategoryViewModel simpleCategoryViewModel = (SimpleCategoryViewModel) o;
    return Objects.equals(this.id, simpleCategoryViewModel.id) &&
        Objects.equals(this.name, simpleCategoryViewModel.name) &&
        Objects.equals(this.isArchived, simpleCategoryViewModel.isArchived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isArchived);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleCategoryViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
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

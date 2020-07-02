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
import com.example.demo.restclient.model.BaseTargetGroupDto;
import com.example.demo.restclient.model.FilterDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Фильтр \&quot;Целевые аудитории\&quot;.
 */
@ApiModel(description = "Фильтр \"Целевые аудитории\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class TargetGroupFilterDto {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("targetGroups")
  private List<BaseTargetGroupDto> targetGroups = null;

  public TargetGroupFilterDto name(String name) {
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

  public TargetGroupFilterDto targetGroups(List<BaseTargetGroupDto> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public TargetGroupFilterDto addTargetGroupsItem(BaseTargetGroupDto targetGroupsItem) {
    if (this.targetGroups == null) {
      this.targetGroups = new ArrayList<>();
    }
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * Список выбранных целевых аудиторий.
   * @return targetGroups
  **/
  @ApiModelProperty(value = "Список выбранных целевых аудиторий.")
  public List<BaseTargetGroupDto> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<BaseTargetGroupDto> targetGroups) {
    this.targetGroups = targetGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetGroupFilterDto targetGroupFilterDto = (TargetGroupFilterDto) o;
    return Objects.equals(this.name, targetGroupFilterDto.name) &&
        Objects.equals(this.targetGroups, targetGroupFilterDto.targetGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, targetGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetGroupFilterDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
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


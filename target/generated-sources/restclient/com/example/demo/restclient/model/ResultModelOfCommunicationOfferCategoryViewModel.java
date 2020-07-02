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
import com.example.demo.restclient.model.CommunicationOfferCategoryViewModel;
import com.example.demo.restclient.model.Result;
import com.example.demo.restclient.model.ResultModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Модель результата с данными.
 */
@ApiModel(description = "Модель результата с данными.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ResultModelOfCommunicationOfferCategoryViewModel {
  @JsonProperty("result")
  private Result result = null;

  @JsonProperty("data")
  private CommunicationOfferCategoryViewModel data = null;

  public ResultModelOfCommunicationOfferCategoryViewModel result(Result result) {
    this.result = result;
    return this;
  }

   /**
   * Состояние результата.
   * @return result
  **/
  @ApiModelProperty(value = "Состояние результата.")
  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

  public ResultModelOfCommunicationOfferCategoryViewModel data(CommunicationOfferCategoryViewModel data) {
    this.data = data;
    return this;
  }

   /**
   * Данные.
   * @return data
  **/
  @ApiModelProperty(value = "Данные.")
  public CommunicationOfferCategoryViewModel getData() {
    return data;
  }

  public void setData(CommunicationOfferCategoryViewModel data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultModelOfCommunicationOfferCategoryViewModel resultModelOfCommunicationOfferCategoryViewModel = (ResultModelOfCommunicationOfferCategoryViewModel) o;
    return Objects.equals(this.result, resultModelOfCommunicationOfferCategoryViewModel.result) &&
        Objects.equals(this.data, resultModelOfCommunicationOfferCategoryViewModel.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultModelOfCommunicationOfferCategoryViewModel {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


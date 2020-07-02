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
import java.util.ArrayList;
import java.util.List;

/**
 * Ошибка при ответе на вопросе.
 */
@ApiModel(description = "Ошибка при ответе на вопросе.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class QuestionError {
  @JsonProperty("idQuestion")
  private String idQuestion = null;

  @JsonProperty("errors")
  private List<String> errors = null;

  public QuestionError idQuestion(String idQuestion) {
    this.idQuestion = idQuestion;
    return this;
  }

   /**
   * Идентификатор вопроса.
   * @return idQuestion
  **/
  @ApiModelProperty(value = "Идентификатор вопроса.")
  public String getIdQuestion() {
    return idQuestion;
  }

  public void setIdQuestion(String idQuestion) {
    this.idQuestion = idQuestion;
  }

  public QuestionError errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public QuestionError addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Набор ошибок.
   * @return errors
  **/
  @ApiModelProperty(value = "Набор ошибок.")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionError questionError = (QuestionError) o;
    return Objects.equals(this.idQuestion, questionError.idQuestion) &&
        Objects.equals(this.errors, questionError.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idQuestion, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionError {\n");
    
    sb.append("    idQuestion: ").append(toIndentedString(idQuestion)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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


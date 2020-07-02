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
import com.example.demo.restclient.model.AuthResultModel;
import com.example.demo.restclient.model.RegistrationResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

/**
 * Результат анонимной регистрации.
 */
@ApiModel(description = "Результат анонимной регистрации.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class AnonymousRegistrationResult {
  /**
   * Код результата.
   */
  public enum StateEnum {
    SUCCESS("Success"),
    
    INVALIDLOGINPASSWORD("InvalidLoginPassword"),
    
    PASSWORDREQUIRED("PasswordRequired"),
    
    REGISTRATIONBLOCKED("RegistrationBlocked"),
    
    REGISTRATIONALREADYCOMPLETED("RegistrationAlreadyCompleted");

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

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("authToken")
  private String authToken = null;

  @JsonProperty("authResult")
  private AuthResultModel authResult = null;

  @JsonProperty("userIdentifier")
  private UUID userIdentifier = null;

  public AnonymousRegistrationResult state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Код результата.
   * @return state
  **/
  @ApiModelProperty(value = "Код результата.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public AnonymousRegistrationResult errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Текст сообщения об ошибке.
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Текст сообщения об ошибке.")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public AnonymousRegistrationResult authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * Токен аутентификации для дальнейших действий.
   * @return authToken
  **/
  @ApiModelProperty(value = "Токен аутентификации для дальнейших действий.")
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  public AnonymousRegistrationResult authResult(AuthResultModel authResult) {
    this.authResult = authResult;
    return this;
  }

   /**
   * Результат аутентификации с маркером доступа для дальнейших действий.
   * @return authResult
  **/
  @ApiModelProperty(value = "Результат аутентификации с маркером доступа для дальнейших действий.")
  public AuthResultModel getAuthResult() {
    return authResult;
  }

  public void setAuthResult(AuthResultModel authResult) {
    this.authResult = authResult;
  }

  public AnonymousRegistrationResult userIdentifier(UUID userIdentifier) {
    this.userIdentifier = userIdentifier;
    return this;
  }

   /**
   * Идентификатор пользователя.
   * @return userIdentifier
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Идентификатор пользователя.")
  public UUID getUserIdentifier() {
    return userIdentifier;
  }

  public void setUserIdentifier(UUID userIdentifier) {
    this.userIdentifier = userIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnonymousRegistrationResult anonymousRegistrationResult = (AnonymousRegistrationResult) o;
    return Objects.equals(this.state, anonymousRegistrationResult.state) &&
        Objects.equals(this.errorMessage, anonymousRegistrationResult.errorMessage) &&
        Objects.equals(this.authToken, anonymousRegistrationResult.authToken) &&
        Objects.equals(this.authResult, anonymousRegistrationResult.authResult) &&
        Objects.equals(this.userIdentifier, anonymousRegistrationResult.userIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, errorMessage, authToken, authResult, userIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnonymousRegistrationResult {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    authResult: ").append(toIndentedString(authResult)).append("\n");
    sb.append("    userIdentifier: ").append(toIndentedString(userIdentifier)).append("\n");
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


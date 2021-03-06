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


package restclient.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Модель рассылки для тестирования.
 */
@ApiModel(description = "Модель рассылки для тестирования.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class MailingTestsModel {
  @JsonProperty("testRecipient")
  private String testRecipient = null;

  public MailingTestsModel testRecipient(String testRecipient) {
    this.testRecipient = testRecipient;
    return this;
  }

   /**
   * Получатель тестового сообщения.  Если для рассылки указана целевая аудитория, необходимо ввести номер карты. Если загружен список номеров, необходимо ввести номер телефона.
   * @return testRecipient
  **/
  @ApiModelProperty(value = "Получатель тестового сообщения.  Если для рассылки указана целевая аудитория, необходимо ввести номер карты. Если загружен список номеров, необходимо ввести номер телефона.")
  public String getTestRecipient() {
    return testRecipient;
  }

  public void setTestRecipient(String testRecipient) {
    this.testRecipient = testRecipient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailingTestsModel mailingTestsModel = (MailingTestsModel) o;
    return Objects.equals(this.testRecipient, mailingTestsModel.testRecipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testRecipient);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingTestsModel {\n");
    
    sb.append("    testRecipient: ").append(toIndentedString(testRecipient)).append("\n");
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


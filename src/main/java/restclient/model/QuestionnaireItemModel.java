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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Базовый класс для модели вопроса.
 */
@ApiModel(description = "Базовый класс для модели вопроса.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class QuestionnaireItemModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("order")
  private Integer order = null;

  /**
   * Тип.
   */
  public enum TypeEnum {
    QUESTION("Question"),
    
    QUESTIONGROUP("QuestionGroup"),
    
    QUESTIONFIXEDANSWER("QuestionFixedAnswer");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  public QuestionnaireItemModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public QuestionnaireItemModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название.
   * @return name
  **/
  @ApiModelProperty(value = "Название.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QuestionnaireItemModel order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Порядок.
   * @return order
  **/
  @ApiModelProperty(value = "Порядок.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

   /**
   * Тип.
   * @return type
  **/
  @ApiModelProperty(value = "Тип.")
  public TypeEnum getType() {
    return type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionnaireItemModel questionnaireItemModel = (QuestionnaireItemModel) o;
    return Objects.equals(this.id, questionnaireItemModel.id) &&
        Objects.equals(this.name, questionnaireItemModel.name) &&
        Objects.equals(this.order, questionnaireItemModel.order) &&
        Objects.equals(this.type, questionnaireItemModel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionnaireItemModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


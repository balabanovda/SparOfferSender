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
 * View модель выпуска буклетов.
 */
@ApiModel(description = "View модель выпуска буклетов.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class BookletEmissionViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("prefix")
  private Integer prefix = null;

  /**
   * Состояние.
   */
  public enum StateEnum {
    NORMAL("Normal");

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

  @JsonProperty("templateId")
  private Integer templateId = null;

  @JsonProperty("templateText")
  private String templateText = null;

  @JsonProperty("loyaltyProgramId")
  private Integer loyaltyProgramId = null;

  public BookletEmissionViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id.
   * @return id
  **/
  @ApiModelProperty(value = "Id.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BookletEmissionViewModel number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Номер.
   * @return number
  **/
  @ApiModelProperty(value = "Номер.")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public BookletEmissionViewModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Описание.
   * @return description
  **/
  @ApiModelProperty(value = "Описание.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BookletEmissionViewModel count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Количество.
   * @return count
  **/
  @ApiModelProperty(value = "Количество.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public BookletEmissionViewModel prefix(Integer prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Префикс.
   * @return prefix
  **/
  @ApiModelProperty(value = "Префикс.")
  public Integer getPrefix() {
    return prefix;
  }

  public void setPrefix(Integer prefix) {
    this.prefix = prefix;
  }

  public BookletEmissionViewModel state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Состояние.
   * @return state
  **/
  @ApiModelProperty(value = "Состояние.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public BookletEmissionViewModel templateId(Integer templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Id шаблона.
   * @return templateId
  **/
  @ApiModelProperty(value = "Id шаблона.")
  public Integer getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }

  public BookletEmissionViewModel templateText(String templateText) {
    this.templateText = templateText;
    return this;
  }

   /**
   * Текст шаблона.
   * @return templateText
  **/
  @ApiModelProperty(value = "Текст шаблона.")
  public String getTemplateText() {
    return templateText;
  }

  public void setTemplateText(String templateText) {
    this.templateText = templateText;
  }

  public BookletEmissionViewModel loyaltyProgramId(Integer loyaltyProgramId) {
    this.loyaltyProgramId = loyaltyProgramId;
    return this;
  }

   /**
   * Идентификатор программы лояльности.
   * @return loyaltyProgramId
  **/
  @ApiModelProperty(value = "Идентификатор программы лояльности.")
  public Integer getLoyaltyProgramId() {
    return loyaltyProgramId;
  }

  public void setLoyaltyProgramId(Integer loyaltyProgramId) {
    this.loyaltyProgramId = loyaltyProgramId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookletEmissionViewModel bookletEmissionViewModel = (BookletEmissionViewModel) o;
    return Objects.equals(this.id, bookletEmissionViewModel.id) &&
        Objects.equals(this.number, bookletEmissionViewModel.number) &&
        Objects.equals(this.description, bookletEmissionViewModel.description) &&
        Objects.equals(this.count, bookletEmissionViewModel.count) &&
        Objects.equals(this.prefix, bookletEmissionViewModel.prefix) &&
        Objects.equals(this.state, bookletEmissionViewModel.state) &&
        Objects.equals(this.templateId, bookletEmissionViewModel.templateId) &&
        Objects.equals(this.templateText, bookletEmissionViewModel.templateText) &&
        Objects.equals(this.loyaltyProgramId, bookletEmissionViewModel.loyaltyProgramId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, description, count, prefix, state, templateId, templateText, loyaltyProgramId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookletEmissionViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateText: ").append(toIndentedString(templateText)).append("\n");
    sb.append("    loyaltyProgramId: ").append(toIndentedString(loyaltyProgramId)).append("\n");
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

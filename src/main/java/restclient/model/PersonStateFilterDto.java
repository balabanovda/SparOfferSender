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
import java.util.ArrayList;
import java.util.List;

/**
 * Фильтр \&quot;Состояние пользователя\&quot;.
 */
@ApiModel(description = "Фильтр \"Состояние пользователя\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PersonStateFilterDto {
  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets personStates
   */
  public enum PersonStatesEnum {
    NORMAL("Normal"),
    
    REGISTERED("Registered"),
    
    ANONYMOUS("Anonymous"),
    
    DELETED("Deleted"),
    
    DEREGISTERED("Deregistered");

    private String value;

    PersonStatesEnum(String value) {
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
    public static PersonStatesEnum fromValue(String text) {
      for (PersonStatesEnum b : PersonStatesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("personStates")
  private List<PersonStatesEnum> personStates = null;

  public PersonStateFilterDto name(String name) {
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

  public PersonStateFilterDto personStates(List<PersonStatesEnum> personStates) {
    this.personStates = personStates;
    return this;
  }

  public PersonStateFilterDto addPersonStatesItem(PersonStatesEnum personStatesItem) {
    if (this.personStates == null) {
      this.personStates = new ArrayList<>();
    }
    this.personStates.add(personStatesItem);
    return this;
  }

   /**
   * Список состояний пользователя.
   * @return personStates
  **/
  @ApiModelProperty(value = "Список состояний пользователя.")
  public List<PersonStatesEnum> getPersonStates() {
    return personStates;
  }

  public void setPersonStates(List<PersonStatesEnum> personStates) {
    this.personStates = personStates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonStateFilterDto personStateFilterDto = (PersonStateFilterDto) o;
    return Objects.equals(this.name, personStateFilterDto.name) &&
        Objects.equals(this.personStates, personStateFilterDto.personStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, personStates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonStateFilterDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    personStates: ").append(toIndentedString(personStates)).append("\n");
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


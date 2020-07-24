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
import java.util.UUID;

/**
 * Информация о пользователе.
 */
@ApiModel(description = "Информация о пользователе.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class UserInfoBase {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("personUid")
  private UUID personUid = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("patronymicName")
  private String patronymicName = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("email")
  private String email = null;

  public UserInfoBase id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор пользователя.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор пользователя.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserInfoBase personUid(UUID personUid) {
    this.personUid = personUid;
    return this;
  }

   /**
   * Уникальный идентификатор пользователя.
   * @return personUid
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Уникальный идентификатор пользователя.")
  public UUID getPersonUid() {
    return personUid;
  }

  public void setPersonUid(UUID personUid) {
    this.personUid = personUid;
  }

  public UserInfoBase firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Имя.
   * @return firstName
  **/
  @ApiModelProperty(value = "Имя.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserInfoBase lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Фамилия.
   * @return lastName
  **/
  @ApiModelProperty(value = "Фамилия.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserInfoBase patronymicName(String patronymicName) {
    this.patronymicName = patronymicName;
    return this;
  }

   /**
   * Отчество.
   * @return patronymicName
  **/
  @ApiModelProperty(value = "Отчество.")
  public String getPatronymicName() {
    return patronymicName;
  }

  public void setPatronymicName(String patronymicName) {
    this.patronymicName = patronymicName;
  }

  public UserInfoBase phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Номер телефона.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Номер телефона.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UserInfoBase email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email.
   * @return email
  **/
  @ApiModelProperty(value = "Email.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoBase userInfoBase = (UserInfoBase) o;
    return Objects.equals(this.id, userInfoBase.id) &&
        Objects.equals(this.personUid, userInfoBase.personUid) &&
        Objects.equals(this.firstName, userInfoBase.firstName) &&
        Objects.equals(this.lastName, userInfoBase.lastName) &&
        Objects.equals(this.patronymicName, userInfoBase.patronymicName) &&
        Objects.equals(this.phoneNumber, userInfoBase.phoneNumber) &&
        Objects.equals(this.email, userInfoBase.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, personUid, firstName, lastName, patronymicName, phoneNumber, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoBase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    personUid: ").append(toIndentedString(personUid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    patronymicName: ").append(toIndentedString(patronymicName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

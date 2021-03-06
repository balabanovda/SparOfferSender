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
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * PersonInfoModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PersonInfoModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("uid")
  private UUID uid = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("patronomicName")
  private String patronomicName = null;

  @JsonProperty("phone")
  private NotifierInfoModel phone = null;

  @JsonProperty("email")
  private NotifierInfoModel email = null;

  @JsonProperty("registrationDate")
  private OffsetDateTime registrationDate = null;

  @JsonProperty("birthDay")
  private OffsetDateTime birthDay = null;

  @JsonProperty("balance")
  private MoneyViewModel balance = null;

  @JsonProperty("notActivated")
  private MoneyViewModel notActivated = null;

  @JsonProperty("isRequiredActions")
  private Boolean isRequiredActions = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    NORMAL("Normal"),
    
    REGISTERED("Registered"),
    
    ANONYMOUS("Anonymous"),
    
    DELETED("Deleted"),
    
    DEREGISTERED("Deregistered");

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

  @JsonProperty("tenderOfferAcceptDate")
  private OffsetDateTime tenderOfferAcceptDate = null;

  @JsonProperty("personalDataProcessingAcceptDate")
  private OffsetDateTime personalDataProcessingAcceptDate = null;

  @JsonProperty("groupId")
  private Integer groupId = null;

  @JsonProperty("timeZone")
  private Integer timeZone = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("loyaltyProgramName")
  private String loyaltyProgramName = null;

  @JsonProperty("loyaltyProgramId")
  private Integer loyaltyProgramId = null;

  public PersonInfoModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PersonInfoModel uid(UUID uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getUid() {
    return uid;
  }

  public void setUid(UUID uid) {
    this.uid = uid;
  }

  public PersonInfoModel firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonInfoModel lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PersonInfoModel patronomicName(String patronomicName) {
    this.patronomicName = patronomicName;
    return this;
  }

   /**
   * Get patronomicName
   * @return patronomicName
  **/
  @ApiModelProperty(value = "")
  public String getPatronomicName() {
    return patronomicName;
  }

  public void setPatronomicName(String patronomicName) {
    this.patronomicName = patronomicName;
  }

  public PersonInfoModel phone(NotifierInfoModel phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public NotifierInfoModel getPhone() {
    return phone;
  }

  public void setPhone(NotifierInfoModel phone) {
    this.phone = phone;
  }

  public PersonInfoModel email(NotifierInfoModel email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public NotifierInfoModel getEmail() {
    return email;
  }

  public void setEmail(NotifierInfoModel email) {
    this.email = email;
  }

  public PersonInfoModel registrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

   /**
   * Get registrationDate
   * @return registrationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }

  public PersonInfoModel birthDay(OffsetDateTime birthDay) {
    this.birthDay = birthDay;
    return this;
  }

   /**
   * Get birthDay
   * @return birthDay
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(OffsetDateTime birthDay) {
    this.birthDay = birthDay;
  }

  public PersonInfoModel balance(MoneyViewModel balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")
  public MoneyViewModel getBalance() {
    return balance;
  }

  public void setBalance(MoneyViewModel balance) {
    this.balance = balance;
  }

  public PersonInfoModel notActivated(MoneyViewModel notActivated) {
    this.notActivated = notActivated;
    return this;
  }

   /**
   * Get notActivated
   * @return notActivated
  **/
  @ApiModelProperty(value = "")
  public MoneyViewModel getNotActivated() {
    return notActivated;
  }

  public void setNotActivated(MoneyViewModel notActivated) {
    this.notActivated = notActivated;
  }

  public PersonInfoModel isRequiredActions(Boolean isRequiredActions) {
    this.isRequiredActions = isRequiredActions;
    return this;
  }

   /**
   * Get isRequiredActions
   * @return isRequiredActions
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsRequiredActions() {
    return isRequiredActions;
  }

  public void setIsRequiredActions(Boolean isRequiredActions) {
    this.isRequiredActions = isRequiredActions;
  }

  public PersonInfoModel state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public PersonInfoModel tenderOfferAcceptDate(OffsetDateTime tenderOfferAcceptDate) {
    this.tenderOfferAcceptDate = tenderOfferAcceptDate;
    return this;
  }

   /**
   * Get tenderOfferAcceptDate
   * @return tenderOfferAcceptDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTenderOfferAcceptDate() {
    return tenderOfferAcceptDate;
  }

  public void setTenderOfferAcceptDate(OffsetDateTime tenderOfferAcceptDate) {
    this.tenderOfferAcceptDate = tenderOfferAcceptDate;
  }

  public PersonInfoModel personalDataProcessingAcceptDate(OffsetDateTime personalDataProcessingAcceptDate) {
    this.personalDataProcessingAcceptDate = personalDataProcessingAcceptDate;
    return this;
  }

   /**
   * Get personalDataProcessingAcceptDate
   * @return personalDataProcessingAcceptDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPersonalDataProcessingAcceptDate() {
    return personalDataProcessingAcceptDate;
  }

  public void setPersonalDataProcessingAcceptDate(OffsetDateTime personalDataProcessingAcceptDate) {
    this.personalDataProcessingAcceptDate = personalDataProcessingAcceptDate;
  }

  public PersonInfoModel groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(value = "")
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public PersonInfoModel timeZone(Integer timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public Integer getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(Integer timeZone) {
    this.timeZone = timeZone;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public PersonInfoModel creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public PersonInfoModel loyaltyProgramName(String loyaltyProgramName) {
    this.loyaltyProgramName = loyaltyProgramName;
    return this;
  }

   /**
   * Get loyaltyProgramName
   * @return loyaltyProgramName
  **/
  @ApiModelProperty(value = "")
  public String getLoyaltyProgramName() {
    return loyaltyProgramName;
  }

  public void setLoyaltyProgramName(String loyaltyProgramName) {
    this.loyaltyProgramName = loyaltyProgramName;
  }

  public PersonInfoModel loyaltyProgramId(Integer loyaltyProgramId) {
    this.loyaltyProgramId = loyaltyProgramId;
    return this;
  }

   /**
   * Get loyaltyProgramId
   * @return loyaltyProgramId
  **/
  @ApiModelProperty(value = "")
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
    PersonInfoModel personInfoModel = (PersonInfoModel) o;
    return Objects.equals(this.id, personInfoModel.id) &&
        Objects.equals(this.uid, personInfoModel.uid) &&
        Objects.equals(this.firstName, personInfoModel.firstName) &&
        Objects.equals(this.lastName, personInfoModel.lastName) &&
        Objects.equals(this.patronomicName, personInfoModel.patronomicName) &&
        Objects.equals(this.phone, personInfoModel.phone) &&
        Objects.equals(this.email, personInfoModel.email) &&
        Objects.equals(this.registrationDate, personInfoModel.registrationDate) &&
        Objects.equals(this.birthDay, personInfoModel.birthDay) &&
        Objects.equals(this.balance, personInfoModel.balance) &&
        Objects.equals(this.notActivated, personInfoModel.notActivated) &&
        Objects.equals(this.isRequiredActions, personInfoModel.isRequiredActions) &&
        Objects.equals(this.state, personInfoModel.state) &&
        Objects.equals(this.tenderOfferAcceptDate, personInfoModel.tenderOfferAcceptDate) &&
        Objects.equals(this.personalDataProcessingAcceptDate, personInfoModel.personalDataProcessingAcceptDate) &&
        Objects.equals(this.groupId, personInfoModel.groupId) &&
        Objects.equals(this.timeZone, personInfoModel.timeZone) &&
        Objects.equals(this.displayName, personInfoModel.displayName) &&
        Objects.equals(this.creationDate, personInfoModel.creationDate) &&
        Objects.equals(this.loyaltyProgramName, personInfoModel.loyaltyProgramName) &&
        Objects.equals(this.loyaltyProgramId, personInfoModel.loyaltyProgramId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uid, firstName, lastName, patronomicName, phone, email, registrationDate, birthDay, balance, notActivated, isRequiredActions, state, tenderOfferAcceptDate, personalDataProcessingAcceptDate, groupId, timeZone, displayName, creationDate, loyaltyProgramName, loyaltyProgramId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonInfoModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    patronomicName: ").append(toIndentedString(patronomicName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    birthDay: ").append(toIndentedString(birthDay)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    notActivated: ").append(toIndentedString(notActivated)).append("\n");
    sb.append("    isRequiredActions: ").append(toIndentedString(isRequiredActions)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tenderOfferAcceptDate: ").append(toIndentedString(tenderOfferAcceptDate)).append("\n");
    sb.append("    personalDataProcessingAcceptDate: ").append(toIndentedString(personalDataProcessingAcceptDate)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    loyaltyProgramName: ").append(toIndentedString(loyaltyProgramName)).append("\n");
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


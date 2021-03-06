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
import java.util.ArrayList;
import java.util.List;

/**
 * CouponEmissionFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CouponEmissionFilter {
  @JsonProperty("changeDateFrom")
  private OffsetDateTime changeDateFrom = null;

  @JsonProperty("changeDateTo")
  private OffsetDateTime changeDateTo = null;

  /**
   * Gets or Sets types
   */
  public enum TypesEnum {
    PUBLIC("Public"),
    
    PERSON("Person"),
    
    DISTRIBUTED("Distributed");

    private String value;

    TypesEnum(String value) {
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
    public static TypesEnum fromValue(String text) {
      for (TypesEnum b : TypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("types")
  private List<TypesEnum> types = null;

  @JsonProperty("partnerIds")
  private List<Integer> partnerIds = null;

  @JsonProperty("loyaltyProgramIds")
  private List<Integer> loyaltyProgramIds = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ARCHIVED("Archived"),
    
    NONARCHIVED("NonArchived");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("personId")
  private Integer personId = null;

  public CouponEmissionFilter changeDateFrom(OffsetDateTime changeDateFrom) {
    this.changeDateFrom = changeDateFrom;
    return this;
  }

   /**
   * Get changeDateFrom
   * @return changeDateFrom
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getChangeDateFrom() {
    return changeDateFrom;
  }

  public void setChangeDateFrom(OffsetDateTime changeDateFrom) {
    this.changeDateFrom = changeDateFrom;
  }

  public CouponEmissionFilter changeDateTo(OffsetDateTime changeDateTo) {
    this.changeDateTo = changeDateTo;
    return this;
  }

   /**
   * Get changeDateTo
   * @return changeDateTo
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getChangeDateTo() {
    return changeDateTo;
  }

  public void setChangeDateTo(OffsetDateTime changeDateTo) {
    this.changeDateTo = changeDateTo;
  }

  public CouponEmissionFilter types(List<TypesEnum> types) {
    this.types = types;
    return this;
  }

  public CouponEmissionFilter addTypesItem(TypesEnum typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @ApiModelProperty(value = "")
  public List<TypesEnum> getTypes() {
    return types;
  }

  public void setTypes(List<TypesEnum> types) {
    this.types = types;
  }

  public CouponEmissionFilter partnerIds(List<Integer> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  public CouponEmissionFilter addPartnerIdsItem(Integer partnerIdsItem) {
    if (this.partnerIds == null) {
      this.partnerIds = new ArrayList<>();
    }
    this.partnerIds.add(partnerIdsItem);
    return this;
  }

   /**
   * Get partnerIds
   * @return partnerIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getPartnerIds() {
    return partnerIds;
  }

  public void setPartnerIds(List<Integer> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public CouponEmissionFilter loyaltyProgramIds(List<Integer> loyaltyProgramIds) {
    this.loyaltyProgramIds = loyaltyProgramIds;
    return this;
  }

  public CouponEmissionFilter addLoyaltyProgramIdsItem(Integer loyaltyProgramIdsItem) {
    if (this.loyaltyProgramIds == null) {
      this.loyaltyProgramIds = new ArrayList<>();
    }
    this.loyaltyProgramIds.add(loyaltyProgramIdsItem);
    return this;
  }

   /**
   * Get loyaltyProgramIds
   * @return loyaltyProgramIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getLoyaltyProgramIds() {
    return loyaltyProgramIds;
  }

  public void setLoyaltyProgramIds(List<Integer> loyaltyProgramIds) {
    this.loyaltyProgramIds = loyaltyProgramIds;
  }

  public CouponEmissionFilter status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CouponEmissionFilter title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CouponEmissionFilter personId(Integer personId) {
    this.personId = personId;
    return this;
  }

   /**
   * Get personId
   * @return personId
  **/
  @ApiModelProperty(value = "")
  public Integer getPersonId() {
    return personId;
  }

  public void setPersonId(Integer personId) {
    this.personId = personId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponEmissionFilter couponEmissionFilter = (CouponEmissionFilter) o;
    return Objects.equals(this.changeDateFrom, couponEmissionFilter.changeDateFrom) &&
        Objects.equals(this.changeDateTo, couponEmissionFilter.changeDateTo) &&
        Objects.equals(this.types, couponEmissionFilter.types) &&
        Objects.equals(this.partnerIds, couponEmissionFilter.partnerIds) &&
        Objects.equals(this.loyaltyProgramIds, couponEmissionFilter.loyaltyProgramIds) &&
        Objects.equals(this.status, couponEmissionFilter.status) &&
        Objects.equals(this.title, couponEmissionFilter.title) &&
        Objects.equals(this.personId, couponEmissionFilter.personId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeDateFrom, changeDateTo, types, partnerIds, loyaltyProgramIds, status, title, personId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponEmissionFilter {\n");
    
    sb.append("    changeDateFrom: ").append(toIndentedString(changeDateFrom)).append("\n");
    sb.append("    changeDateTo: ").append(toIndentedString(changeDateTo)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    partnerIds: ").append(toIndentedString(partnerIds)).append("\n");
    sb.append("    loyaltyProgramIds: ").append(toIndentedString(loyaltyProgramIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
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


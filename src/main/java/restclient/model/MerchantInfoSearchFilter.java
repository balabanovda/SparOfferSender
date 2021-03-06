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

/**
 * MerchantInfoSearchFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class MerchantInfoSearchFilter {
  @JsonProperty("cityId")
  private Integer cityId = null;

  @JsonProperty("сategoryID")
  private Integer ategoryID = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets archivedShowMode
   */
  public enum ArchivedShowModeEnum {
    ARCHIVED("Archived"),
    
    NONARCHIVED("NonArchived");

    private String value;

    ArchivedShowModeEnum(String value) {
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
    public static ArchivedShowModeEnum fromValue(String text) {
      for (ArchivedShowModeEnum b : ArchivedShowModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("archivedShowMode")
  private ArchivedShowModeEnum archivedShowMode = null;

  public MerchantInfoSearchFilter cityId(Integer cityId) {
    this.cityId = cityId;
    return this;
  }

   /**
   * Get cityId
   * @return cityId
  **/
  @ApiModelProperty(value = "")
  public Integer getCityId() {
    return cityId;
  }

  public void setCityId(Integer cityId) {
    this.cityId = cityId;
  }

  public MerchantInfoSearchFilter ategoryID(Integer ategoryID) {
    this.ategoryID = ategoryID;
    return this;
  }

   /**
   * Get ategoryID
   * @return ategoryID
  **/
  @ApiModelProperty(value = "")
  public Integer getAtegoryID() {
    return ategoryID;
  }

  public void setAtegoryID(Integer ategoryID) {
    this.ategoryID = ategoryID;
  }

  public MerchantInfoSearchFilter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MerchantInfoSearchFilter archivedShowMode(ArchivedShowModeEnum archivedShowMode) {
    this.archivedShowMode = archivedShowMode;
    return this;
  }

   /**
   * Get archivedShowMode
   * @return archivedShowMode
  **/
  @ApiModelProperty(value = "")
  public ArchivedShowModeEnum getArchivedShowMode() {
    return archivedShowMode;
  }

  public void setArchivedShowMode(ArchivedShowModeEnum archivedShowMode) {
    this.archivedShowMode = archivedShowMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantInfoSearchFilter merchantInfoSearchFilter = (MerchantInfoSearchFilter) o;
    return Objects.equals(this.cityId, merchantInfoSearchFilter.cityId) &&
        Objects.equals(this.ategoryID, merchantInfoSearchFilter.ategoryID) &&
        Objects.equals(this.name, merchantInfoSearchFilter.name) &&
        Objects.equals(this.archivedShowMode, merchantInfoSearchFilter.archivedShowMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityId, ategoryID, name, archivedShowMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantInfoSearchFilter {\n");
    
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    ategoryID: ").append(toIndentedString(ategoryID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    archivedShowMode: ").append(toIndentedString(archivedShowMode)).append("\n");
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


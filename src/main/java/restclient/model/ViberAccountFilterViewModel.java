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
 * View модель фильтра \&quot;Привязан viber аккаунт\&quot;.
 */
@ApiModel(description = "View модель фильтра \"Привязан viber аккаунт\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ViberAccountFilterViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isDeletedFilterType")
  private Boolean isDeletedFilterType = null;

  /**
   * Gets or Sets viberStates
   */
  public enum ViberStatesEnum {
    EXIST("Exist"),
    
    NOEXIST("NoExist"),
    
    UNKNOWN("Unknown");

    private String value;

    ViberStatesEnum(String value) {
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
    public static ViberStatesEnum fromValue(String text) {
      for (ViberStatesEnum b : ViberStatesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("viberStates")
  private List<ViberStatesEnum> viberStates = null;

  public ViberAccountFilterViewModel id(Integer id) {
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

  public ViberAccountFilterViewModel name(String name) {
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

  public ViberAccountFilterViewModel isDeletedFilterType(Boolean isDeletedFilterType) {
    this.isDeletedFilterType = isDeletedFilterType;
    return this;
  }

   /**
   * Get isDeletedFilterType
   * @return isDeletedFilterType
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDeletedFilterType() {
    return isDeletedFilterType;
  }

  public void setIsDeletedFilterType(Boolean isDeletedFilterType) {
    this.isDeletedFilterType = isDeletedFilterType;
  }

  public ViberAccountFilterViewModel viberStates(List<ViberStatesEnum> viberStates) {
    this.viberStates = viberStates;
    return this;
  }

  public ViberAccountFilterViewModel addViberStatesItem(ViberStatesEnum viberStatesItem) {
    if (this.viberStates == null) {
      this.viberStates = new ArrayList<>();
    }
    this.viberStates.add(viberStatesItem);
    return this;
  }

   /**
   * Привязан ли viber аккаунт.
   * @return viberStates
  **/
  @ApiModelProperty(value = "Привязан ли viber аккаунт.")
  public List<ViberStatesEnum> getViberStates() {
    return viberStates;
  }

  public void setViberStates(List<ViberStatesEnum> viberStates) {
    this.viberStates = viberStates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViberAccountFilterViewModel viberAccountFilterViewModel = (ViberAccountFilterViewModel) o;
    return Objects.equals(this.id, viberAccountFilterViewModel.id) &&
        Objects.equals(this.name, viberAccountFilterViewModel.name) &&
        Objects.equals(this.isDeletedFilterType, viberAccountFilterViewModel.isDeletedFilterType) &&
        Objects.equals(this.viberStates, viberAccountFilterViewModel.viberStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isDeletedFilterType, viberStates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViberAccountFilterViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeletedFilterType: ").append(toIndentedString(isDeletedFilterType)).append("\n");
    sb.append("    viberStates: ").append(toIndentedString(viberStates)).append("\n");
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


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
import java.util.ArrayList;
import java.util.List;

/**
 * Модель роли.
 */
@ApiModel(description = "Модель роли.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class RoleModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("logicalName")
  private String logicalName = null;

  @JsonProperty("permissions")
  private List<String> permissions = null;

  public RoleModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор роли.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор роли.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RoleModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название роли.
   * @return name
  **/
  @ApiModelProperty(value = "Название роли.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleModel logicalName(String logicalName) {
    this.logicalName = logicalName;
    return this;
  }

   /**
   * Логическое название роли.
   * @return logicalName
  **/
  @ApiModelProperty(value = "Логическое название роли.")
  public String getLogicalName() {
    return logicalName;
  }

  public void setLogicalName(String logicalName) {
    this.logicalName = logicalName;
  }

  public RoleModel permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public RoleModel addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Набор прав доступа, доступных участнику с данной ролью.
   * @return permissions
  **/
  @ApiModelProperty(value = "Набор прав доступа, доступных участнику с данной ролью.")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleModel roleModel = (RoleModel) o;
    return Objects.equals(this.id, roleModel.id) &&
        Objects.equals(this.name, roleModel.name) &&
        Objects.equals(this.logicalName, roleModel.logicalName) &&
        Objects.equals(this.permissions, roleModel.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, logicalName, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logicalName: ").append(toIndentedString(logicalName)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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


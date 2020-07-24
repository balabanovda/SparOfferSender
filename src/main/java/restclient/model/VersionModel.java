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
 * Модель версии.
 */
@ApiModel(description = "Модель версии.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class VersionModel {
  @JsonProperty("major")
  private Integer major = null;

  @JsonProperty("minor")
  private Integer minor = null;

  @JsonProperty("build")
  private Integer build = null;

  @JsonProperty("revision")
  private Integer revision = null;

  public VersionModel major(Integer major) {
    this.major = major;
    return this;
  }

   /**
   * Мажорная версия.
   * @return major
  **/
  @ApiModelProperty(value = "Мажорная версия.")
  public Integer getMajor() {
    return major;
  }

  public void setMajor(Integer major) {
    this.major = major;
  }

  public VersionModel minor(Integer minor) {
    this.minor = minor;
    return this;
  }

   /**
   * Минорная версия.
   * @return minor
  **/
  @ApiModelProperty(value = "Минорная версия.")
  public Integer getMinor() {
    return minor;
  }

  public void setMinor(Integer minor) {
    this.minor = minor;
  }

  public VersionModel build(Integer build) {
    this.build = build;
    return this;
  }

   /**
   * Билд.
   * @return build
  **/
  @ApiModelProperty(value = "Билд.")
  public Integer getBuild() {
    return build;
  }

  public void setBuild(Integer build) {
    this.build = build;
  }

  public VersionModel revision(Integer revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Ревизия.
   * @return revision
  **/
  @ApiModelProperty(value = "Ревизия.")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionModel versionModel = (VersionModel) o;
    return Objects.equals(this.major, versionModel.major) &&
        Objects.equals(this.minor, versionModel.minor) &&
        Objects.equals(this.build, versionModel.build) &&
        Objects.equals(this.revision, versionModel.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(major, minor, build, revision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionModel {\n");
    
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

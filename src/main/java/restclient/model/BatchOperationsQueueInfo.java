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
import io.swagger.annotations.ApiModelProperty;

/**
 * BatchOperationsQueueInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class BatchOperationsQueueInfo {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("hasElements")
  private Boolean hasElements = null;

  @JsonProperty("allOperationCount")
  private Integer allOperationCount = null;

  @JsonProperty("completedOperationCount")
  private Integer completedOperationCount = null;

  @JsonProperty("errorOperationCount")
  private Integer errorOperationCount = null;

  public BatchOperationsQueueInfo id(Integer id) {
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

  public BatchOperationsQueueInfo hasElements(Boolean hasElements) {
    this.hasElements = hasElements;
    return this;
  }

   /**
   * Get hasElements
   * @return hasElements
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasElements() {
    return hasElements;
  }

  public void setHasElements(Boolean hasElements) {
    this.hasElements = hasElements;
  }

  public BatchOperationsQueueInfo allOperationCount(Integer allOperationCount) {
    this.allOperationCount = allOperationCount;
    return this;
  }

   /**
   * Get allOperationCount
   * @return allOperationCount
  **/
  @ApiModelProperty(value = "")
  public Integer getAllOperationCount() {
    return allOperationCount;
  }

  public void setAllOperationCount(Integer allOperationCount) {
    this.allOperationCount = allOperationCount;
  }

  public BatchOperationsQueueInfo completedOperationCount(Integer completedOperationCount) {
    this.completedOperationCount = completedOperationCount;
    return this;
  }

   /**
   * Get completedOperationCount
   * @return completedOperationCount
  **/
  @ApiModelProperty(value = "")
  public Integer getCompletedOperationCount() {
    return completedOperationCount;
  }

  public void setCompletedOperationCount(Integer completedOperationCount) {
    this.completedOperationCount = completedOperationCount;
  }

  public BatchOperationsQueueInfo errorOperationCount(Integer errorOperationCount) {
    this.errorOperationCount = errorOperationCount;
    return this;
  }

   /**
   * Get errorOperationCount
   * @return errorOperationCount
  **/
  @ApiModelProperty(value = "")
  public Integer getErrorOperationCount() {
    return errorOperationCount;
  }

  public void setErrorOperationCount(Integer errorOperationCount) {
    this.errorOperationCount = errorOperationCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchOperationsQueueInfo batchOperationsQueueInfo = (BatchOperationsQueueInfo) o;
    return Objects.equals(this.id, batchOperationsQueueInfo.id) &&
        Objects.equals(this.hasElements, batchOperationsQueueInfo.hasElements) &&
        Objects.equals(this.allOperationCount, batchOperationsQueueInfo.allOperationCount) &&
        Objects.equals(this.completedOperationCount, batchOperationsQueueInfo.completedOperationCount) &&
        Objects.equals(this.errorOperationCount, batchOperationsQueueInfo.errorOperationCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hasElements, allOperationCount, completedOperationCount, errorOperationCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchOperationsQueueInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hasElements: ").append(toIndentedString(hasElements)).append("\n");
    sb.append("    allOperationCount: ").append(toIndentedString(allOperationCount)).append("\n");
    sb.append("    completedOperationCount: ").append(toIndentedString(completedOperationCount)).append("\n");
    sb.append("    errorOperationCount: ").append(toIndentedString(errorOperationCount)).append("\n");
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

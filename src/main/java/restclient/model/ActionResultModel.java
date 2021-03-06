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
import java.util.UUID;

/**
 * Фильтр для списка счетов кассы.
 */
@ApiModel(description = "Фильтр для списка счетов кассы.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ActionResultModel {
  @JsonProperty("position")
  private PositionModel position = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("resultUid")
  private UUID resultUid = null;

  @JsonProperty("metavariables")
  private List<MetavariableModel> metavariables = null;

  public ActionResultModel position(PositionModel position) {
    this.position = position;
    return this;
  }

   /**
   * Позиция или её часть, если это чек.
   * @return position
  **/
  @ApiModelProperty(value = "Позиция или её часть, если это чек.")
  public PositionModel getPosition() {
    return position;
  }

  public void setPosition(PositionModel position) {
    this.position = position;
  }

  public ActionResultModel value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Результат действия.
   * @return value
  **/
  @ApiModelProperty(value = "Результат действия.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ActionResultModel resultUid(UUID resultUid) {
    this.resultUid = resultUid;
    return this;
  }

   /**
   * Идентификатор результат.
   * @return resultUid
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Идентификатор результат.")
  public UUID getResultUid() {
    return resultUid;
  }

  public void setResultUid(UUID resultUid) {
    this.resultUid = resultUid;
  }

  public ActionResultModel metavariables(List<MetavariableModel> metavariables) {
    this.metavariables = metavariables;
    return this;
  }

  public ActionResultModel addMetavariablesItem(MetavariableModel metavariablesItem) {
    if (this.metavariables == null) {
      this.metavariables = new ArrayList<>();
    }
    this.metavariables.add(metavariablesItem);
    return this;
  }

   /**
   * Метапеременные результата.
   * @return metavariables
  **/
  @ApiModelProperty(value = "Метапеременные результата.")
  public List<MetavariableModel> getMetavariables() {
    return metavariables;
  }

  public void setMetavariables(List<MetavariableModel> metavariables) {
    this.metavariables = metavariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionResultModel actionResultModel = (ActionResultModel) o;
    return Objects.equals(this.position, actionResultModel.position) &&
        Objects.equals(this.value, actionResultModel.value) &&
        Objects.equals(this.resultUid, actionResultModel.resultUid) &&
        Objects.equals(this.metavariables, actionResultModel.metavariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, value, resultUid, metavariables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionResultModel {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    resultUid: ").append(toIndentedString(resultUid)).append("\n");
    sb.append("    metavariables: ").append(toIndentedString(metavariables)).append("\n");
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


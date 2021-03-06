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
 * Модель результата с данными.
 */
@ApiModel(description = "Модель результата с данными.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ResultModelOfListOfAccountViewModel {
  @JsonProperty("result")
  private Result result = null;

  @JsonProperty("data")
  private List<AccountViewModel> data = null;

  public ResultModelOfListOfAccountViewModel result(Result result) {
    this.result = result;
    return this;
  }

   /**
   * Состояние результата.
   * @return result
  **/
  @ApiModelProperty(value = "Состояние результата.")
  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

  public ResultModelOfListOfAccountViewModel data(List<AccountViewModel> data) {
    this.data = data;
    return this;
  }

  public ResultModelOfListOfAccountViewModel addDataItem(AccountViewModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Данные.
   * @return data
  **/
  @ApiModelProperty(value = "Данные.")
  public List<AccountViewModel> getData() {
    return data;
  }

  public void setData(List<AccountViewModel> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultModelOfListOfAccountViewModel resultModelOfListOfAccountViewModel = (ResultModelOfListOfAccountViewModel) o;
    return Objects.equals(this.result, resultModelOfListOfAccountViewModel.result) &&
        Objects.equals(this.data, resultModelOfListOfAccountViewModel.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultModelOfListOfAccountViewModel {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


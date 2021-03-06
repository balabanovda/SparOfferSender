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
public class ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel {
  @JsonProperty("result")
  private Result result = null;

  @JsonProperty("data")
  private List<CommunicationOfferCategoryViewModel> data = null;

  public ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel result(Result result) {
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

  public ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel data(List<CommunicationOfferCategoryViewModel> data) {
    this.data = data;
    return this;
  }

  public ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel addDataItem(CommunicationOfferCategoryViewModel dataItem) {
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
  public List<CommunicationOfferCategoryViewModel> getData() {
    return data;
  }

  public void setData(List<CommunicationOfferCategoryViewModel> data) {
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
    ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel resultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel = (ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel) o;
    return Objects.equals(this.result, resultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel.result) &&
        Objects.equals(this.data, resultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel {\n");
    
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


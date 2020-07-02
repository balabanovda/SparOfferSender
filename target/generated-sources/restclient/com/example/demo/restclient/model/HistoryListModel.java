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


package com.example.demo.restclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.example.demo.restclient.model.HistoryItemModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ViewModel списка исторических записей.
 */
@ApiModel(description = "ViewModel списка исторических записей.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class HistoryListModel {
  @JsonProperty("allCount")
  private Integer allCount = null;

  @JsonProperty("rows")
  private List<HistoryItemModel> rows = null;

  public HistoryListModel allCount(Integer allCount) {
    this.allCount = allCount;
    return this;
  }

   /**
   * Всего записей.
   * @return allCount
  **/
  @ApiModelProperty(value = "Всего записей.")
  public Integer getAllCount() {
    return allCount;
  }

  public void setAllCount(Integer allCount) {
    this.allCount = allCount;
  }

  public HistoryListModel rows(List<HistoryItemModel> rows) {
    this.rows = rows;
    return this;
  }

  public HistoryListModel addRowsItem(HistoryItemModel rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Строки.
   * @return rows
  **/
  @ApiModelProperty(value = "Строки.")
  public List<HistoryItemModel> getRows() {
    return rows;
  }

  public void setRows(List<HistoryItemModel> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryListModel historyListModel = (HistoryListModel) o;
    return Objects.equals(this.allCount, historyListModel.allCount) &&
        Objects.equals(this.rows, historyListModel.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allCount, rows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryListModel {\n");
    
    sb.append("    allCount: ").append(toIndentedString(allCount)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

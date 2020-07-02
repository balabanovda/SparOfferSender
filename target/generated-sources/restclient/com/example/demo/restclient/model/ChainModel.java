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
import com.example.demo.restclient.model.ActionModel;
import com.example.demo.restclient.model.FilterModel;
import com.example.demo.restclient.model.PositionModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Фильтр для списка счетов кассы.
 */
@ApiModel(description = "Фильтр для списка счетов кассы.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class ChainModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("break")
  private Boolean _break = null;

  @JsonProperty("positions")
  private List<PositionModel> positions = null;

  @JsonProperty("filters")
  private List<FilterModel> filters = null;

  @JsonProperty("actions")
  private List<ActionModel> actions = null;

  public ChainModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ChainModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Наименование.
   * @return name
  **/
  @ApiModelProperty(value = "Наименование.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChainModel _break(Boolean _break) {
    this._break = _break;
    return this;
  }

   /**
   * Не выполнено, так как контекст пуст, или ещё чего.
   * @return _break
  **/
  @ApiModelProperty(value = "Не выполнено, так как контекст пуст, или ещё чего.")
  public Boolean isBreak() {
    return _break;
  }

  public void setBreak(Boolean _break) {
    this._break = _break;
  }

  public ChainModel positions(List<PositionModel> positions) {
    this.positions = positions;
    return this;
  }

  public ChainModel addPositionsItem(PositionModel positionsItem) {
    if (this.positions == null) {
      this.positions = new ArrayList<>();
    }
    this.positions.add(positionsItem);
    return this;
  }

   /**
   * Пришедшие позиции.
   * @return positions
  **/
  @ApiModelProperty(value = "Пришедшие позиции.")
  public List<PositionModel> getPositions() {
    return positions;
  }

  public void setPositions(List<PositionModel> positions) {
    this.positions = positions;
  }

  public ChainModel filters(List<FilterModel> filters) {
    this.filters = filters;
    return this;
  }

  public ChainModel addFiltersItem(FilterModel filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Фильтры.
   * @return filters
  **/
  @ApiModelProperty(value = "Фильтры.")
  public List<FilterModel> getFilters() {
    return filters;
  }

  public void setFilters(List<FilterModel> filters) {
    this.filters = filters;
  }

  public ChainModel actions(List<ActionModel> actions) {
    this.actions = actions;
    return this;
  }

  public ChainModel addActionsItem(ActionModel actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Список действий.
   * @return actions
  **/
  @ApiModelProperty(value = "Список действий.")
  public List<ActionModel> getActions() {
    return actions;
  }

  public void setActions(List<ActionModel> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainModel chainModel = (ChainModel) o;
    return Objects.equals(this.id, chainModel.id) &&
        Objects.equals(this.name, chainModel.name) &&
        Objects.equals(this._break, chainModel._break) &&
        Objects.equals(this.positions, chainModel.positions) &&
        Objects.equals(this.filters, chainModel.filters) &&
        Objects.equals(this.actions, chainModel.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, _break, positions, filters, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _break: ").append(toIndentedString(_break)).append("\n");
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

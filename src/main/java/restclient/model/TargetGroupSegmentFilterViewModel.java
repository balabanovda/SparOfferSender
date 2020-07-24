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

/**
 * View модель набора фильтров сегмента ЦА.
 */
@ApiModel(description = "View модель набора фильтров сегмента ЦА.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class TargetGroupSegmentFilterViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isArchived")
  private Boolean isArchived = null;

  /**
   * Тип сегментации по фильтру.
   */
  public enum TypeEnum {
    EXCLUSIVE("Exclusive"),
    
    INCLUSIVE("Inclusive");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("filter")
  private FilterViewModel filter = null;

  @JsonProperty("calculationInfo")
  private CalculationModel calculationInfo = null;

  public TargetGroupSegmentFilterViewModel id(Integer id) {
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

  public TargetGroupSegmentFilterViewModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название.
   * @return name
  **/
  @ApiModelProperty(value = "Название.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TargetGroupSegmentFilterViewModel isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Признак архивного фильтра.
   * @return isArchived
  **/
  @ApiModelProperty(value = "Признак архивного фильтра.")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public TargetGroupSegmentFilterViewModel type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Тип сегментации по фильтру.
   * @return type
  **/
  @ApiModelProperty(value = "Тип сегментации по фильтру.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TargetGroupSegmentFilterViewModel filter(FilterViewModel filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Фильтр.
   * @return filter
  **/
  @ApiModelProperty(value = "Фильтр.")
  public FilterViewModel getFilter() {
    return filter;
  }

  public void setFilter(FilterViewModel filter) {
    this.filter = filter;
  }

  public TargetGroupSegmentFilterViewModel calculationInfo(CalculationModel calculationInfo) {
    this.calculationInfo = calculationInfo;
    return this;
  }

   /**
   * Информация о расчете.
   * @return calculationInfo
  **/
  @ApiModelProperty(value = "Информация о расчете.")
  public CalculationModel getCalculationInfo() {
    return calculationInfo;
  }

  public void setCalculationInfo(CalculationModel calculationInfo) {
    this.calculationInfo = calculationInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetGroupSegmentFilterViewModel targetGroupSegmentFilterViewModel = (TargetGroupSegmentFilterViewModel) o;
    return Objects.equals(this.id, targetGroupSegmentFilterViewModel.id) &&
        Objects.equals(this.name, targetGroupSegmentFilterViewModel.name) &&
        Objects.equals(this.isArchived, targetGroupSegmentFilterViewModel.isArchived) &&
        Objects.equals(this.type, targetGroupSegmentFilterViewModel.type) &&
        Objects.equals(this.filter, targetGroupSegmentFilterViewModel.filter) &&
        Objects.equals(this.calculationInfo, targetGroupSegmentFilterViewModel.calculationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isArchived, type, filter, calculationInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetGroupSegmentFilterViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    calculationInfo: ").append(toIndentedString(calculationInfo)).append("\n");
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

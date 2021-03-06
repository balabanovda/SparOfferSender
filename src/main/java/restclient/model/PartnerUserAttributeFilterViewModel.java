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
 * Фильтр по партнерскому атрибуту пользователя.
 */
@ApiModel(description = "Фильтр по партнерскому атрибуту пользователя.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PartnerUserAttributeFilterViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isDeletedFilterType")
  private Boolean isDeletedFilterType = null;

  @JsonProperty("partnerUserAttributeId")
  private Integer partnerUserAttributeId = null;

  /**
   * Операция сравнения.
   */
  public enum OperationEnum {
    MORE("More"),
    
    LESS("Less"),
    
    EQUALS("Equals"),
    
    BETWEEN("Between"),
    
    MOREOREQUAL("MoreOrEqual"),
    
    LESSOREQUAL("LessOrEqual"),
    
    BETWEENLESSEQUAL("BetweenLessEqual"),
    
    BETWEENMOREEQUAL("BetweenMoreEqual"),
    
    BETWEENEQUAL("BetweenEqual"),
    
    EACH("Each");

    private String value;

    OperationEnum(String value) {
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
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation = null;

  @JsonProperty("firstValue")
  private Object firstValue = null;

  @JsonProperty("secondValue")
  private Object secondValue = null;

  @JsonProperty("stringValue")
  private String stringValue = null;

  @JsonProperty("radioStringItems")
  private List<String> radioStringItems = null;

  @JsonProperty("boolValue")
  private Boolean boolValue = null;

  /**
   * Тип атрибута.
   */
  public enum AttributeTypeEnum {
    DOUBLE("Double"),
    
    STRING("String"),
    
    BOOL("Bool"),
    
    RADIOSTRING("RadioString"),
    
    INTEGER("Integer"),
    
    DATE("Date");

    private String value;

    AttributeTypeEnum(String value) {
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
    public static AttributeTypeEnum fromValue(String text) {
      for (AttributeTypeEnum b : AttributeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("attributeType")
  private AttributeTypeEnum attributeType = null;

  public PartnerUserAttributeFilterViewModel id(Integer id) {
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

  public PartnerUserAttributeFilterViewModel name(String name) {
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

  public PartnerUserAttributeFilterViewModel isDeletedFilterType(Boolean isDeletedFilterType) {
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

  public PartnerUserAttributeFilterViewModel partnerUserAttributeId(Integer partnerUserAttributeId) {
    this.partnerUserAttributeId = partnerUserAttributeId;
    return this;
  }

   /**
   * Идентификатор атрибута.
   * @return partnerUserAttributeId
  **/
  @ApiModelProperty(value = "Идентификатор атрибута.")
  public Integer getPartnerUserAttributeId() {
    return partnerUserAttributeId;
  }

  public void setPartnerUserAttributeId(Integer partnerUserAttributeId) {
    this.partnerUserAttributeId = partnerUserAttributeId;
  }

  public PartnerUserAttributeFilterViewModel operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Операция сравнения.
   * @return operation
  **/
  @ApiModelProperty(value = "Операция сравнения.")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public PartnerUserAttributeFilterViewModel firstValue(Object firstValue) {
    this.firstValue = firstValue;
    return this;
  }

   /**
   * Первое числовое значение.
   * @return firstValue
  **/
  @ApiModelProperty(value = "Первое числовое значение.")
  public Object getFirstValue() {
    return firstValue;
  }

  public void setFirstValue(Object firstValue) {
    this.firstValue = firstValue;
  }

  public PartnerUserAttributeFilterViewModel secondValue(Object secondValue) {
    this.secondValue = secondValue;
    return this;
  }

   /**
   * Второе числовое значение.
   * @return secondValue
  **/
  @ApiModelProperty(value = "Второе числовое значение.")
  public Object getSecondValue() {
    return secondValue;
  }

  public void setSecondValue(Object secondValue) {
    this.secondValue = secondValue;
  }

  public PartnerUserAttributeFilterViewModel stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

   /**
   * Строковое значение.
   * @return stringValue
  **/
  @ApiModelProperty(value = "Строковое значение.")
  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  public PartnerUserAttributeFilterViewModel radioStringItems(List<String> radioStringItems) {
    this.radioStringItems = radioStringItems;
    return this;
  }

  public PartnerUserAttributeFilterViewModel addRadioStringItemsItem(String radioStringItemsItem) {
    if (this.radioStringItems == null) {
      this.radioStringItems = new ArrayList<>();
    }
    this.radioStringItems.add(radioStringItemsItem);
    return this;
  }

   /**
   * Массив выбранных элементов (для атрибута типа RadioString).
   * @return radioStringItems
  **/
  @ApiModelProperty(value = "Массив выбранных элементов (для атрибута типа RadioString).")
  public List<String> getRadioStringItems() {
    return radioStringItems;
  }

  public void setRadioStringItems(List<String> radioStringItems) {
    this.radioStringItems = radioStringItems;
  }

  public PartnerUserAttributeFilterViewModel boolValue(Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

   /**
   * Булевое значение.
   * @return boolValue
  **/
  @ApiModelProperty(value = "Булевое значение.")
  public Boolean isBoolValue() {
    return boolValue;
  }

  public void setBoolValue(Boolean boolValue) {
    this.boolValue = boolValue;
  }

  public PartnerUserAttributeFilterViewModel attributeType(AttributeTypeEnum attributeType) {
    this.attributeType = attributeType;
    return this;
  }

   /**
   * Тип атрибута.
   * @return attributeType
  **/
  @ApiModelProperty(value = "Тип атрибута.")
  public AttributeTypeEnum getAttributeType() {
    return attributeType;
  }

  public void setAttributeType(AttributeTypeEnum attributeType) {
    this.attributeType = attributeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerUserAttributeFilterViewModel partnerUserAttributeFilterViewModel = (PartnerUserAttributeFilterViewModel) o;
    return Objects.equals(this.id, partnerUserAttributeFilterViewModel.id) &&
        Objects.equals(this.name, partnerUserAttributeFilterViewModel.name) &&
        Objects.equals(this.isDeletedFilterType, partnerUserAttributeFilterViewModel.isDeletedFilterType) &&
        Objects.equals(this.partnerUserAttributeId, partnerUserAttributeFilterViewModel.partnerUserAttributeId) &&
        Objects.equals(this.operation, partnerUserAttributeFilterViewModel.operation) &&
        Objects.equals(this.firstValue, partnerUserAttributeFilterViewModel.firstValue) &&
        Objects.equals(this.secondValue, partnerUserAttributeFilterViewModel.secondValue) &&
        Objects.equals(this.stringValue, partnerUserAttributeFilterViewModel.stringValue) &&
        Objects.equals(this.radioStringItems, partnerUserAttributeFilterViewModel.radioStringItems) &&
        Objects.equals(this.boolValue, partnerUserAttributeFilterViewModel.boolValue) &&
        Objects.equals(this.attributeType, partnerUserAttributeFilterViewModel.attributeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isDeletedFilterType, partnerUserAttributeId, operation, firstValue, secondValue, stringValue, radioStringItems, boolValue, attributeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerUserAttributeFilterViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeletedFilterType: ").append(toIndentedString(isDeletedFilterType)).append("\n");
    sb.append("    partnerUserAttributeId: ").append(toIndentedString(partnerUserAttributeId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    firstValue: ").append(toIndentedString(firstValue)).append("\n");
    sb.append("    secondValue: ").append(toIndentedString(secondValue)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    radioStringItems: ").append(toIndentedString(radioStringItems)).append("\n");
    sb.append("    boolValue: ").append(toIndentedString(boolValue)).append("\n");
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
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


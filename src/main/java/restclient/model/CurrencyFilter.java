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
 * Фильтр для валют.
 */
@ApiModel(description = "Фильтр для валют.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CurrencyFilter {
  @JsonProperty("from")
  private Integer from = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Тип валюты.
   */
  public enum TypeEnum {
    VIRTUAL("Virtual"),
    
    CASH("Cash");

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

  /**
   * Режим выбора архивных объектов.
   */
  public enum ModeEnum {
    ARCHIVED("Archived"),
    
    NONARCHIVED("NonArchived");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mode")
  private ModeEnum mode = null;

  @JsonProperty("partnerIds")
  private List<Integer> partnerIds = null;

  @JsonProperty("defaultFirst")
  private Boolean defaultFirst = null;

  @JsonProperty("sortingIds")
  private List<Integer> sortingIds = null;

  @JsonProperty("externalId")
  private String externalId = null;

  public CurrencyFilter from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * Начало выборки.
   * @return from
  **/
  @ApiModelProperty(value = "Начало выборки.")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public CurrencyFilter count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Количество.
   * @return count
  **/
  @ApiModelProperty(value = "Количество.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CurrencyFilter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Подстрока для поиска по имени.
   * @return name
  **/
  @ApiModelProperty(value = "Подстрока для поиска по имени.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CurrencyFilter type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Тип валюты.
   * @return type
  **/
  @ApiModelProperty(value = "Тип валюты.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CurrencyFilter mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Режим выбора архивных объектов.
   * @return mode
  **/
  @ApiModelProperty(value = "Режим выбора архивных объектов.")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public CurrencyFilter partnerIds(List<Integer> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  public CurrencyFilter addPartnerIdsItem(Integer partnerIdsItem) {
    if (this.partnerIds == null) {
      this.partnerIds = new ArrayList<>();
    }
    this.partnerIds.add(partnerIdsItem);
    return this;
  }

   /**
   * Список партнеров, по которым будут отфильтрованны валюты.
   * @return partnerIds
  **/
  @ApiModelProperty(value = "Список партнеров, по которым будут отфильтрованны валюты.")
  public List<Integer> getPartnerIds() {
    return partnerIds;
  }

  public void setPartnerIds(List<Integer> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public CurrencyFilter defaultFirst(Boolean defaultFirst) {
    this.defaultFirst = defaultFirst;
    return this;
  }

   /**
   * Признак, что первой в списке будет возвращаться валюта по умолчанию.
   * @return defaultFirst
  **/
  @ApiModelProperty(value = "Признак, что первой в списке будет возвращаться валюта по умолчанию.")
  public Boolean isDefaultFirst() {
    return defaultFirst;
  }

  public void setDefaultFirst(Boolean defaultFirst) {
    this.defaultFirst = defaultFirst;
  }

  public CurrencyFilter sortingIds(List<Integer> sortingIds) {
    this.sortingIds = sortingIds;
    return this;
  }

  public CurrencyFilter addSortingIdsItem(Integer sortingIdsItem) {
    if (this.sortingIds == null) {
      this.sortingIds = new ArrayList<>();
    }
    this.sortingIds.add(sortingIdsItem);
    return this;
  }

   /**
   * Список идентификаторов для первоочередного выбора.
   * @return sortingIds
  **/
  @ApiModelProperty(value = "Список идентификаторов для первоочередного выбора.")
  public List<Integer> getSortingIds() {
    return sortingIds;
  }

  public void setSortingIds(List<Integer> sortingIds) {
    this.sortingIds = sortingIds;
  }

  public CurrencyFilter externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Внешний идентификатор валюты.
   * @return externalId
  **/
  @ApiModelProperty(value = "Внешний идентификатор валюты.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyFilter currencyFilter = (CurrencyFilter) o;
    return Objects.equals(this.from, currencyFilter.from) &&
        Objects.equals(this.count, currencyFilter.count) &&
        Objects.equals(this.name, currencyFilter.name) &&
        Objects.equals(this.type, currencyFilter.type) &&
        Objects.equals(this.mode, currencyFilter.mode) &&
        Objects.equals(this.partnerIds, currencyFilter.partnerIds) &&
        Objects.equals(this.defaultFirst, currencyFilter.defaultFirst) &&
        Objects.equals(this.sortingIds, currencyFilter.sortingIds) &&
        Objects.equals(this.externalId, currencyFilter.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, count, name, type, mode, partnerIds, defaultFirst, sortingIds, externalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyFilter {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    partnerIds: ").append(toIndentedString(partnerIds)).append("\n");
    sb.append("    defaultFirst: ").append(toIndentedString(defaultFirst)).append("\n");
    sb.append("    sortingIds: ").append(toIndentedString(sortingIds)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

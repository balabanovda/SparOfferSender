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
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * GoodsGroupSearchFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class GoodsGroupSearchFilter {
  @JsonProperty("dateFrom")
  private OffsetDateTime dateFrom = null;

  @JsonProperty("dateTo")
  private OffsetDateTime dateTo = null;

  @JsonProperty("creatorIds")
  private List<Integer> creatorIds = null;

  @JsonProperty("partnerIds")
  private List<Integer> partnerIds = null;

  /**
   * Gets or Sets archivedShowMode
   */
  public enum ArchivedShowModeEnum {
    ARCHIVED("Archived"),
    
    NONARCHIVED("NonArchived");

    private String value;

    ArchivedShowModeEnum(String value) {
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
    public static ArchivedShowModeEnum fromValue(String text) {
      for (ArchivedShowModeEnum b : ArchivedShowModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("archivedShowMode")
  private ArchivedShowModeEnum archivedShowMode = null;

  @JsonProperty("name")
  private String name = null;

  public GoodsGroupSearchFilter dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Get dateFrom
   * @return dateFrom
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GoodsGroupSearchFilter dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Get dateTo
   * @return dateTo
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }

  public GoodsGroupSearchFilter creatorIds(List<Integer> creatorIds) {
    this.creatorIds = creatorIds;
    return this;
  }

  public GoodsGroupSearchFilter addCreatorIdsItem(Integer creatorIdsItem) {
    if (this.creatorIds == null) {
      this.creatorIds = new ArrayList<>();
    }
    this.creatorIds.add(creatorIdsItem);
    return this;
  }

   /**
   * Get creatorIds
   * @return creatorIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getCreatorIds() {
    return creatorIds;
  }

  public void setCreatorIds(List<Integer> creatorIds) {
    this.creatorIds = creatorIds;
  }

  public GoodsGroupSearchFilter partnerIds(List<Integer> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  public GoodsGroupSearchFilter addPartnerIdsItem(Integer partnerIdsItem) {
    if (this.partnerIds == null) {
      this.partnerIds = new ArrayList<>();
    }
    this.partnerIds.add(partnerIdsItem);
    return this;
  }

   /**
   * Get partnerIds
   * @return partnerIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getPartnerIds() {
    return partnerIds;
  }

  public void setPartnerIds(List<Integer> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public GoodsGroupSearchFilter archivedShowMode(ArchivedShowModeEnum archivedShowMode) {
    this.archivedShowMode = archivedShowMode;
    return this;
  }

   /**
   * Get archivedShowMode
   * @return archivedShowMode
  **/
  @ApiModelProperty(value = "")
  public ArchivedShowModeEnum getArchivedShowMode() {
    return archivedShowMode;
  }

  public void setArchivedShowMode(ArchivedShowModeEnum archivedShowMode) {
    this.archivedShowMode = archivedShowMode;
  }

  public GoodsGroupSearchFilter name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsGroupSearchFilter goodsGroupSearchFilter = (GoodsGroupSearchFilter) o;
    return Objects.equals(this.dateFrom, goodsGroupSearchFilter.dateFrom) &&
        Objects.equals(this.dateTo, goodsGroupSearchFilter.dateTo) &&
        Objects.equals(this.creatorIds, goodsGroupSearchFilter.creatorIds) &&
        Objects.equals(this.partnerIds, goodsGroupSearchFilter.partnerIds) &&
        Objects.equals(this.archivedShowMode, goodsGroupSearchFilter.archivedShowMode) &&
        Objects.equals(this.name, goodsGroupSearchFilter.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, creatorIds, partnerIds, archivedShowMode, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsGroupSearchFilter {\n");
    
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    creatorIds: ").append(toIndentedString(creatorIds)).append("\n");
    sb.append("    partnerIds: ").append(toIndentedString(partnerIds)).append("\n");
    sb.append("    archivedShowMode: ").append(toIndentedString(archivedShowMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


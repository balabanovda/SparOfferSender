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
import java.time.OffsetDateTime;

/**
 * Фильтр для получения рекламы.
 */
@ApiModel(description = "Фильтр для получения рекламы.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class AnnouncementFilter {
  @JsonProperty("titleSubstr")
  private String titleSubstr = null;

  @JsonProperty("spaceName")
  private String spaceName = null;

  /**
   * Gets or sets the state.
   */
  public enum StateEnum {
    DRAFT("Draft"),
    
    READY("Ready"),
    
    PUBLISHED("Published");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("dateFrom")
  private OffsetDateTime dateFrom = null;

  @JsonProperty("dateTo")
  private OffsetDateTime dateTo = null;

  /**
   * Сущности из архива.
   */
  public enum ArchivedStateEnum {
    ARCHIVED("Archived"),
    
    NONARCHIVED("NonArchived");

    private String value;

    ArchivedStateEnum(String value) {
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
    public static ArchivedStateEnum fromValue(String text) {
      for (ArchivedStateEnum b : ArchivedStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("archivedState")
  private ArchivedStateEnum archivedState = null;

  public AnnouncementFilter titleSubstr(String titleSubstr) {
    this.titleSubstr = titleSubstr;
    return this;
  }

   /**
   * Подстрока для поиска по названию рекламы.
   * @return titleSubstr
  **/
  @ApiModelProperty(value = "Подстрока для поиска по названию рекламы.")
  public String getTitleSubstr() {
    return titleSubstr;
  }

  public void setTitleSubstr(String titleSubstr) {
    this.titleSubstr = titleSubstr;
  }

  public AnnouncementFilter spaceName(String spaceName) {
    this.spaceName = spaceName;
    return this;
  }

   /**
   * Подстрока для поиска по названию рекламного места.
   * @return spaceName
  **/
  @ApiModelProperty(value = "Подстрока для поиска по названию рекламного места.")
  public String getSpaceName() {
    return spaceName;
  }

  public void setSpaceName(String spaceName) {
    this.spaceName = spaceName;
  }

  public AnnouncementFilter state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Gets or sets the state.
   * @return state
  **/
  @ApiModelProperty(value = "Gets or sets the state.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public AnnouncementFilter dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Начальная дата выборки.
   * @return dateFrom
  **/
  @ApiModelProperty(value = "Начальная дата выборки.")
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }

  public AnnouncementFilter dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Конечная дата выборки.
   * @return dateTo
  **/
  @ApiModelProperty(value = "Конечная дата выборки.")
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }

  public AnnouncementFilter archivedState(ArchivedStateEnum archivedState) {
    this.archivedState = archivedState;
    return this;
  }

   /**
   * Сущности из архива.
   * @return archivedState
  **/
  @ApiModelProperty(value = "Сущности из архива.")
  public ArchivedStateEnum getArchivedState() {
    return archivedState;
  }

  public void setArchivedState(ArchivedStateEnum archivedState) {
    this.archivedState = archivedState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnouncementFilter announcementFilter = (AnnouncementFilter) o;
    return Objects.equals(this.titleSubstr, announcementFilter.titleSubstr) &&
        Objects.equals(this.spaceName, announcementFilter.spaceName) &&
        Objects.equals(this.state, announcementFilter.state) &&
        Objects.equals(this.dateFrom, announcementFilter.dateFrom) &&
        Objects.equals(this.dateTo, announcementFilter.dateTo) &&
        Objects.equals(this.archivedState, announcementFilter.archivedState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titleSubstr, spaceName, state, dateFrom, dateTo, archivedState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnouncementFilter {\n");
    
    sb.append("    titleSubstr: ").append(toIndentedString(titleSubstr)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    archivedState: ").append(toIndentedString(archivedState)).append("\n");
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


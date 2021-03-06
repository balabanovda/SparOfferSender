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
 * Уточнение времени действия акции.
 */
@ApiModel(description = "Уточнение времени действия акции.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class TimeRefinementDto {
  /**
   * Gets or Sets daysOfWeek
   */
  public enum DaysOfWeekEnum {
    SUNDAY("Sunday"),
    
    MONDAY("Monday"),
    
    TUESDAY("Tuesday"),
    
    WEDNESDAY("Wednesday"),
    
    THURSDAY("Thursday"),
    
    FRIDAY("Friday"),
    
    SATURDAY("Saturday");

    private String value;

    DaysOfWeekEnum(String value) {
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
    public static DaysOfWeekEnum fromValue(String text) {
      for (DaysOfWeekEnum b : DaysOfWeekEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("daysOfWeek")
  private List<DaysOfWeekEnum> daysOfWeek = null;

  @JsonProperty("beginTime")
  private HourMinuteModelDto beginTime = null;

  @JsonProperty("endTime")
  private HourMinuteModelDto endTime = null;

  public TimeRefinementDto daysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public TimeRefinementDto addDaysOfWeekItem(DaysOfWeekEnum daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

   /**
   * Дни недели.
   * @return daysOfWeek
  **/
  @ApiModelProperty(value = "Дни недели.")
  public List<DaysOfWeekEnum> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public TimeRefinementDto beginTime(HourMinuteModelDto beginTime) {
    this.beginTime = beginTime;
    return this;
  }

   /**
   * Время начала.
   * @return beginTime
  **/
  @ApiModelProperty(value = "Время начала.")
  public HourMinuteModelDto getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(HourMinuteModelDto beginTime) {
    this.beginTime = beginTime;
  }

  public TimeRefinementDto endTime(HourMinuteModelDto endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Время конца.
   * @return endTime
  **/
  @ApiModelProperty(value = "Время конца.")
  public HourMinuteModelDto getEndTime() {
    return endTime;
  }

  public void setEndTime(HourMinuteModelDto endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeRefinementDto timeRefinementDto = (TimeRefinementDto) o;
    return Objects.equals(this.daysOfWeek, timeRefinementDto.daysOfWeek) &&
        Objects.equals(this.beginTime, timeRefinementDto.beginTime) &&
        Objects.equals(this.endTime, timeRefinementDto.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysOfWeek, beginTime, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeRefinementDto {\n");
    
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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


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

/**
 * SearchByCardAttributesModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class SearchByCardAttributesModel {
  /**
   * Gets or Sets cardState
   */
  public enum CardStateEnum {
    EMITTED("Emitted"),
    
    PACKED("Packed"),
    
    ACTIVATED("Activated"),
    
    REPLACED("Replaced"),
    
    CREATING("Creating"),
    
    CREATED("Created"),
    
    PREPARED("Prepared"),
    
    ISSUED("Issued");

    private String value;

    CardStateEnum(String value) {
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
    public static CardStateEnum fromValue(String text) {
      for (CardStateEnum b : CardStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("cardState")
  private CardStateEnum cardState = null;

  @JsonProperty("isGift")
  private Boolean isGift = null;

  public SearchByCardAttributesModel cardState(CardStateEnum cardState) {
    this.cardState = cardState;
    return this;
  }

   /**
   * Get cardState
   * @return cardState
  **/
  @ApiModelProperty(value = "")
  public CardStateEnum getCardState() {
    return cardState;
  }

  public void setCardState(CardStateEnum cardState) {
    this.cardState = cardState;
  }

  public SearchByCardAttributesModel isGift(Boolean isGift) {
    this.isGift = isGift;
    return this;
  }

   /**
   * Get isGift
   * @return isGift
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsGift() {
    return isGift;
  }

  public void setIsGift(Boolean isGift) {
    this.isGift = isGift;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchByCardAttributesModel searchByCardAttributesModel = (SearchByCardAttributesModel) o;
    return Objects.equals(this.cardState, searchByCardAttributesModel.cardState) &&
        Objects.equals(this.isGift, searchByCardAttributesModel.isGift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardState, isGift);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchByCardAttributesModel {\n");
    
    sb.append("    cardState: ").append(toIndentedString(cardState)).append("\n");
    sb.append("    isGift: ").append(toIndentedString(isGift)).append("\n");
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


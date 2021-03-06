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
 * View модель фильтра типа карты.
 */
@ApiModel(description = "View модель фильтра типа карты.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CardTypeFilterViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isDeletedFilterType")
  private Boolean isDeletedFilterType = null;

  /**
   * Gets or Sets cardTypes
   */
  public enum CardTypesEnum {
    GENERAL("General"),
    
    SECONDARY("Secondary"),
    
    VIRTUAL("Virtual");

    private String value;

    CardTypesEnum(String value) {
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
    public static CardTypesEnum fromValue(String text) {
      for (CardTypesEnum b : CardTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("cardTypes")
  private List<CardTypesEnum> cardTypes = null;

  public CardTypeFilterViewModel id(Integer id) {
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

  public CardTypeFilterViewModel name(String name) {
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

  public CardTypeFilterViewModel isDeletedFilterType(Boolean isDeletedFilterType) {
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

  public CardTypeFilterViewModel cardTypes(List<CardTypesEnum> cardTypes) {
    this.cardTypes = cardTypes;
    return this;
  }

  public CardTypeFilterViewModel addCardTypesItem(CardTypesEnum cardTypesItem) {
    if (this.cardTypes == null) {
      this.cardTypes = new ArrayList<>();
    }
    this.cardTypes.add(cardTypesItem);
    return this;
  }

   /**
   * Список идентификаторов выбранных категорий карт.
   * @return cardTypes
  **/
  @ApiModelProperty(value = "Список идентификаторов выбранных категорий карт.")
  public List<CardTypesEnum> getCardTypes() {
    return cardTypes;
  }

  public void setCardTypes(List<CardTypesEnum> cardTypes) {
    this.cardTypes = cardTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardTypeFilterViewModel cardTypeFilterViewModel = (CardTypeFilterViewModel) o;
    return Objects.equals(this.id, cardTypeFilterViewModel.id) &&
        Objects.equals(this.name, cardTypeFilterViewModel.name) &&
        Objects.equals(this.isDeletedFilterType, cardTypeFilterViewModel.isDeletedFilterType) &&
        Objects.equals(this.cardTypes, cardTypeFilterViewModel.cardTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isDeletedFilterType, cardTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardTypeFilterViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeletedFilterType: ").append(toIndentedString(isDeletedFilterType)).append("\n");
    sb.append("    cardTypes: ").append(toIndentedString(cardTypes)).append("\n");
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


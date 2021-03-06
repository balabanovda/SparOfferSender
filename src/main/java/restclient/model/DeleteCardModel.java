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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Модель для операции удаления карты.
 */
@ApiModel(description = "Модель для операции удаления карты.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class DeleteCardModel {
  @JsonProperty("ticketId")
  private String ticketId = null;

  @JsonProperty("cardId")
  private Integer cardId = null;

  public DeleteCardModel ticketId(String ticketId) {
    this.ticketId = ticketId;
    return this;
  }

   /**
   * Идентификатор заявки в OTRS.
   * @return ticketId
  **/
  @ApiModelProperty(value = "Идентификатор заявки в OTRS.")
  public String getTicketId() {
    return ticketId;
  }

  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }

  public DeleteCardModel cardId(Integer cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Идентификатор удаляемой карты.
   * @return cardId
  **/
  @ApiModelProperty(value = "Идентификатор удаляемой карты.")
  public Integer getCardId() {
    return cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteCardModel deleteCardModel = (DeleteCardModel) o;
    return Objects.equals(this.ticketId, deleteCardModel.ticketId) &&
        Objects.equals(this.cardId, deleteCardModel.cardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketId, cardId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteCardModel {\n");
    
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
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


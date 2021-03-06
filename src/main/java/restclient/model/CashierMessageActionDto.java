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
 * Действие акции \&quot;Вывод сообщения кассиру\&quot;.
 */
@ApiModel(description = "Действие акции \"Вывод сообщения кассиру\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class CashierMessageActionDto {
  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("message")
  private String message = null;

  public CashierMessageActionDto order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Порядковый номер действия в цепочке.
   * @return order
  **/
  @ApiModelProperty(value = "Порядковый номер действия в цепочке.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public CashierMessageActionDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id действия в цепочке.
   * @return id
  **/
  @ApiModelProperty(value = "Id действия в цепочке.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CashierMessageActionDto message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Сообщение.
   * @return message
  **/
  @ApiModelProperty(value = "Сообщение.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashierMessageActionDto cashierMessageActionDto = (CashierMessageActionDto) o;
    return Objects.equals(this.order, cashierMessageActionDto.order) &&
        Objects.equals(this.id, cashierMessageActionDto.id) &&
        Objects.equals(this.message, cashierMessageActionDto.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, id, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashierMessageActionDto {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


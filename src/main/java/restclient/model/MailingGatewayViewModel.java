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
 * Модель шлюза рассылки.
 */
@ApiModel(description = "Модель шлюза рассылки.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class MailingGatewayViewModel {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("logicalName")
  private String logicalName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("prefix")
  private String prefix = null;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = null;

  public MailingGatewayViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификотор шлюза.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификотор шлюза.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MailingGatewayViewModel logicalName(String logicalName) {
    this.logicalName = logicalName;
    return this;
  }

   /**
   * Логическое имя шлюза.
   * @return logicalName
  **/
  @ApiModelProperty(value = "Логическое имя шлюза.")
  public String getLogicalName() {
    return logicalName;
  }

  public void setLogicalName(String logicalName) {
    this.logicalName = logicalName;
  }

  public MailingGatewayViewModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название шлюза.
   * @return name
  **/
  @ApiModelProperty(value = "Название шлюза.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MailingGatewayViewModel prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Префикс шлюза.
   * @return prefix
  **/
  @ApiModelProperty(value = "Префикс шлюза.")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public MailingGatewayViewModel price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Стоимость одного сообщения.
   * @return price
  **/
  @ApiModelProperty(value = "Стоимость одного сообщения.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public MailingGatewayViewModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Признак удаления.
   * @return isDeleted
  **/
  @ApiModelProperty(value = "Признак удаления.")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailingGatewayViewModel mailingGatewayViewModel = (MailingGatewayViewModel) o;
    return Objects.equals(this.id, mailingGatewayViewModel.id) &&
        Objects.equals(this.logicalName, mailingGatewayViewModel.logicalName) &&
        Objects.equals(this.name, mailingGatewayViewModel.name) &&
        Objects.equals(this.prefix, mailingGatewayViewModel.prefix) &&
        Objects.equals(this.price, mailingGatewayViewModel.price) &&
        Objects.equals(this.isDeleted, mailingGatewayViewModel.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logicalName, name, prefix, price, isDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingGatewayViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logicalName: ").append(toIndentedString(logicalName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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


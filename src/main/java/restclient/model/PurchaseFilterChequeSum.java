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

/**
 * Сумма чека.
 */
@ApiModel(description = "Сумма чека.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class PurchaseFilterChequeSum {
  /**
   * Операция.
   */
  public enum OperatorEnum {
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

    OperatorEnum(String value) {
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
    public static OperatorEnum fromValue(String text) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operator")
  private OperatorEnum operator = null;

  @JsonProperty("firstValue")
  private Double firstValue = null;

  @JsonProperty("secondValue")
  private Double secondValue = null;

  public PurchaseFilterChequeSum operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Операция.
   * @return operator
  **/
  @ApiModelProperty(value = "Операция.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public PurchaseFilterChequeSum firstValue(Double firstValue) {
    this.firstValue = firstValue;
    return this;
  }

   /**
   * Первое значение.
   * @return firstValue
  **/
  @ApiModelProperty(value = "Первое значение.")
  public Double getFirstValue() {
    return firstValue;
  }

  public void setFirstValue(Double firstValue) {
    this.firstValue = firstValue;
  }

  public PurchaseFilterChequeSum secondValue(Double secondValue) {
    this.secondValue = secondValue;
    return this;
  }

   /**
   * Второе значение.
   * @return secondValue
  **/
  @ApiModelProperty(value = "Второе значение.")
  public Double getSecondValue() {
    return secondValue;
  }

  public void setSecondValue(Double secondValue) {
    this.secondValue = secondValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseFilterChequeSum purchaseFilterChequeSum = (PurchaseFilterChequeSum) o;
    return Objects.equals(this.operator, purchaseFilterChequeSum.operator) &&
        Objects.equals(this.firstValue, purchaseFilterChequeSum.firstValue) &&
        Objects.equals(this.secondValue, purchaseFilterChequeSum.secondValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, firstValue, secondValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseFilterChequeSum {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    firstValue: ").append(toIndentedString(firstValue)).append("\n");
    sb.append("    secondValue: ").append(toIndentedString(secondValue)).append("\n");
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


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
 * Модель итогового состояния.
 */
@ApiModel(description = "Модель итогового состояния.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class DeviceEmulationResultStateViewModel {
  /**
   * Код ошибки.
   */
  public enum ErrorCodeEnum {
    OK("Ok"),
    
    SYSTEMERROR("SystemError"),
    
    VERSIONERROR("VersionError"),
    
    PARSEERROR("ParseError"),
    
    FORMATEXCEPTION("FormatException"),
    
    REQUEREFIELDEXCEPTION("RequereFieldException"),
    
    SIGNATUREERROR("SignatureError"),
    
    SIGNATURENOTFOUND("SignatureNotFound"),
    
    CERTIFICATEERROR("CertificateError"),
    
    CARDNOTFOUND("CardNotFound"),
    
    DEVICENOTFOUND("DeviceNotFound"),
    
    LARGEPAYMENTAMOUNT("LargePaymentAmount"),
    
    NOTENOUGHMONEY("NotEnoughMoney"),
    
    CARDBLOCKED("CardBlocked"),
    
    DEVICEBLOCKED("DeviceBlocked"),
    
    NOTUNIQUEOPERATIONID("NotUniqueOperationID"),
    
    OPERATIONNOTFOUND("OperationNotFound"),
    
    OPERATIONISCONFIRMED("OperationIsConfirmed"),
    
    OPERATIONISCANCELED("OperationIsCanceled"),
    
    WRONGPIN("WrongPin"),
    
    CASHIERNOTFOUND("CashierNotFound"),
    
    CARDHOLDERNOTFOUND("CardHolderNotFound"),
    
    CARDNOTACTIVATED("CardNotActivated"),
    
    DISCOUNTEXCEPTION("DiscountException"),
    
    PURCHASENOTFOUND("PurchaseNotFound"),
    
    DIFFERENTCHEQUE("DifferentCheque"),
    
    INCORRECTOPERATIONORDER("IncorrectOperationOrder"),
    
    CARDEXTRAPAYMENT("CardExtraPayment"),
    
    CONFIRMEDPURCHASEOPERATION("ConfirmedPurchaseOperation"),
    
    PURCHASEEXTRAPAYMENT("PurchaseExtraPayment"),
    
    LIMITGAINED("LimitGained"),
    
    PAYMENTEXCEPTION("PaymentException"),
    
    DIFFERENTPURCHASE("DifferentPurchase"),
    
    COUPONSEXCEPTION("CouponsException"),
    
    BUSINESSERROR("BusinessError"),
    
    APPLICATIONDEVICEGRANT("ApplicationDeviceGrant"),
    
    NOTUNIQUEPURCHASEID("NotUniquePurchaseID"),
    
    DIVISIBILITYERROR("DivisibilityError"),
    
    DIFFERENTLEGALS("DifferentLegals"),
    
    UNSPECIFIEDLOYALTYPROGRAM("UnspecifiedLoyaltyProgram"),
    
    CREATED("Created"),
    
    PAYTYPEISNOTEXIST("PayTypeIsNotExist"),
    
    PAYTYPEISARCHIVED("PayTypeIsArchived");

    private String value;

    ErrorCodeEnum(String value) {
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
    public static ErrorCodeEnum fromValue(String text) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("errorCode")
  private ErrorCodeEnum errorCode = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("cashierMessage")
  private String cashierMessage = null;

  public DeviceEmulationResultStateViewModel errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Код ошибки.
   * @return errorCode
  **/
  @ApiModelProperty(value = "Код ошибки.")
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }

  public DeviceEmulationResultStateViewModel message(String message) {
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

  public DeviceEmulationResultStateViewModel cashierMessage(String cashierMessage) {
    this.cashierMessage = cashierMessage;
    return this;
  }

   /**
   * Сообщение для кассира.
   * @return cashierMessage
  **/
  @ApiModelProperty(value = "Сообщение для кассира.")
  public String getCashierMessage() {
    return cashierMessage;
  }

  public void setCashierMessage(String cashierMessage) {
    this.cashierMessage = cashierMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEmulationResultStateViewModel deviceEmulationResultStateViewModel = (DeviceEmulationResultStateViewModel) o;
    return Objects.equals(this.errorCode, deviceEmulationResultStateViewModel.errorCode) &&
        Objects.equals(this.message, deviceEmulationResultStateViewModel.message) &&
        Objects.equals(this.cashierMessage, deviceEmulationResultStateViewModel.cashierMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, cashierMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEmulationResultStateViewModel {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    cashierMessage: ").append(toIndentedString(cashierMessage)).append("\n");
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


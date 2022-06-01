package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T15:56:05.055Z")


public class Order   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("buyer_info")
  private Object buyerInfo = null;

  @JsonProperty("checkout_id")
  private String checkoutId = null;

  @JsonProperty("credit_card_info")
  private Object creditCardInfo = null;

  @JsonProperty("payment_orders")
  @Valid
  private List<Object> paymentOrders = null;

  @JsonProperty("seller_account")
  private Object sellerAccount = null;

  @JsonProperty("amount")
  private Object amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("payment_orders_id")
  private String paymentOrdersId = null;

  public Order id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Order buyerInfo(Object buyerInfo) {
    this.buyerInfo = buyerInfo;
    return this;
  }

  /**
   * Get buyerInfo
   * @return buyerInfo
  **/
  @ApiModelProperty(value = "")


  public Object getBuyerInfo() {
    return buyerInfo;
  }

  public void setBuyerInfo(Object buyerInfo) {
    this.buyerInfo = buyerInfo;
  }

  public Order checkoutId(String checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

  /**
   * Get checkoutId
   * @return checkoutId
  **/
  @ApiModelProperty(value = "")


  public String getCheckoutId() {
    return checkoutId;
  }

  public void setCheckoutId(String checkoutId) {
    this.checkoutId = checkoutId;
  }

  public Order creditCardInfo(Object creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
    return this;
  }

  /**
   * Get creditCardInfo
   * @return creditCardInfo
  **/
  @ApiModelProperty(value = "")


  public Object getCreditCardInfo() {
    return creditCardInfo;
  }

  public void setCreditCardInfo(Object creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
  }

  public Order paymentOrders(List<Object> paymentOrders) {
    this.paymentOrders = paymentOrders;
    return this;
  }

  public Order addPaymentOrdersItem(Object paymentOrdersItem) {
    if (this.paymentOrders == null) {
      this.paymentOrders = new ArrayList<Object>();
    }
    this.paymentOrders.add(paymentOrdersItem);
    return this;
  }

  /**
   * Get paymentOrders
   * @return paymentOrders
  **/
  @ApiModelProperty(value = "")


  public List<Object> getPaymentOrders() {
    return paymentOrders;
  }

  public void setPaymentOrders(List<Object> paymentOrders) {
    this.paymentOrders = paymentOrders;
  }

  public Order sellerAccount(Object sellerAccount) {
    this.sellerAccount = sellerAccount;
    return this;
  }

  /**
   * Get sellerAccount
   * @return sellerAccount
  **/
  @ApiModelProperty(value = "")


  public Object getSellerAccount() {
    return sellerAccount;
  }

  public void setSellerAccount(Object sellerAccount) {
    this.sellerAccount = sellerAccount;
  }

  public Order amount(Object amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public Object getAmount() {
    return amount;
  }

  public void setAmount(Object amount) {
    this.amount = amount;
  }

  public Order currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Order paymentOrdersId(String paymentOrdersId) {
    this.paymentOrdersId = paymentOrdersId;
    return this;
  }

  /**
   * Get paymentOrdersId
   * @return paymentOrdersId
  **/
  @ApiModelProperty(value = "")


  public String getPaymentOrdersId() {
    return paymentOrdersId;
  }

  public void setPaymentOrdersId(String paymentOrdersId) {
    this.paymentOrdersId = paymentOrdersId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.buyerInfo, order.buyerInfo) &&
        Objects.equals(this.checkoutId, order.checkoutId) &&
        Objects.equals(this.creditCardInfo, order.creditCardInfo) &&
        Objects.equals(this.paymentOrders, order.paymentOrders) &&
        Objects.equals(this.sellerAccount, order.sellerAccount) &&
        Objects.equals(this.amount, order.amount) &&
        Objects.equals(this.currency, order.currency) &&
        Objects.equals(this.paymentOrdersId, order.paymentOrdersId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, buyerInfo, checkoutId, creditCardInfo, paymentOrders, sellerAccount, amount, currency, paymentOrdersId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    buyerInfo: ").append(toIndentedString(buyerInfo)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    creditCardInfo: ").append(toIndentedString(creditCardInfo)).append("\n");
    sb.append("    paymentOrders: ").append(toIndentedString(paymentOrders)).append("\n");
    sb.append("    sellerAccount: ").append(toIndentedString(sellerAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentOrdersId: ").append(toIndentedString(paymentOrdersId)).append("\n");
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


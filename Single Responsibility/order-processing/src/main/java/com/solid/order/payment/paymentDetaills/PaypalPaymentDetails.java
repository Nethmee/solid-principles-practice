package com.solid.order.payment.paymentDetaills;

public class PaypalPaymentDetails extends PaymentDetails {

  private String paypalEmail;

  /*public PaypalPaymentDetails() {
    super("PAYPAL");
  }*/
  // For PayPal payment
  public static PaypalPaymentDetails createPayPalPayment(String paypalEmail) {
    PaypalPaymentDetails details = new PaypalPaymentDetails();
    details.paypalEmail = paypalEmail;
    return details;
  }

  public String getPaypalEmail() {
    return paypalEmail;
  }
}

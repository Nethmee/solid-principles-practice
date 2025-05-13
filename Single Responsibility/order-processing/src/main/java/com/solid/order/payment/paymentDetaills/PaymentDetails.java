package com.solid.order.payment.paymentDetaills;
//@NoArgConstructor
public class PaymentDetails {
    private String paymentMethod;
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    PaymentDetails(String paymentMethod, String cardNumber, String expiryDate, String cvv) {
        this.paymentMethod = paymentMethod;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
    PaymentDetails() {
        // Default constructor
    }
    PaymentDetails(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }



    // For credit card payment
    public static PaymentDetails createCreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        PaymentDetails details = new PaymentDetails();
        details.cardNumber = cardNumber;
        details.expiryDate = expiryDate;
        details.cvv = cvv;
        details.paymentMethod = "CREDIT-CARD";
        return details;
    }



    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
    }


} 
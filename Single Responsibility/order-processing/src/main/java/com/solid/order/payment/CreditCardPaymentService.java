package com.solid.order.payment;

import com.solid.order.model.Order;
import com.solid.order.payment.paymentDetaills.PaymentDetails;

public class CreditCardPaymentService implements PaymentService {
    @Override
    public boolean processPayment(Order order, PaymentDetails paymentDetails) {
        if (!"CREDIT_CARD".equals(paymentDetails.getPaymentMethod())) {
            return false;
        }
        
        // In a real application, this would connect to a payment gateway
        String cardNumber = paymentDetails.getCardNumber();
        String expiryDate = paymentDetails.getExpiryDate();
        String cvv = paymentDetails.getCvv();
        
        // Simplified validation for demo purposes
        if (cardNumber == null || cardNumber.length() < 16 || 
            expiryDate == null || cvv == null) {
            return false;
        }
        
        // Simulate successful credit card payment processing
        System.out.println("Processing credit card payment for order: " + order.getOrderId());
        System.out.println("Amount charged: $" + order.getTotalAmount());
        
        return true;
    }
} 
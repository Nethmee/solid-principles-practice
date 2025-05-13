package com.solid.order.payment;

import com.solid.order.model.Order;
import com.solid.order.payment.paymentDetaills.PaypalPaymentDetails;

public class PayPalPaymentServiceImpl implements PaypalPaymentService {
    @Override
    public boolean processPayment(Order order, PaypalPaymentDetails paypalPaymentDetails) {
        if (!"PAYPAL".equals(paypalPaymentDetails.getPaymentMethod())) {
            return false;
        }
        
        // In a real application, this would connect to PayPal's API
        String paypalEmail = paypalPaymentDetails.getPaypalEmail();
        
        // Simplified validation
        if (paypalEmail == null || !paypalEmail.contains("@")) {
            return false;
        }
        
        // Simulate successful PayPal payment processing
        System.out.println("Processing PayPal payment for order: " + order.getOrderId());
        System.out.println("PayPal account: " + paypalEmail);
        System.out.println("Amount charged: $" + order.getTotalAmount());
        
        return true;
    }
} 
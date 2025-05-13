package com.solid.order.payment;

import com.solid.order.model.Order;
import com.solid.order.payment.paymentDetaills.PaymentDetails;
import com.solid.order.payment.paymentDetaills.PaypalPaymentDetails;

public class PayPalPaymentServiceImpl implements PaymentService {
    @Override
    public boolean processPayment(Order order, PaymentDetails paymentDetails) {
        if (!"PAYPAL".equals(paymentDetails.getPaymentMethod())) {
            return false;
        }
        
        // In a real application, this would connect to PayPal's API
        // Cast to the specific subclass
        if (!(paymentDetails instanceof PaypalPaymentDetails)) {
            return false;
        }

        PaypalPaymentDetails paypalDetails = (PaypalPaymentDetails) paymentDetails;
        String paypalEmail = paypalDetails.getPaypalEmail();
        
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
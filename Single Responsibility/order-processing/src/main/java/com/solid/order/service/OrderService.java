package com.solid.order.service;

import com.solid.order.discount.DiscountService;
import com.solid.order.model.Order;
import com.solid.order.notification.NotificationService;
import com.solid.order.payment.CardPaymentService;
import com.solid.order.payment.PaypalPaymentService;
import com.solid.order.payment.paymentDetaills.PaymentDetails;


public class OrderService {
    private final DiscountService discountService;
    private final PaypalPaymentService paypalPaymentService;
    private final CardPaymentService cardPaymentService;
    private final NotificationService notificationService;

    public OrderService(
            DiscountService discountService,
            PaypalPaymentService paypalPaymentService,
            CardPaymentService cardPaymentService,
            NotificationService notificationService) {
        this.discountService = discountService;
        this.paypalPaymentService = paypalPaymentService;
        this.cardPaymentService = cardPaymentService;
        this.notificationService = notificationService;
    }

    public boolean processOrder(Order order, String couponCode, PaymentDetails paymentDetails) {
        // Apply discount if coupon code is provided
        if (couponCode != null && !couponCode.isEmpty()) {
            discountService.applyDiscount(order, couponCode);
        }

        // Process the payment
        boolean paymentSuccessful = cardPaymentService.processPayment(order, paymentDetails);

        // If payment is successful, send confirmation
        if (paymentSuccessful) {
            notificationService.sendConfirmation(order);
        }

        return paymentSuccessful;
    }
} 
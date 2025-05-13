package com.solid.order;

import com.solid.order.discount.CouponDiscountService;
import com.solid.order.discount.DiscountService;
import com.solid.order.model.Order;
import com.solid.order.model.Product;
import com.solid.order.notification.EmailNotificationService;
import com.solid.order.notification.NotificationService;
import com.solid.order.payment.CreditCardPaymentService;
import com.solid.order.payment.PayPalPaymentServiceImpl;
import com.solid.order.payment.PaymentService;
import com.solid.order.payment.paymentDetaills.PaymentDetails;
import com.solid.order.payment.paymentDetaills.PaypalPaymentDetails;
import com.solid.order.service.OrderService;

public class Main {

  public static void main(String[] args) {
    // Create dependencies
    // DEmonstrating Dependency Inversion Principle
    DiscountService discountService = new CouponDiscountService();

    // We'll decide which payment service to use at runtime
    PaymentService creditCardPaymentService = new CreditCardPaymentService();
    PaymentService paypalPaymentService = new PayPalPaymentServiceImpl();



    NotificationService notificationService = new EmailNotificationService();

    // Create an order and add products
    Order order = new Order("customer@example.com");
    order.addProduct(new Product("P1", "Smartphone", 699.99));
    order.addProduct(new Product("P2", "Wireless Earbuds", 129.99));
    order.addProduct(new Product("P3", "Phone Case", 24.99));

    System.out.println("Order created with ID: " + order.getOrderId());
    System.out.println("Initial total: $" + order.getTotalAmount());

    // Process with credit card payment
    System.out.println("\n=== Processing with Credit Card ===");
    OrderService creditCardOrderService = new OrderService(
        discountService, creditCardPaymentService, notificationService);

    PaymentDetails creditCardDetails = PaymentDetails.createCreditCardPayment(
        "4111111111111111", "12/25", "123");

    boolean ccSuccess = creditCardOrderService.processOrder(order, "SAVE20", creditCardDetails);
    System.out.println("Credit card payment successful: " + ccSuccess);

    // Reset order total for the next demo
    order.setTotalAmount(order.getProducts().stream().mapToDouble(Product::getPrice).sum());

    // Process with PayPal payment
    System.out.println("\n=== Processing with PayPal ===");
    OrderService paypalOrderService = new OrderService(
        discountService, paypalPaymentService, notificationService);

    PaypalPaymentDetails paypalDetails = PaypalPaymentDetails.createPayPalPayment(
        "customer@example.com");

    boolean ppSuccess = paypalOrderService.processOrder(order, "HALFOFF", paypalDetails);
    System.out.println("PayPal payment successful: " + ppSuccess);
  }
} 
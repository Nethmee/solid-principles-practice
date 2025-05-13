package com.solid.order.payment;

import com.solid.order.model.Order;
import com.solid.order.payment.paymentDetaills.PaymentDetails;

public interface PaymentService {

  boolean processPayment(Order order, PaymentDetails paymentDetails);
}

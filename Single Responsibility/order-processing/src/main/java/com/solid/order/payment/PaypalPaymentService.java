package com.solid.order.payment;

import com.solid.order.model.Order;
import com.solid.order.payment.paymentDetaills.PaypalPaymentDetails;

public interface PaypalPaymentService {

  boolean processPayment(Order order, PaypalPaymentDetails paypalPaymentDetails);

}

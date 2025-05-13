package com.solid.order.notification;

import com.solid.order.model.Order;

public interface NotificationService {
    void sendConfirmation(Order order);
} 
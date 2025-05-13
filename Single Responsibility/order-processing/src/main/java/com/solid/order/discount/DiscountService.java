package com.solid.order.discount;

import com.solid.order.model.Order;

public interface DiscountService {
    void applyDiscount(Order order, String couponCode);
} 
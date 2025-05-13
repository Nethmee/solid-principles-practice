package com.solid.order.discount;

import com.solid.order.model.Order;
import java.util.HashMap;
import java.util.Map;

public class CouponDiscountService implements DiscountService {
    private final Map<String, Double> couponDiscounts;

    public CouponDiscountService() {
        // Initialize with some sample coupons and their discount percentages
        couponDiscounts = new HashMap<>();
        couponDiscounts.put("SAVE10", 0.10); // 10% discount
        couponDiscounts.put("SAVE20", 0.20); // 20% discount
        couponDiscounts.put("HALFOFF", 0.50); // 50% discount
    }

    @Override
    public void applyDiscount(Order order, String couponCode) {
        if (couponCode != null && couponDiscounts.containsKey(couponCode)) {
            double discount = couponDiscounts.get(couponCode);
            double originalAmount = order.getTotalAmount();
            double discountedAmount = originalAmount - (originalAmount * discount);
            order.setTotalAmount(discountedAmount);
        }
    }
} 
package com.solid.order.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private final String orderId;
    private final List<Product> products;
    private double totalAmount;
    private String customerEmail;

    public Order(String customerEmail) {
        this.orderId = UUID.randomUUID().toString();
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
        this.customerEmail = customerEmail;
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    public void removeProduct(Product product) {
        products.remove(product);
        calculateTotal();
    }

    private void calculateTotal() {
        this.totalAmount = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
} 
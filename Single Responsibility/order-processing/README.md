# Order Processing System - SOLID Principles Example

This project demonstrates SOLID principles through an online order processing system that:
- Holds order data (orderId, products, totalAmount)
- Applies discounts based on coupon codes
- Processes payments via different methods (credit card, PayPal)
- Sends confirmation emails to customers

## SOLID Principles Demonstrated

### 1. Single Responsibility Principle (SRP)
Each class has a single responsibility:
- `Order` is responsible for holding order data
- `DiscountService` is responsible for applying discounts
- `PaymentService` is responsible for processing payments
- `NotificationService` is responsible for sending notifications

### 2. Open/Closed Principle (OCP)
The system is open for extension but closed for modification:
- New payment methods can be added by implementing the `PaymentService` interface
- New discount strategies can be added by implementing the `DiscountService` interface
- New notification methods can be added by implementing the `NotificationService` interface

### 3. Liskov Substitution Principle (LSP)
Subtypes can be substituted for their base types:
- Different payment services (CreditCard, PayPal) can be used interchangeably
- The `OrderService` can work with any implementation of `PaymentService`, `DiscountService`, or `NotificationService`

### 4. Interface Segregation Principle (ISP)
Interfaces are focused and specific:
- `PaymentService` only deals with payment processing
- `DiscountService` only deals with applying discounts
- `NotificationService` only deals with sending notifications

### 5. Dependency Inversion Principle (DIP)
High-level modules depend on abstractions, not details:
- `OrderService` depends on the interfaces (`PaymentService`, `DiscountService`, `NotificationService`)
- The implementations are injected via constructor dependency injection
- This allows for easy swapping of implementations

## How to Build and Run

1. Make sure you have Java 11+ and Maven installed
2. Navigate to the project directory
3. Build the project: `mvn clean install`
4. Run the project: `mvn exec:java -Dexec.mainClass="com.solid.order.Main"` 
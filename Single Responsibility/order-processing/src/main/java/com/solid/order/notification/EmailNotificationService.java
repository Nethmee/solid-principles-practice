package com.solid.order.notification;

import com.solid.order.model.Order;
import com.solid.order.model.Product;

import java.util.Properties;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendConfirmation(Order order) {
        String to = order.getCustomerEmail();
        String subject = "Order Confirmation #" + order.getOrderId();
        
        // Build the email content
        StringBuilder content = new StringBuilder();
        content.append("Thank you for your order!\n\n");
        content.append("Order Details:\n");
        content.append("Order ID: ").append(order.getOrderId()).append("\n");
        content.append("Products ordered:\n");
        
        for (Product product : order.getProducts()) {
            content.append("- ").append(product.getName())
                  .append(" ($").append(product.getPrice()).append(")\n");
        }
        
        content.append("\nTotal Amount: $").append(order.getTotalAmount()).append("\n\n");
        content.append("Your order will be processed shortly.\n");
        content.append("Thank you for shopping with us!");
        

        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Content:\n" + content.toString());
        

        /*
        try {
            Properties properties = new Properties();
            properties.put("mail.smtp.host", "smtp.example.com");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            
            Session session = Session.getInstance(properties, null);
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("orders@example.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(content.toString());
            
            Transport.send(message);
            
            System.out.println("Email sent successfully to " + to);
        } catch (MessagingException e) {
            System.err.println("Failed to send email: " + e.getMessage());
        }
        */
    }
} 
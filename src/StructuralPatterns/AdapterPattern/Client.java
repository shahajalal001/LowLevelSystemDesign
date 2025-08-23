package StructuralPatterns.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("customer@codingminutes.com","order confirmation","your order has been received!");


        NotificationService emailNotificationServiceUsingSendGrid = new SendGridAdapter(new SendGridService());
        emailNotificationServiceUsingSendGrid.send("customer@codingminutes.com","order confirmation","your order has been received!");
    }
}

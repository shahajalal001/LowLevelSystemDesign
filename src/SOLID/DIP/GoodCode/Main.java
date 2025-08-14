package SOLID.DIP.GoodCode;

public class Main {
    public static void main(String[] args) {
        NotificationService emailNotificationService = new NotificationService(new EmailService());
        emailNotificationService.notify("Your order has been shipped");

        NotificationService smsNotificationService = new NotificationService(new SMSService());
        smsNotificationService.notify("OTP 1234");
    }
}

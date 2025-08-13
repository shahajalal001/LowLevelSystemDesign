package SOLID.OCP.BadCode;

public class PaymentProcessor {
    public static void processPayment(String paymentMethod, double amount){
        switch (paymentMethod) {
            case "CreditCard" -> System.out.println("Making payment via Credit Card : " + amount);
            case "DebitCard" -> System.out.println("Making payment via Debit Card : " + amount);
            case "Paypal" -> System.out.println("Making payment via Paypal : " + amount);
            default -> throw new IllegalArgumentException("Unsupported payment method " + paymentMethod);
        }
    }

    public static void main(String[] args) {
        processPayment("DebitCard", 100);
    }

}

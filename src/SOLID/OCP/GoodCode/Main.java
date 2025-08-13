package SOLID.OCP.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod debitCard = new DebitCard();
        PaymentMethod paypal = new Paypal();

        paymentProcessor.processPayment(debitCard, 100);
        paymentProcessor.processPayment(creditCard, 200);
        paymentProcessor.processPayment(paypal, 200);
    }
}

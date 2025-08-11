package UML;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $ " + amount + " using credit card.");
    }
    
}

public class RealizationExample {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(100.5);
    }
}

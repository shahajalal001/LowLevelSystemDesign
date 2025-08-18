package BehaviouralPatterns.StrategyPattern;

interface PaymentStrategy{
    void processPayment();
}

class CreditCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making payment via credit card");
    }
}

class DebitCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making payment via debit card");
    }
}

class UPIPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making payment via UPI");
    }
}

class PaymentServiceII{
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }
    public void pay(){
        paymentStrategy.processPayment();
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentServiceII paymentServiceII = new PaymentServiceII();
        paymentServiceII.setPaymentStrategy(new CreditCard());
        paymentServiceII.pay();
    }
}

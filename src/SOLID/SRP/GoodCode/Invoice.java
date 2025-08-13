package SOLID.SRP.GoodCode;

public class Invoice {
    private final double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount " + amount);
    }
}

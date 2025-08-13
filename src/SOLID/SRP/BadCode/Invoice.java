package SOLID.SRP.BadCode;

public class Invoice {
    private final double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount " +amount);
    }

    public void saveToDatabase(){
        System.out.println("Saving invoice to Database ");
    }

    public void sendEmailNotification(){
        System.out.println("Sending email notification for invoice ");
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice(100);
        invoice.generateInvoice();
        invoice.saveToDatabase();
        invoice.sendEmailNotification();
    }
}

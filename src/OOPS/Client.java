package OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("ShahajalalDebitCard", new DebitCard("010101", "Shahajalal"));
        ps.makePayment("ShahajalalDebitCard");

        ps.addPaymentMethod("ShahajalalCreditCard", new CreditCard("01010143", "Shahajalal"));
        ps.makePayment("ShahajalalCreditCard");

        ps.addPaymentMethod("ShahajalalWallet", new Wallet());
        ps.makePayment("ShahajalalWallet");

        ps.addPaymentMethod("ShahajalalUpi", new UPI("sh"));
        ps.makePayment("ShahajalalUpi");

        ps.makePayment("ShahajalalUpiiii");
    }
    
}

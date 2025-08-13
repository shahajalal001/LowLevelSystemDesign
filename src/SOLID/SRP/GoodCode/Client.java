package SOLID.SRP.GoodCode;

public class Client {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(200);
        invoice.generateInvoice();

        EmailService emailService = new EmailService();
        emailService.sendEmailNotification();

        InvoiceRepository invoiceRepository = new InvoiceRepository();
        invoiceRepository.saveToDatabase();
    }
}

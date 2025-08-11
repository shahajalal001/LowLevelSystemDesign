package OOPS;

public class UPI implements PaymentMethod{
    String upiId;

    public UPI(String id){
        this.upiId = id;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via UPI => "+ upiId);
    }
    
}

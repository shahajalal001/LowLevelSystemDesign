package OOPS;

import java.util.HashMap;

public class PaymentService {
    HashMap<String, PaymentMethod> paymentMethods;

    public PaymentService() {
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod pm){
        paymentMethods.put(name, pm);
    }

    public void makePayment(String name){
        PaymentMethod pm = paymentMethods.get(name);
        if(pm != null){
            pm.pay();
        }else{
            System.out.println("Invalid Payment Method");
        }
        
    }

}

package CreationalPattern.FactoryPattern.Problem;

public class TransportService {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bike = new Bike();
        Transport bycycle = new ByCycle();

        car.deliver();
    }
}

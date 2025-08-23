package CreationalPattern.FactoryPattern.Solution;

public class TransportFactory {
    public static Transport createTransport(String type){
        switch(type.toLowerCase()){
            case "car" -> {
                return  new Car();
            }
            case "bike" -> {
                return  new Bike();
            }
            case "bycycle" -> {
                return  new ByCycle();
            }
            default -> throw new IllegalArgumentException("Unsupported transport type");
        }
    }
}

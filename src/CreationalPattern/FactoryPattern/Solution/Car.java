package CreationalPattern.FactoryPattern.Solution;

public class Car implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivered by car");
    }
    
}

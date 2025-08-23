package CreationalPattern.FactoryPattern.Solution;

public class ByCycle implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivered by by cycle");
    }
    
}

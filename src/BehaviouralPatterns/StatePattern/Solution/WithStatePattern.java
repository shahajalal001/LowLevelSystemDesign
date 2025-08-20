package BehaviouralPatterns.StatePattern.Solution;

public class WithStatePattern {
    public static void main(String[] args) {
        DirectionService service = new DirectionService(new Cycling());

        System.out.println("ETA: " + service.getETA());
        System.out.println("Direction: " + service.getDirection());
    }
}

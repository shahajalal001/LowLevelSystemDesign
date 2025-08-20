package BehaviouralPatterns.StatePattern.Problem;

public class WithoutStatePattern {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(TransportationMode.CAR);
        directionService.setMode(TransportationMode.CAR);

        System.out.println(directionService.getDirection());
        directionService.getETA();
    }
}

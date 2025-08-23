package CreationalPattern.BuilderPattern.Solution;

public class WithBuilderpattern {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Concrete", "Wooden", "Tile")
                .setGarage(true)
                .setSwimmingPool(true)
                .setGarage(false)
                .build();

        System.out.println(house);
    }
}

package CreationalPattern.BuilderPattern.Problem;

public class WithourBuilderPattern {
    public static void main(String[] args) {
        House house = new House("Concrete","Wood","Shingles",true,true,false);
        System.out.println(house);
    }
}

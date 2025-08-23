package StructuralPatterns.FlyWeightPattern.Solution;

public class BulletType {
    private String color; //Intrinsic Property

    public BulletType(String color){
        this.color = color;
        System.out.println("Creating bulletType with color " + color);
    }
}

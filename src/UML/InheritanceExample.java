package UML;

class Animal {
    public void eat(){
        System.out.println("This animal is eating");
    }
}

class Dog extends Animal {
    public void bark(){
        System.out.println("The dog is barking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}

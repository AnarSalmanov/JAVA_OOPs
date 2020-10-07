package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeNoise(); // Will invoke overridden method from sub-class
        animal.animalMethod();//Can invoke non overridden only from itself
        Animal animal1 = new Animal();
        animal1.makeNoise(); // Will invoke method from super class
        Cat cat = new Cat();
        cat.makeNoise(); // Will invoke
    }
}

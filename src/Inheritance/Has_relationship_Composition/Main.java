package Inheritance.Has_relationship_Composition;

public class Main {


    public static void main(String[] args) {
        Car1 car = new Car1("V6", 290, 21);
        Toyota toyota = new Toyota();
        System.out.println(toyota.car.engine);
        System.out.println(toyota.car.getEngine());
    }

}

package Constructors;

public class SingleTon {

//const
    private SingleTon() {
        System.out.println("This is a singleton class private constructor");
    }

    public static SingleTon getObject() {
        return new SingleTon();
    }

    public void walk() {
        System.out.println("I am walking");
    }
}

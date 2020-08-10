package Constructors;

public class SingleTon {

    public static SingleTon singleTon;

    private SingleTon() {
        System.out.println("This is a singleton class constructor");
    }

    public static SingleTon getObject() {
        return singleTon = new SingleTon();
    }

    public void walk() {
        System.out.println("I am walking");
    }
}

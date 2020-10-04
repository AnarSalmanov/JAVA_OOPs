package Inheritance.Has_relationship_Composition;

public class Car1 {

    public static String engine;

    public Car1(String engine, int horsePower, int mpg) {
        this.engine = engine;
        this.horsePower = horsePower;
        this.mpg = mpg;
    }

    public static String getEngine() {
        return engine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMpg() {
        return mpg;
    }

    int horsePower;
    int mpg;


}

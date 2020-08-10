package Interfaces;

public interface Moveable_interface {

    // class variables
    public static final String COMPANY_NAME_1 = "USPS";
    public static final String COMPANY_NAME_2 = "FEDEX";

    //  abstract methods
    public abstract void shipping();

    public abstract void deliverig();

    public static void walk() {
        System.out.println("I am walking");
    }
}

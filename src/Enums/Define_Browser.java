package Enums;

public class Define_Browser {

    // public Browsers browsers; // object of Enum

    public static void getDriver(Browsers browsers) {
        if (browsers == Browsers.CHROME) {
            System.out.println("Chrome launched");
        } else if (browsers == Browsers.FIREFOX) {
            System.out.println("Firefox launched");
        } else if (browsers == Browsers.IE) {
            System.out.println("IE Launched");
        } else {
            System.out.println("Not supported");
        }
    }

    public static void main(String[] args) {
        getDriver(Browsers.FIREFOX);
    }


}

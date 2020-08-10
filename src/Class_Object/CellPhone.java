package Class_Object;

public class CellPhone {

    // Data of a class

    String brand;
    String color;
    double price;
    int messageCount;

    String forConstr;
    int fConstr;

    public CellPhone() {

    }


    public CellPhone(String consValue, int consVal) {
        this.forConstr = consValue;
        this.fConstr = consVal;
    }


    public String reverse() {
        String reversed = "";
        for (int i = forConstr.length() - 1; i >= 0; i--) {
            reversed += forConstr.charAt(i);
        }
        return reversed;
    }


    // Behaviours - methods

    public void call() {
        System.out.println("Calling  from " + " my " + color + " " + brand);
    }

    public void text() {
        System.out.println("I sent " + messageCount + " messages ");
    }

    @Override
    public String toString() {
        return "Hi";
    }

    public static void walk() {
        System.out.println("I am walking");
    }
}

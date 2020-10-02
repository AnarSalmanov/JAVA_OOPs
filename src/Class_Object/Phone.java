package Class_Object;

public class Phone {
    // constant variable of class
    public static final String PRODUCER;
    //instance variables
    public String brand;
    public String color;
    public double price;
    public int messageCount;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }

    //constructor 1
    public Phone() {

    }

    //constructor 2
    public Phone(String brand, String color, double price, int messageCount) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.messageCount = messageCount;
    }

    // this block will be executed only 1 time after 1st object creation
    static {
        PRODUCER = "Azerbaijan";
        System.out.println("This is a static block of Phone class and we assigned producer as Azerbaijan");
    }

    //this block will be executed in each object creation
    {
        System.out.println("This is an instance block of Phone class");
    }

    public void call() {
        System.out.println("Calling  from " + " my " + color + " " + brand);
    }

}

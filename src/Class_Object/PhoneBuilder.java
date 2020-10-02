package Class_Object;

public class PhoneBuilder {

    public static void main(String[] args) {
        //Creating object with non parametrized constructor
        Phone obj1 = new Phone();
        obj1.brand = "Sony";
        obj1.color = "white";
        obj1.price = 530.7;
        obj1.messageCount = 10;
        obj1.call();
        System.out.println(obj1); // will print hashcode
        //Creating object of class using parametrized constructor
        Phone obj2 = new Phone("Nokia", "white", 15.6, 10);
        System.out.println(obj2); // will print hashcode
        obj2.call();


    }
}

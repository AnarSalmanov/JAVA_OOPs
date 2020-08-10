package Encapsulation;

public class Accessing_Class {

    public static void main(String[] args) {

        HiddenClass hdr = new HiddenClass();
        // ASSIGNING VALUE VIA SETTER METHOD
        hdr.setAll("Anar", 30, "engineer");
        // GETTING VALUE VIA GETTER METHOD
        int myAge = hdr.getAge();
        String myName = hdr.getName();
        System.out.println("My name is " + myName + " I am " + myAge);
        hdr.myData();

        //REASSIGNING VALUE VIA SETTER METHOD AND CALLING METHOD AGAIN
        hdr.setAll("Lotu", 55, "engineer");
        hdr.myData();


    }

}

package Static_keyword;

public class StaticKwd_intro {

    /**
     *                        4 Things can be Static
     * 1. methods
     * 2. variables
     * 3. static block
     * 4. static inner class - not used !

     *                            Static members
     * Static keyword means,static member of the class belongs to class itself not to the object .
     * In class we call Static stuff directly, outside of the class we call className.method /className.variable
     * Still we can call with class object as well, but className.staticStuff is easier

     *                             Static Variables
     * Static variables attached to class not object. We can reassign value, increment, decrement inside constructor,
     * setter methods, regular methods and static blocks.Then it will behave like local variable,
     * but non-static variable depends on object, in each object it will have different value.!
     * Static variables are shared variables.Static variables are class variables can be accessed className.variable
     * (if it is not private).If we add static keyword to instance variables, it is not an instance variable anymore.
     * because it will be shared not belonging to object.

     *                              Static method
     * Static methods inside class can be called directly , outside of class className.methodName
     * Static methods cannot invoke non-static instance variables and non-static methods directly in class,
     * we have to call them with the object of class Normally we use static method for utility class.

     *                                 Static block
     * This is a block which will run when class is loaded. It means if any method called from the class or
     * if any object is created this block will run, but it will run only 1 time.
     * Also class can be loaded using Class.forName("package.class") method.
     */


    public static String name;
    public static int count = 0;
    public int age;


    //static block
    static {
        System.out.println("This is a static block, runs in each object creation");
    }

    // with value assigning
    static {
        count += 50;
        name = "Anar";
    }


    //static variable increased in each time object creating because constructor will run
    public StaticKwd_intro() {
        count++;
        System.out.println("Increased the count by 1");
    }

    public void nonStatic() {
        System.out.println("Non static method");
    }


    public static void staticMethod() {
        System.out.println("This is a static method");
        name = "Anar";
        StaticKwd_intro st = new StaticKwd_intro();
        st.age = 25;   // --> invoked non static variable with class obj
        st.nonStatic();  // --> invoked non static method with class obj
    }


}

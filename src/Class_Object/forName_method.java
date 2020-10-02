package Class_Object;

public class forName_method {

    /**
     * Used to load a class, this way static block will run.
     */

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Class_Object.Phone"); // output:This is static block of Phone class

    }

}

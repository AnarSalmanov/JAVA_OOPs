package Throw_throws;

public class ThrowsVsThrow {

    /** ---------------------- throws vs throw -----------------------------
     * Used in method declaration part to declare that,
     * the method may throw some exception.Throws keyword used in method signature
     * to handle checked exceptions in method. We usually follow the compiler's
     * suggestion to handle checked exception. If we call that method which has
     * throws keyword and exception name , then we have to put in same throws
     * ExceptionName signature in caller method .
     *
     * throw --> Used to explicitly throw an exception in method body.
     * Mainly used to throw custom exception.
     * Here the logic is we create our custom exception under the condition.
     */
    public static void main(String[] args) throws InterruptedException {
        suspend();
        System.out.println(person(""));
    }

    // example - throws
    public static void suspend() throws InterruptedException {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static String person(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException(" Name is Empty");
        }
        return name;
    }

}

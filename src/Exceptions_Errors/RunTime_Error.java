package Exceptions_Errors;

public class RunTime_Error {


	/**-------------- Runtime Errors -------------
	 * Example for RunTime Error: 1. Any time we call a method in Java , it creates
	 * a frame in stack memory.If method keeps calling itself then execution does
	 * not stop and leads to stackOverFlow error. --> Exception in thread "main"
	 * java.lang.StackOverflowError
     * TestNG and Junit assertions errors are example for Runtime errors.
	 */

	public static void main(String[] args) {
		go();
		                                   // -- > Exception in thread "main" java.lang.StackOverflowError

	}

	public static void go() {
		System.out.println("I am going");
		go();                             // method calls itself, recursion , recursive methods
	}

}

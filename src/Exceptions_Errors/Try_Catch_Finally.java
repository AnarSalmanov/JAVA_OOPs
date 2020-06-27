package Exceptions_Errors;

public class Try_Catch_Finally {

	/**
	 * Finally block follows catch block, finally block runs always eather
	 * error happens, catch block run or not.
	 * Finally block stops only if there is a statement before finally block System.exit(0);
	 * or JVM crash . Just make sure which your statement will execute , because if we put this command
	 * inside catch block, and if the code does not thhrow any exception, then catch block will not run,
	 * then the code inside catch block will not run as well.
	 * If rhere is an exception inside final block, then the code will stop there, will not completely
	 * execute the finally block. That is why try to use finally block for some informative actions
	 */

	public static void main(String[] args) {

		// where catch block runs
		String name = "Anar";

		try {
			System.out.println(name.charAt(5));
		} catch (Exception e) { // This catch block will catch the exception --> StringIndexOutOfBoundsException
			e.printStackTrace();
			System.exit(0);
		} finally {
			System.out.println("Final block runs alays"); // This code will run always, even catch block not runs.
		}

		// where catch block does not run
		String name2 = "Xose";

		try {
			System.out.println(name2.charAt(1));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("I am running even if catch block not running");
		}
	}

}

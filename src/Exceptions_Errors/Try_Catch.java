package Exceptions_Errors;

public class Try_Catch {

	/**
	 * In below example if we dont surround our code with try/catch block then in
	 * console we will see the exception --> StringOutOfBoundsException happened.
	 * But when we surround that with try/catch block, if code throws any exception
	 * , the code inside catch block will be executed. In console we will see only
	 * the statement in catch block "Exception happened in try block".
	 * If there any statement after atch block, it will be executed too for sure.
	 * Because it is outside of any block
	 * 
	 */

	public static void main(String[] args) {

		try {
			String str = "Java";
			System.out.println(str.charAt(2));
			System.out.println(str.charAt(5)); // code fails in this line , passing the length of String
			System.out.println(str.charAt(1)); // StringOutOfBoundsException
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception happened in try block");
		}
		System.out.println("After catch block statement.");  // will execute even if exception catched
	}

}

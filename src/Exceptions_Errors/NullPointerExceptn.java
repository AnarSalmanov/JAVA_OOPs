package Exceptions_Errors;

public class NullPointerExceptn {

	/**
	 * This exception happens when the used variable is null value and we try to
	 * make any operation with the variable. We can print that, it will be printed
	 * as null , but if we try to print for example : str.toLowercase , then it will
	 * throw exception NullPointerException . See example below; Here we will use
	 * try/catch block to get the Exception in console but not stop the program
	 * 
	 */

	// instance variable
	public static String name;   //---> by default = null (if non iitilized)
	
	

	public static void main(String[] args) {
		try {
			System.out.println(name.toLowerCase()); // nullPointerException
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Final block runs");
		}

	}

}

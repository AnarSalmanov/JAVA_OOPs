package Class_Object;

public class forName_method {

	/**
	 * Used to load a class, this way static block will run.
	 */

	public static void main(String[] args) throws Exception {

		Class.forName("Class_Object.Employee"); // This is static block of Employee class

	}

}

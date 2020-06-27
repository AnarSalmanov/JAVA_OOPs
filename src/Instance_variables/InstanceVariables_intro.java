package Instance_variables;

public class InstanceVariables_intro {

	/**
	 *              Instance variables
	 * Instance variables are object variables they are not static variables, outside of class and in class inside static method must be
	   called by creating class object, even inside main method!
	 * If the value of object is null, it means the Object type Instance variable does not have any value
	   and no any value assigned to that.
	 * If value not assigned to Instance variable and we use that variable for some action
	   in console we will get NullPointerException.
	 * Global variables exist mostly in order to be used by the methods in same class.
	 * 
	 */

	public String car;    //--> default null
	public int year;     //-->default primitive 0
	public boolean isTruck;  //-->defaut false
	public double price;    //-->default 0.00
	public Integer mileage;    //--> default null
	

	
	public static void main(String[] args) {
		InstanceVariables_intro obj1 = new InstanceVariables_intro();
		System.out.println(obj1.car);
		System.out.println(obj1.year);
		System.out.println(obj1.isTruck);
		System.out.println(obj1.price);
		System.out.println(obj1.mileage);

		
		
		
		
	}
}

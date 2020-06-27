package WarmUp_OOP;

public class Son extends Father {

	// constructor
	public Son() {
		System.out.println("This is Son class constructor");
	}

	// static block
	static {
		System.out.println("This is Son class static block");
	}

	// init block
	{
		System.out.println("This is a Son class init block");
	}

	//main method
	public static void main(String[] args) {

		Son s1 = new Son();
		Son s2 = new Son();
		Son s3 = new Son();

	}
	
	
	/** OUTPUT:
This is Father class static block
This is Son class static block
This is a Father class init block
This is Father class constructor
This is a Son class init block
This is Son class constructor
This is a Father class init block
This is Father class constructor
This is a Son class init block
This is Son class constructor
This is a Father class init block
This is Father class constructor
This is a Son class init block
This is Son class constructor
	 */

}

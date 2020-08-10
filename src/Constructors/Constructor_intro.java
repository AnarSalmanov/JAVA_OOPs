package Constructors;

public class Constructor_intro {

	/**                             Constructors
	 * Constructor is a special non-void method, having same name with class and without return type ! example-> 1
	 * Constructors can be with and without parameters.    example --> 2
	 * In programming constructor used for set Class Variables inside constructors signature and this keyword! example-->2
	 * Constructor is a another version of Setter can only set, the advantage is
	   we don't need to create extra Setter method.
	 * Constructor runs when we create an object of class, if constructor not created in class
	   then non-parametrized constructor runs implicitly.
	   If there is in class already parametrized constructor then we have to create an non-parametrized
	   constructor as well
	 * Constructor can have print statement inside it, can have initializing value to global variables in it;
	    when object of class is created, constructor will run and statement will be executed.
	   
	  Note:In body of Constructor we can initialize a value to global variables such as setter method, but
	  even after that if we don't have a getter method we cannot access to private class variable.
	    Constructor is an another shortcut version of Setter method.
	    
	 *  Constructor can be private , the purpose is to make unavailable to create an object of that class.
	    Then all class reusable methods must be static methods.This is usual for Util classes.
	    
	                                 CAN'T BE 
	 *  Constructors cannot be static and final. 
	 *  Constructor cannot be inherited.
	 *  Constructor cannot be overriden, but can be overloaded.
	 */
	
    private String name;
	private int age;
	public String job;
	
	
	
	
	
	// example 1
	public  Constructor_intro() {
		 name ="Nazakat";
		 age= 20;
		 job="engineer";
		System.out.println("This is non-parametrized constructor");
	}
	
	//example 2
	public Constructor_intro(String a , int b) {
		this.name=a;
		this.age=b;
		System.out.println("This is parametrized constructor");
	}
	
	
    //helper method
	
 public void details() {
	 System.out.println("my name is " + name);
	 System.out.println("my age is " + age);
 }
	
	
	
	
	
	
}

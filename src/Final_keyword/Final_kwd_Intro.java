package Final_keyword;

public class Final_kwd_Intro {
	
	/**             FINAL CAN BE
	 *  -> classes
	 *  -> variables  ->uppercase
	 *  -> methods
	 * 
	 *              FINAL VARIABLES
	 * Final variables are constant, value must be initilized and value cannot be changed/re-assigned.    
	 * Final variables must be all UPPERCASE.Final variable can be static as well.If final instance variable 
	 * not initilized ,then it must be initilized inside the first created constructor or inside static block.
	 * depending on which one created first.Final variables can be local as well, but behaving will be as local
	 * the only thing is once 1st value assigned then it is not possible to re-assign the value.
	 * Final variable if is String, then even .toUpperCase method will not work.
	 * 
	 *              
	 *              FINAL METHODS
	 * Final methods cannot be overridden. It means in inheritance consept if in Child class you want to create
	 * exact same maethod which already exist in Parent clas and is final, so it is impossible.
	 * You can use is as is.
	 * 
	 *              FINAL CLASSES
	 * We create a class final when we want to restrict the inherit the class. Final class cannot be inherited.
	 * If the class is final, then no need to make methods final, because anyway final class cannot be inherited itself.
	 * Final class cannot have child class. 
	 */
	
	
	
	
	
	            //FINAL INSTANCE VARIABLE must be UPPERCASE
	
	public final int MAX=100;
	public final String CITY_NAME ="Baku";
	public static final int GRAND_TOTAL =50;
	public final String MYNAME;
	public final String MY_LASTNAME;
	
	
	         //Initilizing inside the Constructor
	
	public Final_kwd_Intro() {
		MYNAME = "Anar";
		MY_LASTNAME="Salmanov";
	}

	
	            // FINAL METHOD
	
	public final void makeAphoneCall(String phoneNumber ) {
		System.out.println("Calling to : " + phoneNumber);
	}
	
	
	
	          // MAIN METHOD
	public static void main(String[] args) {
		Final_kwd_Intro f = new Final_kwd_Intro();
		f.makeAphoneCall("4131313");
	}
	
	
	
	
	
}

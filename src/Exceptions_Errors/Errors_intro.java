package Exceptions_Errors;

public class Errors_intro {
	
	/**                         COMPILE TIME ERRORS
	 *  
	 * For example : int a ="anar" or any syntax error , data types, object creation (ex: if try to create an object of Interface)
	 * then the compiler will complain and IDE (eclipse, intelliJ) will give us hint to fix he problem, we have to manually
	 * fix it , after the fixing problem(making corrections) the compiler will not complain , this is an example for compile
	 * errors . We cannot handle it with try/catch block, because this happens not when we run the code but
	 * in compile time. 
	 * 
	 *                           RUNTIME ERRORS
	 *                           
	 * For example : "StackOverFlow" error (stack memory is full), "OutOfMemory" Error ( heap memory is full).
	 * We cannot handle these errors with try/catch block.
	 * 
	 * Example for RunTime Error: 1. Any time we call a method in Java , it creates
	 * a frame in stack memory.If method keeps calling itself then execution does
	 * not stop and leads to stackOverFlow error. --> Exception in thread "main"
	 * java.lang.StackOverflowError
     * TestNG and Junit assertions errors also are Runtime Errors
	 */
	
	public static void main(String[] args) {
		
	}

}

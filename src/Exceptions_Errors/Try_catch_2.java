package Exceptions_Errors;

public class Try_catch_2 {

	
	
	public static void main(String[] args) {
		
		/** 
		 * Task :
		 * Make the code throws an RunTime Exception and catch it and runt the statement after catch block
		 * 
		 * Note: If we dont handle exception it will throw ArrayIndexOutOfBoud exception
		 */
		
		try {
		int [] nums = {2,4,5,6};
		System.out.println(nums[5]);
		}catch (Exception e) {
			e.printStackTrace();  // --> Prints the caught error but not stopping the program.
		}finally {
			System.out.println("Run finally block no matter what");
		}
		// Now, will run catch block statement  and finally block.
		// " Array length is less than the index mentioned "
		//  "  Run finally block no mantter what "

		
		
		
		/** Task:
		 * Write code, in code thwow the ArithmeticException and catch the exception with catch block
		 */
		try {
		int a =100;
		int n = a/0;
		System.out.println(n);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
	
	

}

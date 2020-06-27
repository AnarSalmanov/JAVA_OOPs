package Exceptions_Errors;

public class TryFinally {
  /**
   * If the code has try/finally + any line code after fnaly  block and the code fails in any line of try block then 
   * program will be execute only passed lines and finally block and will not execute the code after finally block
   * because the code failed and there is no catch block to catch the fail there.
   * 
   */
	
	// Dont use it in real coding


	public static void main(String[] args) {
        // All lines good

		try {
			System.out.println("In try block");
			System.out.println(10 / 2);
		} finally {
			System.out.println("In finaly block");
		}
		System.out.println("After try/finally");

		// Will execute all of them ( 2 lines try + 1 line finally +1 line outside after
		// try/finally)

		
		
		// Fails in 2dn line of try block
		try {
			System.out.println("In try block");
			System.out.println(10 / 0);
		} finally {
			System.out.println("In finaly block");
		}
		System.out.println("After try/finally");
		
		// Will execute 1st line try block + finally block and throw the error.
		
	}

}

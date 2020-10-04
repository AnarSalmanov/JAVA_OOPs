package Exceptions.Try_catch_finally;

public class Try_catch_finally {

    /**              try/catch/finally
     * Usage of try/catch block is: to catch the exception, to print it to console
       and make run the lines after catch block.

              Hierarchy:
       1. All lines which not throws exception in try block will be executed until exception line.
       2. Will break the code in line where exception occurred.
       3. Immediately catch block will catch exception and print exceptionName and its line in console.
       4. Code after catch block will be executed
       5. finally block will be executed always.
     *
     */


	public static void main(String[] args) {
            int[] arr = {2, 4, 5, 6};
        try {
            System.out.println("try block");// will execute
            System.out.println(arr[5]); // will break here
        } catch (Exception e) {
            e.printStackTrace();  //will catch and print exceptionName and its line to the console-> line 23
        } finally {
            System.out.println("finally block"); // will be executed
        }
            System.out.println("after finally block"); //will be executed
	    }







	}







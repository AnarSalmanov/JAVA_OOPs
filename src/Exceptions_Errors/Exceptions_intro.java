package Exceptions_Errors;

public class Exceptions_intro {
	/**
	 *                     WHAT IS EXCEPTIONS
	 * When we run our tests all the time something fails, it
	 * happens very often, In programming error happens due to different reasons.
	 * Could be bug in the code, wrong input , network issue or tool working logic. Due to this , every
	 * programming language provides a way to handle errors/exceptions. Each error/exception is an Object too. 
	 * 
	 *                What is handlig of Exceptions ?  - TRY/CATCH
	 * If you have 10 line codes and you expect to run them properly, but if the code throws an
	 * exception then the code will not run till the end will stop there. But we
	 * have to handle the exception, to put our code inside try/catch block,
	 * if the code throws any exception, then in catch block do something another action.
	 * If your code is ok and not throwing an exception, then catch block will not be executed.
	 * 
	 * 
	 * Suntax:
	 * 
	 * try {
	 *      // your codes here 
	 *  } catch(Exception e) {
	 * 			e.printStackTrace();
	 *    // Tell java what to do if occures any exception in the code which exists in try block
	 *  }
	 * 
	 * If no any unexpexted exception happens, then the code inside catch block will not run.
	 * If the program fails in any line, then code is not passing to next line, catch block
	 * will catch the exception(failure reason) and directly executes inside the catch block;
	 * 
	 * 1. No Problem -No exception :
	 * Will only run the code inside try block, catch block will not run.
	 * 
	 * 2.If exception is in line 1 :
	 * Catch will catch it, and other lines will not run, catch block will run.
	 * 
	 * 3.If exception is in the middle line of code :
	 * Successfully lines will be executed and will be displayed in console, in problematic line code will stop,
	 * catch block will catch the exception and will run the code inside catch block
	 * 
	 *                           WHY WE USE TRY/CATCH BLOCK
	 * If our code surrounded with try/catch block, in case of any error/exception happens in our program,
	 * then our code will not stop running, catch block will catch the problem and inform us.
	 * The main purpose of the try/catch is not to let the program to stop executing the codes.
	 * 
	 * 
	 *                    			e.printStackTrace();
     * Inside catch block we catch the Exception and print in console but it will not stop our propgram,
     * just informs in console what problems happened during the code runs.We just print the 
     * exception and keep continue our test.
	 * 
	 *        try{
	 *        //code here
	 *    } catch(Exception e) {
	 * 			e.printStackTrace();
	 *         }
	 * 
	 *                              e.getMessage();
	 *    e.getMessage not printing whole Exceptions in console, just printing small portion of exceptions 
	 *  message in console/      
	 *  
	 *          try{                  
	 *         //code here
	 *        }catch(Exception e) {
	 * 			e.getMessage();
	 *       }                     
	 *                              
	 *   In catch block inside parentises we can mention eather specific ecxeption or Parent Exception classes suc as 
	 *   Exception, Throwable class)                          
	 *                              
	 *                               FINALLY BLOCK
	 * Finally block follows catch bloc and runs always independent on catch block runs or not. 
	 * Finally block will run always in the code.
	 * Can be stopped only doing 
	 *    ->System.exit(0); before finally block, otherwise will run.
	 * But we have to consider to place this code inside that block which we are sure it will run 100%.
	 */

	

}

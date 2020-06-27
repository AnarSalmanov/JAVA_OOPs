package Exceptions_Errors;

public class Checked_Unchecked_Exceptions {
	
	public static void main(String[] args) {
		
	
	  /**               CHECKED EXCEPTION  (exception which compiler can predict)
	   * This is a kind of exception we must to handle in order to code compile, otherwise the code will not compile.
	   * This exception identified by compiler.
	   * The compiler will demand in method signature include the throws Exception.
	   * Java knows this code may fail that is why demands the just in case againnst possible treat.
	   * Checked exceptions can be handled with try/catch as well, in catch block inside the paretises
	   * we can include the Exception name.
	   * 
	   * ex: IOException, SQLException, FileNotFoundException , InterruptedExeption
	   * for example;
	   * --> public FileInputStream getFileInputStream() throws FileNotFoundException{
	   * 
	   */
           
	  
		
		
		
				
		/**              UN-CHECKED EXCEPTION (exception which compiler can't predict and happens in RunTime)
		 * This is optional to handle, code will compile even if we dont handle.
		 * Un-cheked exceptions belong to RuntimeExceptions.All Runtime exceptions end its subclasses are un-checked
		 * 
		 * ex : IndexOutOfBound,ArrayIndexOutOfBoundException, NullPointerExeption.
		 * 
		 * Here we can use try/ catch block to handle this exception
		 */
		
		
		
		
		
	
}
}
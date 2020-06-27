package Exceptions_Errors;

public class MultyCatchBlocks {
	/**
	 * We can have multy catch blocks in our code, this is not very widely used ,but
	 * when we use the multy catch block in our code then the Parent exception class
	 * must be in the bottom : ex : see the code below RuntimeException is a parent
	 * of those exceptions Note : If in the code multiple catch block, then
	 * exception will be caught only by the catch block which matches.
	 */

	public void clickElment() {

		try {
			// Code here
		} catch (ArithmeticException e) {
		} catch (StringIndexOutOfBoundsException e) {
		} catch (RuntimeException e) {

		}

	}

}

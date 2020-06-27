package Inheritance;

public class HidingParent {

	
	public static String english = "English";
	public String turkish = "Turkish";

	
	
	
	public static void staticMethod() {
		System.out.println("This is a static method of Parent");
	}

	public void printLanguage() {
		System.out.println("Language is " + english);

	}

}

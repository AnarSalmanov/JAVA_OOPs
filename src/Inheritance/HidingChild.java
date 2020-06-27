package Inheritance;

public class HidingChild extends HidingParent {

	public static String english = "England";

	
	
	public static void main(String[] args) {
		staticMethod();              // --> direct from parent because child is inside parent
        System.out.println(english);
	}

	public static void staticMethod() {
		HidingChild hc = new HidingChild();
		System.out.println("This is static meethod of Child " + hc.english);
	}

}

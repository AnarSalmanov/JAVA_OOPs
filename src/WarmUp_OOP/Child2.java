package WarmUp_OOP;

import Access_Modifiers.Access_Mod_intro;

public class Child2 extends Access_Mod_intro {
	
	
	// Accesing outside of package to Parent class inside static method with Child class object to public and protected members.
	
	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		ch2.publicNonStatic();
		ch2.protectedNonstatic();		
	}
	
	
	
	
	
	// Accesing outside of package from Child class to Parent class direct public and protected members.
	
	public void child2Method () {
		publicNonStatic();
		protectedNonstatic();
	}

}

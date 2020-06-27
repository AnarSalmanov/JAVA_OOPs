package Access_Modifiers;

public class Child1 extends Access_Mod_intro{

	
// Accesing within the package to Parent class inside static method with Child class object to public, protected and default members.
	
	public static void main(String[] args) {
		Child1 ch1 = new Child1();
		ch1.publicNonStatic();
		ch1.protectedNonstatic();
		ch1.defaultNonstatic();
	       
		}
	
	
// Accesing within the package from Child class to Parent class direct public , protected and default  members.
		
	public void child1Method () {
		publicNonStatic();
		defaultNonstatic();
		protectedNonstatic();
		
	}
	
	
	
	
}

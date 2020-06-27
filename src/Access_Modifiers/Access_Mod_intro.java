package Access_Modifiers;

public class Access_Mod_intro {
/**
 
 * public    -   visible from anywhere within project
 * 
 * private   -  visible only within project, even not visibe from child class.
 * 
 * non-modifier  -  visible only within same package.
 * 
 * protected  -  visible within same package and outside of package only through inheritance.
 
 */
	
	private void privateMethod() {
		System.out.println("This is private non-static");
	}
	
	public void publicNonStatic() {
		System.out.println("This is public non-static");
		privateMethod();
		defaultNonstatic();
		protectedNonstatic();
	}
	
	
	void defaultNonstatic () {
		System.out.println("This is void non -static");
	}
	
	 protected void protectedNonstatic() {
		 System.out.println("This is protected non-static ");
	 }
	
	
}

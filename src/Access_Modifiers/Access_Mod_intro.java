package Access_Modifiers;

public class Access_Mod_intro {
/**
 
 * public    -   visible(accessible) from anywhere within project
 * 
 * private   -  visible(accessible) only within project, even not visible from child class.
 * 
 * non-modifier  -  visible(accessible) only within same package.
 * 
 * protected  -  visible within same package and from another packages in project only through inheritance.
 
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

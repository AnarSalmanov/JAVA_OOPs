package Encapsulation;

public class HiderClass {

	
	public String job;
	private String fullName;
	private int age;
	
	    // SETTER
	// Passing data  like   glob var = param var
	public void setName(String name, int myAge, String myJob) {
		fullName=name;                        
		age=myAge;
		job=myJob;
	}
	
	
	
	public String getName() {
		return fullName;
	
	}
	
	public int getAge() {
		return age;
	}

	
	
	public static void main(String[] args) {
		HiderClass h = new HiderClass();
		h.setName("Anar",33, "engineer");
		System.out.println(h.getName());
	}
	
	
	public void myData () {
		System.out.println("My name " + fullName);
		System.out.println("My age " + age);

	}
	
	
	
	
	
	
	
	
	
	
	
}

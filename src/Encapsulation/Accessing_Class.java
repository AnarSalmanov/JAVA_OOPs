package Encapsulation;

public class Accessing_Class {
	
	public static void main(String[] args) {
		
		HiderClass hdr = new HiderClass();
		// ASSIGNING VALUE VIA SETTER METHOD
		hdr.setName("Anar",30, "engineer");
		// GETTING VALUE VIA GETTER METHOD
		int myAge=hdr.getAge();
		String myName=hdr.getName();
		System.out.println("My name is " + myName + " I am " + myAge);
		hdr.myData();
		
		//REASSIGNING VALUE VIA SETTER METHOD AND CALLING METHOD AGAIN
		hdr.setName("Lotu", 55,"engineer");
		hdr.myData();
		System.out.println(hdr.job);
		
		
		
		
		
	}

}

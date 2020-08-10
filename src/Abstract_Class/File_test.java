package Abstract_Class;

public class File_test {
	
	/**
	 * NOTE :WE CANNOT CREATE AN OBJECT OF ABSTRACT CLASS, 
	 * From 3rd class (not child) - WE MUST USE CHILD CLASS OBJECT TO ACHIEVE THE ABSTRACT CLASS non static METHODS and class variables.
	 * If abstract class has static members we can achieve them from 3rd class by className.staticMember
	 */

	    // calling Abstract class members in 3rd class using object of Child to achieve Abstract class
	public static void main(String[] args) {
		
		XLS_file_Child xl = new XLS_file_Child("File_XLS_connection");
		xl.open();         //-> calling ABSTRACT method in 3rd class using Child class obj(Child of Abstract class)
		xl.close("RED");   //-> calling NON-STATIC method of Abstract class in 3rd class using Child class object Child of Abstract class)
		xl.price = 20.5;   //-> calling NON-STATIC variable of Abstract class in 3rd class using Child class object(Child of Abstract class)
		File_abst_Parent.speak("Anar"); //-> calling STATIC method of Abstract class using AbtractClassName.staticMethod();
		File_abst_Parent.year = 2019; //  -> calling Abstract class static variable directly with class name
		xl.setName("Anar");
		System.out.println(xl.getName());
		
		
		// same action with another object in 3rd class
		JPG_file_Child jp = new JPG_file_Child("File+JPG_connection");
		jp.open();         // -> calling ABSTRACT method in 3rd class using Child class obj(Child of Abstract class)
		jp.close("Blue"); //  -> calling NON-STATIC method of Abstract class using Child class object (Child of Abstract class)
		jp.price =15.5;   //  -> calling NON-STATIC variable of Abstract class using Child class object (Child of Abstract class)
		File_abst_Parent.speak("Samir"); //-> calling STATIC method of Abstract class using AbtractClassName.staticMethod();
		File_abst_Parent.year = 2020;   // -> accesing Abstract class static variable directly with class name
		jp.setName("Samir");
		System.out.println(jp.getName());
		
		
	}
	
}

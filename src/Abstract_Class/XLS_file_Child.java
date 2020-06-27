package Abstract_Class;

public class XLS_file_Child extends File_abst_Parent {

	public XLS_file_Child(String contructorName) {
		super("Parent");
	}


	//Overriding Parent abstract lass abstract method.
	@Override
	public void open() {
	System.out.println("Opening XLS class method");
	}

	
	//main method
	public static void main(String[] args) {
		XLS_file_Child x = new XLS_file_Child("Parent"); //we can create only object of child concrete class.
		speak("Anar");  // static method from abstract Parent class
		x.close("black door");  // non static from Parent class inside static method
		
		
		
		
	}
}

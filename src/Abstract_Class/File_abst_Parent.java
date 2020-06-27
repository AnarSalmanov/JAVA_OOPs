package Abstract_Class;

public abstract class File_abst_Parent {

	// variables
	private String name;
	public static int year;
	public double price;

	// constructor
	public File_abst_Parent(String contructorName) {
		System.out.println("Abstract class constructor name of coustructor is " + contructorName);
	}


	// abstract method
	public abstract void open();

	// non-static concrete method
	public void close(String color) {
		System.out.println("Close the door  " + color);

	}

	// static concrete method
	public static void speak(String name) {
		System.out.println(name + " is speaking");
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	// Getter
	public String getName() {
		return name;
	}

}

package Abstract_Class;

public class JPG_file_Child extends File_abst_Parent{

	public JPG_file_Child(String contructorName) {
		super("Parent");
	}

	
	@Override
	public void open() {
		System.out.println("Opening JPG file");
	}

}

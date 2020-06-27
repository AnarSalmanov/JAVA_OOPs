package Abstract_Class;

public abstract class Shape_abstr {
	
	String name;

	public Shape_abstr(String name) {
		this.name=name;
	}
	
	public abstract void calculateArea();
}

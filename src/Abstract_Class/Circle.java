package Abstract_Class;

public class Circle extends Shape_abstr {

	int radius;
	double pi;

	

	public Circle(int radius, double pi, String name) {
		super(name);
		this.radius = radius;
		this.pi = pi;

	}

	@Override
	public void calculateArea() {
		double area = radius * radius * pi;
		System.out.println("Area of " + name + " is " + area);
	}

}

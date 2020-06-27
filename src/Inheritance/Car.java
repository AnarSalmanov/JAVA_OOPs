package Inheritance;

public class Car extends Vehicle {

	public static void main(String[] args) {

		Car c = new Car();
		c.make = "Honda";
		model = "Accord"; // -> static variable
		c.year = 2019;
		c.maxSpeed = 280;
		c.drive();
		c.stop();
		c.carDetails(); // --> invoke non-static method inside static method
		staticCarDetails(); // staic method
		ubering();
	}

	// inside non static method we can invoke Parent class members directly.
	public void carDetails() {
		make = "Toyota";
		model = "Camry"; // -> static variable
		year = 2020;
		mileage=210000;
		maxSpeed = 300;
		drive(); // -->invoke methods from parent class inside another non static method
		stop(); // --. invoke method from parent class inside another non-static method
		ubering();
	}

	// inside static method
	public static void staticCarDetails() {
		Car c2 = new Car();
		c2.drive();            // -> null, because using object we must assign value to instance variables of Parent class;
		c2.stop();    
		ubering();

		
		
		
	}

}

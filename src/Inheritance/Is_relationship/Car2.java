package Inheritance.Is_relationship;

public class Car2 extends Vehicle {

	public static void main(String[] args) {

		Car2 c = new Car2();
		c.make = "Honda";
		model = "Accord"; // -> static variable
		c.year = 2019;
		c.maxSpeed = 280;
		c.drive();
		c.stop();
		c.carDetails(); // --> invoke non-static method inside static method
		staticCarDetails(); // static method
		ubering();
	}

	// inside instance method we can invoke Parent class members directly.
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

	// inside static method we can invoke Parent class's instance methods only by
    //creating object of child class.
	public static void staticCarDetails() {
		Car2 c2 = new Car2();
		c2.drive();            // -> null, because using object we must assign value to instance variables of Parent class;
		c2.stop();    
		ubering();

		
		
		
	}

}

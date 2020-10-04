package Inheritance.Is_relationship;

public class Vehicle {
	
	public String make;
	public static String model;
	public int year;
	public int maxSpeed;
	private String color;
	protected int mileage;
	
	
	public void drive () {
		System.out.println("Driving");
		System.out.println(" car make is " +make + " model is " + model + " year is "+ year + " maxSpeed is " + maxSpeed);
	}
	
	
	public void stop () {
		System.out.println("Sopping");
	}
	
	
	public static void ubering () {
		System.out.println("I am ubering");
	}
	
	
}

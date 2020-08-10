package Interfaces;

public class Plane implements Flyable_interface, Moveable_interface {
    public static void main(String[] args) {
        Moveable_interface.walk();
    }
	
	// Overriding 1st interface's abstract methods
	@Override
	public void start() {
		System.out.println("Plane starting ");

	}

	@Override
	public void stop() {
		System.out.println("Plane stopping ");
	}

	// Overriding second interface's abstract methodd
	@Override
	public void shipping() {
		System.out.println("Shipping will be done by " + COMPANY_NAME_1);
	}

	@Override
	public void deliverig() {
		System.out.println("Devivery will be done by " + COMPANY_NAME_2);
	}

	
	
	
}

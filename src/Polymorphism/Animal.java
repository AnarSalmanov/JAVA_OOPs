package Polymorphism;

public class Animal implements Pet{

	
	
	
	public void makeNoise () {
		System.out.println("Animal is making noise");
	}
	
	
	
	public static void main(String[] args) {
		
		Animal d = new Dog();
		d.makeNoise();
		Animal c = new Cat();
		c.makeNoise();
		Animal h = new Horse();
		h.makeNoise();
		
			
	}

}

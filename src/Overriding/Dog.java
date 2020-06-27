package Overriding;

public class Dog extends Animal {

	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.speak();
	}

	
	@Override
	public void speak() {
		super.speak();
		System.out.println("Dog class is speaking");
	}

}

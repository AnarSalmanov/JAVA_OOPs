package Class_Object;

public class CellPhoneBuilding {

	public static void main(String[] args) {

		// Using the object of class we are givin value to class members.

		CellPhone obj1 = new CellPhone("Nokia", 15);
		obj1.brand = "iPhone";
		obj1.color = "black";
		obj1.price = 550.6;
		obj1.messageCount = 5;
		obj1.call();
		obj1.text();

		System.out.println(obj1.reverse());

		CellPhone obj2 = new CellPhone();
		obj2.brand = "Sony";
		obj2.color = "white";
		obj2.price = 530.7;
		obj2.messageCount = 10;
		obj2.call();
		obj2.text();

		// Prints null / 0 because we did not assign a value yet

		CellPhone obj3 = new CellPhone();
		System.out.println(obj3.price); // --> 0.0
		System.out.println(obj3.brand); // --> null

		// Calculate total price of them
		double totalPrice = obj1.price + obj2.price;
		System.out.println("Total price for both phones is : " + totalPrice);

	}
}

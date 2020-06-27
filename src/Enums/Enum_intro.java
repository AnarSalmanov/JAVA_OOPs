package Enums;

enum Levels {
	LOW, MEDIUM, HIGH; // name of the values
}

enum Colors {
	RED, BLACK, WHITE;
}

public class Enum_intro {
	/**
	 * 
	 * Enum is a collection of constants. Enum can be inside and outside of class
	 * Enums does not have types, type values  in Uoeercase without showing any
	 * type Enum name (as class name) should be in uppercase Constant are called as
	 * a static methods with EnumName.value We can declare only constant values in
	 * enum. This is a good practice to store constants there.
	 * 
	 * Syntax : 
	 * 
	 *    enum Colors {
	            RED, BLACK, WHITE;
            }
	 * 
	 *  * Initialization is happening as below:
	 *  Such as passing value to the object of enum by calling value with enaum name.
	 *  
	 * Syntax:
	 *   
	 *     Levels levels = Levels.MEDIUM;
	 */

	public static void main(String[] args) {
		getRed();

		System.out.println(Levels.LOW); // Will print LOW

		// initilize the value this way
		Levels levels = Levels.MEDIUM;
		switch (levels) {
		case LOW:
			System.out.println("Level is " + Levels.LOW);
			break;
		case MEDIUM:
			System.out.println("Level is " + Levels.MEDIUM); // Level is MEDIUM
			break;
		case HIGH:
			System.out.println("Level is " + Levels.HIGH);
			break;
		default:
			System.out.println("level not declared");
			break;
		}

		// initilize the value this way to object.
		Colors colors = Colors.BLACK;
		if (colors == Colors.WHITE) {
			System.out.println("Color is white");
		} else if (colors == Colors.BLACK) {
			System.out.println("Color is black"); // Color is black
		} else {
			System.out.println("Color is Red");
		}

	}

	public static void getRed() {
		System.out.println("Got " + Colors.RED); // Got RED
	}

}

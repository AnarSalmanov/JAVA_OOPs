package Class_Object;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseBuilding {

	/**
	 * If we dont call instance variables with different objects of class  then JVM will not
	 * understand which value we calling, because we can create n number object and
	 * initilize value to instance variables with this objects. Note: cellPhone
	 * class,different data different phones. We can create an array of object of class, data
	 * type will be Class name. First We have to point to object and then variable
	 * ,because each object hold separate value. --> String addres1 =
	 * houses[0].address;     arrayName[indexOfObject].variable
	 */

	public static void main(String[] args) {

		//obj 1
		House house1 = new House();
		house1.type = "villa";
		house1.address = "655 Crane ave";
		house1.year = 2018;
		house1.bedrooms = 5;
		
        //obj2
		House house2 = new House();
		house2.type = "town house";
		house2.address = "Bentonville";
		house2.year = 2019;
		house2.bedrooms = 4;
		

		// Array of class objects.
		House[] houseArr= new House[2]; // -> House is data type here
		houseArr[0] = house1; //->adding objects of class to array
		houseArr[1] = house2; //->adding objects of class to array

		// Print certain object's address
		String address1 = houseArr[0].address;

		// with FOR LOOP
		for (int i = 0; i < houseArr.length; i++) {
			System.out.println(
					houseArr[i].address + " " + houseArr[i].type + " " + houseArr[i].year + " " + houseArr[i].bedrooms);
		}

		// with FOR EACH LOOP
		for (House hous : houseArr) { // House is a class and Data type here.
			System.out.println(hous.address + " " + hous.type + " " + hous.year + " " + hous.bedrooms);
		}

		System.out.println("=============ARRAYLIST OF HOUSE OBJECTS================");

		ArrayList<House> houseList = new ArrayList<>(Arrays.asList(houseArr));
		String tp = houseList.get(1).type;
		System.out.println(tp);

		// FOR LOOP
		for (int i = 0; i < houseList.size(); i++) {
			System.out.println(houseList.get(i).type);
		}

		//FOR EACH LOOP
		for (House hlist :houseList) {
			System.out.println(hlist.type);
		}
		
		                //Object type Method 
		//Call method which returns object
		//Using object get value from point address of Hose class.
		System.out.println(buildHouse("villa", "413 Home ave", 2013, 7).address);
		
	
		
		
	
		
	
		
	}
	
	
	/**
	 * TASK:
	 * Create a method which assigns value with object
	 * Returns : Object of House class.
	 * Parameters :  2 Strings, 2 int 
	 * When we invoke method, we will feed parameter and this method will feed instance variables.
	 */
	       
	   //This method makes DataType as House class.
	  // This static method is initilizing value to all class variables as Setter method but returns object.
	public static House buildHouse(String style, String location, int buildYear, int rooms) {
		House myHouse = new House();
		myHouse.type=style;            
		myHouse.address=location;
		myHouse.year=buildYear;
		myHouse.bedrooms=rooms;
		return myHouse;
	}
	
}

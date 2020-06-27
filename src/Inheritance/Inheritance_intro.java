package Inheritance;

public class Inheritance_intro {
	
	/**                          INHERITANCE
	 * Inheritance is Parent child relations between 2 classes.
	 * We use extends keyword to establish this connection for Parent regular or abstract classes
	 * also we use implements for Parent interfaces. Child class extends/implements Parent class.
	 * Child class acquires to Parent's property and that property now belogs to Child as well.
	 * It is like to initilize value, to invoke method from Parent class everythink happens like 
	 * all actions happens in Child class itself.
	 * Parent class members, variables , methods are available for Child class.
	   But Child class members are not avaliable for Parent.
	 * When child class extends Parent class, then in order to be able to invoke non-static variables
	   and methods of Parent class inside static methods,we need to create an object of Child class,
	   but here we dont create an object of Parent class we create an object of child class, 
	   but in child class inside non-static methods we can call directly everythink from Parent class
	   without using an object of child class.  
	 * If Child and Parent are in same package, then Child class can access to public, default and protected.
	 * If Child and Parent are in different package, then Child class can access to public and protected.    
	 * Constructor not inherited from Parent class.(which means , not visible from child class)
	 * Private variables and private methods are not inherited, are visible only in Parent class itself.!
	 
	
	 *                    HIDING STATIC METHODS AND VARIABLES
	 * Inherited static methods and static variables are hidden, not overridden!
	 * If we have static method and static instance variable in Parent class and in Child class we want to create
	 * exact same static method and same static instance variable , then we can create it, both classes will have
	 * exact same static method and static variable , but Parent class static method and variable will not be overriden.
	 * because compiler will hide them,compiler will see only Child class static method and static variable.
	 * Parent class method and variable will be hidden. Will not be overriden.
	 * 
       */
	
	}

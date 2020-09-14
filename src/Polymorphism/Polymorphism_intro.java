package Polymorphism;

public class Polymorphism_intro {
	
	/**                      POLYMORPHISM
	 * Polymorphism occurs only in Parent and Child class relationship.
	 * Child class extends to regular Parent class or Abstract Class or implements Interface.
	 * In polymorphism Parent class or Interface reference refers to Child class .
	        Parent obj = new ChildClass()
            Interface ref = new ChildClass ();
	        
	        With obj:
	        CAN access to Child class overridden(which exist in Parent and Child both) methods
	        CAN ACCESS Parent class any method.
	        
	 *   Class Grandpa  
	 *       method1();
	 *       method3();
	 *   Class Dad extends Grandpa
	 *       method1();
	 *       method2();
	 *   Class Son extends Dad
	 *       method1();
	 *       method4();
	 *       
	 *   Grandpa grandpa = new Dad();
	 *   grand1.method1();        -->  accessing Dad class overridden methods
	 *   grand1.method3();        -->  accessing own class method
	 *                                
	 *       
	 *   Grandpa grand = new Son();
	 *   grand.method1();        -->  accessing Child class overridden methods
	 *   grand.method3();        -->  accessing own class method
	 *                                     
	 *  Reference of Interface can't refer another interface, but can refer to regular class.
	 *  All classes which refers Abstract class or Interface are extends or implements to Parent abstract class or interface.
	 *  Then using animal object we can invoke all common methods (which exists in both classes) and the methods which exist in 
	 *  Parent class itself class. See grandpa class example.
	 *  To invoke the methods which exists only in Child class, we need to create an object of Child class and
	 *  invoke as usual with the class object.
	 *  
	 *  
	 *  WebDriver driver = new ChromeDriver();
	 *  WebDriver    -->  is Interface (Interface)
     *  driver  --> reference of Interface refers to Child class
	 *  ChromeDriver -->  is Child class(Also ChromeDriver is class and implements to WebDriver interface)
	 *  
	 *  
	 *  
	 *                          2 TYPES POLYMORPHISM
	 *        1. Compile time Polymorphism -- > Method OverLoading
	 *        2. Runtime Polymorphism ---> Method Overriding
	 *        
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 */

}

package Polymorphism;

public class Polymorphism_intro {
	
	/**                      POLYMORPHYSM
	 * Polymorphism occures only in Parent and Child class relationship.
	 * Child class extends to regular Parent class or Abstract Class or implements Interface.
	 * In polymorphysm Parent class refers to Child class .
	        Parent obj = new  Childclass() 
	        
	        With obj:
	        CAN access to Child class overridden(which exixt in Parent and Child both) methods
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
	 *   grand1.method1();        -->  accessing Dad class overrridden methds
	 *   grand1.method3();        -->  accessing own class method
	 *                                
	 *       
	 *   Grandpa grand = new Son();
	 *   grand.method1();        -->  accessing Child class overrridden methds
	 *   grand.method3();        -->  accessing own class method
	 *                                     
	 *  Reference of Interface can't refer another interface, but can refer to regular class.
	 *  All classes which refers Abstract class or Interface are extends or implements to Parent abstrat class or interface.
	 *  Then using animal object we can invoke all common methods (which exists in both classes) and the methods which exist in 
	 *  Parent class itself class. See grandpa class example.
	 *  To invoke the methods which exists only in Child class, we need to create an object of Child class and
	 *  invoke as usual with the class object.
	 *  
	 *  
	 *  WebDriver driver = new ChromeDriver();
	 *  WebDriver    -->  is reference type (Interface)
	 *  ChromeDriver -->  is Child class(Also ChromeDriver is class and implements to WebDriver interface)
	 *  
	 *  
	 *  
	 *                          2 TYPES POLYMORPHYSM
	 *        1. Compile time Polymerphism -- > Method OverLoading
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

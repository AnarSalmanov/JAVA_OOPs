package Abstraction;

public class Abstraction_intro {
	
	
	/**                   WHAT IS ABSTRACTIONS
	 * Abstraction is a process showing behaviour/features but hiding the implementation details.
	 * 
	 
                           WHY WE USE ABSTRACTION ?
	 * In programming when we do abstraction, then we create abstract classes and methods that only shows the feature, 
	 * but we don't show the implementation details.
     * So those method we create as abstract methods and override them from child class. And at the runtime we hide
     * the implementation details.
	 * 
	 *  
	 *                      HOW TO ACHIEVE ABSTRACTION ?
	 *  There is 2 ways of achieving abstraction in java.
	 *  by using :
	 *  -> 1. Abstract classes
	 *  -> 2. Interfaces.
	 *  
	 *                       ABSTRACT CLASS
	 *  Using "abstract" keyword to create an abstract class.
	 *  -> public abstract class className {
	 *  }
	 *  We cannot create an object of abstract class. !
	 *  Abstract class has both abstract method and concrete methods. Or it may or may not have abstract methods.
	 *  Regular class extends to abstract class,once it extends then regular class makes contract with abstract class
	 *  that ,Child regular class will override (implement) Abstract class's all unimplemented (abstract)
	 *  methods.Always regular class is child of abstract class.
	 *  MUST be used Child class's object to access Abstract class's non static methods and instance variables from 3rd class.
     *  Using abstract class name we can access to Static class variables and static methods. ClassName.variable and ClassName.method

	 *  
	 *  If there is multilevel inheritance   c-> extends b-> extends Abstract class in this case,
	 *  1.b will override Abstract class's abstract method (
	 *  2.c will override Abstract class's abstract method as well despite c class does not extends to Abstract class direct,
	 *  but extends to sub class of Abstract class.
	 *  
	 *  Abstract class can have other abstract sub classes as well.Sub abstract class also should use
	 *  extends keyword to inherit Parent abstract class's property.
	 *  NOTE: Any CONCRETE class which extends to the Sub abstract class,
	 *  it will override both(parent's and child's) all abstract methods.
	 *  Abstract class can have instance and static variables.
	 *  Abstract class can have Constructors.
	 *  Abstract class can have private constructor if it is not one and only constructor in class.
	 *  
	 *                            CAN NOT 
	 *  Abstract class cannot be final or private.(otherwise we cannot inherit using extends)
	 *  Abstract methods can't be added to normal classes. 
	 *  Object of Abstract class can't be created
	 *  
	 *                       
	 *                       HOW TO INVOKE CONCRETE METHODS FROM ABSTRACT CLASS in child and 3rd class?
	 *    1--> In Child class of Abstract class.
	 *           -> 1. from non-static stuff - we can directly call Abstract class's variables and methods.
	 *           -> 2. from static stuff- static stuff directly, non-static stuff with Child class's object.
	 *    2--> In 3rd class, to non-static stuff only by creating an object of child class.
	 *         using Child class object we can call childObj.methodName() and childObj.variable .   
	 *    3--> In 3rd class, to static stuff : abstractClassName.staticVariable and abstractClassName.staticMethod();
	 *          
	
	                
	 *                        ABSTRACT METHODS                
	 * Abstract methods can be return type and void and have parameters,but never can have a body.
	 *  -->  public abstract void draw();   --> void, but no body
        -->  public abstract int drawLine(String line);  --> return type,but no body 
        
	 * Abstract method informs the feature/behaviour in methodName but we don't see the implementation details.
	 * ABSTRACT METHODS CAN'T BE ADDED TO NORMAL CLASSES.
	 * If Abstract class has concrete static method, from 3ed class we can access by ClassName.method().
	                        
	                         VARIABLES
	 *  Abstract class can have instance and static variables and final variables.
	 *  Variables can be any access modifier.
	

        
	 
	 *                      ABSTRACT CLASS CONSTRUCTOR
	 * Abstract class can have regular constructor.(not abstract)
	 * Once we create an object of child class,then Abstract class constructor will run.
	 * Abstract class can have non-args and parametrized constructors, there is no limitation
	 * Can have n number constructors.
	 * Abstract class can have private constructor if it is not one and only constructor in class.
	 * */

}

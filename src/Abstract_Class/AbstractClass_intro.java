package Abstract_Class;

public class   AbstractClass_intro {
    /*
     *                       ABSTRACT CLASS
     *  Using "abstract" keyword to create an abstract class.
     *  -> public abstract class className {
     *  }
     *  We cannot create an object of abstract class. !
     *  Abstract class has both abstract method and concrete methods. Or it may or may not have abstract methods.
     *  Regular class extends to abstract class,once it extends then regular class makes contract with abstract class
     *  that ,Child regular class will override (implement) Abstract class's all unimplemented (abstract)
     *  methods.Always regular class is child of abstract class.
     *  MUST be used Child class's object to access Abstract class's concrete methods and class variables from 3rd class.
     *  If there is multilevel inheritance   c extends b extends Abstract class in this case.
     *  1.b will override Abstract class's abstract method (
     *  2.c will override Abstract class's abstract method as well despite c class does not extends to Abstract class direct,
     *  but extends to sub class of Abstract class.
     *
     *  Abstract class can have other abstract sub classes as well.Sub abstract class also should use
     *  extends keyword to inherit Parent abstract class's property.
     *  Any class which extends to the Sub abstract class,
     *  it will override both(parent and child) abstract classes all abstract methods.
     *  Abstract class can have instance and static variables with all kind access modifiers.
     *  Abstract class can have Constructors.
     *  Abstract class can have private constructor if it is not one and only constructor in class.

                          CAN NOT
	 *  Abstract class cannot be final or private.(otherwise we cannot inherit)
	 *  Abstract methods can't be added to normal classes.
	 *  Object of Abstract class can't be created

	                        ABSTRACT METHODS
	 * Abstract methods can be return type and void and have parameters,but never can have a body.
	 *  -->  public abstract void draw();   --> void, but no body
        -->  public abstract int drawLine(String line);  --> return type,but no body

	 * Abstract method informs the feature/behaviour in methodName but we don't see the implementation.
	 * ABSTRACT METHODS CAN'T BE ADDED TO NORMAL CLASSES.
	 * If Abstract class has regular static method, from 3ed class we can access by ClassName.method().

	                            VARIABLES
	 *  Abstract class can have instance and static and final variables.
	 *  Variables can be any access modifier.
     */


}

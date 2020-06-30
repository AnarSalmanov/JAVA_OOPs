package Interfaces;

public class Interface_intro {

    /**                            INTERFACE
     *  Interface is created using interface keyword in the regular class or in eclipse we can
     directly create an interface.
     ex: -> public interface Cars{
     }
     *  The concrete class can implements n number of Interface unlike abstract
     class(concrete class can extends only 1 Abstract class)
     *  We can not create an object of interface as well.
     *  Interface can have another sub Interface.
     *  A normal class implements to Interface but Interface extends to another Interface !
     *  If a regular class extends to another class or abstract class and at the same time implements to
     *  one or more Interfaces, then class first extends then implements and that class
     *  must override all abstract methods of Abstract class and Interface.
     *  Interface cannot be final or private Otherwise other classes can't implement that.
     *  Everything in interface must be public
     *
     *                           CAN NOT HAVE
     *  Can't have a Constructor.
     *  Can't create an object of interface as well.
     *  Can't be final or private Otherwise other classes can't implement that.
     *
     *
     *
     *                             INTERFACE VARIABLES
     *  Interface can have only constant variables
     *    -> public static final int NUMBER=100; !
     *  Variables must be initialized the value directly in class once it declared.
     *  Can't be assigned value inside static block  or in init block or inside any method etc.
     *  Can't be changed/updated, can be used only as they are .
     *  Can be accessed only using InterfaceName.variable.
     *
     *
     *                             INTERFACE METHODS
     * 1.Abstract methods:  - Can have return type or not but never can have body.
     *    --> public abstract int drawLine(String line); - with parameter and return type , no body
     *    --> public abstract void draw(); - without return type , no body
     *
     * 2. Public static methods:
     *    --> public static void method () {     - Can't be overridden, will become hidden.
     *          }
     * 3. Public default methods:
     *   --> public default void method () {     - Can be overridden.
     *          }
     *
     *
     */


}

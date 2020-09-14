package Inheritance;

public class Inheritance_intro {

    /**                          INHERITANCE
     * Inheritance is Parent child relations between 2 classes.
     * We use extends keyword to establish this connection for Parent regular or abstract classes
     * Also we use implements keyword to inherit from interfaces.
     * Child class extends/implements Parent class.
     * This called is Relationship !
     * Child class acquires to Parent's property and that property now belongs to Child as well.
     * Can access to any type of access modifiers except private members in same package,
     outside of package can access to public and protected..
     * It is like to initialize value, to invoke method from Parent class everything happens like
     all actions happens in Child class itself.
     * Static methods of child class can access Parent's class non static members using Child class obj.
     Child obj = new Child ();
     * If Child and Parent are in same package,in Child is visible public, default and protected.
     * If Child and Parent are in different package,in Child is visible public and protected.
     * Constructor not inherited from Parent class.( not visible from child class)
     * Private variables and methods are not visible in Child class, which means not inherited.!
     *
     *                    HIDING STATIC METHODS AND VARIABLES
     * Static members of parent class are visible in child class.
     * Inherited static methods and static variables are hidden, can not be overridden!
     * If we have static method and static instance variable in Parent class and in Child class we want to create
     * exact same static method and same static instance variable , then we can create it, both classes will have
     * exact same static method and static variable , but Parent class static method and variable will not be overridden.
     * because compiler will hide them,compiler will see only Child class static method and static variable.
     * Parent class method and variable will be hidden. Will not be overridden.
     *
     */

}

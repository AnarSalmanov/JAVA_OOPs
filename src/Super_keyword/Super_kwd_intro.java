package Super_keyword;

public class Super_kwd_intro {

	/**
	 *                           super()
	 * Used to call Parent class constructor , should be placed in 1st statement of Child class constructor;
	 * When we create an object of Child class (inheritance) , it will always run Parent class constructor first.
	 * If a parent has only 1 Constructor with parameter, 
	 * then when Child class extends to Parent class compiler will complain,
	 * Parent class has parametrized constructor ,create a constructor 
	 * and in 1st statement of constructor put super(arg ) method with parameter inside.
	 * When we create a object of child class,those parameter inside super () method will be passed and feed parent constructor
	 * and as soon as child class object created , parent class and child class constructors will
	 * run both (because in child we passed super() meethod)
	 *   super(parameter);               
	 *                      
	 *                          CAN NOT
	 *  super() method can not be inside  any method , static block , static methods .
	 *  super. can not be inside any static block , static methods .
	 *  
	 * 
	 * 
	 * 
	 *                            super.
	 * Used to call from child class Instance variables and Methods Of Parent class,if in sub class
	 * exist same name variables and methods, used to avoid overriding.Because this way it will execute both statements,
	 * parent and child. Because if we dont use super. keyword then we will be accessing only to 
	 * overridden , child class members.
	 *   
	 *      super.variableName
	 *      super.methodName();
	 */
	
	
	
	
	
}

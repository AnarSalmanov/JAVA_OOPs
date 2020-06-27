package This_keyword;

public class This_kwd_intro {

	/**                       this.
	 * this keyvord - is used to differentiate instance variable from local variable.
	 * This way we say to JVM that, this.variable (global variable), useful if you
	 * have same name local and global variable. In most cases it is used when we
	 * crate a Setter method if Setter method parameter variable name is same with
	 * instance variable , otherwise JVM will think we just assignin parameters
	 * value back to parameter value.
	 * 
	 *                       this ()
	 * this() method - is used to call constructor from another constructor, can be used only 
	 * inside the constructor , outside of constructor anywhere.
	 * If you use it inside constructor (not common used) you have to put in 1st
	 * statement.When we call any constructor inside the constructor in class , 
	 * we pass parameter of construtor like this this(arg 1, arg 2) etc.
	 * 
	 *                       CAN NOT
	 * this () method cannot be used inside any method , static block and static methods.
	 * this. cannot be used inside any static method or static block.
	 */

	String firstName;
	String lastName;

	public void setVariables(String name, String lastName) {
		this.firstName = name; // --> We say, instance variable "name" = parameter"name"
		this.lastName = lastName; // We say, instance variable "lastname" = parameter lastname.
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	// Custom method -> returns String
	public String myInfo() {
		return firstName + "| " + lastName + " |";
	}

	public static void main(String[] args) {

		This_kwd_intro obj1 = new This_kwd_intro();
		obj1.setVariables("Anar", "Salmanov");
		String fisrtname = obj1.getFirstName();
		String lastname = obj1.getLastName();
		System.out.println("FullName is " + fisrtname + " " + lastname);
		System.out.println(obj1.myInfo());

	}

}

package Class_Object;

public class Employee {

	// Data information of class -Global variables
	String name;
	String lastName;
	String email;
	String job;
	double hourlySalary;
	int employee_id;

	static {
		System.out.println("This is static block of Employee class");
	}

	// main method
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "Xose";
		emp1.lastName = "Mari";
		emp1.email = emp1.name + emp1.lastName + "@yahoo.com"; // even in same class we must call non-static global
		emp1.job = "Engineer"; // variable with object
		emp1.hourlySalary = 65.50;
		emp1.employee_id = 113;

		emp1.work();
		emp1.getPaid();

		Employee emp2 = new Employee();
		emp2.name = "Bob";
		emp2.lastName = "Marley";
		emp2.email = emp2.name + emp2.lastName + "@yahoo.com"; // even in same class we must call non-static global
		emp2.job = "Scrum Master"; // variable with object
		emp2.hourlySalary = 70.50;
		emp2.employee_id = 114;

		emp2.work();
		emp2.getPaid();

	}

	// Behaviours of class-Methods
	public void work() {
		System.out.println(name + " " + lastName + " is working as " + job + "\n" + "contact email " + email);
	}

	public void getPaid() {
		System.out.println(name + " " + lastName + " yearly gets paid " + hourlySalary * 2080);
	}

}

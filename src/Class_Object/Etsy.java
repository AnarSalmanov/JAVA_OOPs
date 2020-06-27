package Class_Object;

public class Etsy {

	/**
	 * Create 2 object of this class, encapsulate the variables and acces from
	 * EtcyAccounts class with Getter and Setter methods Create one more Setter
	 * method with this keyord, create 3rd objet use with this keyword Setter
	 */

	private String email;
	private String password;
	private String firstname;

	public void setVariables(String mail, String passw, String name) {
		email = mail;
		firstname = name;
		if (passw.length() >= 6) {
			password = passw;
		} else {
			System.out.println("password length is less than 6 charachters");
		}
	}

	public void setVariableWithThisKeyword(String email, String password, String firstname) {
		this.email = email;
		this.firstname = firstname;
		if (password.length() >= 6) {
			this.password = password;
		} else {
			System.out.println("Password must be at least 6 characters");
		}
	}

	public String getFirstName() {
		return firstname;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

}

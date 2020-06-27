package Class_Object;

public class EtsyAccounts {

	public static void main(String[] args) {

		Etsy account1 = new Etsy();
		account1.setVariables("a@n.com", "1234", "Lola");
		String firstName1 = account1.getFirstName();
		String email1 = account1.getEmail();
		String password1 = account1.getPassword();
		System.out.println(email1 + " " + firstName1 + " " + password1);

		Etsy account2 = new Etsy();
		account2.setVariables("b@z.com", "567899", "Nina");
		String firstName2 = account2.getFirstName();
		String email2 = account2.getEmail();
		String password2 = account2.getPassword();
		System.out.println(email2 + " " + firstName2 + " " + password2);

		Etsy account3 = new Etsy();
		account3.setVariableWithThisKeyword("mmm@mail.com", "131313", "Layla");
		String firstName3 = account3.getFirstName();
		String email3 =account3.getEmail();
		String password3 = account3.getPassword();
		System.out.println(email3 + " " + firstName3 + " " + password3);
		
		
		
		
		
		
	}

}

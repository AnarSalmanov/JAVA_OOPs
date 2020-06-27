package Warmup_Abstraction;

public class RegularUser extends SlackUser{
	


	int groupNumber;

	
	
	public RegularUser(String name, int age, int groupNumber) {
		super("Lola", 13);
		this.groupNumber=groupNumber;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending message from REGULAR user to " +  message);
	}
	
	
	public void joinAgroup(int groupNumber) {
		System.out.println("Joining group from Regular class");
		this.groupNumber=groupNumber;
	}

}

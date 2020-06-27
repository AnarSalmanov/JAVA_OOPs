package Warmup_Abstraction;

public class AdminUser  extends SlackUser{
	
	public AdminUser(String name, int age) {
		super(name, age);
	}

	boolean isOwner;

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending message from AdminUser to " + message);
	}

	
   public void activateUser (String name) {
	   System.out.println("Admin class is activating user " + name);
   }
	
	public void deactivateUser (String name) {
		System.out.println("Deactivating the user " + name);
	}
	
	
	
}

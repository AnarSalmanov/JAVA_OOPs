package Warmup_Abstraction;

public abstract class SlackUser {

	String name;
	int age;
	
	
	public SlackUser(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	
	public abstract  void sendMessage (String message);
		
	
	
	
	
}

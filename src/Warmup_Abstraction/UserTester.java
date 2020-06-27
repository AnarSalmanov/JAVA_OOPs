package Warmup_Abstraction;

public class UserTester {
	
	public static void main(String[] args) {
		
		RegularUser reg = new RegularUser("Anar", 33,77);
		reg.joinAgroup(15);
		reg.sendMessage("Mayte");
		RegularUser reg2 = new RegularUser("Samir", 31, 707);
		reg2.joinAgroup(12);
		reg2.sendMessage("Mora");
		
		AdminUser admin = new AdminUser("Xosemi" , 40);
		admin.activateUser("Xezer");
		admin.sendMessage("Xezer");
		admin.deactivateUser("Xezer");
		
	}
	
   
	
	
	

}

package This_keyword;

public class Return_this {
	
	private int result;
	

	public Return_this plus(int a, int b) {
		result=a+b;  // here we assignng value to Instance variable when it called.
		return this;
	}
	
	
	
	public static void main(String[] args) {
		 Return_this rt = new Return_this();
		 rt.plus(5, 10);
		 System.out.println(rt.result);   // --> 15
		
		
		
		
	}
	
	
	
	
	
	
	
}

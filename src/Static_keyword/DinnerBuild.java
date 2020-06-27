package Static_keyword;

public class DinnerBuild {
	
	

	public static void main(String[] args) {
		Dinner d = new Dinner();
		d.takeAslice();
		System.out.println(Dinner.pizzaSlice);
		d.takeAslice(3);
		System.out.println(Dinner.pizzaSlice);
	}

}

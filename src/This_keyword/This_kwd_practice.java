package This_keyword;

public class This_kwd_practice {

	/**
	 * TASK : Encapsulate class variables Add GETTER and SETTER Create a void method
	 * named accelerate, increase a speed by mpg parameter (int mph), print the
	 * carmodels new speed 
	 */

	private String carModel;
	private int speed;

	public void setVariables(String carModel, int speed) {
		this.carModel = carModel;
		this.speed = speed;
	}

	public String getCarModel() {
		return carModel;
	}

	public int getSpeed() {
		return speed;
	}

	public void accelerate(int mph) {
		speed+=mph;    // here no need to this keyword becaue it is pointing to instance variable.
		System.out.println(carModel+ "'s After accelerate speed is :"  + speed);
	}

	//MAIN METHOD
	public static void main(String[] args) {
		This_kwd_practice obj = new This_kwd_practice();
		obj.setVariables("BMW", 110);
		int beforeAccelerate = obj.getSpeed();
		System.out.println("Before accelerate speed is : " + beforeAccelerate);
		obj.accelerate(40);

	}

}

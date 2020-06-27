package Warmup_Polymorphism;

public class NewYear extends Holiday {

	int dayOfCount;

	@Override
	public void sendHolidayMessage() {
		System.out.println("This holiday message comes fom NewYear class");
	}

	public void countDown_WelcomeNewYear() {
		dayOfCount = 20;
		System.out.println(dayOfCount + " left till NewYear");
	}

}

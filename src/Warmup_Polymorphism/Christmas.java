package Warmup_Polymorphism;

public class Christmas extends Holiday {

	int giftCounts;

	@Override
	public void sendHolidayMessage() {
		System.out.println("This holiday message comes from Christmas class");
	}

	public void sendHolidayMessage (String receiver) {
		System.out.println("Christmas message to " + receiver);
	}
	
	public void exchangeGifts() {
		giftCounts = 10;
		System.out.println("I will present " + giftCounts + " gifts ");
	}

}

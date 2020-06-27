package Warmup_Polymorphism;

public class Holidays_Test {

	public static void main(String[] args) {
		
		// With parent class object in Polymorphism principes, directly we can call only overriden methods and instance variables.
		Holiday holiday = new Christmas();
		holiday.sendHolidayMessage();
		
		
		// In order to call non-overriden methods we have 2 ways
		   // 1. With the object of Child class itself
		Christmas christmas = new Christmas();
		christmas.exchangeGifts();

		     //2 . Downcasting
		Christmas ch = (Christmas)holiday;
		ch.exchangeGifts();
		
		
	//-------------------	
		
		holiday = new NewYear();   
		holiday.sendHolidayMessage();
		NewYear newYear = new NewYear();
		newYear.countDown_WelcomeNewYear();
		// or
		NewYear nw =  (NewYear)holiday;
		nw.countDown_WelcomeNewYear();
		
	

	}
}

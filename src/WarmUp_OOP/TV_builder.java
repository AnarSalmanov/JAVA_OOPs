package WarmUp_OOP;

public class TV_builder {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.setVariables(3, 4, true, "LG");
		
	//	tv1.immediateOff();   --> inside this method we re-assigned value to class variable.
		tv1.turnOn();
		tv1.turnOff();
		tv1.setChannel();
		tv1.setVolume();
		tv1.channelUp();
		tv1.channelDown();
		tv1.voulumeUp();
		tv1.voulumeDown();

		int channel = tv1.getChannel();
		int volume = tv1.getVolume();
		boolean isOn = tv1.getOnOf();
		String brand = tv1.getBrand();

		System.out.println("Channel is " + channel);
		System.out.println("Volume is " + volume);
		System.out.println("Tv is on = " + isOn);
		System.out.println("TV brand is  " + brand);

	}

}

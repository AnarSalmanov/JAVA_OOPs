package WarmUp_OOP;

public class TV {

	private int channel;
	private int volumeLevel;
	private boolean on;
	private String brand;

	public TV() {
		System.out.println("TV class constructor is running");
	}

	// Setter

	public void setVariables(int channel, int volumeLevel, boolean on, String brand) {
		this.channel = channel;
		this.volumeLevel = volumeLevel;
		this.on = on;
		this.brand = brand;
	}

	// Getters

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volumeLevel;
	}

	public boolean getOnOf() {
		return on;
	}

	public String getBrand() {
		return brand;
	}

	// Methods

	public void immediateOff() {
		on = false;
		System.out.println("Turned off ");
	}

	public void turnOn() {
		if (on == false) {
			System.out.println("It was off now turned on");
		} else {
			System.out.println("Tv is already on");
		}
	}

	public void turnOff() {
		if (on == true) {
			System.out.println("It was on now turned off");
		} else {
			System.out.println("Tv is already Off");
		}
	}

	public void setChannel() {
		if (on == true) {
			if (channel >= 1 && channel <= 120) {
				System.out.println("Switched the tv to the channel " + channel);
			} else {
				System.out.println(channel + " is not in 1-120 channel range");
			}
		} else {
			System.out.println("TV is off , cannot set channel");
		}
	}

	public void setVolume() {
		if (on == true) {
			if (volumeLevel >= 8) {
				System.out.println("The allowed volume level is 1-7 , cannot make volume " + volumeLevel);
			} else {
				System.out.println("Settled the volume to  " + volumeLevel);
			}
		} else {
			System.out.println("TV is off , cannot set volume");
		}
	}

	public void channelUp() {
		if (on == true) {
			if (channel >= 120) {
				System.out.println("Max channel is 120, cannot go up");
			} else {
				System.out.println("Switching channel up to " + (channel + 1));
			}
		} else {
			System.out.println("TV is off, cannot make channel up");
		}
	}

	public void channelDown() {
		if (on == true) {
			if (channel <= 1) {
				System.out.println("Min channel is 1 , cannot go down");
			} else {
				System.out.println("Switching channel down  to " + (channel - 1));
			}
		} else {
			System.out.println("TV is off, cannot make channel down");
		}
	}

	public void voulumeUp() {
		if (on == true) {
			if (volumeLevel >= 7) {
				System.out.println("Cannot make volume up,  maximum volume is 7");
			} else {
				System.out.println("Making wolume + 1 = " + (volumeLevel + 1));
			}
		} else {
			System.out.println("TV is off, cannot make volume up");
		}
	}

	public void voulumeDown() {
		if (on == true) {
			if (volumeLevel <= 1) {
				System.out.println("Cannot make volume down,  minimum volume is 1");
			} else {
				System.out.println("Making wolume - 1  = " + (volumeLevel - 1));
			}
		} else {
			System.out.println("TV is off, annot make volume down");
		}
	}
}

package Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class Drivers_test {
	public static void main(String[] args) {

		Webdriver driver1 = new ChromeDriver();
		driver1.open();
		driver1.navigateToUrl("www.mail.az");
		driver1.close();
		ChromeDriver org1 = new ChromeDriver();
		org1.setChromeOptions(new String[] { "Anar", "Samir" });

		Webdriver driver2 = new FireFoxDriver();
		driver2.open();
		driver2.navigateToUrl("www.mail.az");
		driver2.close();

		FireFoxDriver forg = new FireFoxDriver();
		forg.setFirefoxDriver(new ArrayList<>(Arrays.asList(new String[] { "Xezer", "Elvin" })));

	}

}

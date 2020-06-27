package Polymorphism;

import java.util.List;

public class FireFoxDriver implements Webdriver {

	@Override
	public void navigateToUrl(String URL) {
		System.out.println("Firefox driver navigating to URL " + URL);
	}

	@Override
	public void open() {
		System.out.println("Firefox driver is opening");
	}

	@Override
	public void close() {
		System.out.println("Firefox driver is closing");
	}

	@Override
	public void quit() {
		System.out.println("Firefox driver is quiting");
	}

	public void setFirefoxDriver(List<String> str) {

	}

}

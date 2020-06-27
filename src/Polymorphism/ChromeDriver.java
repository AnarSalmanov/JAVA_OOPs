package Polymorphism;

public class ChromeDriver implements Webdriver {

	@Override
	public void navigateToUrl(String URL) {
		System.out.println("Chrome driver getting the url " + URL);

	}

	@Override
	public void open() {
		System.out.println("Chrome driver opening");

	}

	@Override
	public void close() {
		System.out.println("Chrome driver is closing ");
	}

	@Override
	public void quit() {
		System.out.println("Chrome driver is quiting ");

	}

	public void setChromeOptions(String [] str) {
		
	}
	
	
	
	
	
	
	
	
	
}

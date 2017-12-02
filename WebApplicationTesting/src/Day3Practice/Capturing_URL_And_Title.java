package Day3Practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturing_URL_And_Title {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();

	}

}

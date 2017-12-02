package day2practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Automation {



	public static void main(String[] args) {
		
	FirefoxDriver driver = new FirefoxDriver();

	driver.get("http://facebook.com");
		
	driver.close();
	
	}

}

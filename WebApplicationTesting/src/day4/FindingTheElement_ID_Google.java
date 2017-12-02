package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingTheElement_ID_Google {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("u_0_2")).click();
		driver.close();
		
			
		
		
		
		
	}

}

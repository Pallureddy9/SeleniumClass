package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class facebookLogin_back_Homepage {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		//perform click on Login element
		driver.findElement(By.id("u_0_2")).click();
		driver.navigate().back();
		
		Sleeper.sleepTightInSeconds(10);
		
		driver.findElement(By.id("email")).sendKeys("pallu_reddy5@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("itsalhappens");
		driver.findElement(By.id("u_0_2")).click();
		driver.close();
		
	}

}

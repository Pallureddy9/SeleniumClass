package mouseHoverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class com_flipcartMouse {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
		Actions Act = new Actions(driver);
		WebElement Electronics = driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
		
		
		Act.moveToElement(Electronics).perform();
		
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span")).click();
		
		
		
		driver.close();
		

	}

}

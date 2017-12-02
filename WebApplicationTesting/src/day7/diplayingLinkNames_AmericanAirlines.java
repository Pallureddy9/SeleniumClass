package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.thoughtworks.selenium.webdriven.commands.GetText;

import day1practice.SystemOutPrint;

public class diplayingLinkNames_AmericanAirlines {

	private static final int i = 0;

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.americanairlines.com/homePage.do?locale=en_US");
		
		List<WebElement>AmericanAirlineslinks = driver.findElements(By.tagName("a"));
		
		System.out.println(AmericanAirlineslinks.size());
		Sleeper.sleepTightInSeconds(5);
		
		for(int i=0;i<AmericanAirlineslinks.size();i++)
		 {
			if(AmericanAirlineslinks.get(i).isDisplayed());
			{
				System.out.println(AmericanAirlineslinks.get(i).getText());
				AmericanAirlineslinks.get(i).click();
			
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				System.out.println();
				
				driver.navigate().back();
				
				AmericanAirlineslinks= driver.findElements(By.tagName("a")); 
			}
			
				
			driver.close();
			 
		}
	
	}
	
}

				

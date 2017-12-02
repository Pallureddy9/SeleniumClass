package com.ExcelOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register_NewToursApplication {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country = driver.findElement(By.name("country"));
		List<WebElement> countrynames = country.findElements(By.linkText("option"));
		
		for(int i=0;i<countrynames.size();i++)
		{
			System.out.println(countrynames.get(i).getText());
		}
		driver.close();
		
		
		
		
	



	}

}

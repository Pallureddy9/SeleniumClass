package com.screenshots_TSRTC;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Screenshots_TRSRTC {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock = driver.findElement(By.className("menu-wrap"));
		List<WebElement>HeaderLinks = HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderLinks.size());
		
		for(int i=0;i<HeaderLinks.size();i++)
		{
			String linkname = HeaderLinks.get(i).getText();
			System.out.println(linkname);
			HeaderLinks.get(i).click();
			
			Sleeper.sleepTightInSeconds(5);
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			// Sleeper.sleepTightInSeconds(5);
			
			 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(srcFile, new File ("C:\\Users\\mw\\Desktop\\PallaviSelenium\\TSRTC_ScreenShots\\"+linkname+".png"));
			
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(5);
			
			HeaderBlock = driver.findElement(By.className("menu-wrap")); 
			HeaderLinks = HeaderBlock.findElements(By.tagName("a"));
			System.out.println();
			
		}
				
		
		
		
		driver.close();
		
		
		
		
	}

}

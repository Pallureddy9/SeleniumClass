package day8;

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

public class Com_Tsrtc_Screenshots {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
	
		WebElement headerblock = driver.findElement(By.className("menu-wrap"));
		List<WebElement>headerlinks= headerblock.findElements(By.tagName("a"));
		
		System.out.println(headerlinks.size());
		
		driver.findElement(By.className("selectedtabcopy")).click();
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\mw\\Desktop\\PallaviSelenium\\TSRTC_ScreenShots\\Homepage.png"));
		
		driver.navigate().back();
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.linkText("Vajra Booking")).click();
		File srcFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1, new File("C:\\Users\\mw\\Desktop\\PallaviSelenium\\TSRTC_ScreenShots\\VajraBooking.png"));
		
		driver.navigate().back();
		
		Sleeper.sleepTightInSeconds(3);
		
		driver.findElement(By.linkText("My Ticket")).click();
		 File srcFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile2, new File("C:\\Users\\mw\\Desktop\\PallaviSelenium\\TSRTC_ScreenShots\\MyTicket.png"));
		 
		 driver.navigate().back();
		 
		 Sleeper.sleepTightInSeconds(5);
		 
		 driver.findElement(By.linkText("Cancel Tickets")).click();
		 File srcFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile3, new File("C:\\Users\\mw\\Desktop\\PallaviSelenium\\TSRTC_ScreenShots\\CancelTickets.png"));
		 
		 driver.navigate().back();
		 
		 Sleeper.sleepTightInSeconds(3);
		 
		 driver.findElement(By.linkText("Cancelled Services")).click();
		 File srcFile4= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile4,new File("C:\\Users\\mw\\Desktop\\PallaviSelenium\\TSRTC_ScreenShots\\CancelledServices.png"));
		 
		 driver.navigate().back();
		 
		 Sleeper.sleepTightInSeconds(3);
		 
		 driver.findElement(By.linkText("About Us")).click();
		 File srcFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile5, new File("C:\\Users\\mw\\Desktop\\PallaviSelenium\\TSRTC_ScreenShots\\AboutUs.png"));
		 
		 driver.navigate().back();
		 Sleeper.sleepTightInSeconds(3);
		 
		 driver.findElement(By.linkText("Driver Info")).click();
		 File srcFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile6, new File("C:\\Users\\mw\\Desktop\\PallaviSelenium\\TSRTC_ScreenShots\\DriverInfo.png"));
		 
		 driver.navigate().back();
		 
		 
		 
		 
		 
		
		
		
		driver.close();
		
		

	}

}

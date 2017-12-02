package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Com_Screenshot_Newtours {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		{
			FileUtils.copyFile(srcfile, new File("C:\\Users\\mw\\Desktop\\NewTourScreenShots\\Signon.png"));
			
			}
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("REGISTER")).click();
		File srcfile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		{
			FileUtils.copyFile(srcfile1,new File("C:\\Users\\mw\\Desktop\\NewTourScreenShots\\Register.png"));
		}
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("SUPPORT")).click();
		 File srcfile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 {
			 FileUtils.copyFile(srcfile2, new File("C:\\Users\\mw\\Desktop\\NewTourScreenShots\\Support.png"));
			 
		 }
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("CONTACT")).click();
		File srcfile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		{
			FileUtils.copyFile(srcfile3, new File("C:\\Users\\mw\\Desktop\\NewTourScreenShots\\Contact.png"));
		}
		
		
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img").click();
		
		driver.close();
		
		
         


	}

}

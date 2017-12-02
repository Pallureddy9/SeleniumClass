package com.TestNG;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistration_Data_Driven_Excel 
{
	FirefoxDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test(priority=2)
	public void NewUserRegistration() throws IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\mw\\Desktop\\PallaviSelenium\\NewTours_UserRegistrationBook1.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1"); 
		
		
		int rowCount = sheet.getLastRowNum();
		for(int i=1;i<rowCount;i++)
		{
			Row r =sheet.getRow(i);
			
			driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
			
			double d= r.getCell(2).getNumericCellValue();
			long x=(long)d;
			String phonenumber=Long.toString(x);
			
			
			driver.findElement(By.name("phone")).sendKeys(phonenumber);
			driver.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
			driver.findElement(By.name("address2")).sendKeys();
			driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
			
			double p=r.getCell(7).getNumericCellValue();
			long y =(long)p;
			String postalCode=Long.toString(y);
			
			driver.findElement(By.name("postalCode")).sendKeys(postalCode);
			driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
			
			driver.findElement(By.name("email")).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElement(By.name("password")).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(9).getStringCellValue());
			
			Sleeper.sleepTightInSeconds(5);
			
			driver.findElement(By.name("register")).click();
			
			System.out.println("User registered Successfully");
			
			
			driver.navigate().back();
			
			
			
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}

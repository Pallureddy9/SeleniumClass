package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursApplication_LogInTest
{
	FirefoxDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
	}
	
	@Test
	public void LogIn()
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
	

}

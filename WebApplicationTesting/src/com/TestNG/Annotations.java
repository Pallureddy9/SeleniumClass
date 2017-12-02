package com.TestNG;

import org.testng.annotations.Test;

public class Annotations
{
	@Test 
	public void BrowserLaunch()
	{
		System.out.println("This will Launch Firefox Browser");
	}
	
	@Test
	public void SignIn()
	{
		System.out.println("Login to Gmail");
	}
	
	@Test(enabled=false)
	public void ComposeMail()
	{
		System.out.println("this is compose mail functionality");
	}

}

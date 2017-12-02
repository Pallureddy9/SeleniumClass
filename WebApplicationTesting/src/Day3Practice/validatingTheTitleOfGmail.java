package Day3Practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class validatingTheTitleOfGmail {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
		
		String ExpectedTitle = "Gmail - Free Storage and Email from Google";
		System.out.println(ExpectedTitle);
		
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title Matched - PASS");
		}
		else
		{
			System.out.println("Title Not Matched - FAIL");
		}
		
		String ExpectedURL = "https://www.google.com/gmail/about/";
		System.out.println(ExpectedURL);
		
		String ActualURL = driver.getCurrentUrl();
		System.out.println(ActualURL);
		
		if(ActualTitle.contains(ExpectedURL))
		{
			System.out.println("URL Matched - PASS");
		}
		else
		{
			System.out.println("URL NotMatched - FAIL");
		}
			
		driver.close();
	}


}
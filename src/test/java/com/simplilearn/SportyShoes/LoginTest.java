package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test(priority = 1)
	public void loginUserWithIncorrectCredentials() throws InterruptedException
	{
		try {
		WebDriver driver = BaseTest.getDriver();
		
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		
		//logs out of the application if its already logged in
		if(driver.getPageSource().contains("Hello Subi !"))
		{
			home.logoutUser();
		}
		
		
		login.loginUser("subbhashree@abc.com","subi@123");//login to the website using subbhashree@abc.com email and subi@123 password
		
		//To check if user is unable to login with wrong credentials
		Thread.sleep(2000);
		Assert.assertTrue(driver.getPageSource().contains("Message:Invalid User Credentials. Please Try Again.."));//checks if user is unable to login with wrong credentials
		System.out.println("User is unable to login to the Sporty Shoes website with wrong credentials");
		
		home.logoutUser();
		
	}catch(Exception e)
		{
		  e.printStackTrace();  // Log the exception
		}
	}
	
    @Test(priority = 2)
	//Logging in to the Sporty shoes website
	public void loginUser() throws InterruptedException
	{
		WebDriver driver = BaseTest.getDriver();
		
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		
	//logs out of the application if its already logged in
	if(driver.getPageSource().contains("Hello Subi !"))
	{
		home.logoutUser();
	}
	
	login.loginUser("subi@abc.com","subi@123");//login to the website using subi@abc.com email and subi@123 password
	
	Thread.sleep(1000);
	
	//To check if the user has successfully logged in the website
	Assert.assertTrue(driver.getPageSource().contains("Hello Subi !"));//checks if the website is logged in with username Subi
	System.out.println("User Subi has successfully logged into the Sporty Shoes website");
	}
	
	
}


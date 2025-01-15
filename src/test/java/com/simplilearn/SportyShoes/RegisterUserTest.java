package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegisterUserTest extends BaseTest{
	@Test
	//Function to Sign up as a new user 
	public void registerUser()
	{   
		WebDriver driver = BaseTest.getDriver();
		LoginPage login = new LoginPage(driver);
		RegisterUserPage registerUser = new RegisterUserPage(driver);
		
		//Click Register Here Button
		login.registerHereButton();
		
		//Registers the user
		registerUser.register("Subi","subi@abc.com","subi@123");
		
		//To check if the user is successfully registered with the website
		Assert.assertTrue(driver.getPageSource().contains("Hello Subi !"));
		System.out.println("User Subi is successfully registered with Sporty Shoes");
		
	}
	}

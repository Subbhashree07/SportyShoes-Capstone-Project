package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
	@Test
	public void logoutUser() throws InterruptedException{
		WebDriver driver = BaseTest.getDriver();
		HomePage home = new HomePage(driver);
		
		//Logout user
		Thread.sleep(2000);
		home.logoutUser();
		
	}

}

package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfilePageTest extends BaseTest {
	@Test
	//Function to update the User Profile
	public void updateProfile() throws InterruptedException
	{
		WebDriver driver = BaseTest.getDriver();
		
		HomePage Home = new HomePage(driver);
		ProfilePage Profile = new ProfilePage(driver);
		RegisterUserPage registerUser = new RegisterUserPage(driver);
		
		Home.navigateToProfile();//Clicks Profile Button
		
		Profile.clickUpdateProfile();//Clicks Update Profile Button
		
		registerUser.setName("Subbhashree");//Updates Name as "Subbhashree"
		Profile.clickEditProfile();//Clicks Edit Profile button which updates the user name
		
		//checks if the user name is updated as "Subbhashree"
		Assert.assertTrue(driver.getPageSource().contains("Subbhashree Updated Successfully."));
		System.out.println("Subi User profile is successfully updated with new Username");
		
		Home.navigateToHome(); //clicks Home button
		
		//To check if the user has been successfully updated in the Home page
		Assert.assertTrue(driver.getPageSource().contains("Hello Subbhashree !"));
	    System.out.println("User has been successfully updated");
		
		}
	}

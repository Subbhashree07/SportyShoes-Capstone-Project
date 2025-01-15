package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	@FindBy(xpath = "//a[@class='card-link' and @href='/edit-profile']")
	private WebElement UpdateProfilelink;
	
	@FindBy(xpath = "//button[contains(text(),'Edit Profile')]")
	private WebElement EditProfileButton;

public ProfilePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void clickUpdateProfile()
{
	UpdateProfilelink.click();
}

public void clickEditProfile()
{
	EditProfileButton.click();
}
}

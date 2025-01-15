package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="email")
    private WebElement emailtextbox;
	
	@FindBy(id="password")
	private WebElement passwordtextbox;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[contains(text(),'Register Here')]")
	private WebElement newuserregisterButton;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setEmail(String emailId) throws InterruptedException
	{   
		emailtextbox.click();
		emailtextbox.sendKeys(emailId);
	}
	
	public void setPassword(String pwd)
	{
		passwordtextbox.click();
		passwordtextbox.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
	
	public void registerHereButton()
	{
		newuserregisterButton.click();
	}
	
	public void loginUser(String emailId,String pwd) throws InterruptedException
	{
		setEmail(emailId);
		setPassword(pwd);
		clickLogin();
	}
}



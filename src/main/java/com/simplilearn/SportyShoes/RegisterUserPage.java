package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserPage {
	
	@FindBy(id="name")
    private WebElement nametextbox;
	
	@FindBy(id="email")
    private WebElement emailtextbox;
	
	@FindBy(id="password")
    private WebElement passwordtextbox;
	
	@FindBy(xpath = "//button[contains(text(),'Register')]")
	private WebElement registerButton;
	
	public RegisterUserPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setName(String name)
	{
		nametextbox.click();
		nametextbox.clear();
		nametextbox.sendKeys(name);
	}
	
	public void setEmail(String emailId)
	{
		emailtextbox.click();
		emailtextbox.sendKeys(emailId);
	}
	public void setPassword(String pwd)
	{
		passwordtextbox.click();
		passwordtextbox.sendKeys(pwd);
	}
	
	
	public void clickRegister()
	{
		registerButton.click();
	}
	
	public void register(String name,String emailId,String pwd)
	{
		setName(name);
		setEmail(emailId);
		setPassword(pwd);
		clickRegister();
	}

}

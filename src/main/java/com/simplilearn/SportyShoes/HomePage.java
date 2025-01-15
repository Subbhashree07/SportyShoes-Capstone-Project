package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	    //Cart Button
	    @FindBy(xpath = "//a[@class='nav-link' and @href='/cart']") 
		private WebElement Cartbutton;
	    
	    //Orders Button
	    @FindBy(xpath = "//a[@class='nav-link' and @href='/orders']") 
	    private WebElement Ordersbutton;
	    
	    //Profile Button
	    @FindBy(xpath = "//a[@class='nav-link' and @href='/profile']") 
	    private WebElement Profilebutton;
	    
	    //Logout Button
	    @FindBy(xpath = "//a[@class='nav-link' and @href='/logout']") 
	    private WebElement Logoutbutton;
	    
	    //Home Button
	    @FindBy(xpath = "//a[@class='nav-link' and @href='/home']") 
	    private WebElement Homebutton;
	    
	    public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	    
	    //Clicks Home tab
	    public void navigateToHome() throws InterruptedException
	    {   
	    	Thread.sleep(2000);
	    	Homebutton.click();
	    }
	   
	    //Clicks Cart tab
	    public void navigateToCart()
	    {
	    	Cartbutton.click();
	    }
	    
	    //Clicks Orders tab
	    public void navigateToOrders()
	    {
	    	Ordersbutton.click();
	    }
	    
	    //Clicks Logout tab
	    public void logoutUser() throws InterruptedException
	    {
	    	Logoutbutton.click();
	    	Thread.sleep(2000);
	    }
	    
	    //Clicks Profile tab
	    public void navigateToProfile()
	    {
	    	Profilebutton.click();
	    }
}

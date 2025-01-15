package com.simplilearn.SportyShoes;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
	Actions actions;
	WebDriverWait wait ;
	JavascriptExecutor js;
	
	//Add to card element for MaxFit Pro Sports Shoes
	@FindBy(id ="cart901")
	private WebElement addToCart_maxfit_Button;
	
	//Add to card element for Light Stride Performance Sports Shoes
	@FindBy(id ="cart801")
	private WebElement addToCart_lightstrideperformance_Button;
		
	
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		//actions = new Actions(driver);
		js=(JavascriptExecutor)driver;
	}
	
	//To add MaxFit Pro Sports Shoes item to cart by clicking on Add to cart button
	public void addToCartItem1() throws InterruptedException
	{   
		//Add MaxFit Pro Sports Shoes to cart
		Thread.sleep(2000);
	
		js.executeScript("arguments[0].scrollIntoView();",addToCart_maxfit_Button);
		js.executeScript("arguments[0].click()",addToCart_maxfit_Button);
		//actions.moveToElement(addToCart_maxfit_Button).click().perform();
	}
	
	public void addToCartItem2() throws InterruptedException
	{
	//To add MaxFit Pro Sports Shoes item to cart by clicking on Add to cart button
		//Add Lightstride Performance Shoes to cart
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",addToCart_lightstrideperformance_Button);
		js.executeScript("arguments[0].click()",addToCart_lightstrideperformance_Button);
		System.out.println("Lightstride Performance Shoes item is added to cart");
		
	}
}

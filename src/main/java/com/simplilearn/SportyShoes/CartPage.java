package com.simplilearn.SportyShoes;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CartPage {
	JavascriptExecutor js;
	
	//Place Order Button
    @FindBy(id = "place-order") 
	private WebElement PlaceOrderbutton;
    
    //MaxFit Pro Sports Shoes item in cart
    @FindBy(xpath = "//div[@class='media']//h5[text()='MaxFit Pro Sports Shoes']")
	private WebElement maxfitpro_cartitem;
    
    //LightStride Performance Shoes item in cart
    @FindBy(xpath = "//div[@class='media']//h5[text()='LightStride Performance Shoes']")
	private WebElement lightstrideperformance_cartitem;
    
    public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		js=(JavascriptExecutor)driver;
	}
    
    public boolean validatecart()
    {
    	boolean item1isVisible = maxfitpro_cartitem.isDisplayed();
    	boolean item2isVisible = lightstrideperformance_cartitem.isDisplayed();
    	if(item1isVisible&&item2isVisible)
    	{
    		return true;
    	}
    	
    	else {
		return false;
    	}
		
    }
    
    public void placeOrder() throws InterruptedException
    {
    		Thread.sleep(2000);
    		js.executeScript("arguments[0].scrollIntoView();",PlaceOrderbutton);
    		js.executeScript("arguments[0].click()",PlaceOrderbutton);
    		
    	}
    	
	

}

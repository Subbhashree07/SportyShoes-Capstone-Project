package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {
	    
	    //MaxFit Pro Sports Shoes item in Orders page
	    @FindBy(xpath = "//img[@src='9.png'and @alt='Shoe Image'and @class='mr-3']") 
	    private WebElement maxfitpro_orders;
	    
	    
	  //MaxFit Pro Sports Shoes item in Orders page
	    @FindBy(xpath = "//img[@src='8.png'and @alt='Shoe Image'and @class='mr-3']") 
	    private WebElement LightStride_Performance_orders ;
	    
	    public OrdersPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	    
	    public boolean validateorders()
	    {
	    	boolean item1isVisible = maxfitpro_orders.isDisplayed();
	    	//boolean item2isVisible = LightStride_Performance_orders .isDisplayed();
	    	if(item1isVisible)//&&item2isVisible)
	    	{
	    		return true;
	    	}
	    	
	    	else {
			return false;
	    	}
			
	    }
	    
}


package com.simplilearn.SportyShoes;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceOrderTest extends BaseTest {
	@Test
	public void placeOrder() throws InterruptedException {
		WebDriver driver = BaseTest.getDriver();
		
	    CartPage cart = new CartPage(driver);
		HomePage home = new HomePage(driver);
		OrdersPage orders = new OrdersPage(driver);
		
		//Place order of the items in the cart
		cart.placeOrder();
		
		//Validating order placed success message 
	    Assert.assertTrue(driver.getPageSource().contains("Message:Order Placed Successfully with ID:"));
	    System.out.println("Items are successfully ordered in cart");
	    
	    //Navigate to Home tab
	    home.navigateToHome();
	    
	    //Select and navigate to Orders tab
	    home.navigateToOrders();
	    
	    //Validate the display of the ordered items in Orders page
	    assertTrue(orders.validateorders());
	    
	    System.out.println("Items ordered are successfully displayed in the Orders page");
		
		
	}
	
	

}

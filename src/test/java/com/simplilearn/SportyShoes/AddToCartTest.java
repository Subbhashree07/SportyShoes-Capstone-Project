package com.simplilearn.SportyShoes;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCartTest extends BaseTest{
	@Test
	//To add items to cart and check their availability in cart
	public void checkCartmsg() throws InterruptedException{
		WebDriver driver = BaseTest.getDriver();//Use the shared WebDriver instance
		
		//creation of objects to access elements and actions of HomePage,CartPage and AddToCartPage
		HomePage home = new HomePage(driver);
		CartPage cart = new CartPage(driver);
		AddToCartPage addItemToCart = new AddToCartPage(driver);
		
		//Add Item1 Shoe MaxFit Pro Sports shoe to cart
		addItemToCart.addToCartItem1();
		
		//Validating items added to cart success message 
		Assert.assertTrue(driver.getPageSource().contains("Message:Shoe MaxFit Pro Sports Shoes Added Successfully to Cart"));
		System.out.println("MaxFit Pro Sports Shoes item is added to cart message is displayed");
		
		home.navigateToHome();//Navigate to Home
		
		//Add Item2 Shoe LightStride Performance Shoe to cart
		addItemToCart.addToCartItem2();
		
		//Validating items added to cart success message 
		Assert.assertTrue(driver.getPageSource().contains("Message:Shoe LightStride Performance Shoes Added Successfully to Cart"));
		System.out.println("Shoe LightStride Performance Shoes is added successfully to cart message is displayed");
		
		//To check if the added items are available in cart
		home.navigateToHome();
		home.navigateToCart();
	    assertTrue(cart.validatecart());
		System.out.println("Items are successfully added to cart");
	}

}

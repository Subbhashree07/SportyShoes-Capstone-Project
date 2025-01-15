package com.simplilearn.SportyShoes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{ 
	
	private static WebDriver driver;
	
	//Initialization of WebDriver
	@BeforeSuite
	public void setUpSuite()
	{
		WebDriverManager.chromedriver().setup();
		if(driver==null) {
	    driver =  new ChromeDriver();//Initialize the driver
	    driver.manage().window().maximize();//Maximizes the browser
	    
		driver.get("http://localhost:9010/");//Opens the website
		System.out.println("SportyShoes Website is launched");
		}
		
	}
	
	//Method to access the shared WebDriver Instance across classes
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	//Closes the browser after all tests
	@AfterSuite
	public void tearDownSuite()
	{
	if(driver!=null)
	{
		driver.quit();
		System.out.println("AfterTest:SportyShoes Website is closed");
	}
    }
}

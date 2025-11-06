package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	protected WebDriver driver;
	
	
	@BeforeSuite
	public void setUp() {
		
		
    
	
			driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}

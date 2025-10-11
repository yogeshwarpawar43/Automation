package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\Users\yoges\eclipse-workspace\learn.selenium.com\src\test\resources\driversdriverschromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("added");
	}

}

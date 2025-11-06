package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.selenium.utiles.ConfigReader;

public class BaseClass {

	protected WebDriver driver;
	protected ConfigReader config;
	protected ConfigReader testData;

	@BeforeSuite
	public void setUp() {
		// Load both property files
		config = new ConfigReader(
				"C:\\Users\\yoges\\eclipse-workspace\\SeleniumMaster\\src\\test\\resources\\config\\config.properties");
		testData = new ConfigReader(
				"C:\\Users\\yoges\\eclipse-workspace\\SeleniumMaster\\src\\test\\resources\\config\\locators.properties");
		String browser = config.getProperty("browser");
		String url = config.getProperty("url");

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}

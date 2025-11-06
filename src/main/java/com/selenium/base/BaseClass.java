package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.selenium.utiles.ConfigReader;

public class BaseClass {

	protected WebDriver driver;
	protected static ConfigReader config;
	protected static ConfigReader testData;

	static {
        try {
	   String projectPath = System.getProperty("user.dir");

       // Build relative paths to config files
       String configPath = projectPath + "/src/test/resources/config/config.properties";
       String testDataPath = projectPath + "/src/test/resources/config/locators.properties";

       // Load both property files
       config = new ConfigReader(configPath);
       testData = new ConfigReader(testDataPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	
	@BeforeSuite
	public void setUp() {
		
		
     
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

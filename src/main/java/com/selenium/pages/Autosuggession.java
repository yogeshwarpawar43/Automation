package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.base.BaseClass;
import com.selenium.utiles.ConfigReader;

public class Autosuggession{
	
	private WebDriver driver;
    private ConfigReader testData;
    
    
	private By auto_suggesst;
	//private By select_india;
	
	public Autosuggession(WebDriver driver,ConfigReader testData) {
		this.driver = driver;
		this.testData = testData;
		this.auto_suggesst = By.xpath(testData.getProperty("auto_xpath"));
		//this.select_india = By.id(testData.getProperty("india_select_id"));
	}
	
	public WebElement suggession() {
		WebElement auto = driver.findElement(auto_suggesst);
		auto.sendKeys("india");
		return auto;
		/*WebElement send_key = driver.findElement(auto_suggesst);
		send_key.sendKeys("india");
		driver.findElement(select_india).click();
		return send_key.getAttribute("india");*/
	}

}

package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.selenium.utiles.ConfigReader;

public class RadioButtonPage {
	
	 private WebDriver driver;
	 private ConfigReader testData;

	    private By radiobutton; // we will initialize in constructor
	
	//private By radiobutton = By.xpath(testData.getProperty("radio_xpath"));

	public RadioButtonPage(WebDriver driver, ConfigReader testData) {
        this.driver = driver;
        this.testData = testData;
        this.radiobutton = By.xpath(testData.getProperty("radio_xpath"));
    }
	
	public boolean clickradio(){
		WebElement radio = driver.findElement(radiobutton);
		radio.click();
		return radio.isSelected();
		
	}

}

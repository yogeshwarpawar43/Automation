package com.selenium.pages;

import org.openqa.selenium.WebDriver;

public class TestPage {

	WebDriver driver;
	public TestPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String car() {
		String color = "Red";
		return color;
	}
}

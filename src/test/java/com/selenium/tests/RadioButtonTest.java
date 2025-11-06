package com.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.base.BaseClass;
import com.selenium.pages.RadioButtonPage;

public class RadioButtonTest extends BaseClass {
	
	//RadioButtonPage rbutton = new RadioButtonPage(driver);
	
	@Test
	public void selectRadio() throws InterruptedException {
		RadioButtonPage rbutton = new RadioButtonPage(driver, testData);
		//rbutton.clickradio();
		 boolean selected = rbutton.clickradio();
		Assert.assertTrue(selected, "Radio button should be selected");
	}
	
}

package com.selenium.tests;


import org.testng.annotations.Test;

import com.selenium.base.BaseClass;
import com.selenium.pages.Autosuggession;

public class AutoSelectedTest extends BaseClass{
	
	
	@Test
	public void autoSelect() throws InterruptedException {
		Thread.sleep(10000);
		Autosuggession autoobj = new Autosuggession(driver,testData);
		autoobj.suggession();
		//String value = auto.suggession();
		//Assert.assertEquals(value, "india", "Auto-suggestion selected value should match");
	}

}

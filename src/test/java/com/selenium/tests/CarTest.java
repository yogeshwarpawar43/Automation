package com.selenium.tests;

import org.testng.annotations.Test;

import com.selenium.base.BaseClass;
import com.selenium.pages.TestPage;

public class CarTest extends BaseClass{
	
	@Test
	public void checkcar() {
		TestPage tp = new TestPage(driver);
		tp.car();
	}

}

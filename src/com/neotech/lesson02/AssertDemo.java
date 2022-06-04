package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;

public class AssertDemo extends CommonMethods{

	@BeforeMethod
	public void open() {
		setUp();
	}
	
	@Test
	public void tittleValidation() {
		
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		
		
		//1st Way
	//	Assert.assertEquals(expectedTitle, actualTitle);
		
		//2nd Way
		
		Assert.assertEquals(expectedTitle, actualTitle , "Title does not match");
		
		// if (hard) assertion fails
		//the statement will not display after assertion
		System.out.println("Test after assert");
	}
	
		@Test
		public void validateLogo() {
			
			WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));
			boolean logoDisplayed = logo.isDisplayed();
			
			Assert.assertEquals(logoDisplayed, true, "Logo is not displayed");
			//3rd way only boolean 
			Assert.assertTrue(logoDisplayed); // and you can even send text
		}
		
		
		
	
	
	@AfterMethod
	public void close() {
		tearDown();
	}
	
}

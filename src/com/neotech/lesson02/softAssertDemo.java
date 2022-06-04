package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class softAssertDemo extends CommonMethods{
	
	//open application
	//verify logo displayed
	//enter valid credentiasl
	//verify user succes logged in by verify account name
	
	@BeforeMethod
	public void loginValidation() {
		setUp();
		
	}
	@AfterMethod
	public void close() {
		tearDown();
	}
	@Test
	public void logoAndLoginValidation() {
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo]/img'"));
		
		boolean logoDisplayed = logo.isDisplayed();
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertTrue(logoDisplayed, "Logo is not displayed");
		//logging in
		sendText(driver.findElement(By.id("txtUsername")),ConfigsReader.getProperty("username"));
		
		sendText(driver.findElement(By.id("txtPassword")),ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.xpath("button[@type='submit']")));
		
		String expected = "Jacqueline white";
		
		String actual = driver.findElement(By.id("account-name")).getText();
		
		soft.assertEquals(actual, expected, "Account is not same");
	
		soft.assertAll();
		
		// If test case failed, execution will stop after assertAll()
				// This statement will NOT be executed
				System.out.println("After assertAll");
	}
}
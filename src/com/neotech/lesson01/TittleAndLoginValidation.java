package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class TittleAndLoginValidation extends CommonMethods{
	
	
	@BeforeMethod
	public void openAndNavigate() {
		
		setUp();
		
	}
	
	@AfterMethod
	public void quitBrowser() {
		
		tearDown();
		
	}
	
	@Test
	public void titleValidation() throws Exception {
		
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			
			System.out.println("Title Validation Passed");
		}
		else {
			System.out.println(" Title Validation Failed");
			throw new Exception();
		}
		wait(2);
	}
	
	@Test
	public void logoValidation() throws Exception {
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));

		if (logo.isDisplayed()) {
			System.out.println("Logo Validation Passed!");
		} else {
			System.out.println("Logo Validation Failed!");
			throw new Exception();
		}
		wait(3);
	}

	@Test
	public void loginValidation() throws Exception {
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		// we can also do it by:
		// Saving the webElement in a variable
		// and then sendText() to it

		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

		click(driver.findElement(By.xpath("//button[@type='submit']")));

		// we can validate by checking if the logo at the top left is shown after the login

		WebElement logo = driver.findElement(By.id("ohrm-small-logo"));

		if (logo.isDisplayed()) {
			System.out.println("We have successfully logged in!");
		} else {
			System.out.println("Login Failed");
			throw new Exception();
		}

	}
	
}

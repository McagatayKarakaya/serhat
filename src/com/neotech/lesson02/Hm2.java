package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class Hm2 extends CommonMethods {

	@BeforeMethod
	public void start() {
		setUp();
	}

	@AfterMethod
	public void ends() {
		tearDown();
	}

	@Test
	public void testOne() {

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		
		click(driver.findElement(By.linkText("PIM")));
		
		click(driver.findElement(By.linkText("Add Employee")));
		
		wait(3);
		
		WebElement name = driver.findElement(By.xpath("//label[text()='Employee Full Name']"));
		
		WebElement employee = driver.findElement(By.xpath("//label[text()='Employee Id']"));
		
		WebElement location = driver.findElement(By.xpath("//label[text()='Location']"));
		
		SoftAssert as = new SoftAssert();
		
		as.assertTrue(name.isDisplayed());
		
		as.assertTrue(employee.isDisplayed());
		
		as.assertTrue(location.isDisplayed());
		
		as.assertAll();
		
		System.out.println("All Displayed");
		
		sendText(driver.findElement(By.id("first-name-box")), "Mustafa");
		
		sendText(driver.findElement(By.id("last-name-box")), "Karakaya");
		
		selectDropdown(driver.findElement(By.id("location")), "Australian Regional HQ");
		
		click(driver.findElement(By.id("modal-save-button")));
		
		wait(5);
		
		WebElement disp = driver.findElement(By.xpath("//span[@id='pim.navbar.employeeName']"));
		
		as.assertTrue(disp.isDisplayed());
		
		wait(5);
		
	}

}

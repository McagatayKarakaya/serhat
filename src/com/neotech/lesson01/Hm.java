package com.neotech.lesson01;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

//1. Open chrome browser
//2. Go to "https://hrm.neotechacademy.com/"
//3. Enter valid username
//4. Leave password field empty
//5. Verify error message with text "Password cannot be empty" is displayed.

public class Hm extends CommonMethods{
	
	@BeforeMethod
	public void bm() {
		setUp();
	}
	
	@Test
	public void login() {
		
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		
		WebElement error = driver.findElement(By.id("txtPassword-error"));
		
		if(error.isDisplayed()) {
			System.out.println(error.getText());
		}else {
			System.out.println("nope");
		}
	}
	
	@AfterMethod
	public void afm() {
		tearDown();
	}
	
	public static void main(String[] args) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File sf = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sf, new File("screenshots/HRM/screenshot03.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

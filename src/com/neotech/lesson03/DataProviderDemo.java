package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;

public class DataProviderDemo extends CommonMethods{
	
	@BeforeMethod
	public void start() {
		setUp();
		
	}
	
	@AfterMethod
	public void quit() {
		tearDown();
	}
	
	@Test(dataProvider = "userData")
	public void LoginFunctionality(String username, String password) {
		
		WebElement user = driver.findElement(By.id("txtUsername"));
		
		sendText(user,username);
		
		WebElement pass = driver.findElement(By.id("txtPassword"));
		
		sendText(pass,password);
		
		wait(3);
		
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		
			
	}
	
	@DataProvider(name="userData")
	public Object [][] getData(){
		
		Object[][] credentials = {{"Admin","Neotech@123"},{"Yusuf","helo@123"},{"kerim","velo@123"}};
		return credentials;
		
	}

}

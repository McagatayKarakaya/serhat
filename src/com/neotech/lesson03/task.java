package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;

public class task extends CommonMethods{

	@BeforeClass
	public void start() {
		setUp();
	}
	
	@AfterClass
	public void quit() {
		tearDown();
	}
	
	@Test(priority = 1, dataProvider = "login")
	public void zoginFalan(String name, String pass) {
		
		WebElement na = driver.findElement(By.id("txtUsername"));
		
		sendText(na,name);
		
		WebElement pas = driver.findElement(By.id("txtPassword"));
		
		sendText(pas,pass);
		
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		
		wait(5);
		
	}
	
	@Test(priority=2, dataProvider = "verify")
	
	public void erifyFalan(String isim, String soyisim) {
		
		click(driver.findElement(By.linkText("PIM")));
		
		click(driver.findElement(By.linkText("Add Employee")));
		
		wait(5);
		
		WebElement is = driver.findElement(By.id("first-name-box"));
		
		sendText(is, isim);
		
		WebElement so = driver.findElement(By.id("last-name-box"));
		
		sendText(so, soyisim);
		
		selectDropdown(driver.findElement(By.id("location")), "Australian Regional HQ");
		
		click(driver.findElement(By.id("modal-save-button")));
		
		wait(5);
		
	}
		
	@DataProvider(name = "login")
	public Object[][] gData(){
		
		Object[][] obj = {{"Admin","Neotech@123"}};
		
		return obj;
		
	}
	
	@DataProvider(name = "verify")
	public Object[][] getData(){
		
		Object[][] obj2 = {{"Mustafa","Karakaya"},{"Emre","Kiz"}};
		
		return obj2;
	
	
	}
	
}

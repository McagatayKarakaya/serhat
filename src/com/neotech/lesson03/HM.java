package com.neotech.lesson03;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import hrmPackagesFactory.HRM;

public class HM extends HRM {
	
	@BeforeClass(alwaysRun= true)
	public void start() {
		setUp();
	}
	
	@AfterClass(alwaysRun= true)
	public void close() {
		tearDown();
	}
	
	@Test(priority=1,dataProvider = "loginAndVerify", groups = "smoke")
	public void login(String username, String password) {

		HRM h = new HRM();
		sendText(h.username, username);
		sendText(h.password, password);
		click(h.loginBtn);
		wait(3);
	}
	
	@Test(priority = 2, dataProvider = "employeeAdd", groups = "smoke")
	public void employee(String name, String lastName) {
		
		HRM h = new HRM();
		
		click(h.pim); 
		click(h.addEmployee);
		wait(5);
		sendText(h.firstName, name);
		sendText(h.lastName, lastName);
		selectDropdown(h.location, 2);
		waitForClickability(h.saveButton);
		click(h.saveButton);
		waitForVisibility(h.Name);

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File sourcer = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyDirectory(sourcer, new File("screenshots/hrm/"+name+".png"));
		} catch (IOException e) {
			System.out.println("did not get screenshot");
			e.printStackTrace();
		}
	}
	
	@DataProvider(name ="employeeAdd")
	public Object[][] empAdd(){
		Object[][] obj2 = {{"ba","ba"},{"black","black"},{"sheap","sheap"}};
		
		return obj2;
	}
	
	
	@DataProvider(name="loginAndVerify")
	
	public Object[][] getData(){
		
		Object[][] obj = {{"Admin","Neotech@123"}};
		
		return obj;
	}

}

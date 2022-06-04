package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.util.CommonMethods;

public class DashboardpageUsingFactory extends CommonMethods{
	
	@FindBy(xpath = "//div[@id='ohrm-small-logo']")
	public WebElement logo;
	
	public DashboardpageUsingFactory () {
		PageFactory.initElements(driver, this);
	}
	
//	public WebElement logo = driver.findElement(By.id("ohrm-small-logo"));
	
}

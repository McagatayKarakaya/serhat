package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.util.CommonMethods;

public class RetryLoginPageUsingFactory extends CommonMethods{
	
	@FindBy(xpath="//div[@class='toast-message']")
	public WebElement credentials;
	
	public RetryLoginPageUsingFactory(){
		
		PageFactory.initElements(driver, this);
	}

}

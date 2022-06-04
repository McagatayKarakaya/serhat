package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.util.BaseClass;
import com.neotech.util.CommonMethods;

public class LoginPageUsingFactory extends CommonMethods{
	
	@FindBy(id = "txtUsername")
	public WebElement username;
	
	@FindBy(id ="txtPassword")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginBtn;
	
	@FindBy(id="txtPassword-error")
	public WebElement error;
	
	public LoginPageUsingFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}

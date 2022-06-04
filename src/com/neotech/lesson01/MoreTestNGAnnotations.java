package com.neotech.lesson01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MoreTestNGAnnotations {
	
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Before Suite Method");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("After Suite Method");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test Method");
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After Test Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class ");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After Class ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before Method ");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After Method ");
	}
	
	@Test
	public void test1() {
		
		System.out.println("Test 1 ");
	}

}

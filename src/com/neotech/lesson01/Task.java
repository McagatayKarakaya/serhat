package com.neotech.lesson01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task {

	@Test
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test 2");
	}
	
	
	@BeforeClass
	public void beforeC() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterC() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void BeforeM() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void AfterM() {
		System.out.println("After Method");
	}
}

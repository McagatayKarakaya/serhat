package com.neotech.lesson02;

import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;

public class Priority extends CommonMethods{
	
	@Test(priority=0)
	public void firstTest() {
		System.out.println("first method");
	}
	
	@Test(priority=1)
	public void secondTest() {
		System.out.println("second method");
	}
	
	@Test(priority=2)
	public void thirdTest() {
		System.out.println("third method");
	}
	
	@Test(priority=3)
	public void fourthTest() {
		System.out.println("fourth method");
	}
	
	//we can also put same priority value in that way same values will run in alphabetical order
	
	
	

}

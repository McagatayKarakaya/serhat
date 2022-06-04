package com.neotech.lesson02;

import org.testng.annotations.Test;

//HW1: Executing tests using priority and enable attributes
//
//Create a class TaskOne that has 5 test methods named:
//firstMethod
//firstMethod1
//secondMethod
//thirdMethod
//fourthMethod
//
//And each of them printing the method name
//Run and observe results
//
//Then, add the needed attributes to print the following result:
//fourthMethod
//thirdMethod
//secondMethod
//firstMethod

public class TaskOne{
	
	@Test(priority=3)
	public void firstMethod() {
		System.out.println("this is first method");
	}
	@Test(enabled=false,priority=1)
	public void firstMethod1() {
		System.out.println("this is first method1");
	}
	@Test(priority=2)
	public void secondMethod() {
		System.out.println("this is second method");
	}
	@Test(priority=1)
	public void thirdMethod() {
		System.out.println("this is third method");
	}
	@Test(priority=0)
	public void fourthMethod() {
		System.out.println("this is fourth method");
	}
	
	
}

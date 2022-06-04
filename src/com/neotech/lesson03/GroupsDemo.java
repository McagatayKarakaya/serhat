package com.neotech.lesson03;

import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test(groups="smoke")
	public void test1() {
		
		System.out.println("this is test one");

	}
	
	@Test(groups= {"smoke", "regression","sprint5"})
	public void test2() {
		
		System.out.println("this is test two");

	}
	
	@Test(groups = "sprint5")
	public void test3() {
		
		System.out.println("this is test three");

	}
	
	@Test(groups = {"smoke", "broken"})
	public void test4() {
		
		System.out.println("this is test four");

	}

}

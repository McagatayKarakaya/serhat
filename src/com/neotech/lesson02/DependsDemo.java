package com.neotech.lesson02;

import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;

public class DependsDemo extends CommonMethods{
	
		@Test
		public void firstTest() {
			System.out.println("first method");
		}
		
		@Test
		public void secondTest() {
			System.out.println("second method");
		}
		
		@Test(dependsOnMethods = {"firstTest", "secondTest"})
		public void thirdTest() throws Exception {
			System.out.println("third method");
			
			throw new Exception();//if we are failing it wont stop running
		}
		
		@Test(dependsOnMethods = "thirdTest")
		public void fourthTest() {
			System.out.println("fourth method");
		}

}

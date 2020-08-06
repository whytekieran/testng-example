package com.whyte.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Using Annotations
public class TC2 {
	
	@BeforeClass
  	public void initBeforeTestClass() {
  		System.out.println("Runs before the test class");
  	}
  	
  	@AfterClass
  	public void initAfterTestClass() {
  		System.out.println("Runs after the test class");
  	}
	
  	@BeforeMethod
  	public void initBeforeTestMethod() {
  		System.out.println("Runs before each test method");
  	}
  	
  	@AfterMethod
  	public void initAfterTestMethod() {
  		System.out.println("Runs after each test method");
  	}
	
	@Test
	public void test3() {
		System.out.println("This is test 3.....");
	}
	  
	@Test
	public void test4() {
		System.out.println("This is test 4.....");
	}
}

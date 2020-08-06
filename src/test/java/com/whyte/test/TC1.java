package com.whyte.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//Using Annotations
public class TC1 {
	
	@BeforeSuite
  	public void initBeforeSuite() {
  		System.out.println("Runs before the suite");
  	}
  	
  	@AfterSuite
  	public void initAfterSuite() {
  		System.out.println("Runs after the suite");
  	}
	
	@BeforeTest
  	public void initBeforeTest() {
  		System.out.println("Runs before the test");
  	}
  	
  	@AfterTest
  	public void initAfterTest() {
  		System.out.println("Runs after the test");
  	}
	
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
	public void test1() {
		System.out.println("This is test 1.....");
	}
	  
	@Test
	public void test2() {
		System.out.println("This is test 2.....");
	}
}

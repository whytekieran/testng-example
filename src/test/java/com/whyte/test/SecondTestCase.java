package com.whyte.test;

import org.testng.annotations.Test;

public class SecondTestCase {
	@Test(priority=1)
	public void setup() {
		System.out.println("Opening Browser and Application");
	}
	  
	@Test(priority=2)
	public void searchCustomer() {
		System.out.println("search customer");
	}
	
	@Test(priority=3)
	public void addCustomer() {
		System.out.println("add customer");
	}
	  
	@Test(priority=4)
	public void teardown() {
		System.out.println("closing application and browser");
	}
}

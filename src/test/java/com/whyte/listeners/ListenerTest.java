package com.whyte.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//one passes one skips one fails adding a listener class which runs methods at various stages during the test cycle
////if you want to integrate the listenr with this class via xml file then you would comment the below anotation
//then look inside listeners.xml for what you would do.
@Listeners(CustomListeners.class)
public class ListenerTest {
	@Test
	public void test1() {
		System.out.println("This is test 1.....");
		Assert.assertEquals("A", "A");
	}
	  
	@Test
	public void test2() {
		System.out.println("This is test 2.....");
		Assert.assertEquals("A", "B");
	}
	
	@Test
	public void test3() {
		System.out.println("This is test 3.....");
		throw new SkipException("Throwing a skip exception");
	}
}

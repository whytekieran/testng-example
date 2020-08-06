package com.whyte.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener is just one of 8 listeners for TestNG docs here:
//https://testng.org/doc/documentation-main.html#testng-listeners
//run when tests have different results pass fail skipped etc
public class CustomListeners implements ITestListener {

	public void onStart(ITestContext itc) {
		System.out.println("Starts test execution "+ itc.getName());
	}
	
	public void onFinish(ITestContext itc) {
		System.out.println("Finish test execution "+ itc.getName());
	}
	
	public void onTestStart(ITestResult itr) {
		System.out.println("starts test "+ itr.getName());
	}
	
	public void onTestSkip(ITestResult itr) {
		System.out.println("skipped test "+ itr.getName());
	}
	
	public void onTestSuccess(ITestResult its) {
		System.out.println("success test "+ its.getName());
	}
	
	public void onTestFailure(ITestResult itf) {
		System.out.println("failed test "+ itf.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg) {
		
	}
}

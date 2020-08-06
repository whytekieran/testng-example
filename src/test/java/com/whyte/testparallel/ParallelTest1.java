package com.whyte.testparallel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//https://www.youtube.com/watch?v=M93T8T69akw&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=10
public class ParallelTest1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void logoTest() throws InterruptedException {
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Assert.assertTrue(logo.isDisplayed(), "Logo isnt displayed");
		Thread.sleep(5000);
	}
	
	@Test
	public void homepageTitleTest() throws InterruptedException {
		String title  = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM", "Titles dont match");//3rd param = output if failure
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}

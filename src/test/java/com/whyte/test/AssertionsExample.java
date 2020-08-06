package com.whyte.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertionsExample {
  
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser", "url"})
	public void setup(String browser, String url) {
		
		//https://www.youtube.com/watch?v=l9qY4xQNA6g&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=8
		//Remember you could multiple if else here to setup different selenium driver for different browser
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}
	}
	
	@Test(priority=1)
	public void logoTest() {
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Assert.assertTrue(logo.isDisplayed(), "Logo isnt displayed");
	}
	
	@Test(priority=2)
	public void homepageTitleTest() {
		String title  = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM", "Titles dont match");//3rd param = output if failure
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}

package com.whyte.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	//If your data provider is in another class you can add the parameter dataProviderClass=MyDataProvider.class
	@Test(dataProvider = "LoginDataProvider")
	public void loginTest(String email, String password) {
		System.out.println(email+"                  "+password);
	}
	
	@DataProvider(name="LoginDataProvider")
	public Object[][] getData(){
		
		Object[][] data = {{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
		return data;
	}
}

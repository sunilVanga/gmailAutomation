package com.qa.gmail.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.gmail.base.TestBase;
import com.qa.gmail.pages.HomePage;
import com.qa.gmail.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage login;
	HomePage homepage;
	
	
	@BeforeMethod
	public void setup(){
		TestBase.initialization();
		login=new LoginPage();
		
	}
	@Test
	public void titleTest(){
		String title=login.verifyTitle();
		Assert.assertEquals(title, "Gmail");
	}
	@Test
	public void loginTest(){
		homepage=login.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}

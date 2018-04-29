package com.qa.gmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.gmail.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath=".//*[@id='identifierId']")
	WebElement uName;
	@FindBy(xpath=".//*[text()='Next']")
	WebElement nextBtn;
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath=".//*[text()='Next']")
	WebElement nextBtn1;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	public String verifyTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd){
		uName.sendKeys(un);
		nextBtn.click();
		password.sendKeys(pwd);
		nextBtn1.click();
		return new HomePage();
		
	}


}

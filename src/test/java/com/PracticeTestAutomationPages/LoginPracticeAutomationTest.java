package com.PracticeTestAutomationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPracticeAutomationTest {
	WebDriver driver;
	public  LoginPracticeAutomationTest(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement Submit;
	
	public void login_EasyCal(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		Submit.click();
	}
}

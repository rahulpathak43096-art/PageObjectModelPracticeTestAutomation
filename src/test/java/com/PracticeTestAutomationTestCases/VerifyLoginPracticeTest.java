package com.PracticeTestAutomationTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PracticeTestAutomationPages.LoginPracticeAutomationTest;

import library.Reusability;
import utility.Helper;

public class VerifyLoginPracticeTest {
	public WebDriver driver;
	@Test
	public void CheckValidUser() {
		WebDriver driver = Helper.startBrowser("chrome", "https://practicetestautomation.com/practice-test-login/");
		Reusability.capturesscreenshot(driver,"Step1. Login to PracticeTestAutomation Application");
		LoginPracticeAutomationTest loginPagePracticeAutomation = PageFactory.initElements(driver,LoginPracticeAutomationTest.class);
		loginPagePracticeAutomation.login_EasyCal("8076995880", "gautam");
		
		Reusability.capturesscreenshot(driver,"Step2. Logout to  Application");
		
	    driver = Helper.startBrowser("FF", "https://practicetestautomation.com/practice-test-login/");
		Reusability.capturesscreenshot(driver,"Step1. Login to PracticeTestAutomation Application");
		LoginPracticeAutomationTest loginPagePracticeAutomatio = PageFactory.initElements(driver,LoginPracticeAutomationTest.class);
		loginPagePracticeAutomatio.login_EasyCal("8076995880", "gautam");
		
		Reusability.capturesscreenshot(driver,"Step2. Logout to  Application");
		
		driver = Helper.startBrowser("Edge", "https://practicetestautomation.com/practice-test-login/");
		Reusability.capturesscreenshot(driver,"Step1. Login to PracticeTestAutomation Application");
		LoginPracticeAutomationTest loginPagePracticeAutomationTes = PageFactory.initElements(driver,LoginPracticeAutomationTest.class);
		loginPagePracticeAutomationTes.login_EasyCal("8076995880", "gautam");
		
		Reusability.capturesscreenshot(driver,"Step2. Logout to  Application");
		
		
	}

}

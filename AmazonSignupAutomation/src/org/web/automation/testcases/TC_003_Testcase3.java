package org.web.automation.testcases;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.web.automation.assertions.PageVerifications;
import org.web.automation.base.BaseFunctions;
import org.web.automation.pages.TestingWorldHomePage;
import org.web.automation.pages.TestingWorldLoginPage;
import org.web.automation.utility.PropertyReader;
import org.web.automation.utility.TakeScreenshot;


public class TC_003_Testcase3 extends BaseFunctions {

	@Test
	public void startBrowser(){

		TestingWorldHomePage HomePage =PageFactory.initElements(driver, TestingWorldHomePage.class);
		HomePage.ClickLoginButton();
		TestingWorldLoginPage LoginPage = PageFactory.initElements(driver, TestingWorldLoginPage.class);
		LoginPage.EnterUserName("testuser3");		
		LoginPage.EnterPassword("testpass3");
		LoginPage.HitLogInButton();
		Assert.assertTrue(PageVerifications.ValidatePageTitle(driver, "Loginng"));
		TakeScreenshot.CaptureScreenshot(driver, "Login Error");

	}

}

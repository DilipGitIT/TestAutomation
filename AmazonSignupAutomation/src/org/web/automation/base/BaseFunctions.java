package org.web.automation.base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.web.automation.utility.PropertyReader;

public class BaseFunctions {

	public static WebDriver driver;

	@BeforeMethod
	public static void StartBrowser(){

		if(PropertyReader.configfilereader("BrowserName").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

			driver = new ChromeDriver();
		}
		else if(PropertyReader.configfilereader("BrowserName").equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/Internetexplorerdriver.exe");

			driver = new InternetExplorerDriver();
		}
		driver.get(PropertyReader.configfilereader("Applicationurl"));
	}

	@AfterMethod
	public static void CloseBrowser(){
		driver.close();

	}

}

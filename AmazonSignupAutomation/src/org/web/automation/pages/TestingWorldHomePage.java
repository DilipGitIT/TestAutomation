package org.web.automation.pages;import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.web.automation.utility.PropertyReader;

public class TestingWorldHomePage {
	@FindBy(xpath="//*[@id='ja-search']/ul/li[1]/a") WebElement LoginButtonxpath;
	public void ClickLoginButton(){
		
		LoginButtonxpath.click();

	}

}

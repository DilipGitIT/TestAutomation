package org.web.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingWorldLoginPage {
	@FindBy(name="username") WebElement UserNameByName;
	@FindBy(name="password") WebElement PasswordByName;
	@FindBy(xpath="//button[@type='submit']") WebElement LogInforSignUpxpath;
	
	public void EnterUserName(String Uname){
		
		UserNameByName.sendKeys(Uname);
	}
	
	public void EnterPassword(String Upass){
		PasswordByName.sendKeys(Upass);
	}
	
	public void HitLogInButton()
	{
		LogInforSignUpxpath.click();
	}

}

package org.web.automation.assertions;

import org.openqa.selenium.WebDriver;

public class PageVerifications {
	
	public static Boolean ValidatePageTitle(WebDriver driver,String exptitle){
		boolean result =false;
		
		if(driver.getTitle().equalsIgnoreCase(exptitle)){
			result =true;
			
		}
		return result;
		
	}

}

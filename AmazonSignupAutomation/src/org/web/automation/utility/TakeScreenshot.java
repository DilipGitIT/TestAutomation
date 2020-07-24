package org.web.automation.utility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.etsi.uri.x01903.v13.impl.GenericTimeStampTypeImpl;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	public static void CaptureScreenshot(WebDriver driver,String SName)
	
	{
		Calendar c= Calendar.getInstance();
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File output= screenshot.getScreenshotAs(OutputType.FILE);
		File f= new File("./Screenshots/"+SName+c.getTime().toString().replace(":", "".replace(" ", ""))+".png");
		try {
			FileUtils.copyFile(output, f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

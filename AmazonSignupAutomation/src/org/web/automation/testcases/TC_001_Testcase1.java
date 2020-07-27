package org.web.automation.testcases;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.web.automation.assertions.PageVerifications;
import org.web.automation.base.BaseFunctions;
import org.web.automation.pages.TestingWorldHomePage;
import org.web.automation.pages.TestingWorldLoginPage;
import org.web.automation.utility.ExcelReader;
import org.web.automation.utility.PropertyReader;
import org.web.automation.utility.TakeScreenshot;


public class TC_001_Testcase1 extends BaseFunctions {

	@Test(dataProvider="Excel", dataProviderClass=ExcelReader.class)
	public void startBrowser(String Uname, String Upass) throws Exception{

		TestingWorldHomePage HomePage =PageFactory.initElements(driver, TestingWorldHomePage.class);
		HomePage.ClickLoginButton();
		TestingWorldLoginPage LoginPage = PageFactory.initElements(driver, TestingWorldLoginPage.class);
		LoginPage.EnterUserName(Uname);
		LoginPage.EnterPassword(Upass);
		LoginPage.HitLogInButton();
		Assert.assertTrue(PageVerifications.ValidatePageTitle(driver, "Login"));
		TakeScreenshot.CaptureScreenshot(driver, "Login Error");

	}
	/*@DataProvider(name="Excel")
	public static Object[][] testDataGenerator(){
		FileInputStream File = null;
		try {
			File = new 	FileInputStream("./Excelfile/Testdata.xlsx");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		XSSFWorkbook WB = null;
		try {
			WB = new XSSFWorkbook(File);
		} catch (IOException e) {

			e.printStackTrace();
		}
		XSSFSheet sheet1 =WB.getSheet("Testdata");
		int noofrows = sheet1.getPhysicalNumberOfRows();
		int noofcol = sheet1.getRow(noofrows).getPhysicalNumberOfCells();
		Object[][] testdata= new Object[noofrows][noofcol];
		
		for( int i=0;i < noofrows;i++){
			XSSFRow row= sheet1.getRow(i);
			XSSFCell Uname=  row.getCell(0);
			XSSFCell Upass=  row.getCell(1);
			testdata[i][0]=Uname.getStringCellValue();
			testdata[i][1]=Upass.getStringCellValue();
			
		}

		return testdata;
	


	


}*/
}

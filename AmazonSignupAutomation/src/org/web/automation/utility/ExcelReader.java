package org.web.automation.utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {
	@DataProvider(name="Excel")
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
		int noofcols = sheet1.getRow(0).getPhysicalNumberOfCells();
		Object[][] testdata= new Object[noofrows][noofcols];
		for( int i=0;i < noofrows;i++){

			for (int j= 0; j<noofcols-1;j++)
			{
				XSSFRow row= sheet1.getRow(i);
				XSSFCell Uname=  row.getCell(j);
				XSSFCell Upass=  row.getCell(j+1);
				testdata[i][j]=Uname.getStringCellValue();
				testdata[i][j+1]=Upass.getStringCellValue();

			}


		}
		return testdata;




	}
}



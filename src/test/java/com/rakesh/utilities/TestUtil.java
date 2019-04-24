package com.rakesh.utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.rakesh.base.TestBase;

public class TestUtil extends TestBase {
	
	public static String screenshotPath;
	public static String screenshotName;
	
	
	public static void captureScreenshot() throws IOException {
		
		Date d = new Date();
		screenshotName = d.toString().replaceAll(" ", "_").replaceAll(":", "_");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotName));
		
	}
	
	
	@DataProvider(name="dp")
	public Object[][] getData(Method m){
		
		String sheetName = m.getName();
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		
		
		Object[][] data = new Object[rowCount-1][colCount];
		
		
		for(int rowNum = 2; rowNum<=rowCount; rowNum++) {
			for(int colNum = 0; colNum<colCount; colNum++) {
				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		
		return data;
	}
	
}

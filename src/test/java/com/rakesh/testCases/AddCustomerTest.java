package com.rakesh.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rakesh.base.TestBase;

public class AddCustomerTest extends TestBase {
	
	@Test(dataProvider="getData")
	public void AddCustomer(String firstName, String lastName, String postCode, String alertText) {
		
		//System.out.println(firstName + " " + lastName + " " + postCode + " " + alertText);
		
		driver.findElement(By.cssSelector(OR.getProperty("addCustBtn"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("firstName"))).sendKeys(firstName);
		driver.findElement(By.cssSelector(OR.getProperty("lastName"))).sendKeys(lastName);
		driver.findElement(By.cssSelector(OR.getProperty("postCode"))).sendKeys(postCode);
		driver.findElement(By.cssSelector(OR.getProperty("addBtn"))).click();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		Assert.assertTrue(alert.getText().contains(alertText));
		
		alert.accept();
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		int rowCount = excel.getRowCount("AddCustomerTest");
		int colCount = excel.getColumnCount("AddCustomerTest");
		
		
		Object[][] data = new Object[rowCount-1][colCount];
		
		
		for(int rowNum = 2; rowNum<=rowCount; rowNum++) {
			for(int colNum = 0; colNum<colCount; colNum++) {
				data[rowNum-2][colNum] = excel.getCellData("AddCustomerTest", colNum, rowNum);
			}
		}
		
		return data;
	}
	
}

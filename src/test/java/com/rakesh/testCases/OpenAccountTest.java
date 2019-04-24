package com.rakesh.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rakesh.base.TestBase;
import com.rakesh.utilities.TestUtil;

public class OpenAccountTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void openAccountTest(String customer, String currency) {
		
		//System.out.println(firstName + " " + lastName + " " + postCode + " " + alertText);
		
		
	}
	
	
}

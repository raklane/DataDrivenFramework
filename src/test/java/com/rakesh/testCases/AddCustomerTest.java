package com.rakesh.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rakesh.base.TestBase;
import com.rakesh.utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void addCustomerTest(String firstName, String lastName, String postCode, String alertText) {
		
		//System.out.println(firstName + " " + lastName + " " + postCode + " " + alertText);
		
		click("addCustBtn_CSS");
		type("firstName_CSS",firstName);
		type("lastName_XPATH",lastName);
		type("postCode_CSS",postCode);
		click("addBtn_CSS");
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		Assert.assertTrue(alert.getText().contains(alertText));
		
		alert.accept();
		
	}
	
	
}

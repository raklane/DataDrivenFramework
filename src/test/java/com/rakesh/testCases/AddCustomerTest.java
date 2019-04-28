package com.rakesh.testCases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rakesh.base.TestBase;
import com.rakesh.utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void addCustomerTest(Hashtable<String, String> data) throws InterruptedException {
		
		//Check if the test is runnable
		if(!data.get("runMode").equalsIgnoreCase("Y")) {
			throw new SkipException("Skipping the test " + "addCustomerTest" + "as the run mode is No");
		}
		
		click("addCustBtn_CSS");
		type("firstName_CSS",data.get("firstName"));
		type("lastName_XPATH",data.get("lastName"));
		type("postCode_CSS",data.get("postCode"));
		click("addBtn_CSS");
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		Assert.assertTrue(alert.getText().contains(data.get("alertText")));
		Thread.sleep(2000);
		alert.accept();
		
	}
	
	
}

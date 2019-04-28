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

public class OpenAccountTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void openAccountTest(Hashtable<String, String> data) throws InterruptedException {
		
		//Check if the test is runnable
		if(!data.get("runMode").equalsIgnoreCase("Y")) {
			throw new SkipException("Skipping the test " + "addCustomerTest" + "as the run mode is No");
		}
		
		click("openAccount_CSS");
		select("customer_CSS", data.get("customer"));
		select("currency_CSS", data.get("currency"));
		click("process_CSS");
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertText = alert.getText();
		Thread.sleep(2000);
		alert.accept();
		
	}
	
	
}

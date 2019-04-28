package com.rakesh.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.rakesh.base.TestBase;
import com.rakesh.utilities.TestUtil;


public class BankManagerLoginTest extends TestBase {
	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException {
		
		//Check if the test is runnable
		if(!TestUtil.isTestRunnable("bankManagerLoginTest", excel)) {
			throw new SkipException("Skipping the test " + "bankManagerLoginTest" + "as the run mode is No");
		}
		
		//verifyEquals("abc", "xyz");
		
		log.debug(this.getClass().getName() + " test started.");
		click("bmlBtn_CSS");
		Thread.sleep(3000);
		
		//Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))), "Login not successful");
		
		log.debug(this.getClass().getName() + " test finished.");
		
		//Assert.fail("Login not executed successfully");
		
		
	}

}

package com.rakesh.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.rakesh.base.TestBase;


public class BankManagerLoginTest extends TestBase {
	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		
		
		
		log.debug(this.getClass().getName() + " test started.");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		Thread.sleep(3000);
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))), "Login not successful");
		
		log.debug(this.getClass().getName() + " test finished.");
		
		Assert.fail("Login not executed successfully");
		
		
	}

}

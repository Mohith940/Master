package com.projectExecution;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.genericlibraries.Driver;
import com.genericlibraries.WebdriverCommonUtills;

public class IntiateBrowser_Test {
  @Test
  public void f() {
  }
  
  @BeforeSuite
  public void launchBrowser() throws Exception {
	  String browserName =WebdriverCommonUtills.getTestData("Data", 8, 0);
	  String url =WebdriverCommonUtills.getTestData("Data", 8, 1);
	  Driver.launchBrowser(browserName, url);
  }

  @AfterSuite
  public void closeBrowser() {
	  
	 
  }
}

package com.bussinesslibraries;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import com.genericlibraries.WebdriverCommonUtills;
import com.pagefactory.CapsuleCrmHomePage;

public class AddCaseDetiles {
	
	CapsuleCrmHomePage hmp = new CapsuleCrmHomePage();
	
	public void addCase() throws Exception {
		
		WebdriverCommonUtills.enterValue(hmp.caseRealtesTo, "sag"); //mohith
		
		List<WebElement>lis =WebdriverCommonUtills.listOfWebElemnts(hmp.caseRealtesTo);
		
		Actions act = WebdriverCommonUtills.performActions();
		
		String expName = WebdriverCommonUtills.getTestData("Sheet2", 14, 1);
		
for (WebElement val : lis) {
			
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(3000);
			String actualName = val.getText().trim();
			
			if (expName.equals(actualName)) {
				
				act.sendKeys(Keys.ENTER).perform();
				break;
			}
		}
		
	}

}

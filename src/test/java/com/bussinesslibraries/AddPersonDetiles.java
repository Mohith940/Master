package com.bussinesslibraries;

import com.genericlibraries.WebdriverCommonUtills;
import com.pagefactory.CapsuleCrmHomePage;

public class AddPersonDetiles {
	
	CapsuleCrmHomePage hmp =new CapsuleCrmHomePage();
	
	public void addPerson() throws Exception {
		
		WebdriverCommonUtills.performClick(hmp.person_Icon);
		WebdriverCommonUtills.performClick(hmp.addPerson_Icon);
		
		
		
	WebdriverCommonUtills.perfromSelect(hmp.tittle).selectByIndex(1);
String fristName = WebdriverCommonUtills.getTestData("Sheet2", 2, 1);
System.out.println(fristName);
WebdriverCommonUtills.enterValue(hmp.fristName, fristName);
WebdriverCommonUtills.enterValue(hmp.lastName, WebdriverCommonUtills.getTestData("Sheet2", 3, 1));
WebdriverCommonUtills.enterValue(hmp.jobTittle, WebdriverCommonUtills.getTestData("Sheet2", 4, 1));
WebdriverCommonUtills.enterValue(hmp.Organisation, WebdriverCommonUtills.getTestData("Sheet2", 5, 1));
WebdriverCommonUtills.enterValue(hmp.tags, WebdriverCommonUtills.getTestData("Sheet2", 6, 1));
WebdriverCommonUtills.performClick(hmp.addTag);
//		
WebdriverCommonUtills.enterValue(hmp.mobileNumber, WebdriverCommonUtills.getTestData("Sheet2", 9, 1));
WebdriverCommonUtills.perfromSelect(hmp.mobileNumberD).selectByVisibleText("Mobile");
WebdriverCommonUtills.enterValue(hmp.emailID, WebdriverCommonUtills.getTestData("Sheet2", 10, 1));
WebdriverCommonUtills.perfromSelect(hmp.emailIDD).selectByVisibleText("Work");
WebdriverCommonUtills.enterValue(hmp.website, WebdriverCommonUtills.getTestData("Sheet2", 11, 1));
WebdriverCommonUtills.perfromSelect(hmp.websiteD1).selectByIndex(1);
WebdriverCommonUtills.perfromSelect(hmp.websiteD2).selectByIndex(1);
//		
WebdriverCommonUtills.performClick(hmp.saveButton);;
	}

}

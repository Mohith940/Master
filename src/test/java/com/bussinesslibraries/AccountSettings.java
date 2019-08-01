package com.bussinesslibraries;

import com.genericlibraries.WebdriverCommonUtills;
import com.pagefactory.CapsuleCrmHomePage;

public class AccountSettings {
	
	CapsuleCrmHomePage hmp= new CapsuleCrmHomePage();
	
	public void accountSettingsPage() {
		
		WebdriverCommonUtills.performClick(hmp.accountIcon); //mohith
	}

}

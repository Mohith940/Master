package com.bussinesslibraries;

import com.genericlibraries.WebdriverCommonUtills;
import com.pagefactory.CapsuleCrmHomePage;

public class LoginCapsuleCrm  {
	
    CapsuleCrmHomePage hp = new CapsuleCrmHomePage();
    
    
    
    public void loginCapsuleCrm() throws Exception {
    	
    	String userNmae = WebdriverCommonUtills.getTestData("Data", 12 , 0);
    	
    	String password =WebdriverCommonUtills.getTestData("Data", 12, 1);
    	
    	
    	//Enter UserName
    	
    	WebdriverCommonUtills.enterValue(hp.login_UserName,userNmae);
    	WebdriverCommonUtills.enterValue(hp.login_Password, password);
    	
       //Click on Login Button
    	WebdriverCommonUtills.performClick(hp.login_Button);
    	
    	
    }
 
}

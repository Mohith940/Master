package com.projectExecution;


import org.testng.annotations.Test;

import com.bussinesslibraries.AccountSettings;
import com.bussinesslibraries.AddPersonDetiles;


public class CapsuleCrm {
	
	com.bussinesslibraries.LoginCapsuleCrm login =new com.bussinesslibraries.LoginCapsuleCrm();
	AddPersonDetiles add =new AddPersonDetiles();
	AccountSettings account =new AccountSettings();
  @Test(priority=0)
  public void login() throws Exception {
	  login.loginCapsuleCrm();
  }
  
  @Test(priority=1,enabled=false)
  public void addPerson() throws Exception {
	  add.addPerson();
  }
  
  @Test
  public void accountSettingsPage() {
	  account.accountSettingsPage();
  }
  
}
  


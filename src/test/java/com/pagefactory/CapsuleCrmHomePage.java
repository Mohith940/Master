package com.pagefactory;

import org.openqa.selenium.By;

public class CapsuleCrmHomePage {

	
	//*********Login Page Locators*********//
	
	public By login_UserName = By.id("login:usernameDecorate:username");
	
	public By login_Password =By.id("login:passwordDecorate:password");
	
	public By  login_Button  =By.id("login:login");
	
	
	//*******Home Page Locators*****
	
	public By person_Icon = By.id("ember18");
	public By addPerson_Icon =By.xpath("//a[@href='/party/person/new']");
	
	
	//********ADD Person Page********//
	
	//*******NEW Person********//
	
	public By tittle    =  By.xpath("//div[@id='party:j_id108']/div/span/div/select");
	public By fristName =  By.xpath("//input[@id='party:fnDecorate:fn']");
	public By lastName  =  By.id("party:lnDecorate:ln");
	public By jobTittle =  By.id("party:roleDecorate:jobTitle");
	public By Organisation =By.id("party:orgDecorate:org");
	public By tags        = By.id("party:tagsDecorate:tagComboBox");
	public By addTag      = By.id("party:tagsDecorate:j_id187");
	
	
	//***********Contact DETAILS*****//
	
	public By mobileNumber  = By.id("party:j_id325:0:phnDecorate:number");
	public By mobileNumberD = By.xpath("//div[@id='party:j_id325:0:phnDecorate']/div/span/div/select");
	public By emailID    = By.id("party:j_id342:0:emlDecorate:nmbr");
	public By emailIDD   = By.xpath("//div[@id='party:j_id342:0:emlDecorate']/div/span/div/select");
	public By website   = By.id("party:j_id370:0:webDecorate:web");
	public By websiteD1 =By.id("party:j_id370:0:webDecorate:service");
	public By websiteD2 =By.xpath("//*[@id='party:j_id370:0:webDecorate']/div/span/div[2]/select");
	
	
	//*****Buttons****//
	public By saveButton =By.id("party:save");
	public By cancelButton =By.id("party:cancel");
	
	
	//******ADD CASE******//
	public By caseIcon =By.id("ember31");
	public By addCase =By.id("ember92");
	
	//*****ADD CASE DETAILS****//
	public By caseRealtesTo =By.id("partySearch");
	public By name =By.id("caseNameDecorate:name");
	public By description =By.id("caseDescriptionDecorate:description");
	public By tagsCase =By.id("tagsDecorate:tagComboBox");
	public By addTagButton=By.id("tagsDecorate:j_id191");
	
	
	public By saveCase =By.id("save");
	public By cancelCase =By.id("cancel");
	
	
	//******Account Settings*******//
	
	public By accountIcon =By.xpath("//div[@id='ember39']");
	public By accountSettings = By.id("ember65");
    public By links =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li/a"); 
	public By account= By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[1]/a");
	public By invoice =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[2]/a");
	public By export =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[3]/a");
	public By appearence =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[4]/a");
	public By mailDropBOx =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[5]/a");
	public By users =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[6]/a");
	public By opportunites =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[7]/a");
	public By tracks =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[8]/a");
	public By taskCategories =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[9]/a");
	public By customFields =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[10]/a");
	public By tagsAccountPge =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[11]/a");
	public By integrations =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[12]/a");
	public By trash =By.xpath("//span[@id='pageMessagesAndContentPanel']/div[2]/div[1]/ul/li[13]/a");
	
	
	
}



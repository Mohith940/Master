package com.genericlibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	
public static WebDriver driver = null;
	
	public static void launchBrowser(String browserName,String passURL){
		
		if (browserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.firefox.marionette", 
					"src/test/resources/libs/geckodriver.exe");
			driver = new FirefoxDriver();//mohith
			
		}else if (browserName.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", 
					"src/test/resources/libs/chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", 
					"src/test/resources/libs/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.setProperty("webdriver.firefox.marionette", 
					
					"src/test/resources/libs/geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Default FF browser is launched!");
		}
		driver.manage().window().maximize();
		driver.get(passURL);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}



}

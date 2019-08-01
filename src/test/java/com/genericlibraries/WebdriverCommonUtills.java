package com.genericlibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebdriverCommonUtills {
	
	public static String getWebText(By locator){
		String val =Driver.driver.findElement(locator).getText().trim();
		return val;
	}
	

	public static void closeBrowser(){

		Driver.driver.close();
	}

	public static void quitBrowser(){

		Driver.driver.quit();
	}

	public static void normalWait(int passTime) throws Exception{
		Thread.sleep(passTime);
	}

	public static void captureScreenshot() throws Exception{
		Random  ran = new Random();
		int val = ran.nextInt(54656555);

		EventFiringWebDriver  efd = new EventFiringWebDriver(Driver.driver);
		File  srcIMG = efd.getScreenshotAs(OutputType.FILE);
		File  dstIMG = new File("src/test/resources/ScreenShots/WeekDayBatch58_"+val+".png");
        Files.copy(srcIMG, srcIMG);
	}


	public static void enterValue(By locator,String value){
		Driver.driver.findElement(locator).clear();
		Driver.driver.findElement(locator).sendKeys(value);
	}

	public static void performClick(By locator){
		Driver.driver.findElement(locator).click();
	}
	
	

	public static void waitForPageLoad(int passTime){

		Driver.driver.manage().timeouts().implicitlyWait(passTime, TimeUnit.SECONDS);

	}

	public static void waitForElementPresent(int passTime,By locator){

		WebDriverWait  wait = new WebDriverWait(Driver.driver, passTime);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

    public static List<WebElement> listOfWebElemnts(By locator) {
		
		List<WebElement> lis = Driver.driver.findElements(locator);
		return lis;
		
	}

	public static Actions performActions(){

		Actions act = new Actions(Driver.driver);
		return act;
	}


	public static Select perfromSelect(By locator){
		Select  sel = new Select(Driver.driver.findElement(locator));
		return sel ;
	}





	public static String getTestData(String sheetName,int passRow,int passCel) throws Exception{

		FileInputStream  fis = new FileInputStream("src/test/resources/TestData/Test Data.xlsx");
		Workbook  wb = WorkbookFactory.create(fis);
		Sheet  sh = wb.getSheet(sheetName);
		Row  rw = sh.getRow(passRow);
		String val =rw.getCell(passCel).getStringCellValue();
		return val;
	}

	public static void setCellValue(String sheetName,int rowNo,int cellNo,String passValue) throws Exception{

		FileInputStream  fis = new FileInputStream("src/test/resources/TestData/Test Data.xlsx");
		Workbook  wb = WorkbookFactory.create(fis);
		Sheet  sh = wb.getSheet(sheetName);
		Row  rw = sh.getRow(rowNo);
		Cell  cel =rw.createCell(cellNo);
		//cel.setCellType(cel.CELL_TYPE_STRING);
		cel.setCellValue(passValue);
		FileOutputStream  fos = new FileOutputStream("src/test/resources/Test Data/TestData.xlsx");
		wb.write(fos);
	}
	
	public static void switchToLatestWindow(String passTitle){

		Set<String> set = Driver.driver.getWindowHandles();
		System.out.println("Windows Size : "+set.size());

		for (String val : set) {

			System.out.println("Window ID : "+val);
			Driver.driver.switchTo().window(val);
			String actualTitle = Driver.driver.getTitle().trim();
			if (passTitle.equals(actualTitle)) {
				break;
			}

		}
	}


}

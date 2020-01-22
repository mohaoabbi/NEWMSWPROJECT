package com.mortgagecalculator;


import java.io.File;
import java.sql.Connection;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class testbrowser extends browserSetup {

	public testbrowser(WebDriver driver, String browser, String url) throws Exception {
		super(driver, browser,url);
		
	}

	public static void main(String[] args) throws Exception {
		
		
		
		testbrowser session = new testbrowser(driver,browser,url);
		driver.get(url);
	    
		driver.findElement(By.name("defaultbutton")).click();
		
		Set windowset = driver.getWindowHandles();
		System.out.println(windowset);
		System.out.println(driver.getTitle());
		
		Iterator it = windowset.iterator();
		
		driver.switchTo().window((String) it.next());
		driver.switchTo().window((String) it.next());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.className("fmcty-radio-option")).click();
		driver.findElement(By.id("MortgageCalculatorDOTORG_property_zip")).sendKeys("20147");
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
		System.out.println("the Screenshot is taken");
		Set windowset1 = driver.getWindowHandles();
		Iterator it1 = windowset1.iterator();
		driver.switchTo().window((String) it1.next());
		
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		
		//driver.findElement(By.id("homeval")).sendKeys("500000");
		
	
		

		

	}

}

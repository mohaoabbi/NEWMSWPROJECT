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
import org.openqa.selenium.WebElement;
	
public class MortgageCalcs extends browserSetup {

	public MortgageCalcs(WebDriver driver, String browser, String url) throws Exception {
		super(driver, browser,url);
		
	}

	public static void main(String[] args) throws Exception {
		
		
		// Open instance of a browser
		MortgageCalcs session = new MortgageCalcs(driver,browser,url);
		// navigate to URL
		driver.get(url);
		System.out.println(driver.getTitle());
		homevalue(570);
		
		
	}
	
	
	public static void homevalue(double homeval) {
		 
		WebElement hv= driver.findElement(By.id("homeval"));
		hv.clear();
		hv.sendKeys("homeval");
	
	
	}
}

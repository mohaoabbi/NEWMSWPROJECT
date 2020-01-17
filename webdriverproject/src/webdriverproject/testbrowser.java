package webdriverproject;

import java.sql.Connection;
import java.sql.ResultSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class testbrowser extends browserSetup {

	public testbrowser(WebDriver driver, String browser, String url,Connection con) throws Exception {
		super(driver, browser,url,con);
		
	}

	public static void main(String[] args) throws Exception {
		
		
		
		testbrowser session = new testbrowser(driver,browser,url,con);
		driver.get(url);
	    /*driver.findElement(By.name("q")).sendKeys("Abdel");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);*/
		

		

	}

}

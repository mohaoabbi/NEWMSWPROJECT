package guru99Pages;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginPagePageFactory {
	
	// userName = mngr243094 , password = zYqAvan
	static WebDriver driver;
	static By  username = By.name("uid");
	static By  password = By.name("password");
	static By  loginbtn = By.name("btnLogin");
	static By  vrfText = By.xpath("//td[contains(text(),'Manger Id ')]");
	
	public static void navigateToBrowser() {
	
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		
	}
public static void enterUsername(String userName) {
	
	driver.findElement(username).sendKeys(userName);
	
}
public static void enterPassword(String pass) {
	
	driver.findElement(password).sendKeys(pass);
}
public static void clickLoginbtn() {
	
	driver.findElement(loginbtn).click();
}
public static void verifyText() {
	
	 String actualpageName = driver.findElement(vrfText).getText();
	 String expectedpageName = "Manger Id : mngr243094";
	 Assert.assertEquals(actualpageName, expectedpageName);
}
	
public static void cleanup() {
	
	driver.close();
	
	}
	
}

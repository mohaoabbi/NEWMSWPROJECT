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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginPage {
	
	// userName = mngr243094 , password = zYqAvan
	static WebDriver driver;
	static By Username = By.name("uid");
	static By password = By.name("password");
	static By btnLogin = By.name("btnLogin");
	static By  vrfText = By.xpath("//td[contains(text(),'Manger Id : mngr243094')]");
	
	
	
	public static void navigateToBrowser() {
	
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		
	}
public static void loginMethod(String userN,String pass) {
	
	driver.findElement(Username).sendKeys(userN);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(btnLogin).click();
	
}
public static void verifyTextpos() {
	
	 String actualpageName = driver.findElement(vrfText).getText();
	 String expectedpageName = "Manger Id : mngr243094";
	 Assert.assertEquals(actualpageName, expectedpageName);
}
public static void verifyTextneg() {
	
	 String actualpageName = driver.switchTo().alert().getText();
	 String expectedpageName = "User or Password is not valid";
	 System.out.println(actualpageName);
	 Assert.assertEquals(actualpageName, expectedpageName);
	 driver.switchTo().alert().accept();
}
	
public static void cleanup() {
	
	driver.close();
	
	}
	
}

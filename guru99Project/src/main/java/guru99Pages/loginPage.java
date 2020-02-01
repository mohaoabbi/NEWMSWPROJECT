package guru99Pages;

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

public class loginPage {
	static WebDriver driver;
	@BeforeMethod() 
	@Parameters({"url"})
	public void setupMethod(String url) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test()
	@Parameters({"username","password"})
	
	public void positiveLogin(String username, String password) {
		
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		String heading3= driver.findElement(By.xpath("//marquee[@class = \"heading3\"]")).getText();
		String ecpected = "Welcome To Manager's Page of Guru99 Bank";
		System.out.println(heading3);
		Assert.assertEquals(heading3, ecpected);
		
	}
	@Test()
	@Parameters({"usernameN","passwordN"})
	
	public void negativeLogin(String usernameN, String passwordN) {
		
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys(usernameN);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(passwordN);
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		String alert = "User or Password is not valid";
		String alertActual = 	driver.switchTo().alert().getText();
		Assert.assertEquals(alertActual, alert);
		driver.switchTo().alert().accept();
	}
	
	@AfterMethod()
	
	public void cleanup() {
		
	
		
		driver.close();
	}
}

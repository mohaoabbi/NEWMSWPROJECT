package guro99PagesPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginPage {
	static WebDriver driver;
	@BeforeTest() 
	
	public void setupMethod() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
	}
	
	@Test()
	
	public void getaquote() {
		
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr243094");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("zYqAvan");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		
	}
	
	@AfterTest()
	
	public void cleanup() {
		
		String heading3= driver.findElement(By.xpath("//marquee[@class = \"heading3\"]")).getText();
		String ecpected = "Welcome To Manager's Page of Guru99 Bank";
		System.out.println(heading3);
		Assert.assertEquals(heading3, ecpected);
		
		driver.close();
	}
}

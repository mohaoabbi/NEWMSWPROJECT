package fcs10Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homePage {
	static WebDriver driver;
	@BeforeTest() 
	
	public void setupMethod() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
	}
	
	@Test()
	
	public void getaquote() {
		
		driver.findElement(By.xpath("//rs-layer[@id=\"slider-1-slide-1-layer-7\"]")).click();
		
	}

}

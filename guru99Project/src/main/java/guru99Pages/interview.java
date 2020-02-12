package guru99Pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class interview {
	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("")).sendKeys("nMWEEE",Keys.SHIFT);
		//a[@id='mhgfhghg']
		//a[contains(text(),mhgfhgfk))]
		
		Actions a = new Actions(driver);
		
		Set<String> aa=driver.getWindowHandles();
		Iterator<String> it= aa.iterator();
		
		
		
	}

}

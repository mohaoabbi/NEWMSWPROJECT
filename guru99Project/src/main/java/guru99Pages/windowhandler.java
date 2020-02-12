package guru99Pages;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandler {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");

		driver.findElement(By.name("defaultbutton")).click();
		Set<String> aa = driver.getWindowHandles();

		Iterator<String> it = aa.iterator();
		String wind1 = it.next();
		String wind2 = it.next();

		driver.switchTo().window(wind2);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(wind1);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.id("iFrameResizer0")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"table-filters\"]/div[1]/mf-segment-control/div/a[2]")).click();
		
		// driver.quit();

	}

}

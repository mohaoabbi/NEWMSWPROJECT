package com.fcs10;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.drive", "C:\\Users\\Abdel\\Documents\\wed_Class\\chromedriver.exe");
		// creat an instance of browser
		WebDriver   driver = new ChromeDriver();
		// navigate to URL
	    driver.get("https://www.mortgagecalculator.org");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("homeval")).sendKeys("1000000");
	    driver.findElement(By.xpath("//input[@id=\"downpayment\"]")).sendKeys("10000");
	    driver.findElement(By.xpath("//input[@id= \"intrstsrate\"]")).sendKeys("4.75");
	    
	   /*List<WebElement> radio =driver.findElements(By.xpath("//input[@name=\"param[downpayment_type]\"]"));
	   radio.get(1).click();
	   System.out.println(radio.size());*/
	   
	   //driver.findElement(By.xpath("//select[@name=\"param[start_month]\"]/option[@value=\"7\"]")).click();
	    System.out.println(driver.findElements(By.xpath("//input[@name=\"param[downpayment_type]\"]")).size());
	    driver.findElements(By.xpath("//input[@name=\"param[downpayment_type]\"]")).get(1).click();
	   
	   Select Duaa = new Select(driver.findElement(By.xpath("//select[@name=\"param[start_month]\"]")));
	   
	   Duaa.selectByIndex(4);
	   
	 WebElement  suk= driver.findElement(By.xpath("//input[@name=\"defaultbutton\"]"));
	 System.out.println(suk.getClass());
	   suk.click();
	   
	   
	   
	   
	   
	  /* 
	// It will return the parent window name as a String
	   String mainWindow=driver.getWindowHandle();
	   // It returns no. of windows opened by WebDriver and will return Set of Strings
	   Set<String> set =driver.getWindowHandles();
	   // Using Iterator to iterate with in windows
	   Iterator<String> itr= set.iterator();
	   while(itr.hasNext()){
	   String childWindow=itr.next();
	      // Compare whether the main windows is not equal to child window. If not equal, we will close.
	   if(!mainWindow.equals(childWindow)){
	   driver.switchTo().window(childWindow);
	   System.out.println(driver.switchTo().window(childWindow).getTitle());
	   driver.close();
	   }
	   }
	   // This is to switch to the main window
	   driver.switchTo().window(mainWindow);
	   */
	   
	   
	   
	
	
	
	 
	  
	    
	   
		

	}

}

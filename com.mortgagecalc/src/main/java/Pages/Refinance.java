package Pages;

import org.openqa.selenium.By;

public class Refinance extends setupClass{
	

	 public static void Originalhomeval(String orhomval) throws InterruptedException {
		 	driver.findElement(By.xpath("//a[contains(text(),'Refinance')]")).click();
		    driver.findElement(By.name("HomeValue")).sendKeys(orhomval);
		  
	  }
	

}

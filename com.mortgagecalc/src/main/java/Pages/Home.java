package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class Home extends setupClass {


  public static void homeval(String homval) throws InterruptedException {
	 
	    driver.findElement(By.id("homeval")).sendKeys(homval);
	  
  }
 

}

package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class Home extends setupClass {


  public static void homeval(String homval) throws InterruptedException {
	 
	    driver.findElement(By.id("homeval")).sendKeys(homval);
	  
  }
  public static void downpay(String dpay) throws InterruptedException {
		 
	    driver.findElement(By.id("downpayment")).sendKeys(dpay);
	  
}
  public static void interestrate(String intrate) throws InterruptedException {
		 
	    driver.findElement(By.id("downpayment")).sendKeys(intrate);
	    //Explicit wait
	   // new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(null));
	  //implicit wait
	   // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
  public static void verifymonthlypay() {
		 
	    String expected ="";
	    String actual ="";
	  
}
 

}

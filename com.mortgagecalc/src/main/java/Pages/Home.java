package Pages;

import org.openqa.selenium.By;


public class Home extends setupClass {


 public void setupEnv() throws InterruptedException {

		
}

  public static void homeval(String homval) throws InterruptedException {
	  launchDriver("chrome");
		 Thread.sleep(3000);
		driver.get("https://www.mortgagecalculator.org/");
	System.out.println("I'm Here");
	  
	  driver.findElement(By.xpath("//input[@id=\"homeval\"]")).sendKeys(homval);
	  
  }


}

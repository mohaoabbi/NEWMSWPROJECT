package WedClass.com.mcalculator;

import org.openqa.selenium.By;

public class Home extends setupClass {

	public static void homeval(String hval) {
		
		launchbrowser("firefox");
		driver.findElement(By.id("homeval")).sendKeys(hval);
		driver.close();
	}

}

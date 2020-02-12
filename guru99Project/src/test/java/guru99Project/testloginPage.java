package guru99Project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import guru99Pages.loginPage;

public class testloginPage {

	@BeforeMethod()
	
	public void setup() {
		
		loginPage.navigateToBrowser();
		
	}
	@Test(priority = 1)
	
	public void testLoginpositive() {
		
		loginPage.loginMethod("mngr243094","zYqAvan");
		loginPage.verifyTextpos();
	}
@Test(priority = 2)
	
	public void testLoginnegative() {
		
	loginPage.loginMethod("mngr24","zYqAvan");
		loginPage.verifyTextneg();
	}
	
	@AfterMethod()
	 public void cleanup() {
		
		loginPage.cleanup();
	}
}

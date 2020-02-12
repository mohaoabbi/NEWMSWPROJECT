package guru99Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import guru99Pages.loginPage;

public class mngNewCustomer extends loginPage {
	
	
	static By mngnewCustomer = By.xpath("//a[contains(text(),'New Customer')]");
	
	public static void newCustomerLink() {
		
		loginPage.navigateToBrowser();
		loginPage.loginMethod("mngr243094","zYqAvan");
		System.out.println("I'm here");
		driver.findElement(mngnewCustomer).click();
	
	}

}

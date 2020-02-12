package guru99Project;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import guru99Pages.loginPage;
import guru99Pages.mngNewCustomer;

public class mngNewCustomerTest {

	@BeforeMethod()
		
		public void setup() {
		}
	
	@Test ()
	
	public void TestnewCustomerLink() {
		
		mngNewCustomer.newCustomerLink();
	}	
	}



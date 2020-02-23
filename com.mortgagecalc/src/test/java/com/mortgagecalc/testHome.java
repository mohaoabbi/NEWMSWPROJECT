package com.mortgagecalc;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Home;

public class testHome extends Home {
	
	

	@Test()
	 public void testHomeval() throws InterruptedException {
		
		homeval("500000");
	}
}

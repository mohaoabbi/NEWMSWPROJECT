package com.mortgagecalc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Home;

public class testHome extends Home {

	@BeforeMethod()
	public void setupTest() throws InterruptedException{
		setupEnv();

	}

	@Test()
	public void testHomeval() throws InterruptedException {

		homeval("500000");
	}
	@Test()
	public void testHomeval1() throws InterruptedException {

		homeval("600000");
	}

	@AfterMethod
	public void Testcleanup() {
		cleanup();
	}
}

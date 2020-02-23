package com.mortgagecalc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Refinance;

public class TestRefinanceClass extends Refinance {
	
	@BeforeMethod()
	public void setupTest() throws InterruptedException{
		setupEnv();

	}

	@Test()
	public void testHomeval() throws InterruptedException {

		Originalhomeval("700000");
	}
	@Test()
	public void testHomeval1() throws InterruptedException {

		Originalhomeval("800000");
	}

	/*@AfterMethod
	public void Testcleanup() {
		cleanup();
	}*/

}

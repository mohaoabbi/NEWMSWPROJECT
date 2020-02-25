package com.mortgagecalc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Refinance;

public class TestRefinanceClass extends Refinance {
	
	
	@BeforeMethod()
	public void setupTest() throws InterruptedException{
		setupEnv("firefox");

	}

	@Test(priority = 1)
	public void testHomeoriginalval() throws InterruptedException {

		Originalhomeval("700000");
	}
	@Test(priority = 2)
	public void testHomeoriginalval1() throws InterruptedException {

		Originalhomeval("800000");
	}

	@AfterMethod
	public void Testcleanup() {
		cleanup();
	}
	@BeforeTest()
	public void befrotestmethod(){
		System.out.println("Before");
	}

}

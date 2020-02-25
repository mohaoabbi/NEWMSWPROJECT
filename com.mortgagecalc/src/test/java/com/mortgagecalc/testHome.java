package com.mortgagecalc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Home;

public class testHome extends Home {
	@AfterTest()
	public void Aftertestmethod(){
		System.out.println("After test");
	}
	@BeforeMethod()
	public void setupTest() throws InterruptedException{
		setupEnv("chrome");

	}

	@Test(priority = 2)
	public void testHomeval() throws InterruptedException {

		homeval("500000");
	}
	@Test(priority = 1)
	public void testHomeval1() throws InterruptedException {

		homeval("600000");
		downpay("6000");
		interestrate("4.25");
	}

	@AfterMethod
	public void Testcleanup() {
		cleanup();
	}
	@BeforeTest()
	public void abefrotestmethod(){
		System.out.println("Before test");
	}
	@BeforeTest()
	public void abbefrotestmethod(){
		System.out.println("Before test abb");
	}
	
}

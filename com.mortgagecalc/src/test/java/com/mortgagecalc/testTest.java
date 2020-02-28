package com.mortgagecalc;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testTest {
	
	@BeforeClass()
	public void beforeclass() {
		System.out.println(" @beforeclass");
	}
	@BeforeTest()
	public void beforeTest() {
		System.out.println(" @beforeTest");
	}
	@BeforeMethod()
	public void beforeMethod() {
		System.out.println(" @beforeMethod");
	}
	
	@Test()
	
	public void testgetPreAppB() {
		
		preAppBClick();
		
	}

	private void preAppBClick() {
		System.out.println("Test fun");
		
	}
	
	@BeforeSuite()
	public void beforeSuite() {
		System.out.println(" @beforeSuite");
	}
}

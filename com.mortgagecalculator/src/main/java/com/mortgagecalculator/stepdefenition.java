package com.mortgagecalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefenition {
	

	static WebDriver driver,Br;

		

public stepdefenition(browserSetup browserSetup) throws Exception{
		
		driver = browserSetup.setup();
		System.out.println("i'm here");
	}

	
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		
		
	  System.out.println("i'm here Given");
	  
	}

	@When("^user enters home value into homeval textbox$")
	public void user_enters_home_value_into_homeval_textbox() throws Throwable {
		//driver.findElement(By.id("homeval")).sendKeys("500000");
		driver.findElement(By.id("downpayment")).sendKeys("12000");
		 System.out.println("I'm here When");
	  
	}

	@When("^entres rate into rate textbox$")
	public void entres_rate_into_rate_textbox() throws Throwable {
		
		driver.findElement(By.id("intrstsrate")).sendKeys("4.75");
		 System.out.println("i'm here When");
	  
	}

	@Then("^clicks on submit button$")
	public void clicks_on_submit_button() throws Throwable {
		driver.findElement(By.name("cal")).click();
	
		 System.out.println("i'm here intrstsrate");
	  
	}

	@Then("^A Mortgage Repayment Summary dislays with a monthly payment value$")
	public void a_Mortgage_Repayment_Summary_dislays_with_a_monthly_payment_value() throws Throwable {
		
	  System.out.println("Then");
	}


	
	
	
	

}

package com.mortgagecalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefenition {
	

	static WebDriver driver,Br;
		
	   
public stepdefenition(browserSetup browserSetup) throws Exception{
		
		driver = browserSetup.setup();
		
	}
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		driver.get("https://www.mortgagecalculator.org/");
		driver.findElement(By.id("homeval")).sendKeys("500000");
	  System.out.println("Given");
	  
	}

	@When("^user enters home value into homeval textbox$")
	public void user_enters_home_value_into_homeval_textbox() throws Throwable {
		 System.out.println("When");
	  
	}

	@When("^entres rate into rate textbox$")
	public void entres_rate_into_rate_textbox() throws Throwable {
		 System.out.println("When");
	  
	}

	@Then("^clicks on submit button$")
	public void clicks_on_submit_button() throws Throwable {
		 System.out.println("Then");
	  
	}

	@Then("^A Mortgage Repayment Summary dislays with a monthly payment value$")
	public void a_Mortgage_Repayment_Summary_dislays_with_a_monthly_payment_value() throws Throwable {
	  System.out.println("Then");
	}


	
	
	
	

}

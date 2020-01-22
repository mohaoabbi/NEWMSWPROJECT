package com.mortgagecalculator;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefenition {
	

	static WebDriver driver,Br;
	static String payval;
		

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
		driver.findElement(By.id("homeval")).sendKeys("500000");
		driver.findElement(By.id("downpayment")).sendKeys("12000");
		
	  
	}

	@When("^entres rate into rate textbox$")
	public void entres_rate_into_rate_textbox() throws Throwable {
		
		driver.findElement(By.id("intrstsrate")).sendKeys("4.75");
		
	  
	}

	@Then("^clicks on submit button$")
	public void clicks_on_submit_button() throws Throwable {
		
	List<WebElement> payment=	driver.findElements(By.xpath("//div[@class='left-cell']"));
	System.out.println(payment.size());
	payval = payment.get(5).getText();
	System.out.println(payval);
	driver.findElement(By.xpath("//div[@class='rw-box button']/input")).click();;
	  
	}

	@Then("^A Mortgage Repayment Summary dislays with a monthly payment value$")
	public void a_Mortgage_Repayment_Summary_dislays_with_a_monthly_payment_value() throws Throwable {
		List<WebElement> payment1=	driver.findElements(By.xpath("//div[@class='left-cell']"));
		System.out.println(payment1.size());
		String payvalres = payment1.get(5).getText();
		System.out.println(payvalres.equals(payval));
		System.out.println(payvalres);
		
		driver.quit();
	  
	}


	
	
	
	

}

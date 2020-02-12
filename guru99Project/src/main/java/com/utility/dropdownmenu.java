package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownmenu {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		
		Select select = new Select (driver.findElement(By.name("param[start_month]")));
		
		select.selectByVisibleText("Mar");

	}

}

package com.dmvtc.testnjPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setup {
   static WebDriver driver;


public static void lounchBrowser(String browser) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
}
	
	
}

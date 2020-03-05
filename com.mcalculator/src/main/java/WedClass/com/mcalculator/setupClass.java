package WedClass.com.mcalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setupClass {
	
	static WebDriver driver;
	
	public static void launchbrowser(String browser) {
	
		if (browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
				}
	driver.manage().window().maximize();
	driver.get("https://www.mortgagecalculator.org/");
	
	}

}

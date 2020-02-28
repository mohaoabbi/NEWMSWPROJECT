package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setupClass {
    static WebDriver driver;
    static int count;

	public static void  launchDriver(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
		if (browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			}
	}
	public void getscreenshot() {
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile=new File("C:\\Users\\Abdel\\git\\NEWMSWPROJECT\\com.mortgagecalc\\target\\Screenshot.png");
	try {
		FileUtils.copyFile(SrcFile,DestFile);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public void setupEnv(String browser) throws InterruptedException {

		 launchDriver(browser);
		driver.get("https://www.mortgagecalculator.org/");
	
}
	 public void cleanup() {
			driver.close();
		}
}

package review;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class classreview {
	
int x;
	

	public static void main(String[] args) throws InterruptedException {

	
		setup();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Abdel");

		
		File fl = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//File DestFile=new File("C:\\Users\\Abdel\\git\\NEWMSWPROJECT\\review\\scs.png");
	
		//Copy file at destination
		try {
			FileUtils.copyFile(fl, new File("C:\\Users\\Abdel\\git\\NEWMSWPROJECT\\review\\scs.png"));
			
			byte[] img_bytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			BufferedImage img = ImageIO.read(new ByteArrayInputStream(img_bytes));
			Graphics g = img.getGraphics();
			g.setColor(java.awt.Color.black);
			g.setFont(new Font( "SansSerif", Font.BOLD, 14));
			g.drawString("My text", 10, 10);
			g.drawRect(5, 5, 50, 50);
			g.dispose();

			// save the image
			ImageIO.write(img, "png", new File("screenshot.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static WebDriver driver;

	public static void setup() {
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
	
	}
	
	

}


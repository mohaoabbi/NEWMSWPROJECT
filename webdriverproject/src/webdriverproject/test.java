package webdriverproject;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, InvalidFormatException, IOException {
		
	
	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:\\Users\\Abdel\\Documents\\wed_Class\\screenshot.png"));
		File image1 = new File("C:\\Users\\Abdel\\Documents\\wed_Class\\screenshot.png");
		addImagesToWordDocument(image1);
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		
	}
		public static void addImagesToWordDocument( File imageFile1)
				throws IOException, InvalidFormatException {
			XWPFDocument doc = new XWPFDocument();
			XWPFParagraph p = doc.createParagraph();
			XWPFRun r = p.createRun();
			BufferedImage bimg1 = ImageIO.read(imageFile1);
			int width1 = bimg1.getWidth();
			int height1 = bimg1.getHeight();
			/*BufferedImage bimg2 = ImageIO.read(imageFile2);
			int width2 = bimg2.getWidth();
			int height2 = bimg2.getHeight();*/
			String imgFile1 = imageFile1.getName();
			//String imgFile2 = imageFile2.getName();
			int imgFormat1 = getImageFormat(imgFile1);
			//int imgFormat2 = getImageFormat(imgFile2);
			String p1 = "Sample Paragraph Post. This is a sample Paragraph post. Sample Paragraph text is being cut and pasted again and again. This is a sample Paragraph post. peru-duellmans-poison-dart-frog.";
			//String p2 = "Sample Paragraph Post. This is a sample Paragraph post. Sample Paragraph text is being cut and pasted again and again. This is a sample Paragraph post. peru-duellmans-poison-dart-frog.";
			r.setText(p1);
			r.addBreak();
			r.addPicture(new FileInputStream(imageFile1), imgFormat1, imgFile1, Units.toEMU(width1), Units.toEMU(height1));
			// page break
			// r.addBreak(BreakType.PAGE);
			// line break
			/*r.addBreak();
			r.setText(p2);
			r.addBreak();
			r.addPicture(new FileInputStream(imageFile2), imgFormat2, imgFile2, Units.toEMU(width2), Units.toEMU(height2));*/
			FileOutputStream out = new FileOutputStream("C:\\Users\\Abdel\\Documents\\wed_Class\\word_images.docx");
			doc.write(out);
			out.close();
			doc.close();
		}
		private static int getImageFormat(String imgFileName) {
			int format;
			if (imgFileName.endsWith(".emf"))
				format = XWPFDocument.PICTURE_TYPE_EMF;
			else if (imgFileName.endsWith(".wmf"))
				format = XWPFDocument.PICTURE_TYPE_WMF;
			else if (imgFileName.endsWith(".pict"))
				format = XWPFDocument.PICTURE_TYPE_PICT;
			else if (imgFileName.endsWith(".jpeg") || imgFileName.endsWith(".jpg"))
				format = XWPFDocument.PICTURE_TYPE_JPEG;
			else if (imgFileName.endsWith(".png"))
				format = XWPFDocument.PICTURE_TYPE_PNG;
			else if (imgFileName.endsWith(".dib"))
				format = XWPFDocument.PICTURE_TYPE_DIB;
			else if (imgFileName.endsWith(".gif"))
				format = XWPFDocument.PICTURE_TYPE_GIF;
			else if (imgFileName.endsWith(".tiff"))
				format = XWPFDocument.PICTURE_TYPE_TIFF;
			else if (imgFileName.endsWith(".eps"))
				format = XWPFDocument.PICTURE_TYPE_EPS;
			else if (imgFileName.endsWith(".bmp"))
				format = XWPFDocument.PICTURE_TYPE_BMP;
			else if (imgFileName.endsWith(".wpg"))
				format = XWPFDocument.PICTURE_TYPE_WPG;
			else {
				return 0;
			}
			return format;
		}

	}



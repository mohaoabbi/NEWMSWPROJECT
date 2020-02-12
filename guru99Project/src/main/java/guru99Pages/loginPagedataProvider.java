package guru99Pages;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class loginPagedataProvider {
	static WebDriver driver;
	String filepath = "C:\\Users\\Abdel\\git\\NEWMSWPROJECT\\guru99Project\\testExcel.xlsx";
	String sheetname= "first sheet";
	@BeforeMethod() 
	@Parameters({"url"})
	public void setupMethod(String url) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	@DataProvider(name="userdata")
	public Object[][] readData(Object[][] data) throws InvalidFormatException, IOException {
	
		Object[][] date = readExcel(filepath, sheetname);
		
	return data;
	}
	
	 public Object[][] readExcel(String filePath, String sheetName) throws InvalidFormatException, IOException {
         FileInputStream file= new FileInputStream(filePath);
         XSSFWorkbook wb = new XSSFWorkbook(file);
         XSSFSheet sheet = wb.getSheet(sheetName);
         int rowCount = sheet.getLastRowNum();
         int column = sheet.getRow(0).getLastCellNum();
         Object[][] data = new Object[rowCount][column];
         for (int i = 1; i <= rowCount; i++) {
             XSSFRow row = sheet.getRow(i);
             for (int j = 0; j < column; j++) {
                 XSSFCell cell = row.getCell(j);
                 DataFormatter formatter = new DataFormatter();
                 String val = formatter.formatCellValue(cell);
                 data[i - 1][j] = val;
             }
         }
         System.out.println(Arrays.deepToString(data));
         return data;
     }
	
	@Test(dataProvider = "userdata")

	
	public void negativeLogin(String usernameN, String passwordN) {
		
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys(usernameN);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(passwordN);
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		String alert = "User or Password is not valid";
		String alertActual = 	driver.switchTo().alert().getText();
		AssertJUnit.assertEquals(alertActual, alert);
		driver.switchTo().alert().accept();
	}
	
	@AfterMethod()
	
	public void cleanup() {
		
	
		
		driver.close();
	}
}

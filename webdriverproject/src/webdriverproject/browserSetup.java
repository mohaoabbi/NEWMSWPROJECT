package webdriverproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.sql.Connection;

import org.docx4j.wml.P.Dir;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import bsh.commands.dir;



public class browserSetup {
	static WebDriver driver,Br;
	static String url;
	static String browser;
	
	private static String urlc;
	private static String user;
	private static String password;
	static Connection con;
	static Statement st ;
	static ResultSet result ;
	
	public browserSetup(WebDriver driver, String browser,String url, Connection con) throws Exception{
		
		this.driver = driver;
		this.browser = browser;
		this.url = url;
		this.con= con;
		//dbconnect();
		setup();
		
	}
		
		public void setup() throws IOException, InterruptedException {
		
		Properties ppt = new Properties();
		File filepath = new File(System.getProperty("user.dir")+"\\src\\Resources\\config.properties");
		FileInputStream file = new FileInputStream(filepath);
		ppt.load(file);
		browser = ppt.getProperty("browser");
		url =ppt.getProperty("url");
		
		 if (browser.equalsIgnoreCase("chrome")) {
		String key , browserPath;
		key = ppt.getProperty("chromekey");
		browserPath = ppt.getProperty("browserPathchrome");
		System.setProperty(key, browserPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		 }
		 if (browser.equalsIgnoreCase("Firefox")) {
				String key , browserPath;
				key = ppt.getProperty("ffxkey");
				browserPath = ppt.getProperty("browserPathffx");
				System.setProperty(key, browserPath);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				
				 }
		 if (browser.equalsIgnoreCase("Edge")) {
				String key , browserPath;
				key = ppt.getProperty("msekey");
				browserPath = ppt.getProperty("browserPathmse");
				System.setProperty(key, browserPath);
				Thread.sleep(3000);
				driver = new EdgeDriver();
				
				driver.manage().window().maximize();
				
				 }
		 if (browser.equalsIgnoreCase("ie")) {
				String key , browserPath;
				key = ppt.getProperty("iekey");
				browserPath = ppt.getProperty("browserie");
				System.setProperty(key, browserPath);
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				
				 }
	}
		
		public void dbconnect() throws Exception {
			 urlc = "jdbc:mysql://localhost:3307/sakila";
			 user = "Abdel"; 
			password = "$123Abcd";
			
			Class.forName("com.mysql.jdbc.Driver");

			con =DriverManager.getConnection(urlc,user,password);
			
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery("select * from actor");
			
			java.sql.ResultSetMetaData rsmd = result.getMetaData();
			   System.out.println("querying SELECT * FROM XXX");
			
			int columnsNumber = rsmd.getColumnCount();
			   while (result.next()) {
			       for (int i = 1; i <= columnsNumber; i++) {
			           if (i > 1) System.out.print(",  ");
			           String columnValue = result.getString(i);
			           System.out.print(columnValue + " " + rsmd.getColumnName(i));
			       }
			       System.out.println("");
			   }

			 try {
		            if (result != null) {
		                result.close();
		            }

		            if (st != null) {
		                st.close();
		            }

		            if (con != null) {
		                con.close();
		            }
		        } catch (Exception e) {

		        }
			
			
		}
}
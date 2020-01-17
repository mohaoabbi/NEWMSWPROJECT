package wedProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class newclasses{

public static void main(String[] args) throws IOException{


	File filepath = new File("C:\\Users\\Abdel\\Documents\\wed_Class\\testClass.xlsx");
	
	FileOutputStream file = new FileOutputStream(filepath);
	
	XSSFWorkbook wb = new XSSFWorkbook();
	XSSFSheet sheet = wb.createSheet();
	
	XSSFRow raw0 = sheet.createRow(0);
	XSSFCell col0 = raw0.createCell(0);
	XSSFCell col1 = raw0.createCell(1);
	
	col0.setCellValue("first cell");
	col1.setCellValue("second cell");
	
	
	
	file.close();
	

}
}
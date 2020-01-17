import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class creatExcel {

	public static void main(String[] args) throws Exception   {
		
		
		
		XSSFWorkbook wb = new XSSFWorkbook();	
		
		XSSFSheet sheet = wb.createSheet("first sheet");
		
		Row raw0 = sheet.createRow(0);
		Row raw1 = sheet.createRow(1);
		
		Cell col00 = raw0.createCell(0);
		Cell col01 = raw0.createCell(1);
		Cell col10 = raw1.createCell(0);
		Cell col11 = raw1.createCell(1);
		
		
		
		col10.setCellValue("first second row cell");
		col11.setCellValue("second second row cell");
		
		File filepath = new File("C:\\Users\\Abdel\\Documents\\wed_Class\\testExcel.xlsx");
		FileOutputStream file = new FileOutputStream(filepath);
		
		wb.write(file);
		wb.close();
		file.close();
		
		
			
		
			  
		  
	} 
	}



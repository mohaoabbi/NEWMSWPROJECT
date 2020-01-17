import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcel {

	public static void main(String[] args) throws Exception {
		
		File filepath = new File("C:\\Users\\Abdel\\Documents\\wed_Class\\testExcel.xlsx");
		
		FileInputStream file = new FileInputStream(filepath);
		
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheetAt(0);
		
		
		for (Row row : sheet) {
			
			for(Cell cell : row) {
				
				switch (cell.getCellType()) {
					
					case STRING:
				        System.out.print(cell.getStringCellValue()+"\t");
				        break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+"\t");
						break;
					case BLANK:
						System.out.print("Blank"+"\t");
						break;
				default:
					break;
				}
				
			}
			
			
			System.out.println();
			
			
		}
	

file.close();
	}

}

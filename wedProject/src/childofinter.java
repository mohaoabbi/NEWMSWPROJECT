import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class childofinter  {

	
		public static void main(String[] args) throws Exception {
			
			
		//connectivity
			//File file = new File("C:\\Users\\Abdel\\Documents\\wed_Class\\Mohamed.txt");
			/*FileWriter writer = new FileWriter(file);
			BufferedWriter pen = new BufferedWriter(writer);
			
			// writing in thefile
			// creat on the loop
			
			for (int i=0;i<20;i+=3) {
				
				for (int j=0;j<50;j+=5) {
					
					pen.write(j+ ",");	
					
				}
				
				pen.write("\n");
				
				
			}
			pen.close();
		
			
			
		}*/
			
			FileReader reader= new FileReader("C:\\Users\\Abdel\\Documents\\wed_Class\\Mohamed.txt");
			BufferedReader rf = new BufferedReader(reader);
		System.out.println(rf.read());
			
			int i=0 ;
			
			while((i=rf.read())!=-1) {
				
				System.out.print((char)i);
			}
			
			
			
			
			rf.close();
			reader.close();
			

}
}

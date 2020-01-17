package writefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.dir") );
		
		File f = new File (System.getProperty("user.dir") + "\\src\\config\\config1.txt");
		
		FileWriter fw = new FileWriter(f);
		
		
		BufferedWriter write = new BufferedWriter(fw);
		
		write.write("hello world");
		write.newLine();
		write.write("hello class");
		write.close();
		
	

	}
	
	public static void fun(int x , double y) {
		System.out.println("int + double" + x + y);
	}
	public static void fun(double x , int y) {
		System.out.println("double + int" + x + y);
	}

}

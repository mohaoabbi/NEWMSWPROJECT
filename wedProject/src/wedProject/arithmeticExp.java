package wedProject;

import java.text.NumberFormat;

public class arithmeticExp {

	public static void main(String[] args) {
		System.out.println("1)-----------------------------------------------------------");
		int result = 10 / 3;
		
		System.out.println(result);
		
		double result1 = (double)10 / 3;
		
		System.out.println(result1);
		System.out.println("-------------------------------------------------------------");
		System.out.println("2)-----------------------------------------------------------");
		//assign x value to y then increment x
		int x = 1;
		int y = x++;
		int yy = ++x;
		System.out.println("assign x value to y then increment x");
		System.out.println("value of x = " + " " +x);
		System.out.println(y);
		System.out.println(yy);
		System.out.println("-------------------------------------------------------------");
		System.out.println("3)-----------------------------------------------------------");
		// increment value of z by 1 then assign it to d
		int z = 1;
		int d = ++z;
		
		System.out.println(z);
		System.out.println(d);
		System.out.println("-------------------------------------------------------------");
		System.out.println("4)-----------------------------------------------------------");
		// implicit casting
		// Byte > short > int > long >float > double
		short w = 3;
		int e = w + 1;
		
		System.out.println(e);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("5)-----------------------------------------------------------");
		// explicit casting
		
		double w1 = 3.8;
		int e1 = (int)w1 + 1;

		System.out.println(e);
		
		String s = "1" ;
		
		int f = Integer.parseInt(s) + 5;
		System.out.println(f);
		
		NumberFormat curr = NumberFormat.getCurrencyInstance();
		String result2 = curr.format(17893647.897);
		 System.out.println(result2);
		 
		 NumberFormat percent = NumberFormat.getPercentInstance();
			String result3 = percent.format(.035);
			 System.out.println(result3);
			 
			 
			 // method chaining
			 
			 System.out.println(NumberFormat.getCurrencyInstance().format(234569832.786));
		
		}

}

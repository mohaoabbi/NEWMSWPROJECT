package wedProject;

import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int i = scn.nextInt();
		
		System.out.println("Enter a name");
		String s = scn.next();
			
				
				if (i%3!=0 && i%5 != 0){
					System.out.println(i);}else {
				
					if (i %3==0 && i%5==0) {	
						
						System.out.println("Fiz-Buz");}
				else if (i%3 == 0) {
					System.out.println("Fiz");}
				else  {
					System.out.println("Buz");}
				}
			}
		
		
		
	}



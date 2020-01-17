package wedProject;

import java.util.Scanner;

public class calculatorProject {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Principal amount: ");
		
		double principalAmount = scn.nextDouble();
		
		//System.out.println("Principal Amount is = " + principalAmount );
		
		System.out.print("Enter Interest Rate: ");
		
		double interestRate = scn.nextDouble();
		
		//System.out.println("Interest Rate is = %" + interestRate );
		
	System.out.print("Enter periode in years: ");
		
		int periode = scn.nextInt();
		
		//System.out.println("The life of loan in years is = " + periode );
		
		double mortgage = principalAmount 
				*( (interestRate/100/12)* Math.pow((1+ (interestRate/100/12)), 12*periode))
				/(Math.pow((1+ (interestRate/100/12)), 12*periode)-1) ;
		
		System.out.println("Your mortgage is: " + mortgage);
		
		
		
	}

}

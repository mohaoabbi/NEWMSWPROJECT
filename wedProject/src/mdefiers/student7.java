package mdefiers;

import java.util.Arrays;

public class student7 implements Cloneable{

	 int id;
	String name;
	
	student7(int i , String n){
		
		id = i;
		name = n;
	}
	
	 static int noOfObjects = 0; 
	  
	    // Instead of performing increment in the constructor 
	    // instance block is preferred to make this program generic. 
	    { 
	        noOfObjects += 1; 
	    } 
	
		void display() {
		System.out.println(id + " "+ name);
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		
		student7 s1 = new student7(111, "karan");
		student7 s2 = (student7)s1.clone();
		student7 s3 = s1;
		new student7(113,"al");
		
		
		s2.display();
		s3.display();
		new student7(117,"all");
		
		System.out.println(student7.noOfObjects); 
	
	
		
	}
	


}

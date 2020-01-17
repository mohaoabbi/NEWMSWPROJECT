import java.util.Arrays;

import constructorClass.javaClass;



public class objectBP {
	
	int id;
	String firstname;
	
	
	
	void sleeps(){
		
		System.out.println("Keep out, I'm sleeping");
		
		
		
	}
	
	objectBP(int id, String firstname){
		
		this.id = id;
		this.firstname=firstname;
		
		
	}
	

	public static void main(String[] args) {
		

		objectBP studen1 = new objectBP(1001,"Abdel");
		
		objectBP studen2 = new objectBP(1002,"Kamal");
		
	
		
		
	}

}

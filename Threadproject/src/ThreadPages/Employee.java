package ThreadPages;

public class Employee  {

	int id;  
	String name;  
	Address address;  
	  
	public Employee(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {  
		Address address1=new Address("Ashburn","VIRGINIA","USA");  
		
	  
		Employee e1=new Employee(111,"Abdel",address1);  
		
	      
	e1.display();  
	
	

}
}

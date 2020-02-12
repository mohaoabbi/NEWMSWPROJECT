package ThreadPages;

public class objectClass {
	static final int x= 10;
	int stId;
	String stName;
	
	objectClass(int stId, String stName){
		
		this.stId =stId;
		this.stName = stName;
	}
	
	
	/*static void stjob(int hours) {
		System.out.println("student sleeps " + hours+" hours");
	}*/
	
	public static void main(String[] args) {
		
		objectClass obj = new objectClass(101,"Ayah");
		
		objectClass obj1 = new objectClass(101,"Ayah");
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj.stId);
		System.out.println(obj.stName);
		System.out.println(obj1.stId);
		System.out.println(obj1.stName);
		System.out.println(obj == obj1);
		System.out.println(obj1.equals(obj1));

		//stjob(24);
		
	}
	

}

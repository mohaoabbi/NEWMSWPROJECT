package mdefiers;

 public class modifiersClass {
	
	
	 
	 
	 int id;
	public int idp;
	protected int idpr;
	private int idpi;
	 
	 
	modifiersClass(int id){
		
		this.id = id;
		
	}
	 
	 
	 
	String usernamem;
	public void  metho1() {
		
		System.out.println("metho1");
	}
	
	
	public static void main(String[] args) {
	
		
		modifiersClass s = new modifiersClass(12);
		modifiersClass s1 = new modifiersClass(12);
		modifiersClass s2 = new modifiersClass(13);
		
		
		System.out.println(s1==s);
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		
		
		
		
}

	
	
	
	
}

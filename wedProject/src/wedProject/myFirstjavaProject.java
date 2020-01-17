package wedProject;

public class myFirstjavaProject {
	


	public static void main(String[] args) {
		
		int x = 3;
		int y = 10;
		String s = "5";
	
		int z = x + y;
		int w = x - y;
		int k = x * y;
		 
		double t = (double)y / x ;
		double d = (double)Integer.parseInt(s) / x ;
		
		System.out.println("Bouchra\t was talking \" on the phone:\n "+z);
		System.out.println(w);
		System.out.println(k);
		System.out.println(t);
		System.out.println(d);
		
		String st = new String("string");
		StringBuffer sb = new StringBuffer("string");
		
		st.concat("hello");
		sb.append("buffer");
		System.out.println(st);
		System.out.println(st.concat("hello"));
		System.out.println(sb);
		
		
		
		
		
	}

}

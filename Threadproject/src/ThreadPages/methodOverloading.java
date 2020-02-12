package ThreadPages;

public class methodOverloading  extends Address{
public methodOverloading(String city, String state, String country) {
		super(city, state, country);
		// TODO Auto-generated constructor stub
	}


public static void inheritMoney(String x ,String y) {
	System.out.println("I'll give you all I have" );
}
	
	public static void mariage() {
		System.out.println("I want to mary my girl" );
	}

public static void main(String[] args) {
	
	
	mariage();
}
}

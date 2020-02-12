package ThreadPages;

	

public class encapsulation {
	
	private double balance = 5000.67 ;
	int customerid;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		System.out.println("deposit cash");
	}
	
	

}

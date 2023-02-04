package src.com.aurionpro.model;
public class Account {

	private int accountNumber;
	private String name;
	private double balance;
	private static int count=0;
	
	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		count++;  
	}
	
	public Account(int accountNumber, String name) {
		this(accountNumber, name , 1000);
		//count++;  
	}
	
	public Account(int accountNumber) {
		this(accountNumber, "DEFAULT" , 1000);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}

	public static int getAccountCount() {
		return count;
		
	}
}
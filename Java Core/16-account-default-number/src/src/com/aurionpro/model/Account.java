package src.com.aurionpro.model;
public class Account {

	private String accountNumber;
	private String name;
	private double balance;
	private static int count=0;
	private static int i=0;
	
	public Account(String name, double balance) {
		this.accountNumber= "S"+(101+i);
		this.name = name;
		this.balance = balance;
		count++;  
		i++;
	}
	
	public Account(String name) {
		this(name , 1000);
		//count++;  
	}
	
	public Account() {
		this("DEFAULT" , 1000);
	}
	
	public String getAccountNumber() {
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
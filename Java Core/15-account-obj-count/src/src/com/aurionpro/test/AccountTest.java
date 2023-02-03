package src.com.aurionpro.test;

import src.com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account acc1 = new Account(101, "ABC", 100000);
		Account acc2 = new Account(102, "PQR");
		Account acc3 = new Account(103);
		printAccDetails(acc1);
		printAccDetails(acc2);
		printAccDetails(acc3);
		//System.out.println("Total account count is: "+Account.count);
		System.out.println("Total account count is: "+Account.getAccountCount());
	}
	
	private static void printAccDetails(Account acc) {
		System.out.println("Account no: " + acc.getAccountNumber());
		System.out.println("Account holder name: " + acc.getName());
		System.out.println("Account balance: " + acc.getBalance());
		System.out.println();
	}
}

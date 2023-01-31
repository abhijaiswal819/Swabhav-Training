package src.com.aurionpro.test;

import src.com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account acc = new Account(101, "ABC", 100000);
		System.out.println("Initially Account Deatils");
		printAccDetails(acc);
		
		System.out.println("After Withdraw Account Deatils");
		acc.withdraw(2000);
		printAccDetails(acc);
		
		System.out.println("After Deposit Account Deatils");
		acc.deposit(4000);
		printAccDetails(acc);
	}

	private static void printAccDetails(Account acc) {
		System.out.println("Account no: " + acc.getAccountNumber());
		System.out.println("Account holder name: " + acc.getName());
		System.out.println("Account balance: " + acc.getBalance());
		System.out.println();
	}

}

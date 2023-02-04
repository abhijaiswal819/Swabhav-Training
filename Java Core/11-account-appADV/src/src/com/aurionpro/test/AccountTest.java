package src.com.aurionpro.test;

import src.com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account acc = new Account(101, "ABC", 100000);
		System.out.println("Account Deatils: ");
		printAccDetails(acc);
		accountWithdraw(acc, 200000);	
		System.out.println();
		accountDeposit(acc, 4000);		
	}

	private static void accountDeposit(Account acc, int amount) {
		if(acc.deposit(amount)) {
			System.out.println("Deposit is in Process");
			System.out.println("Successfully deposited");
			System.out.println("Account balance: " + acc.getBalance());
		}
		else {
			System.out.println("You have entered invalid amount");
		}
	}

	private static void accountWithdraw(Account acc, int amount) {
		if(acc.withdraw(amount)) {
			System.out.println("Withdrawl is in Process");
			System.out.println("Successfully withdrawn");
			System.out.println("Account balance: " + acc.getBalance());
		}
		else {
			System.out.println("You have in-sufficient balance");
		}
	}

	private static void printAccDetails(Account acc) {
		System.out.println("Account no: " + acc.getAccountNumber());
		System.out.println("Account holder name: " + acc.getName());
		System.out.println("Account balance: " + acc.getBalance());
		System.out.println();
	}

}

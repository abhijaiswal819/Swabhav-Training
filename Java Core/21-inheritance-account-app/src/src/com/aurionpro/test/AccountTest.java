package src.com.aurionpro.test;

import src.com.aurionpro.model.Account;
import src.com.aurionpro.model.CurrentAccount;
import src.com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {

		SavingAccount save=new SavingAccount(101, "ABC", 100000);
		save.withdraw(3000);
		save.deposit(2000);
		printAccountDetails(save);

		CurrentAccount current=new CurrentAccount(102, "PQR", 100000);
		current.withdraw(119000);
		current.deposit(2000);
		printAccountDetails(current);
	}

	private static void printAccountDetails(Account acc) {
		System.out.println("Account no: " + acc.getAccountNumber());
		System.out.println("Account holder name: " + acc.getName());
		System.out.println("Account balance: " + acc.getBalance());
		System.out.println();
	}

}

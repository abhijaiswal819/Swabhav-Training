package com.aurionpro.model;

public class EmailNotifier implements INotifier {
	private static EmailNotifier instance;
	public static int objCount = 0;

	public EmailNotifier() {
		// System.out.println("Singleton(): Private constructor invoked");
		objCount++;
	}

	public EmailNotifier getInstance() {
		if (objCount < 2) {
			instance = new EmailNotifier();
			return instance;
		}
		return null;
	}

	@Override
	public void notifyUser(Account account, double amount, String transactionType) {
		System.out.println("Email Notifier");
		System.out.println("Transaction type is: " + transactionType);
		System.out.println("Process was successful.");
		System.out.println("Amount is: " + amount);
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Current Balance: " + account.getBalance());
		System.out.println();
	}

}

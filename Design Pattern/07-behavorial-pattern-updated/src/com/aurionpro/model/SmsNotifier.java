package com.aurionpro.model;

public class SmsNotifier implements INotifier {

	private static SmsNotifier instance;
	//public static int objCount = 0;

	public SmsNotifier() {
//		objCount++;
	}

	public static SmsNotifier getInstance() {
//		if (objCount < 2) {
//			instance = new SmsNotifier();
//			return instance;
//		}
//		return null;
		if (instance == null) {
			instance = new SmsNotifier();

		}
		return instance;
	}

	@Override
	public void notifyUser(Account account, double amount, String transactionType) {
		System.out.println("SMS Notifier");
		System.out.println("Transaction type is: " + transactionType);
		System.out.println("Process was successful.");
		System.out.println("Amount is: " + amount);
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Current Balance: " + account.getBalance());
		System.out.println();
	}

}

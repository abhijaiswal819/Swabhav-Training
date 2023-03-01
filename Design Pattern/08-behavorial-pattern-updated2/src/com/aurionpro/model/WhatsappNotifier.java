package com.aurionpro.model;

public class WhatsappNotifier implements INotifier {

//	private static WhatsappNotifier instance;
//	public static int objCount = 0;
//
//	public WhatsappNotifier() {
//		// System.out.println("Singleton(): Private constructor invoked");
//		objCount++;
//	}
//
//	public WhatsappNotifier getInstance() {
//		if (objCount < 2) {
//			instance = new WhatsappNotifier();
//			return instance;
//		}
//		return null;
//	}
	@Override
	public void notifyUser(Account account, double amount, String transactionType) {
		System.out.println("WhatsApp Notifier");
		System.out.println("Transaction type is: " + transactionType);
		System.out.println("Process was successful.");
		System.out.println("Amount is: " + amount);
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Current Balance: " + account.getBalance());
		System.out.println();
	}


}

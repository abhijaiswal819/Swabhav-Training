package com.aurionpro.model;

public interface INotifier {

	void notifyUser(Account account, double amount, String transactionType);
}

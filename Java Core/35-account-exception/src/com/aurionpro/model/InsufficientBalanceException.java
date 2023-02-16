package com.aurionpro.model;

public class InsufficientBalanceException extends RuntimeException {

	Account account;
	double amount;

	public InsufficientBalanceException(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public String getMessage() {
		String message = "";
		message+="Cannot withdraw amount: Rs. "+amount;
		message+="\nAccount Number: "+account.getAccountNumber();
		message+="\nCurrent Balance: "+account.getBalance();
		message+="\nMinimum balance is Rs. 1000";
		return message;
	}

//	@Override
//	public String toString() {
//		return "InvalidAgeException [message=" + message + "]";
//	}
}

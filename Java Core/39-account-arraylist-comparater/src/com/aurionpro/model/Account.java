package com.aurionpro.model;

public class Account{// implements Comparable<Account> {

	private int accountNumber;
	private String name;
	private double balance;
		
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

//	@Override
//	public int compareTo(Account o) {
//		//return (this.getBalance()).compareTo(o.getBalance())
//		//return 0;
//		//return Double.compare(this.getBalance(), o.getBalance());//Ascending order logic for integer
//		return (this.getName().compareTo(o.getName()));//Ascending order logic for String
//	}
		
}

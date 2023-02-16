package com.aurionpro.model;

public class Account {
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
	
	public void deposit(double amount) {
		this.setBalance(this.getBalance()+amount);
		System.out.println("Amount deposited successfully.");
		System.out.println("Account Balance is: "+this.getBalance());
	}
	
	public void withdraw(double amount) {
		if((this.balance-amount)>=1000) {
			this.setBalance(this.getBalance()-amount);
			System.out.println("Amount withdrawn successfully.");
			System.out.println("Account Balance is: "+this.getBalance());
		}
		else {
			throw new InsufficientBalanceException(this,amount);
		}
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}

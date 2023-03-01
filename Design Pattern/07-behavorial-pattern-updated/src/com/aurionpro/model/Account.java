package com.aurionpro.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Account {

	private int accountNumber;
	private String name;
	private double balance;
	private Set<INotifier> notifiers;

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		//notifiers = new ArrayList<INotifier>();
		notifiers = new HashSet<INotifier>();
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

	public Set<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(Set<INotifier> notifiers) {
		this.notifiers = notifiers;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			// List<INotifier> UniqueNumbers =
			// notifiers.stream().distinct().collect(Collectors.toList());
			//List<INotifier> collect = notifiers.stream().filter(n->n!=null).distinct().collect(Collectors.toList());
			for (INotifier x : notifiers) {
				x.notifyUser(this, amount, "Deposit");
			}
		}
	}

	public void withdraw(double amount) {
		if ((balance - amount) > 0) {
			balance = balance - amount;
			// List<INotifier> UniqueNumbers =
			// notifiers.stream().distinct().collect(Collectors.toList());
			//List<INotifier> collect1 = notifiers.stream().filter(n->n!=null).distinct().collect(Collectors.toList());
			for (INotifier x : notifiers) {
				x.notifyUser(this, amount, "Withdraw");
				//System.out.println(collect1);
			}
		} else {
			throw new InsufficientBalanceException("Insufficient Funds");
		}
	}

	public void registerNotifier(INotifier notifier) {
//            if (!notifiers.equals(null)) {
//            	notifiers.add(notifier);
//            }
//		if (notifiers != null) {
//        	notifiers.add(notifier);
//        }
		notifiers.add(notifier);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers + "]";
	}

}

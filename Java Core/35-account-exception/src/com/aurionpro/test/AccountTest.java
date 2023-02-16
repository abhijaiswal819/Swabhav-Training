package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(101, "RAM", 10000);
		System.out.println(account);
		System.out.println();
		account.deposit(1000);
		System.out.println();
		try {
			account.withdraw(12000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}

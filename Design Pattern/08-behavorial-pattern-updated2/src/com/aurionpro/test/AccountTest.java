package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.SmsNotifier;
import com.aurionpro.model.WhatsappNotifier;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account(101, "RAM", 10000);
		acc.registerNotifier(new SmsNotifier());
		acc.registerNotifier(new SmsNotifier());
		acc.registerNotifier(new EmailNotifier());
		acc.registerNotifier(new EmailNotifier());
		acc.registerNotifier(new WhatsappNotifier());
		acc.withdraw(5000);
		acc.deposit(2000);
		
	}

}

package com.aurionpro.test;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;
import com.aurionpro.model.Employee;

public class AccountTest {

	public static void main(String[] args) {
		
		List<Account> accountList = Arrays.asList(
				new Account(101, "RAMA", 1000),
				new Account(102, "KAMALA", 20000),
				new Account(103, "JAMSHED", 31000),
				new Account(104, "SAM", 4000)
				);
		
		//System.out.println(accountList);
		List<Account> collect = accountList.stream().filter(n -> n.getBalance() >=10000).collect(Collectors.toList());
		System.out.println(collect);
		
		//
//		Create list of Account(id, name, salary)
//		a. Show Account details of account with minimum Balance
//		b. Show Account details of account with maximum Balance
//		c. Show names greater than 6 characters
//		d. find total of balance of all accounts
		//
		System.out.println();
		System.out.println("Account details of account with Minimum Balance: ");
		accountList.parallelStream().min(Comparator.comparing(Account::getBalance)).ifPresent(System.out::println); 
		
		System.out.println("Account details of account with Maximum Balance: ");
		accountList.parallelStream().min(Comparator.comparing(Account::getBalance)).ifPresent(System.out::println);
		
		System.out.println("Names greater than 6 characters: ");
		accountList.parallelStream().filter(name -> name.getName().length() > 6).forEach(System.out::println);
		
		System.out.println("Total of balance of all accounts: ");
		System.out.println(accountList.stream().map(n->n.getBalance()).reduce(0.0, (Double::sum)));
		//List<Double> collect1 = accountList.stream().map(n->n.getBalance()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//System.out.println(collect1.stream().map(String::valueOf).reduce("", (String::concat)));
	}

}

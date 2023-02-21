package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		List<Account> accountList = Arrays.asList(
				new Account(101, "RAM", 1000),
				new Account(102, "KAM", 20000),
				new Account(103, "JAM", 31000),
				new Account(104, "SAM", 4000)
				);
		
		//System.out.println(accountList);
		List<Account> collect = accountList.stream().filter(n -> n.getBalance() >=10000).collect(Collectors.toList());
		System.out.println(collect);
	}

}

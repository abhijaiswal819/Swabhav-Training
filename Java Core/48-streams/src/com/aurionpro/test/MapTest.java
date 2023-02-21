package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class MapTest {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 31, 30, 40);
		List<Integer> collect = numberList.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> friends = Arrays.asList("RAMA", "KAMAL", "JAMAKA", "SAM");
		List<String> collect2 = friends.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Account> accountList = Arrays.asList(
				new Account(101, "RAM", 1000),
				new Account(102, "KAM", 20000),
				new Account(103, "JAM", 31000),
				new Account(104, "SAM", 4000)
				);
		
		accountList = accountList.stream().map(n-> new Account(n.getAccountNumber(), n.getName(), n.getBalance()*1.06)).collect(Collectors.toList());
		System.out.println(accountList);
		
		System.out.println();
		List<Account> collect3 = accountList.stream().filter(n-> n.getAccountNumber()==101).collect(Collectors.toList());
		System.out.println(collect3);
		
		System.out.println();
		List<Integer> collect4 = numberList.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
		System.out.println(collect4);
	}

}

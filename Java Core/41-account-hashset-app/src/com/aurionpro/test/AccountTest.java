package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Set<Account> list = new HashSet<Account>();

		list.add(new Account(101, "RAM", 510));
		list.add(new Account(101, "SAM", 510));
		list.add(new Account(102, "KAM", 850));
		list.add(new Account(103, "JAM", 285.8));

		for(Account x : list) {
			System.out.println(x);
		}
		System.out.println();
		
		
		//Collections.sort(list, Collections.reverseOrder());
		//Collections.sort(list,(s1,s2)-> (int)s1.getBalance()-(int)s2.getBalance());
		//Collections.sort(list);//Ascending order 
//		Collections.sort(list, Collections.reverseOrder());//Descending order
//		System.out.println("\nList of account in Descending order by balance: ");
//		for (int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
//		Collections.sort(list);//Ascending order 
//		//list.sort(Comparator.naturalOrder()); //Ascending order 
//		System.out.println("\nList of account in Descending order by name: ");
//		for (int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}	
	}

}

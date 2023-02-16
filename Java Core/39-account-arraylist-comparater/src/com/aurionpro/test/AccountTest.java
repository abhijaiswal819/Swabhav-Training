package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.aurionpro.model.Account;
import com.aurionpro.model.SortByBalance;
import com.aurionpro.model.SortByName;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();

		list.add(new Account(101, "RAM", 510));
		list.add(new Account(102, "KAM", 850));
		list.add(new Account(103, "JAM", 285.8));

		double total = 0;
//		double min=list.get(0).getBalance();
//		int minIndex=0;
//		double max=list.get(0).getBalance();
//		int maxIndex=0;

		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			total += list.get(i).getBalance();
//			if(min>list.get(i).getBalance()) {
//				min=list.get(i).getBalance();
//				minIndex=i;
//			}
//			else {
//				max=list.get(i).getBalance();
//				maxIndex=i;
//			}
		}
		System.out.println("\nTotal bank balance is: " + total);
//		System.out.println("\nMaximum is: " + list.get(maxIndex));
//		System.out.println("\nMinimum is: " + list.get(minIndex));
		//System.out.println("Minimum Element in ArrayList = "+Collections.min(list));
		//System.out.println("Minimum Element in ArrayList = "+Collections.max(list));
		
		//Collections.sort(list, Collections.reverseOrder());
		//Collections.sort(list,(s1,s2)-> (int)s1.getBalance()-(int)s2.getBalance());
		//Collections.sort(list);//Ascending order 
		//Collections.sort(list, Collections.reverseOrder());//Descending order
		//Collections.sort(list);//Ascending order 
		//list.sort(Comparator.naturalOrder()); //Ascending order 
		Collections.sort(list, new SortByName());//Ascending order 
		System.out.println("\nList of account in Descending order: ");
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}	

		Collections.sort(list, new SortByBalance());//Ascending order 
		System.out.println("\nList of account in Ascending order: ");
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}	
	}

}

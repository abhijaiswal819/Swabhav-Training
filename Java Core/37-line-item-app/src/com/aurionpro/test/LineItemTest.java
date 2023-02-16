package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		List<LineItem> list = new ArrayList<>();

//		LineItem item = new LineItem(101, "RAM", 5, 10);
//		LineItem item1 = new LineItem(102, "SHAYAM", 3, 50);
//		LineItem item2 = new LineItem(103, "RAHUL", 2, 85);
//		
//		list.add(item);
//		list.add(item1);
//		list.add(item2);

		list.add(new LineItem(101, "ParleG", 5, 10));
		list.add(new LineItem(102, "Sandwich", 3, 50));
		list.add(new LineItem(103, "Frankie", 2, 85));

//		item.calculateCost();
//		item1.calculateCost();
//		item2.calculateCost();
//		
//		System.out.println(item);
//		System.out.println(item1);
//		System.out.println(item2);

		double total = 0;
		for (LineItem x : list) {
			System.out.println(x);
			total += x.calculateCost();
		}
		System.out.println("\nTotal cart cost is: " + total);
	}

}

package com.aurionpro.test;

import com.aurionpro.model.CustomerRepositry;
import com.aurionpro.model.IRepositry;
import com.aurionpro.model.OrderRepositry;
import com.aurionpro.model.ProductRepositry;

public class RepositryTest {

	public static void main(String[] args) {
		doDbOperation(new CustomerRepositry());
		doDbOperation(new ProductRepositry());
		doDbOperation(new OrderRepositry());
	}

	private static void doDbOperation(IRepositry obj) {
		obj.create();
		obj.update();
		obj.delete();
		obj.read();
		System.out.println();
	}

}

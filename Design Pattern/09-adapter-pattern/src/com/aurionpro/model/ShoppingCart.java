package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<IItems> cartItems;

	public ShoppingCart() {
		super();
		this.cartItems = new ArrayList<IItems>();
	}

	public void addItemtoCart(IItems item) {
		cartItems.add(item);
	}

	public List<IItems> getCartItems() {
		int i=1;
		for (IItems x : cartItems) {
			System.out.println("Item "+i+++":");
			System.out.println("Name: "+x.getItemName()+"\nPrice(incl.): "+x.getItemPrice());
			System.out.println();
		}
		return null;
	}

	public double getCartPrice() {
		double total = 0;
		for (IItems x : cartItems) {
			total += x.getItemPrice();
		}
		return total;

	}

}

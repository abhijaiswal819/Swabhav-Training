package com.aurionpro.test;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.ShoppingCart;

import abc.Hat;

public class CartTest {

	public static void main(String[] args) {

		ShoppingCart cartObj = new ShoppingCart();
		cartObj.addItemtoCart(new Biscuit("Parle-G", 10));
		cartObj.addItemtoCart(new HatAdapter(new Hat("Summer", "Designer Cotton caps", 300, 10)));
		
		//System.out.println(cartObj.getCartItems());
		cartObj.getCartItems();
		System.out.println("Total Cart Price is: "+cartObj.getCartPrice());
	}

}

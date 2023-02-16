package com.aurionpro.model;

public class LineItem {

	private int id;
	private String name;
	private int quantity;
	private double unitPrice;
//	public double getTotalCostPerItem() {
//		return totalCostPerItem;
//	}
//
//	public void setTotalCostPerItem(double totalCostPerItem) {
//		this.totalCostPerItem = totalCostPerItem;
//	}
//
//	private double totalCostPerItem;
		
	public LineItem(int id, String name, int quantity, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double calculateCost() {
//		totalCostPerItem = this.quantity*this.unitPrice;
//		return totalCostPerItem;
		return quantity*unitPrice;
	}

	@Override
	public String toString() {
		//return "LineItem [id=" + id + ", name=" + name + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", TotalPrice=" + totalCostPerItem + "]";
		return "LineItem [id=" + id + ", name=" + name + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", TotalPrice=" + calculateCost() + "]";
	}
	
	
}

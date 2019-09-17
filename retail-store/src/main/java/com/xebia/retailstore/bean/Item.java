package com.xebia.retailstore.bean;

/*
 * class for Items to be purchased at store.
 */
public class Item {
	
	private String name;
	private double price;
	//to check if its grocery item or not 
	private String type;
	
	public Item() {}
	
	public Item(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}

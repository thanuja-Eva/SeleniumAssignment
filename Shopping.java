package com.ha.shoppingCart;

public class Shopping {
	
	private int id;
	private String description;
	private int quantity;
	private double price;
	
	public Shopping() {
		
	}
	
	public String getDescription() {
		return this.description;
		
	}
	
	public void setDescription(String description) {
		this.description=description;
		
	}
	
	
	
	public int getQuantity() {
		return this.quantity;
		
	}
	
	public void setQuantity(int quantity) {
		if(quantity>0) {
		this.quantity=quantity;
		}
		else {
			System.out.println("invalid value");
		}
	}
	
	

}

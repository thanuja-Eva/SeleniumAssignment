package com.ha.shoppingCart;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shopping item=new Shopping();
		item.setDescription("Shirt");
		item.setQuantity(3);
		
		Shopping item1=new Shopping();
		item1.setDescription("laptop");
		item1.setQuantity(5);
		
		System.out.println(item.getDescription() +" "+item.getQuantity());
		
		System.out.println(item1.getDescription() +" "+item1.getQuantity());
		
	}

}

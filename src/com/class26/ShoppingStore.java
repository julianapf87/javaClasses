package com.class26;

public class ShoppingStore {

	public String item;
	public double price;
	public double quantity;
	public double Price;

	

	ShoppingStore(String aItem, double aPrice, double aQuantity) {
		this.item = aItem;
		this.price = aPrice;
		this.quantity = aQuantity;

		System.out.println(this.item + " Total Value" + Price);
	}
	
	public double TotalPrice() {
		
		Price = this.price * this.quantity;
		return Price;
	}

	public static void main(String[] args) {
		ShoppingStore blancket = new ShoppingStore("Blancket", 49.99, 2);

		ShoppingStore mattress = new ShoppingStore("Mattress", 219.59, 2);

	}

}

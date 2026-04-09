package ex01_list.arraylist.product;

import java.util.Set;

public class Product {
	private String name;
	private int price;
	private int quantity;
	
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setQunatity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
	public int getTotalPrice(int price, int quantity) {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d원) x %d개", name, price, quantity);
	}
}

package exam2;

public class Product {
	private String name;
	private int stock;
	
	public Product(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}
	
	void sell(int amount) {
		if(amount > this.stock) {
			System.out.println("재고가 부족합니다");
		} else if(this.stock > amount) {
			stock -= amount;
			System.out.println("판매 완료");
		}
	}
	
	void printInfo() {
		System.out.println(name + " : " + stock + "개");
	}
}

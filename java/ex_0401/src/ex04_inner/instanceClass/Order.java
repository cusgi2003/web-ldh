package ex04_inner.instanceClass;

public class Order {
	int orderNumber;
	
	public Order(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	class Item{
		String name;
		int price;
		int count;
		
		public Item(String name, int price, int count) {
			this.name = name;
			this.price = price;
			this.count = count;
		}
		
		void printInfo() {
			System.out.println("상품명 : " + name + ", 가격 : " + price + "원, "+ "수량 :" + count);
		}
	}
	
	
	public void printOrderInfo(Item item) {
		System.out.println("주문번호 : " + orderNumber);
		item.printInfo();
	}
	
	
}

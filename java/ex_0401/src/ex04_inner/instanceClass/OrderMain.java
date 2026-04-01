package ex04_inner.instanceClass;

public class OrderMain {
	public static void main(String[] args) {
		Order order = new Order(2026001);
		Order.Item item = order.new Item("키보드", 500000, 2);
		
		order.printOrderInfo(item);
	}
}

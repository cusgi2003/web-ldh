package exam2;

public class ProductMain {
	public static void main(String[] args) {
		Product product = new Product("apple", 10);
		
		// 재고 출력
		product.printInfo();
		
		// 3개 판매
		product.sell(3);
		
		// 재고 출력
		product.printInfo();
		
		// 10개 판매 시도
		product.sell(10);
		
		// 재고 출력
		product.printInfo();
		
	}
}

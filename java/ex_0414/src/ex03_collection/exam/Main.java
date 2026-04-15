package ex03_collection.exam;

public class Main {
	public static void main(String[] args) {
		ProductService service = new ProductService();
		
		// 제품 추가 하기
		service.addProduct(new Product("P001", "삼각김밥", 1200, 10));
		service.addProduct(new Product("P002", "사탕", 300, 50));
		service.addProduct(new Product("P003", "콜라", 2100, 100));
		service.addProduct(new Product("P004", "도시락", 500, 30));
		
		service.printAllProducts();
		
		// P001 제품의 가격을 10% 인상
		service.updateProduct("P001", product -> {
			product.setPrice((int)(product.getPrice() * 1.1));
		});
		
		// 재고가 있는 제품만 조회
		service.findProductsByCondition(p -> p.getStock() > 0);
		
		// 재고가 없는 상품 삭제
		service.deleteProductsByCondition(p -> p.getPrice() > 300);
	}
}

package ex01_list.arraylist.product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> products = new ArrayList<>();
	
	// 상품추가(같은 상품이 들어오면 수량만 증가)
	public void addProduct(String name, int price, int quantity) {
		// list의 size()가 0이면 반복문에 안들어간다
		for(Product p : products) {
			if(p.getName().equals(name)) {
				p.setQuantity(quantity);
				System.out.println("기존 상품 수량 증가");
				return;
			}
		}
		
		// 넘어온 제품이 겹치지 않는다면 list에 추가하기
		products.add(new Product(name,price,quantity));
		System.out.println("상품 추가 완료");
	}
	
	// 장바구니 출력
	public void printCart() {
		// 장바구니가 비어있으면 "장바구니가 비었습니다." 출력하기
		if(products.isEmpty()) {
			System.out.println("장바구니가 비었습니다.");
			return;
		}
		// 모든 상품을 출력하기
		for(Product p : products) {
			System.out.println(p.toString());
		}
	}
	
	public void printTotalPrice() {
		int totalPrice = 0;
		for(Product p : products) {
			totalPrice += (p.getPrice() * p.getQuantity());
		}
		
		System.out.println("총 결제 금액 : " + totalPrice + "원");
		return;
	}
	
	public void removeProduct(String name) {
		// 제품이 있으면 삭제하고 "제품 삭제 완료"
		for(Product p : products) {
			if(p.getName().equals(name)) {
				products.remove(p);
				System.out.println("제품 삭제 완료");
				return;
			}
		}
		// 제품이 없으면 "해당 제품이 없습니다"
		System.out.println("해당 상품이 없습니다.");

	}
}

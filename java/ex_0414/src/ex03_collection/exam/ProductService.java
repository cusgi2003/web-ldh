package ex03_collection.exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProductService {
	private List<Product> products = new ArrayList<Product>();

	public void addProduct(Product product) {
		if (findByCode(product.getCode()) != null) {
			System.out.println("이미 존재하는 상품 코드입니다.");
			return;
		}
		products.add(product);

	}

	public void printAllProducts() {
		System.out.println("====> 모든 상품 출력 <====");
		for (Product p : products) {
			System.out.println(p);
		}
	}

	public Product findByCode(String code) {
		for (Product p : products) {
			if (p.getCode().equals(code)) {
				return p;
			}
		}
		return null;
	}

	// 상품 정보의 수정
	public void updateProduct(String code, Consumer<Product> updater) {
		// 코드에 해당하는 제품 한 개 찾기
		Product p = findByCode(code);

		if (p == null) {
			System.out.println("상품이 존재하지 않습니다");
			return;
		}
		updater.accept(p);
	}

	public void findProductsByCondition(Predicate<Product> predicate) {
		System.out.println("재고가 있는 상품");
		// 전체 순회하면서
		for (Product p : products) {
			// 매개변수로 넘어온 람다식의 조건에 맞으면
			if (predicate.test(p)) {
				System.out.println(p);
			}
		}
	}

	public void deleteProductsByCondition(Predicate<Product> predicate) {
		products.removeIf(predicate);
	}
}

package ex03_collection.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProductService {
	List<Product> products = new ArrayList<Product>();

	public void addProduct(Product product) {
		for (Product p : products) {
			if (p.getCode().equals(product.getCode())) {
				System.out.println("이미 존재하는 상품 코드입니다.");
				return;
			}
		}
		products.add(product);

	}

	public void printAllProducts() {
		products.forEach(System.out::println);
	}

	public Product findByCode(String code) {
		for (Product p : products) {
            if (code.equals(p.getCode())) {
                return p;
            }
        }
        return null;
	}

	public void updateProduct(String code, Function<Product, Product> updater) {
		Product product = findByCode(code);
		if (product != null) {
			int index = products.indexOf(product);
			products.set(index, updater.apply(product));
		}
	}

	public void findProductsByCondition(Predicate<Product> predicate) {
		products.stream().filter(predicate).forEach(System.out::println);
	}
	
	public void deleteProductsByCondition(Predicate<Product> predicate) {
		products.removeIf(predicate);
	}
}

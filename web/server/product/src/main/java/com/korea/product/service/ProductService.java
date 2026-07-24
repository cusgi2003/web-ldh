package com.korea.product.service;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import com.korea.product.dao.ProductDAO;
import com.korea.product.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	private final ProductDAO productDAO;

	public List<ProductVO> findAll() {
		// TODO Auto-generated method stub
		return productDAO.findAll();
	}

	public ProductVO findById(int product_id) {
		// TODO Auto-generated method stub
		return productDAO.findById(product_id);
	}

	// 3. 상품 등록
	public List<ProductVO> createProduct(ProductVO vo) {
		productDAO.createProduct(vo);
		return productDAO.findAll();
	}

	
	public List<ProductVO> updateProduct(ProductVO vo) {
		//제품이 있는지 확인
				ProductVO product = productDAO.findById(vo.getProductId());
				
				if(product == null) {
					throw new IllegalArgumentException("수정할 상품이 존재하지 않습니다.");
				}
				
				productDAO.updateProduct(vo);
				
				return productDAO.findAll();
	}
	

}

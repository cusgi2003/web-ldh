package com.korea.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.korea.product.vo.ProductVO;

@Mapper
public interface ProductDAO {

	List<ProductVO> findAll();

	void createProduct(ProductVO vo);

	ProductVO findById(int productId);

	int updateProduct(ProductVO vo);

	int decreaseStock(int productId, int productCount);

	

}

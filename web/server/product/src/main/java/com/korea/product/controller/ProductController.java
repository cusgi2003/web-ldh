package com.korea.product.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.service.ProductService;
import com.korea.product.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productServce;

	// 1. 전체 상품 조회
	@GetMapping
	public ResponseEntity<?> findAll() {
		List<ProductVO> list = productServce.findAll();
		return ResponseEntity.ok().body(list);
	}

	// 2. 특정 상품 번호로 조회
	@GetMapping("/{productId}")
	public ResponseEntity<?> findById(@PathVariable int productId) {
		ProductVO product = productServce.findById(productId);
		return ResponseEntity.ok().body(product);
	}

	// 4. 상품 수정
	@PutMapping("/{productId}")
	public ResponseEntity<?> updateProduct(
			@PathVariable int productId,
			@RequestBody ProductVO vo) {
		
		try {
			// 주소창의 id를 받아 VO 객체에 강제로 세팅
			vo.setProductId(productId);
			
			// 성공 시 200 OK와 함께 최신 목록 반환
			return ResponseEntity.ok().body(productServce.updateProduct(productId));
			
		} catch (Exception e) { // 변수명 e로 통일
			// 실패 시 500 Internal Server Error 또는 400 BadRequest와 함께 에러 메시지 반환
			return ResponseEntity.badRequest().body(e.getMessage()); // getMessage() 괄호 추가
		}
	}

}

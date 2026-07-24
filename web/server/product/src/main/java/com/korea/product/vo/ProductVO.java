package com.korea.product.vo;

import java.time.LocalDateTime; // LocalDate에서 시간까지 포함하는 타입으로 변경 권장
import lombok.Data;

@Data
public class ProductVO {
	
	private Integer productId;      // product_id -> 카멜 케이스 변경 (안전한 Integer 권장)
	private String productName;     // product_name -> 카멜 케이스 변경
	private Integer productStock;   // product_stock -> 카멜 케이스 변경
	private Integer productPrice;   // product_price -> 카멜 케이스 변경
	private LocalDateTime registerDate; // register_date -> 카멜 케이스 변경
	private LocalDateTime updateDate;   // update_date -> 카멜 케이스 변경
	
}


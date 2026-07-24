package com.korea.product.vo;

import java.time.LocalDateTime; // 시간 정보까지 정확히 담는 타입으로 변경
import lombok.Data;

@Data
public class OrderVO {

	private Integer orderId;       // order_id -> 카멜 케이스 변경 (안전한 Integer 권장)
	private Integer productId;     // product_id -> 카멜 케이스 변경
	
	private String productName;    // product_name -> 카멜 케이스 변경
	private Integer productCount;  // product_count -> 카멜 케이스 변경
	private Integer productPrice;  // product_price -> 카멜 케이스 변경
	private Integer totalPrice;    // total_price -> 카멜 케이스 변경
	
	private LocalDateTime orderDate; // order_date -> 카멜 케이스 변경
}

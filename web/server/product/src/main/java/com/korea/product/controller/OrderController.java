package com.korea.product.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.service.OrderService;
import com.korea.product.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
	
	private OrderService orderService;
	
	@PostMapping
	public String createOrder(@RequestBody OrderVO vo) {
		return orderService.createOrder(vo);
	}
	
	
}

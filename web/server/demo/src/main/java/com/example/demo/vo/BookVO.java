package com.example.demo.vo;

import lombok.Data;

@Data
public class BookVO {
	Long id;
	String title;
	String author;
	String category;
	int price;
	int stock;
}

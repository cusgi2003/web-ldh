package com.korea.test.dto;

import com.korea.test.entity.BookEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO {
	private Long id;
	private String title;
	private String author;
	private int price;
	private String category;
	private int stock;
	
	public BookDTO(BookEntity bookEntity) {
		this.id = bookEntity.getId();
		this.title = bookEntity.getTitle();
		this.author = bookEntity.getAuthor();
		this.price = bookEntity.getPrice();
		this.category = bookEntity.getCategory();
		this.stock = bookEntity.getStock();
	}
}

package com.korea.test.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.test.dto.BookDTO;
import com.korea.test.dto.ResponseDTO;
import com.korea.test.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("books")
public class BookController {
	
	private final BookService bookService;
	
	// 도서 등록 POST
	// 메서드명 : create
	@PostMapping
	public ResponseEntity<?> create(
			@RequestBody BookDTO dto) {
		try {
			BookDTO result = bookService.create(dto);
			
			ResponseDTO<BookDTO> response = 
					ResponseDTO.<BookDTO>builder()
						.data(List.of(result))
						.build();
			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			ResponseDTO<BookDTO> response = 
					ResponseDTO.<BookDTO>builder()
						.error(e.getMessage())
						.build();
			
			return ResponseEntity.ok().body(response);
		}
	}
	
	
	
}

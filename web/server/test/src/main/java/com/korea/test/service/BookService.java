package com.korea.test.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.korea.test.dto.BookDTO;
import com.korea.test.entity.BookEntity;
import com.korea.test.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
	
	private final BookRepository bookRepository;
	
	// 1. 도서 등록
	public BookDTO create(BookDTO dto) {
		BookEntity entity = BookEntity.builder()
				.title(dto.getTitle())
				.author(dto.getAuthor())
				.price(dto.getPrice())
				.category(dto.getCategory())
				.stock(dto.getStock())
				.build();
		BookEntity savedEntity = bookRepository.save(entity);
		return new BookDTO(savedEntity);
	}
	
	// 2. 전체 도서 조회
	public List<BookDTO> findAll() {
		List<BookDTO> list = bookRepository.findAll()
				.stream()
				.map(BookDTO::new)
				.toList();
		
		System.out.println(list);
		return list;
	}
	
	// 3. 도서 ID 조회
	public BookDTO findById(Long id){
		BookEntity entity = bookRepository.findById(id).get();
		
		return new BookDTO(entity);
	}
	
	// 4. 제목으로 도서 조회
	public List<BookDTO> finByTitle(String title){
		return bookRepository
				.findByTitleContaining(title)
				.stream()
				.map(BookDTO::new)
				.toList();
	}
	
	// 5. 카테고리별 도서 검색
	public List<BookDTO> findByCategory(String category) {
		return bookRepository
				.findBycategoryContaining(category)
				.stream()
				.map(BookDTO::new)
				.toList();
	}
	
	// 6. 도서 정보 수정
	public BookDTO update(Long id, BookDTO dto) {
		BookEntity entity = bookRepository.findById(id).get();
		
		// dto 수정할 겂을 entity에 넣는다
		entity.setTitle(dto.getTitle());
		entity.setAuthor(dto.getAuthor());
		entity.setPrice(dto.getPrice());
		entity.setCategory(dto.getCategory());
		entity.setStock(dto.getStock());
		
		BookEntity savedEntity = bookRepository.save(entity);
		
		return new BookDTO(savedEntity);
	}
	
	// 7. 도서 삭제
	public void delete(long id) {
		BookEntity entity = bookRepository.findById(id)
				.orElseThrow(() -> new NoSuchElementException("삭제할 도서가 없습니다."));
		
		// 데이터 삭제
		bookRepository.delete(entity);
		
	}
	
}

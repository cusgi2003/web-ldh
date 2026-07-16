package com.korea.test.repository;

import org.springframework.stereotype.Repository;

import com.korea.test.entity.BookEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>{
	
	// 특정 제목이 포함된 데이터를 조회하는 메서드
	List<BookEntity> findByTitleContaining(String title);
	
	// 카테고리가 일치하는 도서 검색
	List<BookEntity> findBycategoryContaining(String category);
	
}

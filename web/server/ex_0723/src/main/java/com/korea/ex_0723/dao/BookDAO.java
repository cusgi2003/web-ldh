package com.korea.ex_0723.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.korea.ex_0723.vo.BookVO;

@Mapper
public interface BookDAO {
	
	// 전체 조회
	List<BookVO> findAll();
	
	// 도서 검색
	BookVO findById(Long id);
	
	// 도서 추가
	int insert(BookVO vo);

	// 도서 수정
	int update(BookVO vo);

	// 도서 삭제
	int delete(Long id);

	// 카테고리별 도서 조회
	List<BookVO> findByCategory(String category);

	// 도서 제목 검색
	List<BookVO> findByTitle(String title);

	int countBooks();
	
	List<BookVO> findAllOrder(@Param("sort") String sort);

}

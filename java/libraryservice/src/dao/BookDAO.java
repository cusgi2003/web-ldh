package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBUtil;
import dto.BookDTO;

public class BookDAO {
	// book 테이블에 도서 정보를 등록하는 기능 구현하기
	// insertBook(BookDTO dto)
	public void insertBook(BookDTO dto) {
		String sql = "INSERT INTO book (title, author, stock) values (?, ?, ?)";

		try (Connection conn = DBUtil.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getAuthor());
			pstmt.setInt(3, dto.getStock());
			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("도서 정보 등록 완료");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 전체 도서 조회 기능 만들기
	// findAllBooks()
	public void findAllBooks() {
		String sql = "SELECT * FROM book";

		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			while (rs.next()) {
				int bookId = rs.getInt("book_id");
				String title = rs.getString("title");
				String author = rs.getString("author");
				int stock = rs.getInt("stock");

				System.out.println("도서 번호 : " + bookId);
				System.out.println("도서 명 : " + title);
				System.out.println("저자 : " + author);
				System.out.println("재고 : " + stock);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void findLowStockBooks() {
		List<BookDTO> list = new ArrayList<BookDTO>();
		
		String sql = "SELECT * from book where stock = ?";
		try (
				Connection conn = DBUtil.getConnection(); 
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setBook_id(rs.getInt("book_id"));
				dto.setTitle(rs.getString("title"));
				dto.setAuthor(rs.getString("author"));
				dto.setStock(rs.getInt("stock"));
				
				list.add(dto);
			}
			
			if(list.isEmpty()) {
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

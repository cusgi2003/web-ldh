package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBUtil;

public class RentalDAO {

	// 고객이 도서를 대여하면 다음의 작업을 처리한다.
	// 도서 재고를 조회
	// rental 테이블에 대여 정보를 추가
	// book 테이블이 재고를 1 감소
	// rentalBook(int customerId, int bookId)
	// conn.setAutoCommit(false);
	// conn.rollback(); 롤백
	// conn.commit(); 커밋
	
	public void rentalBook(int customer_id, int book_id) {
		String stockSQL = "SELECT stock from book where book_id = ?";
		String insertSQL = "INSERT INTO rental(customer_id, book_id) values(?, ?)";
		String updateSQL = "UPDATE book set stock = stock -1 where book_id = ?";
		
		try (
				Connection conn = DBUtil.getConnection();
				){
			conn.setAutoCommit(false);
			
			try (
				PreparedStatement stockPstmt = conn.prepareStatement(stockSQL);
					PreparedStatement insertPstmt = conn.prepareStatement(insertSQL);
					PreparedStatement updatePstmt = conn.prepareStatement(updateSQL);
					){
				stockPstmt.setInt(1, book_id);
				ResultSet rs = stockPstmt.executeQuery();
				
				if(!rs.next()) {
					System.out.println("존재하지 않는 도서입니다");
					conn.rollback();
					return;
				}
				int stock = rs.getInt("stock");
				
				if(stock <= 0) {
					System.out.println("재고가 부족합니다");
					conn.rollback();
				}
				
				insertPstmt.setInt(1, customer_id);
				insertPstmt.setInt(2, book_id);
				insertPstmt.executeUpdate();
				
				updatePstmt.setInt(1, book_id);
				updatePstmt.executeUpdate();
				
				conn.commit();
				
				System.out.println("도서 대여 완료");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 전체 대여 목록 Join으로 조회
	// 대여번호, 고객명, 도서명, 대여일을 조회
	// findRentalList()
	public void findRentalList() {
		String sql = 
				"""
				select 
					r.rental_id,
					c.name,
					b.title,
					r.rental_date
				from rental r
				inner join customer c
				on r.customer_id = c.customer_id
				inner join book b
				on r.book_id = b.book_id
				order by r.rental_id
				""";
		
		try(
			Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
				){
			while(rs.next()){
				System.out.println("대여번호 : " + rs.getInt("rental_id"));
	            System.out.println("고객명 : " +  rs.getString("name"));
	            System.out.println("도서명 : " + rs.getString("title"));
	            System.out.println("대여일 : " + rs.getString("rental_date"));
	            System.out.println("-----------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 특정 사람이 대여한 도서 목록만 조회
	public void findRentalByCustomer(int customerID) {
		String sql = """
				select c.name, b.title, r.rental_date
				from rental r
				inner join customer c on r.customer_id = c.customer_id
				inner join book b on r.book_id = b.book_id;
				where c.customer_id = ?
				""";
		
		try (
				Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			pstmt.setInt(1, customerID);
			
			ResultSet rs = pstmt.executeQuery();
			boolean found = false;
			
			while(rs.next()) {
				found = true;
				System.out.println("고객명 : " + rs.getString("name"));
				System.out.println("도서명 : " + rs.getNString("title"));
				System.out.println("대여일 : " + rs.getString("rental_date"));
				System.out.println("--------------");
			}
			
			// 조회된게 없다면
			if(!found) {
				System.out.println("대여 내역이 없습니다");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

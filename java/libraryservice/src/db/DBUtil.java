package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	// 데이터베이스 연결 객체를 반환하는 메소드

	// db 접속 정보
	// 주소
	private static String url = "jdbc:mysql://localhost:3306/rental_db";
	// 아이디
	private static String user = "root";
	// 비밀번호
	private static String password = "11111111";

	public static Connection getConnection() throws Exception{
			return DriverManager.getConnection(url,user,password);
	}
}

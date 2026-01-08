package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

public class SqlExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. JDBC Driver Load
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. DB 접속 : 연결할 DB 정보 필요
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "hr";
		String passworld = "hr";

		Connection conn = DriverManager.getConnection(url, username, passworld);

		/*********** INSERT **************/
		// 3. SQL 실행
		String insert = "INSERT INTO employees VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		// 3-1. Statement or PreparedStatement 객체 생성
		PreparedStatement ps = conn.prepareStatement(insert);
		ps.setInt(1, 1000); // 1은 ?의 순서, 1000은 값
		ps.setString(2, "Kil-Dong");
		ps.setString(3, "Hong");
		ps.setString(4, "kdHong@google.com");
		ps.setString(5, "82.10.1234.1234");
		ps.setString(6, "21/11/05");
		ps.setString(7, "SA_REP");
		ps.setDouble(8, 6000);
		ps.setDouble(9, 0.15);
		ps.setInt(10, 149);
		ps.setInt(11, 80);

		// 3-2. SQL 전달 및 실행
		int result = ps.executeUpdate();

		// 3-3. 반환결과 처리
		System.out.println("insert 결과 : " + result);

		/*********** UPDATE **************/
		// 3. SQL 실행
		// 3-1. Statement or PreparedStatement 객체 생성
		// jdk 15버전 이상만 가능한 템플릿 문법
		String update = """
				UPDATE employees
				SET last_name = ?
				WHERE employee_id = ?
				""";
		ps = conn.prepareStatement(update);
		ps.setString(1, "Kang");
		ps.setInt(2, 1000);
		// 3-2. SQL 전달 및 실행
		result = ps.executeUpdate();

		// 3-3. 반환결과 처리
		System.out.println("UPDATE 결과 : " + result);

		/*********** SELECT **************/
		// 3. SQL 실행
		// 3-1. Statement or PreparedStatement 객체 생성
		String select = """
				SELECT * FROM employees
				ORDER BY employee_id
				""";

		ps = conn.prepareStatement(select);

		// 3-2. SQL 전달 및 실행
		ResultSet rs = ps.executeQuery();

		// 3-3. 반환결과 처리
		while (rs.next()) {
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			System.out.printf("이름 : %s, %s\n", firstName, lastName);
		}

		/*********** DELETE **************/
		// 3. SQL 실행
		// 3-1. Statement or PreparedStatement 객체 생성
		String delete = """
				DELETE FROM employees
				WHERE employee_id = ?
				""";
		ps = conn.prepareStatement(delete);
		ps.setInt(1, 1000);
		// 3-2. SQL 전달 및 실행
		result = ps.executeUpdate();

		// 3-3. 반환결과 처리
		System.out.println("DELETE 결과 : " + result);
		// 4. 자원 해제

		if (rs != null)
			rs.close();
		if (ps != null)
			ps.close();
		if (conn != null)
			conn.close();
	}
}

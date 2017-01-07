package main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LoginDao {
	private String url = "dev.cs8zfdntdlzp.ap-northeast-2.rds.amazonaws.com:1521:orcl";
	private String user = "ck";
	private String pass = "wnstjd88";
	private String sql = "select * from ";
	
	public boolean getLoginInfo() throws Exception{
		boolean result = false;
		
		
		//jdbc 4단계
		
		//1.드라이버 로딩 - 오라클드라이버를 동적으로 로딩하기위해 자바의 리블랙션기술을 사용.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("1.드라이버 로딩 성공.");
		//2.커넥션 생성
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("2.디비 연결 성공.");
		//3.쿼리문 작성 및 실행.
		PreparedStatement ps = conn.prepareStatement(sql);
		
		return result;
	}
}

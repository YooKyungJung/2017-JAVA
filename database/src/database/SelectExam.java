package database;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class SelectExam {
	
	public static void main(String[] args) {
		//1단계: JDBC 드라이버
		try {
			Class.forName("org.gjt.mm.mysql.Driver");	
			
		} catch(ClassNotFoundException ee) { System.err.println("DB연결 드라이브가 없음"); }
		
		//2단계: 
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/test?useSSL=false";
		String id="root";
		String pw="0903";		
		try {
			conn=DriverManager.getConnection(url,id,pw);
		} catch(SQLException ee) { System.err.println("DB 서버 연결 실패"); }
		
		//3단계: 명령어 처리 Statement 객체 생성
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
		} catch(SQLException ee) { System.err.println("작업 처리 객체 생성 실패"); }
		
		//4단계: 명령어 작성(검색) 및 결과 보기
		ResultSet rs = null;
		try {
			rs=stmt.executeQuery("select * from t1");
			while(rs.next()) {
				System.out.println(rs.getString("name")+"-"+rs.getString("month")+"-"+rs.getString("day"));
			}
		} catch(SQLException ee) { System.err.println("작업 처리 객체 생성 실패"); }

		//5단계: 접속 종료
		try {
			rs.close(); stmt.close(); conn.close();
		} catch(SQLException ee) { System.err.println("접속 종료 실패"); }
		
	}

}

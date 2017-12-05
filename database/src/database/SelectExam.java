package database;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class SelectExam {
	
	public static void main(String[] args) {
		//1�ܰ�: JDBC ����̹�
		try {
			Class.forName("org.gjt.mm.mysql.Driver");	
			
		} catch(ClassNotFoundException ee) { System.err.println("DB���� ����̺갡 ����"); }
		
		//2�ܰ�: 
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/test?useSSL=false";
		String id="root";
		String pw="0903";		
		try {
			conn=DriverManager.getConnection(url,id,pw);
		} catch(SQLException ee) { System.err.println("DB ���� ���� ����"); }
		
		//3�ܰ�: ���ɾ� ó�� Statement ��ü ����
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
		} catch(SQLException ee) { System.err.println("�۾� ó�� ��ü ���� ����"); }
		
		//4�ܰ�: ���ɾ� �ۼ�(�˻�) �� ��� ����
		ResultSet rs = null;
		try {
			rs=stmt.executeQuery("select * from t1");
			while(rs.next()) {
				System.out.println(rs.getString("name")+"-"+rs.getString("month")+"-"+rs.getString("day"));
			}
		} catch(SQLException ee) { System.err.println("�۾� ó�� ��ü ���� ����"); }

		//5�ܰ�: ���� ����
		try {
			rs.close(); stmt.close(); conn.close();
		} catch(SQLException ee) { System.err.println("���� ���� ����"); }
		
	}

}
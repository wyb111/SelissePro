/**
 * 
 */
package com.selisse;

import java.sql.*;

/**
 * @author Administrator
 * 
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Access��������
		String accessdriver = "sun.jdbc.odbc.JdbcOdbcDriver";
		// �����ַ���
		String accessURL = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
		Connection conn = null;
		String dbpath = "D:/workspace/Selisse/WebContent/db/selisse.mdb";
		try {
			accessURL += dbpath;
			Class.forName(accessdriver);
			conn = DriverManager.getConnection(accessURL);
			Statement stmt = conn.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			String sql = "select * from product";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print("��Ʒ��:");
				System.out.println(rs.getString("name"));
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

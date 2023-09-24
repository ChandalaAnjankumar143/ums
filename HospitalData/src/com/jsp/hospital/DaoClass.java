package com.jsp.hospital;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoClass {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/rev_db";
			String user = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("write the query");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			Statement statement = con.createStatement();
			boolean res = statement.execute(reader.readLine());
			if (res) {
				ResultSet set = statement.getResultSet();
				ResultSetMetaData data = set.getMetaData();
				int count = data.getColumnCount();
				while (set.next()) {
					for (int i = 1; i <= count; i++) {
						System.out.println(data.getColumnLabel(i) + "of the eemployee is" + set.getObject(i));
//			System.out.println(set.getInt(1));
//			System.out.println(set.getString(2));
//			System.out.println(set.getString(3));
//			System.out.println(set.getString(4));
					}
				}
				System.out.println("Db transaction sufful");
				con.close();
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

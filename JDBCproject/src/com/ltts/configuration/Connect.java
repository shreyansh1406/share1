package com.ltts.configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect
	{
	public static Connection getConnection() throws Exception {
	{
	// Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root123");
//	Statement st=con.createStatement();
//
////	st.execute("create table employee (vno int(10),vname varchar(10),vsal int(10))");
////	System.out.println("Table created successfully");
	return con;
	}
}
	}

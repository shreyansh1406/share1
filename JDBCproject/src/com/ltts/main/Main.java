package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.ltts.configuration.Connect;
import com.ltts.dao.Playerdao;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Connection mc=Connect.getConnection();
		Statement s = mc.createStatement();
		Playerdao b=new Playerdao();

		System.out.println("1 insert operation");
		System.out.println("2 update operation");
		System.out.println("3. delete opertaion");
		System.out.println("4. select or read opeartion");
		System.out.println("enter to select option");
		int option=Integer.parseInt(br.readLine());
			switch(option)
		{
		case 1:
      		System.out.println("insert record into the table");
      		b.add();
//			Connection con=Connect.getConnection();
//			PreparedStatement pst=con.prepareStatement("insert into Player values(?,?,?,?)");
//			System.out.println("enter id,name ,skill,nom");
//			int id=Integer.parseInt(br.readLine());
//			String name=br.readLine();
//			String skill=br.readLine();
//			int nom=Integer.parseInt(br.readLine());
//			pst.setInt(1,id);
//			pst.setString(2,name);
//			pst.setString(3,skill);
//			pst.setInt(4,nom);
//			pst.executeUpdate();
//			System.out.println("record is inserted");
			break;
		case 2:
			System.out.println("update record into the table");
			b.update();
//			Connection con1=Connect.getConnection();
//			PreparedStatement pst1=con1.prepareStatement("update Player set empid=? ");
//			System.out.println("enter the id to update");
//			int id1=Integer.parseInt(br.readLine());
//			pst1.setInt(1,id1);
//			pst1.executeUpdate();
//			System.out.println("record is updated");
			break;
		case 3:
			System.out.println("delete record into the table");
			b.delete();
//			Connection con2=Connect.getConnection();
//			PreparedStatement pst2=con2.prepareStatement("delete from Player where empid=?");
//			System.out.println("enter the id to update");
//			int id2=Integer.parseInt(br.readLine());
//			pst2.setInt(1,id2);
//			pst2.executeUpdate();
//			System.out.println("record is deleted");
			break;
		case 4:
			System.out.println("select from the table");
			b.getall();
//			Connection con3=Connect.getConnection();
//			PreparedStatement pst3=con3.prepareStatement("select*from emp");
//			pst3.executeQuery();
			break;

	}

}}

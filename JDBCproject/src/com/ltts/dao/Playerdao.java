package com.ltts.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 

import com.ltts.configuration.Connect;
import com.ltts.model.Player;

public class Playerdao { 

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public void add() throws Exception 
	{ 

		Connection con=Connect.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into Player values(?,?,?,?)");
		System.out.println("enter id,name ,skill,nom");
		int id=Integer.parseInt(br.readLine());
		String name=br.readLine();
		String skill=br.readLine();
		int nom=Integer.parseInt(br.readLine());
		Player p=new Player(id,name,skill,nom);
		pst.setInt(1,id);
		pst.setString(2,name);
		pst.setString(3,skill);
		pst.setInt(4,nom);
		pst.executeUpdate();
		System.out.println("record is inserted");
		} 

	public void delete() throws Exception 
	{ 
		Connection con2=Connect.getConnection();
		PreparedStatement pst2=con2.prepareStatement("delete from Player where Id=?");
		System.out.println("enter the id to delete");
		int id2=Integer.parseInt(br.readLine());
		pst2.setInt(1,id2);
		pst2.executeUpdate();
		System.out.println("record is deleted");
	} 

	public void getall() 
		throws Exception 
	{ 
		Connection con1=Connect.getConnection();
		String query = "select * from Player"; 
		PreparedStatement ps = con1.prepareStatement(query); 
    	ResultSet rs = ps.executeQuery(); 
//		List<Player> ls = new ArrayList(); 

//		while (rs.next()) { 
//			Player emp = new Player(); 
//			emp.setId(rs.getInt("Id")); 
//			emp.setName(rs.getString("name")); 
//			emp.setSkill(rs.getString("skill")); 
//			emp.setId(rs.getInt("numberofmatches"));
//			
//			ls.add(emp); 
//		} 
//		return ls; 
		while(rs.next()){
			System.out.println(rs.getInt(1)+" " + rs.getString(2)+" " + rs.getString(3)+" " + rs.getInt(4));
		}
	} 

	public void update() 
		throws Exception 
	{ 
		Connection con1=Connect.getConnection();
		PreparedStatement pst1=con1.prepareStatement("update Player set id=? ");
		System.out.println("enter the id to update");
		int id1=Integer.parseInt(br.readLine());
		pst1.setInt(1,id1);
		pst1.executeUpdate();
		System.out.println("record is updated");
	} 
} 

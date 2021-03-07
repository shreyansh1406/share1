package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ltts.Configuration.MyConnection;
import com.ltts.Dao.PlayerDAO;
import com.ltts.Dao.TeamDAO;
import com.ltts.model.Player;
import com.ltts.model.Team;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Connection mc=MyConnection.getConnection();
		Statement s = mc.createStatement();
		ResultSet rs = s.executeQuery("select * from Team");
		while(rs.next()){
			System.out.println(rs.getString(1)+" " + rs.getString(2));
		}
		
		System.out.println("welcome to Employee Application");
		//before doing crud operation you should create table

		System.out.println("1 insert operation or create");
		System.out.println("2 update operation");
		System.out.println("3. delete opertaion");
		System.out.println("4. select or read opeartion");
		System.out.println("enter to select option");
		int option=Integer.parseInt(br.readLine());
			switch(option)
		{
		case 1:
			System.out.println("insert record into the table");
			Connection con=DBUtil.getConnection();
			PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
			pst.setInt(1,101);
			pst.setString(2,"ajay");
			pst.setInt(3,5000);
			pst.executeUpdate();
			System.out.println("record is inserted");
			break;
		case 2:
			System.out.println("update record into the table");
			Connection con1=DBUtil.getConnection();
			PreparedStatement pst1=con1.prepareStatement("update emp set empid=? ");
			pst1.setInt(1,200);
			pst1.executeUpdate();
			System.out.println("record is updated");
			break;
		case 3:
			System.out.println("delete record into the table");
			Connection con2=DBUtil.getConnection();
			PreparedStatement pst2=con2.prepareStatement("delete from emp where empid=?");
			pst2.setInt(1,200);
			pst2.executeUpdate();
			System.out.println("record is deleted");
			break;
		case 4:
			System.out.println("select from the table");
			Connection con3=DBUtil.getConnection();
			PreparedStatement pst3=con3.prepareStatement("select*from emp");
			pst3.executeQuery();
			break;
		}
		
		}

	}

		
		System.out.println("enter team ID: ");
		
		
		
		String team = br.readLine();
		
		System.out.println("enter team name:");
		
		String name=br.readLine();
		
		System.out.println("enter player ID: ");
		
		int pno=Integer.parseInt(br.readLine());
		
System.out.println("enter player name:");
		
		String name1=br.readLine();
		
		
		Player p=new Player();
		
		TeamDAO td=new TeamDAO();
		
		//boolean b=td.insertPlayer(p);
		//boolean b = td.createTeams();
		
		//td.insertTeams();
		
		//if(b){
			//System.out.println("Team Table not created ");
		//}
		//else{
			//System.out.println("Team Table created");
		//}

		PlayerDAO p1 =new PlayerDAO();
		
		//boolean b=pd.insertPlayer(p);
//		//boolean d = p1.createPlayer();
//		
//		if(d){
//			System.out.println("Player Table not created ");
//		}
//		else{
//			System.out.println("Playyer Table created");
//		}
//		
		
		
		
	}

}
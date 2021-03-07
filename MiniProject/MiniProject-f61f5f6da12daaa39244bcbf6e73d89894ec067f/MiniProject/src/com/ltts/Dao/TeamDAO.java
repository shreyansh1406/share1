package com.ltts.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.Configuration.MyConnection;

import com.ltts.model.Team;


public class TeamDAO {
	public List<Team> getAllTeams(){
		List<Team> li=new ArrayList<Team>();
		return li;

}
	
public Team getTeamById(int id) {
	Team t = new Team(id, null);
	return t;
}

public boolean createTeams() throws Exception {
	Connection mc=MyConnection.getConnection();
	
	PreparedStatement ps=mc.prepareStatement("create table if not exists Team(teamId int(2) primary key , teamName varchar(20))");
	
	//ps.setInt(1,getPlayerId());
	//ps.setString(2,getPlayerName());
	return ps.execute();
	
}

public void insertTeams() throws Exception {
	Connection mc=MyConnection.getConnection();
	
	Statement s = mc.createStatement();
	//s.execute("insert into customer values ('Vishal','23')");
	//s.executeUpdate("insert into Team values ((1,'CSK'),(2,'DC'),(3,'KKR'),(4,'KXIP'),(5,'MI'),(6,'RCB'),(7,'RR'),(8,'SRH')");
	
//	s.executeUpdate("insert into Team values (1,'CSK')");
//	s.executeUpdate("insert into Team values (2,'DC')");
//	s.executeUpdate("insert into Team values (3,'KKR')");
//	s.executeUpdate("insert into Team values (4,'KXIP')");
//	s.executeUpdate("insert into Team values (5,'MI')");
//	s.executeUpdate("insert into Team values (6,'RCB')");
//	s.executeUpdate("insert into Team values (7,'RR')");
//	s.executeUpdate("insert into Team values (8,'SRH')");
//	System.out.println("Record is inserted");
//	
//	ResultSet rs = s.executeQuery("select * from team");
//	
//	while(rs.next()){
//		System.out.println(rs.getString(1)+" " + rs.getString(2));
//	}
//	
	
	PreparedStatement ps=mc.prepareStatement("insert into Team  (teamId,teamName) values (1,'CSK'),(2,'DC'),(3,'KKR'),(4,'KXIP'),(5,'MI'),(6,'RCB'),(7,'RR'),(8,'SRH')");
	
	//ResultSet rs = s.executeQuery("select * from Team");
	
	System.out.println("Record is inserted");
	 ps.executeUpdate();
	
	//ps.setInt(1,getPlayUerId());
	//ps.setString(2,getPlayerName());
	//ResultSet rs =s.executeQuery(null);
	//return s.execute(null);
	
}


private int getPlayerId() {
	// TODO Auto-generated method stub
	return 0;
}
private String getPlayerName() {
	// TODO Auto-generated method stub
	return null;
}
public boolean updatePlayer(int id) {
	return true;
}

}
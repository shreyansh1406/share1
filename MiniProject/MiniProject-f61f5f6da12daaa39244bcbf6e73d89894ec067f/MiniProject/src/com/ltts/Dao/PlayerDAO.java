package com.ltts.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.Configuration.MyConnection;
import com.ltts.model.Player;

public class PlayerDAO {
	public List<Player> getAllPlayers(){
		List<Player> li=new ArrayList<Player>();
		
		return li;

}
public Player getplayerById(int id) {
	Player p=new Player();
	
	return p;
}

public boolean createPlayer() throws Exception {
	Connection mc= MyConnection.getConnection();
	
	PreparedStatement ps1=mc.prepareStatement("create table Player(playerId int(2) primary key , name varchar(20), date date, skill varchar(30), noOfmatches int, runs int, wickets int,nation varchar(30),power double,teamId int,FOREIGN KEY (teamId) REFERENCES Team(teamid))");
	
	//ps.setInt(1,getPlayerId());
	//ps.setString(2,getPlayerName());
	return ps1.execute();
	
}


public boolean insertPlayer(Player p) throws Exception {
	
	
	Connection mc=MyConnection.getConnection();
	PreparedStatement ps=mc.prepareStatement("insert into player values(?,?)");
	ps.setInt(1,getPlayerId());
	ps.setString(2,getPlayerName());
	return ps.execute();
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
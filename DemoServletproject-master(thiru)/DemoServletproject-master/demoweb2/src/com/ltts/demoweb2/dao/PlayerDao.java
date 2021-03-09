package com.ltts.demoweb2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltts.demoweb2.configure.MyConnection;
import com.ltts.demoweb2.model.Player;

public class PlayerDao {
	
	public boolean insertPlayer(Player p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into web_player values(?,?,?)");
		ps.setInt(1, p.getPlayerId());
		ps.setString(2, p.getPlayerName());
		ps.setString(3, p.getCountry());

		return ps.execute();
		//return false;

		
	}

}

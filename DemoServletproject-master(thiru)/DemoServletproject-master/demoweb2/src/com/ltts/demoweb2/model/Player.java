package com.ltts.demoweb2.model;

public class Player {

	private int playerId;
	private String playerName;
	private String country;
	
	
	public Player() {
		super();
	}
	
	public Player(int playerId, String playerName, String country) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.country = country;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player playerId=" + playerId + ", playerName=" + playerName + ", country=" + country ;
	}
	
	
	
}

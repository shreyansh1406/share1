package com.ltts.model;
import java.util.Date;

public class Player {
	
private int Id;	
private String name;
private String skill;
private int numberOfMatches;


public Player(int id, String name, String skill, int numberOfMatches) {
	super();
	Id = id;
	this.name = name;
	this.skill = skill;
	this.numberOfMatches = numberOfMatches;
}

public Player() {
	// TODO Auto-generated constructor stub
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSkill() {
	return skill;
}

public void setSkill(String skill) {
	this.skill = skill;
}

public int getNumberOfMatches() {
	return numberOfMatches;
}

public void setNumberOfMatches(int numberOfMatches) {
	this.numberOfMatches = numberOfMatches;
}

@Override
public String toString() {
	return "Player [Id=" + Id + ", name=" + name + ", skill=" + skill + ", numberOfMatches=" + numberOfMatches + "]";
}


}





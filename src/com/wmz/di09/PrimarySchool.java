package com.wmz.di09;

public class PrimarySchool extends School {
	
	private int level;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "PrimarySchool [level=" + level + "]";
	}
	
	

}

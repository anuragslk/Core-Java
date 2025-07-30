package com.rays.oops;

public class Automobile {
 
	private String company;
	private String model;
	private String colour;
	private int speedlimit;
	
	public void setCompany(String co) {
		this.company=co;
	}
	public String getCompany() {
		return this.company;
	}
	public void setModel(String mo) {
		this.model=mo;
	}
	public String getModel() {
		return this.model;
	}
	public void setColour(String col) {
		this.colour=col;
	}
	public String getColour () {
		return this.colour;
	}
	public void setSpeedlimit(int sl) {
		this.speedlimit=sl;
	}
	public int getSpeedlimit () {
		return this.speedlimit;
	}
}

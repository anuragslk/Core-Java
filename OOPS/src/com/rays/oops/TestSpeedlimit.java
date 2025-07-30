package com.rays.oops;

public class TestSpeedlimit {
public static void main(String[] args) {

	Automobile car1 = new Automobile();
	Automobile car2 = new Automobile();
	
	car1.setCompany("Ferrai");
	car1.setModel("FarMAx1");
	car1.setColour("Red");
	car1.setSpeedlimit(500);
	
	System.out.println(car1.getCompany());
	System.out.println(car1.getModel());
	System.out.println(car1.getColour());
	System.out.println(car1.getSpeedlimit());
	System.out.println("---------------------");
	
	car2.setCompany("Bugati");
	car2.setModel("Cheveron");
	car2.setColour("Matte Black");
	car2.setSpeedlimit(700);
	
	System.out.println(car2.getCompany());
	System.out.println(car2.getModel());
	System.out.println(car2.getColour());
	System.out.println(car2.getSpeedlimit());
	System.out.println("---------------------");
}
}

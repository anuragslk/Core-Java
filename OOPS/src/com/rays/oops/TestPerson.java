package com.rays.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	Person p1 = new Person ();
	
	p1.setName ("Aryan");
	p1.setDob (sdf.parse("2002/12/07"));
	p1.setAddress("Indore");
	
	System.out.println(p1.getName());
	System.out.println(sdf.format(p1.getDob()));
	System.out.println(p1.getAddress());
	
	System.out.println("----------------------");
	
	Person p2 = new Person ();
	
	p2.setName ("Tukoji");
	p2.setDob (sdf.parse("1885/05/01"));
	p2.setAddress ("Indore");
	
	System.out.println(p2.getName());
	System.out.println(sdf.format(p2.getDob()));
	System.out.println(p2.getAddress());
	
	System.out.println("----------------------");
	
	
}
}

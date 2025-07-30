package com.rays.oops;

public class TestAccount {
public static void main(String[] args) {
	
	Account a1 = new Account();
	Account a2 = new Account();
	
	a1.setName("Anurag");
	a1.setAccno("123456789");
	a1.setAcctype("Current");
	a1.setBalance(590872635);
	
	System.out.println(a1.getName());
	System.out.println(a1.getAccno());
	System.out.println(a1.getAcctype());
	System.out.println(a1.getBalance());
	
	System.out.println("-----------------");
	
	a2.setName("Akshda");
	a2.setAccno("987654422");
	a2.setAcctype("Savings");
	a2.setBalance(98997669);
	
	System.out.println(a2.getName());
	System.out.println(a2.getAccno());
	System.out.println(a2.getAcctype());
	System.out.println(a2.getBalance());
	
	System.out.println("-----------------");
	

}
}

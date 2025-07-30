package com.rays.oops;

public class Account {

		private String name;
		private String accno;
		private String acctype;
		private int balance;
		
		public void setName (String s) {
		this.name=s;
		}
		public String getName () {
		return this.name;
		}
		public void setAccno (String an) {
		this.accno=an;
		}
		public String getAccno (){
		return this.accno;
		}
		public void setAcctype (String ac) {
		this.acctype=ac;
		}
		public String getAcctype () {
		return this.acctype;
		}
		public void setBalance (int b) {
		this.balance=b;
		}
		public int getBalance () {
		return this.balance;
		}
		}

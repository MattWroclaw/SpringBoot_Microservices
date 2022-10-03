package com.example.demo.bean;


public class Account {
	
	private int accId;
	private String accName;
	private String accType;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int id, String accName, String accType) {
		super();
		this.accId = id;
		this.accName = accName;
		this.accType = accType;
	}
	
	

}

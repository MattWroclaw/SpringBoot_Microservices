package com.example.demo.bean;

import javax.persistence.*;

@Entity
@Table(name="custtab")
public class Cust {
	
	@Id
	@Column(name="cust_id")
	private int custId;
	
	@Column(name="cust_name")
	private String custName;
	
	@Column(name="cust_desc")
	private String custDesc;
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustDesc() {
		return custDesc;
	}
	public void setCustDesc(String custDesc) {
		this.custDesc = custDesc;
	}
	public Cust(int custId, String custName, String custDesc) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custDesc = custDesc;
	}
	public Cust() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cust [custId=" + custId + ", custName=" + custName + ", custDesc=" + custDesc + "]";
	}

	
	
	
}

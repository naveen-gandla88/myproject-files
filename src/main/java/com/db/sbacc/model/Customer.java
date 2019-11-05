package com.db.sbacc.model;

import java.util.Date;

public class Customer {
	
	private int accNumber;
	private String accType;
	private String custId;
	private String custName;
	private Date dob;
	private String gender;
	
	
	
	public Customer(int accNumber, String accType, String custId, String custName, Date dob, String gender) {
		super();
		this.accNumber = accNumber;
		this.accType = accType;
		this.custId = custId;
		this.custName = custName;
		this.dob = dob;
		this.gender = gender;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	

}

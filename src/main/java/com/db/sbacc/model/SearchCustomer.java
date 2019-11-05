package com.db.sbacc.model;

import java.util.Date;

public class SearchCustomer {

	private int accNumber;
	private String firstName;
	private String lastName;
	private String city;
	private Date dob;
	
	

	public SearchCustomer(int accNumber, String firstName, String lastName, String city, Date dob) {
		super();
		this.accNumber = accNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.dob = dob;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}

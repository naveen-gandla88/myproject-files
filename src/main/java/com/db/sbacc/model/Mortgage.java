package com.db.sbacc.model;


public class Mortgage {
	
	private String mortType;
	private double propertyCost;
	private double depoAmt;
	
	
	public String getMortType() {
		return mortType;
	}
	public void setMortType(String mortType) {
		this.mortType = mortType;
	}
	public double getPropertyCost() {
		return propertyCost;
	}
	public void setPropertyCost(double propertyCost) {
		this.propertyCost = propertyCost;
	}
	public double getDepoAmt() {
		return depoAmt;
	}
	public void setDepoAmt(double depoAmt) {
		this.depoAmt = depoAmt;
	}
	
	

}

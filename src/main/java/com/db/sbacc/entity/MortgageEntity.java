package com.db.sbacc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.db.sbacc.generator.SequenceIdGenerator;

@Entity
@Table(name = "mortgage")
public class MortgageEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acc_seq")
	@GenericGenerator(name="acc_seq",
	strategy = "com.db.sbacc.generator.SequenceIdGenerator", 
	parameters = {
			@Parameter(name = SequenceIdGenerator.INCREMENT_PARAM, value="50"),
			@Parameter(name = SequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "M_"),
			@Parameter(name = SequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value ="%05d")
	})
	
	@Column(name = "mortgage_acc_no")
	private String mortAccno;
	@Column(name = "mortgage_type")
	private String mortType;
	@Column(name = "property_cost")
	private double propertyCost;
	@Column(name = "deposit_amt")
	private double depoAmt;
	@Column(name = "password")
	private String password;
	@Column(name = "balance_amt")
	private double balanceAmt;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalanceAmt() {
		return balanceAmt;
	}

	public void setBalanceAmt(double balanceAmt) {
		this.balanceAmt = balanceAmt;
	}

	public String getMortAccno() {
		return mortAccno;
	}

	public void setMortAccno(String mortAccno) {
		this.mortAccno = mortAccno;
	}

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

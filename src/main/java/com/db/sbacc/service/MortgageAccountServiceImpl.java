package com.db.sbacc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.sbacc.dao.MortgageAccountRepo;
import com.db.sbacc.model.Mortgage;

@Service
public class MortgageAccountServiceImpl implements MortgageAccountService{
	
	@Autowired
	MortgageAccountRepo mortgageAccRepo;
	
	public Mortgage createMortAcc(Mortgage mortAcc) { 
		
		return null;
		
	}

}

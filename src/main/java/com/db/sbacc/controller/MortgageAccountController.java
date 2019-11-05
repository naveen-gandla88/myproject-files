package com.db.sbacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.db.sbacc.model.Mortgage;
import com.db.sbacc.service.MortgageAccountService;

@RestController
public class MortgageAccountController {
	
	@Autowired
	MortgageAccountService mortgageAccService;
	
	@RequestMapping(value="/createMort", method=RequestMethod.POST)
	public Mortgage createMortAcc(@RequestBody  Mortgage mortAcc) {
		mortgageAccService.createMortAcc(mortAcc);
		return null;
		
	}

}

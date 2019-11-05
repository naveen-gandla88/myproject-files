package com.db.sbacc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.sbacc.model.Customer;
import com.db.sbacc.service.RetriveAccDetailsService;

@RestController
@RequestMapping("/customer")
public class RetriveAccDetailsController {

	@Autowired
	RetriveAccDetailsService accDetailsService;

	@RequestMapping(value="/accdetails/{accNo}")
	public List<Customer> getAccountDeatils(@PathVariable("accNo") int accNo) {

		List<Customer> cust = accDetailsService.getAccDetails(accNo); 
		return cust;

	}

}

package com.db.sbacc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.sbacc.model.SearchCustomer;
import com.db.sbacc.service.SearchCustomerService;

@RestController
@RequestMapping("/customer")
public class SearchCustomerController {
	
	@Autowired
	SearchCustomerService customerService;
	
	@RequestMapping(value="/findcust/{input}")
	public List<SearchCustomer> findAllCustomers(@PathVariable("input") String input){
		
		return customerService.findAllCustomers(input);
	}

}

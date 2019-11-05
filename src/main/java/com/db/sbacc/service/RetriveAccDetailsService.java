package com.db.sbacc.service;

import java.util.List;

import com.db.sbacc.model.Customer;

public interface RetriveAccDetailsService {

	public List<Customer> getAccDetails(int accNo);
}

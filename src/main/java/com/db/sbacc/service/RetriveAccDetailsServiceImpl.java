package com.db.sbacc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.sbacc.dao.RetriveAccDetailsRepo;
import com.db.sbacc.entity.CustomerEntity;
import com.db.sbacc.model.Customer;

@Service
public class RetriveAccDetailsServiceImpl implements RetriveAccDetailsService {

	@Autowired
	RetriveAccDetailsRepo accDetailsRepo;

	public List<Customer> getAccDetails(int accNo) {

		List<CustomerEntity> accs = accDetailsRepo.getAccdeatils(accNo);
		List<Customer> account = accs.stream().map(c -> new Customer(c.getAccNumber(), c.getAccType(), c.getCustId(), c.getFirstName(),
				c.getDob(), c.getGender())).collect(Collectors.toList());

		return account;
	}

}

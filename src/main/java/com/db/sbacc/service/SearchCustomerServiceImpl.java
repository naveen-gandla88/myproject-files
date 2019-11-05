package com.db.sbacc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.sbacc.dao.SearchCustomerRepo;
import com.db.sbacc.entity.CustomerEntity;
import com.db.sbacc.model.SearchCustomer;

@Service
public class SearchCustomerServiceImpl implements SearchCustomerService {

	@Autowired
	SearchCustomerRepo customerRepo;

	@Override
	public List<SearchCustomer> findAllCustomers(String input) {
		// TODO Auto-generated method stub
		List<CustomerEntity> cust = customerRepo.findCustomerByInput(input);

		
		List<SearchCustomer> cust2 = cust.stream().map(cus -> new SearchCustomer(cus.getAccNumber(), cus.getFirstName(),
				cus.getLastName(), cus.getCity(), cus.getDob())).collect(Collectors.toList());
	
		// to get only names
		// List<String> names =
		// cust.stream().map(SBCustomer::getFirstName).collect(Collectors.toList());
		// System.out.println(names);

		return cust2;
	}

}

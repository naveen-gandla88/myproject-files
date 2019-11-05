package com.db.sbacc.service;



import java.util.List;

import com.db.sbacc.model.SearchCustomer;

public interface SearchCustomerService {
	
	
	List<SearchCustomer> findAllCustomers(String input);

}

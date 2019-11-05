package com.db.sbacc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.db.sbacc.entity.CustomerEntity;

public interface RetriveAccDetailsRepo extends CrudRepository<CustomerEntity, Integer>{
	
	@Query("select s from SBCustomer s where s.accNumber = ?1 ")
	List<CustomerEntity> getAccdeatils(int accNo);

}

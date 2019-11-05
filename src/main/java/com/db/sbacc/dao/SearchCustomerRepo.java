package com.db.sbacc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.db.sbacc.entity.CustomerEntity;

@Repository
public interface SearchCustomerRepo extends CrudRepository<CustomerEntity, Integer> {

	@Query("select c from SBCustomer c where c.firstName LIKE %?1% or c.lastName LIKE %?1% or c.city LIKE %?1% "
			+ "or CAST(c.accNumber As string) LIKE %?1% or CAST(c.dob As string) LIKE %?1% or c.accType LIKE %?1% ")
	List<CustomerEntity> findCustomerByInput(String input);

}

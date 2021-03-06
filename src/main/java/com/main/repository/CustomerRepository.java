package com.main.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.main.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	public  Customer findByEmail(String email);

}

package com.main.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Customer;
import com.main.repository.CustomerRepository;


@RestController
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	//Get All Employee
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		
		return customerRepository.findAll();
	}
	
	
	//Create or Add employee rest api
	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

}

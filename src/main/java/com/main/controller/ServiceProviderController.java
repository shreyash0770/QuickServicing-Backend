package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.ServiceProvider;
import com.main.repository.ServiceProviderRepository;

@RestController
@RequestMapping("/")
public class ServiceProviderController {
	
	@Autowired
	private ServiceProviderRepository providerRepository;
	
	//Get All Services
	@GetMapping("/serviceProviders")
	public List<ServiceProvider> getAllServiceProviders(){
		
		return providerRepository.findAll();
	}
	
	
	//Create or Add ServiceProvider rest api
	@PostMapping("/serviceProviders")
	public ServiceProvider createServiceProvider(@RequestBody ServiceProvider serviceProvider){
		
		return providerRepository.save(serviceProvider);	
	}
	
	
	
	

}

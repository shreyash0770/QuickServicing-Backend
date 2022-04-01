package com.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.exception.ResourceNotFoundException;
import com.main.model.ServiceProvider;
import com.main.repository.ServiceProviderRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class ServiceProviderController {
	
	@Autowired
	private ServiceProviderRepository serviceproviderrepo;
	
	//--------------------------------------Service Provider-------------------------------------------
	
			//Get All ServiceProviders
			@GetMapping("/serviceProviders")
			public List<ServiceProvider> getAllServiceProviders(){
				
				return serviceproviderrepo.findAll();
			}
			
			
			//Create or Add ServiceProvider rest api
			@PostMapping("/serviceProviders")
			public ServiceProvider createServiceProvider(@RequestBody ServiceProvider serviceProvider){
//				System.out.println(serviceProvider.getS_Picture().getClass().getSimpleName());
				return serviceproviderrepo.save(serviceProvider);	
			}
			
			
			//get ServiceProviders by id rest api
					@GetMapping("/serviceProviders/{id}")
					public ResponseEntity<ServiceProvider> getServiceProvidersById(@PathVariable int id) {
						
						ServiceProvider provider =serviceproviderrepo.findById(id)
								.orElseThrow(()-> new ResourceNotFoundException("Service Provider Not Exists with id :" +id));
						return ResponseEntity.ok(provider);	
					}
					
					
					
//					//Update Customer rest api
					@PutMapping("/serviceProviders/{id}")
					public ResponseEntity<ServiceProvider> updateServiceProvider(@PathVariable int id,@RequestBody ServiceProvider providerDetails){
						
						ServiceProvider provider =serviceproviderrepo.findById(id)
								.orElseThrow(()-> new ResourceNotFoundException("ServiceProvider Not Exists with id :" +id));
						
						provider.setS_Name(providerDetails.getS_Name());
						provider.setS_Phone(providerDetails.getS_Phone());
						provider.setS_Address(providerDetails.getS_Address());
						provider.setS_City(providerDetails.getS_City());
						provider.setS_Pincode(providerDetails.getS_Pincode());
						provider.setS_Email(providerDetails.getS_Email());
						provider.setS_Password(providerDetails.getS_Password());
						provider.setS_Role(providerDetails.getS_Role());
						provider.setS_Picture(providerDetails.getS_Picture());
						

						ServiceProvider updatedServiceProvider = serviceproviderrepo.save(provider);
						return ResponseEntity.ok(updatedServiceProvider);
						
					}
					
					
//					//Delete Customer rest api
					@DeleteMapping("/serviceProviders/{id}")
					public ResponseEntity<Map<String, Boolean>> deleteServiceProvider(@PathVariable int id){
						ServiceProvider provider =serviceproviderrepo.findById(id)
								.orElseThrow(()-> new ResourceNotFoundException("Service Provider Not Exists with id :" +id));
						
						serviceproviderrepo.delete(provider);
						Map<String, Boolean> response = new HashMap<>();
						response.put("deleted", Boolean.TRUE);
						return ResponseEntity.ok(response);
					}
			
			

	

}

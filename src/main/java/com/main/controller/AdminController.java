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
import com.main.model.Admin;

import com.main.model.ServiceProvider;
import com.main.repository.AdminRepository;

import com.main.repository.ServiceProviderRepository;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class AdminController {
	
	@Autowired
	private AdminRepository adminRepository;	
	
	
	        //---------------------------------Admin-------------------------------------------
	
	//Get Admin Details
	@GetMapping("/admin")
	public List<Admin> getdetails() {
		
		return adminRepository.findAll();
	}
	
	

		
//		@GetMapping("/Adminlogin")
//		public ResponseEntity<Admin> loginDoctor(@RequestParam String Email,@RequestParam String Password)
//		{
//			return adminservice.loginUser(Email, Password);
//		}
//		
//		@PostMapping("/dloginl")
//		public ResponseEntity<Admin> loginDoctor(@RequestBody Admin doc)
//		{
//			return adminservice.loginUser1(doc);
//		}
	
		
}

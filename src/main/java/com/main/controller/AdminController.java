package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Admin;
import com.main.repository.AdminRepository;


@RestController
@RequestMapping("/")
public class AdminController {
	
	@Autowired
	private AdminRepository adminRepository;
	
	//Get Admin Details
	@GetMapping("/admin")
	public List<Admin> getdetails() {
		
		return adminRepository.findAll();
	}

}

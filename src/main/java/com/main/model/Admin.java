package com.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	
	@Id
	private String Email;
	private String Password;
	
	
	public Admin() {
	
	}
	
	public Admin(String email, String password) {
		super();
		Email = email;
		Password = password;
	}


	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
    

  
	
	
	
	

}

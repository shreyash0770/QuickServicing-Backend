package com.main.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name =  "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_Id;

	@Column(name = "c_Name")
	private String c_Name;

	@Column(name = "c_Email")
	private String c_Email;

	@Column(name = "c_Password")
	private String c_Password;

	@Column(name = "c_mobile")
	private String c_mobile;

	@Column(name = "c_City")
	private String c_City;

	@Column(name = "c_Address")
	private String c_Address;

	@Column(name = "c_Pincode")
	private int c_Pincode;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="c_id", referencedColumnName = "c_Id")
	private List<Vehicle> vehicle;


	public Customer() {

	}


	public Customer(String c_Name, String c_Email, String c_Password, String c_mobile, String c_City, String c_Address,
			int c_Pincode) {
		super();
		this.c_Name = c_Name;
		this.c_Email = c_Email;
		this.c_Password = c_Password;
		this.c_mobile = c_mobile;
		this.c_City = c_City;
		this.c_Address = c_Address;
		this.c_Pincode = c_Pincode;
	}


	public int getC_Id() {
		return c_Id;
	}
	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}
	public String getC_Name() {
		return c_Name;
	}
	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}
	public String getC_Email() {
		return c_Email;
	}
	public void setC_Email(String c_Email) {
		this.c_Email = c_Email;
	}
	public String getC_Password() {
		return c_Password;
	}
	public void setC_Password(String c_Password) {
		this.c_Password = c_Password;
	}
	public String getC_mobile() {
		return c_mobile;
	}
	public void setC_mobile(String c_mobile) {
		this.c_mobile = c_mobile;
	}
	public String getC_City() {
		return c_City;
	}
	public void setC_City(String c_City) {
		this.c_City = c_City;
	}
	public String getC_Address() {
		return c_Address;
	}
	public void setC_Address(String c_Address) {
		this.c_Address = c_Address;
	}
	public int getC_Pincode() {
		return c_Pincode;
	}
	public void setC_Pincode(int c_Pincode) {
		this.c_Pincode = c_Pincode;
	}





}




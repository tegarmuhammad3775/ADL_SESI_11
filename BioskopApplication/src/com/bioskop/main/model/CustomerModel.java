package com.bioskop.main.model;

import java.sql.Date;


public class CustomerModel extends Model {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String noHP;
	private String address;
	private String email;
	private Date birthdate;
	
	public CustomerModel() {
		
	}

	public CustomerModel(int customerId, String firstName, String lastName, String noHP, String address, String email, Date birthdate) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.noHP = noHP;
		this.address = address;
		this.email = email;
		this.birthdate = birthdate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNoHP() {
		return noHP;
	}

	public void setNoHP(String noHP) {
		this.noHP = noHP;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
	

}

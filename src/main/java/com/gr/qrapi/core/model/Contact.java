package com.gr.qrapi.core.model;

import java.io.Serializable;

public class Contact implements Serializable{
	
	private static final long serialVersionUID = 2L;

	public static final String MALE = "male";
	public static final String FEMALE = "female";
	public static final String ACTIVE = "active";
	public static final String INACTIVE = "inactive";
	
	private Integer Id;
	private Integer accountId;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private Integer phoneNumber;
	private String status;

	//Contact has an address
	/*private Integer addressId;*/
	private Address address;
	
//	public Contact()
//	{	
//		this.accountId = 0;
//		this.phoneNumber = 0;
//		this.gender = MALE;
//		this.status = ACTIVE;
//		this.email = "";
//		this.firstName = "";
//		this.lastName = "";
//	}

	public Contact() {
	}
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

/*	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}*/


}

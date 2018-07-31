package com.gr.qrapi.core.model;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = 3L;

	private Integer Id;
	/*private Integer contactId;*/
	private String streetAddress;
	private String city;
	private String province;
	private String country;

/*	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}*/

	public Address() {
	}
	
//	public Address() 
//	{
//		this.contactId = 0;
//		this.city = "";
//		this.streetAddress = "";
//		this.province = "";
//		this.country = "";
//	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}

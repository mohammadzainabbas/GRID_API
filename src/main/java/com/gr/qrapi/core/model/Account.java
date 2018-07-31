package com.gr.qrapi.core.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author ufarooq
 */
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String email;
	private String city;
	
	//Account have many contacts
	private List<Contact> contacts;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Account() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}

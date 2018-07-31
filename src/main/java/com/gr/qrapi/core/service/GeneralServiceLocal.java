package com.gr.qrapi.core.service;

import java.util.List;

import javax.ejb.Local;

import com.gr.qrapi.core.model.Account;
import com.gr.qrapi.core.model.Address;
import com.gr.qrapi.core.model.Contact;

/**
 * @author ufarooq
 */
@Local
public interface GeneralServiceLocal {

	List<Account> getAllAccounts();
	List<Contact> getAllContacts();
	List<Address> getAllAddresses();
}

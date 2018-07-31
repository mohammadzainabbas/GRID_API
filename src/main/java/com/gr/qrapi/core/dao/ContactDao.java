package com.gr.qrapi.core.dao;

import java.util.List;

import com.gr.common.dao.GenericDao;
import com.gr.qrapi.core.model.Account;
import com.gr.qrapi.core.model.Contact;

/**
 * @author mohammadzainabbas
 *
 */
public interface ContactDao extends GenericDao<Contact, Integer>{

	List<Contact> getAllContacts();
	void updateContact(Contact contact);
	void addContact(Contact contact);
	void deleteContact(int contactId);
}

package com.gr.qrapi.core.service;

import java.util.List;

import javax.ejb.Stateless;

import com.gr.common.service.ServiceManager;
import com.gr.qrapi.core.dao.AccountDaoHibernateImpl;
import com.gr.qrapi.core.dao.AddressDaoHibernateImpl;
import com.gr.qrapi.core.dao.ContactDaoHibernateImpl;
import com.gr.qrapi.core.model.Account;
import com.gr.qrapi.core.model.Address;
import com.gr.qrapi.core.model.Contact;

/**
 * @author ufarooq
 */
@Stateless
public class GeneralService implements GeneralServiceLocal {


	public static GeneralServiceLocal getService() {
		return (GeneralServiceLocal) ServiceManager.getService(GeneralServiceLocal.class);
	}
	
	@Override
	public List<Account> getAllAccounts() {
		return AccountDaoHibernateImpl.getDao().getAllAccounts();
	}
	
	@Override
		public List<Contact> getAllContacts() {
		return ContactDaoHibernateImpl.getDao().getAllContacts();
	}
	
	@Override
	public List<Address> getAllAddresses() {
	return AddressDaoHibernateImpl.getDao().getAllAddresses();
}

}

package com.gr.qrapi.core.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.gr.common.dao.AbstractHibernateDao;
import com.gr.common.dao.DaoManager;
import com.gr.common.exception.DaoException;
import com.gr.qrapi.core.model.Contact;

/**
 * @author mohammadzainabbas
 */
public class ContactDaoHibernateImpl extends AbstractHibernateDao<Contact, Integer> implements ContactDao{
	
	public static ContactDao getDao() {
		return DaoManager.getInstance().getDao(ContactDao.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contact> getAllContacts() {
	
		try {
			Session session = getSession();
			Criteria criteria = session.createCriteria(Contact.class);
			criteria.setMaxResults(100);
			
			List<Contact> contacts = (List<Contact>) criteria.list();
			for (Contact contact : contacts) {
				Hibernate.initialize(contact.getAddress());
			}
			
			return contacts;
		} catch (Exception e) {
			throw new DaoException(e);
		}	
	}
	
	@Override
	public void updateContact(Contact contact) {
		
		try 
		{
			Session session = getSession();
			Contact con = (Contact) session.get(Contact.class, contact.getId());
			if(con != null)
			{
				session.update(contact);
			}
			closeSession(session);
		} catch (Exception e) {
			throw new DaoException(e);
		}
		
		}
	@Override
	public void addContact(Contact contact) {

		try 
		{
			Session session = getSession();
			session.save(contact);
			closeSession(session);
		} 
		catch (RuntimeException e) 
		{
			throw new DaoException(e);
		}
		
	}
	@Override
	public void deleteContact(int contactId) {

		try 
		{
			Session session = getSession();
			Contact	con = (Contact) session.get(Contact.class, contactId);
			if (con != null) 
			{
				session.delete(con);
			}
			closeSession(session);
		}
		catch (RuntimeException e) 
		{
			throw new DaoException(e);
		}
		
	}
}

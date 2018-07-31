package com.gr.qrapi.core.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.gr.common.dao.AbstractHibernateDao;
import com.gr.common.dao.DaoManager;
import com.gr.common.exception.DaoException;
import com.gr.qrapi.core.model.Address;

/**
 * @author mohammadzainabbas
 *
 */
public class AddressDaoHibernateImpl extends AbstractHibernateDao<Address, Integer> implements AddressDao{
	
	public static AddressDao getDao() {
		return DaoManager.getInstance().getDao(AddressDao.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Address> getAllAddresses() {
		try {
			Session session = getSession();
			Criteria criteria = session.createCriteria(Address.class);
			criteria.setMaxResults(100);
			
			List<Address> addresses = (List<Address>) criteria.list();
			
			return addresses;			
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}
	
	
	@Override
	public void updateAddress(Address address) {
		
		try 
		{
			Session session = getSession();
			Address add = (Address) session.get(Address.class, address.getId());
			if(add != null)
			{
				session.update(address);
			}
			closeSession(session);
		} catch (Exception e) {
			throw new DaoException(e);
		}
		
		}
	@Override
	public void addAddress(Address address) {

		try 
		{
			Session session = getSession();
			session.save(address);
			closeSession(session);
		} 
		catch (RuntimeException e) 
		{
			throw new DaoException(e);
		}
		
	}
	@Override
	public void deleteAddress(int addressId) {

		try 
		{
			Session session = getSession();
			Address	add = (Address) session.get(Address.class, addressId);
			if (add != null) 
			{
				session.delete(add);
			}
			closeSession(session);
		}
		catch (RuntimeException e) 
		{
			throw new DaoException(e);
		}
		
	}

}

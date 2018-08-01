package com.gr.qrapi.core.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.gr.common.dao.AbstractHibernateDao;
import com.gr.common.dao.DaoException;
import com.gr.common.dao.DaoManager;
import com.gr.qrapi.core.model.Account;

/**
 * @author ufarooq
 */
public class AccountDaoHibernateImpl extends AbstractHibernateDao<Account, Integer> implements AccountDao {

	public static AccountDao getDao() {
		return DaoManager.getInstance().getDao(AccountDao.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAllAccounts() {
		
		try {
			Session session = getSession();
			Criteria criteria = session.createCriteria(Account.class);
			criteria.setMaxResults(100);

			List<Account> accounts = (List<Account>) criteria.list();
			
/*			for(Account account: accounts)
			{
				Hibernate.initialize(account.getContacts());
			}*/

			return accounts;
		} catch (Exception aex) {
			throw new DaoException(aex);
		}
	}
	
	@Override
	public void updateAccount(Account account) 
	{
		try 
		{
			Session session = getSession();
			Account acc = (Account) session.get(Account.class, account.getId());
			if (acc != null)
			{
				session.update(account);				
			}
			closeSession(session);
		} 
		catch (RuntimeException e) 
		{
			throw new DaoException(e);
		}
	}
	
	@Override
	public void addAccount(Account account) {
		try 
		{
			Session session = getSession();
			session.save(account);
			closeSession(session);
		} 
		catch (RuntimeException e) 
		{
			throw new DaoException(e);
		}
	}
	
	@Override
		public void deleteAccount(int accountId) {
		
		try 
		{
			Session session = getSession();
			Account acc = (Account) session.get(Account.class, accountId);
			if (acc != null) 
			{
				session.delete(acc);
			}
			closeSession(session);
		}
		catch (RuntimeException e) 
		{
			throw new DaoException(e);
		}
		
		}
				
}

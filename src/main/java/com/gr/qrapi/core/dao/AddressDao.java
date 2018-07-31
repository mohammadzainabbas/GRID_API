package com.gr.qrapi.core.dao;

import java.util.List;

import com.gr.common.dao.GenericDao;
import com.gr.qrapi.core.model.Account;
import com.gr.qrapi.core.model.Address;
/**
 * @author mohammadzainabbas
 *
 */
public interface AddressDao extends GenericDao<Address,	Integer>{

	List<Address> getAllAddresses();
	void updateAddress(Address address);
	void addAddress(Address address);
	void deleteAddress(int addressId);
}

package com.exposure.webapp.app.contacts.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.exposure.webapp.app.contacts.dao.ContactsDao;
import com.exposure.webapp.base.domain.Contact;


/**
 * 
 * @author David
 *
 */
@Service("contactsService")
public class ContactsServiceImpl implements ContactsService
{
	@Resource
	private ContactsDao contactsDao;
	

	@Override
	public List<Contact> getContacts() 
	{
		return contactsDao.getContacts();
	}

}

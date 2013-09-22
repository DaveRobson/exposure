package com.exposure.webapp.app.contacts.dao;

import java.util.List;

import com.exposure.webapp.base.domain.Contact;

/**
 * 
 * @author David
 *
 */
public interface ContactsDao 
{
	List<Contact> getContacts();
}

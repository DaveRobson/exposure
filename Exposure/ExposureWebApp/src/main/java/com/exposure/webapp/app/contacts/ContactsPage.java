package com.exposure.webapp.app.contacts;

import org.apache.wicket.markup.html.basic.Label;

import com.exposure.webapp.base.page.AuthenticatedUserPage;

/**
 * 
 * Main page for all of the systems contacts
 * 
 * @author David
 *
 */
@SuppressWarnings("serial")
public class ContactsPage extends AuthenticatedUserPage
{
	public ContactsPage() 
	{
		add(new Label("heading", "Contacts"));
	
	}
}

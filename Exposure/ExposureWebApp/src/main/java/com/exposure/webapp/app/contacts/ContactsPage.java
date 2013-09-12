package com.exposure.webapp.app.contacts;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;

import com.exposure.webapp.base.component.ListGroup;
import com.exposure.webapp.base.domain.Contact;
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
		
		
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(new Contact("Adam Hillier - 01635 555454", "adam@ahpphotography.co.uk - wedding"));
		contacts.add(new Contact("Laura Casser - 01635 889766", "laura@ahpphotography.co.uk - commercial"));
		contacts.add(new Contact("David Robson - 07912674442", "mail@david-robson.co.uk - family"));
		
		
		add(new ListGroup("contact-list", contacts));
	
	}
}

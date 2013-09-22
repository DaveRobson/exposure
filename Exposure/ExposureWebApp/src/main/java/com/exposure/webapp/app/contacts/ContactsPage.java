package com.exposure.webapp.app.contacts;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.exposure.webapp.app.contacts.service.ContactsService;
import com.exposure.webapp.base.component.ListGroup;
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
	@SpringBean
	private ContactsService contactsService;
	
	public ContactsPage() 
	{
		add(new Label("heading", "Contacts"));
		
		Form<Void> form = new Form<Void>("form");
		form.add(new Button("newContact", new Model<String>("New Contact"))
		{
			@Override
			public void onSubmit() 
			{
				setResponsePage(NewContact.class);
			}
		});
		
		add(form);
		
		
		add(new ListGroup("contact-list", contactsService.getContacts()));
	
	}
}

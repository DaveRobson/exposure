package com.exposure.webapp.app.contacts;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.EmailTextField;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

import com.exposure.webapp.base.domain.Contact;
import com.exposure.webapp.base.page.AuthenticatedUserPage;

/**
 * 
 * @author David
 *
 */
@SuppressWarnings("serial")
public class NewContact extends AuthenticatedUserPage
{
	public NewContact() 
	{
		Form<Contact> form = new Form<Contact>("form", new CompoundPropertyModel<Contact>(new Contact()));
		add(form);
		
		//Base Details
		form.add(new Label("firstnameLabel", "First Name"));
		form.add(new TextField<String>("firstName"));
		
		form.add(new Label("lastnameLabel", "Last Name"));
		form.add(new TextField<String>("lastName"));
		
		form.add(new Label("emailLabel", "Email Address"));
		form.add(new EmailTextField("emailAddress"));
		
		form.add(new Label("phoneLabel", "Phone Number"));
		form.add(new TextField<String>("phoneNumber"));
		
		//Address
		form.add(new Label("address1Label", "Address Line 1"));
		form.add(new TextField<String>("address.addressLine1"));
		
		form.add(new Label("address2Label", "Address Line 2"));
		form.add(new TextField<String>("address.addressLine2"));
		
		form.add(new Label("townCityLabel", "Town/City"));
		form.add(new TextField<String>("address.townCity"));
		
		form.add(new Label("postcodeLabel", "Postcode"));
		form.add(new TextField<String>("address.postcode"));
		
	}
}

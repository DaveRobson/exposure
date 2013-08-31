package com.exposure.webapp.app.login;

import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.EmailTextField;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.protocol.http.WebApplication;

import com.exposure.webapp.app.ExposureSession;
import com.exposure.webapp.base.domain.LoggedInUser;
import com.exposure.webapp.base.domain.UserLoginRequest;

@SuppressWarnings("serial")
public class LoginPanel extends Panel
{

	public LoginPanel(String id) 
	{
		super(id);
		
		if (ExposureSession.get().isSignedIn())
		{
			continueToOriginalDestination();
			setResponsePage(WebApplication.get().getHomePage());
		}
		
		final Form<UserLoginRequest> form = new Form<UserLoginRequest>("form", new CompoundPropertyModel<UserLoginRequest>(
				new UserLoginRequest()));
		add(form);
		
		form.add(new Label("emailLabel", "Email"));

		form.add(new EmailTextField("emailAddress"));
		
		form.add(new Label("passwordLabel", "Password"));
	
		form.add(new PasswordTextField("password"));
		
		form.add(new Button("button", new Model<String>("Sign in"))
		{
			@Override
			public void onSubmit() 
			{
				
				if(((ExposureSession)getSession()).signIn(form.getModelObject().getEmailAddress(), form.getModelObject().getPassword()))
				{
					setResponsePage(WebApplication.get().getHomePage());
				}			
			}
		});		
	}

}

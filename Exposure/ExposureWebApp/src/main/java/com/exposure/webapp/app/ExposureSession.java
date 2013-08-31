package com.exposure.webapp.app;

import org.apache.wicket.Session;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;

import com.exposure.webapp.base.domain.User;

/**
 * 
 * @author David
 *
 */
@SuppressWarnings("serial")
public class ExposureSession extends AuthenticatedWebSession
{
	//Logged in user
	private User user;

	public ExposureSession(Request request) 
	{
		super(request);
	}
	
	public static ExposureSession get()
	{
		return ExposureSession.class.cast(Session.get());
	}

	@Override
	public boolean authenticate(String username, String password) 
	{
		return true;
	}

	@Override
	public Roles getRoles() 
	{
		return new Roles();
	}	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

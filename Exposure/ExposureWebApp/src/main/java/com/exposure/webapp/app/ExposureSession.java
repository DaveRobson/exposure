package com.exposure.webapp.app;

import org.apache.wicket.Session;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;

import com.exposure.webapp.base.domain.LoggedInUser;
import com.exposure.webapp.base.domain.User;
import com.google.common.collect.Lists;

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
	
	 /**
     * Checks the given email address and password, returning a User object if the email address and
     * password identify a valid user.
     * 
     * @param emailAddress
     *            The email address
     * @param password
     *            The password
     * @return True if the user was authenticated
     */
    @Override
    public final boolean authenticate(final String emailAddress, final String password)
    {
    	final String EMAIL = "a@b.com";
        final String WICKET = "password";

        if (user == null)
        {
            // Trivial password "db"
            if (EMAIL.equalsIgnoreCase(emailAddress) && WICKET.equalsIgnoreCase(password))
            {
                user = new LoggedInUser(1, emailAddress, new Roles(Roles.USER)) ;
            }
        }

        return user != null;
    }
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public Roles getRoles() 
	{
       if (isSignedIn())
        {
            // If the user is signed in, they have these roles
            return user.getRoles();
        }
        return null;
	}

}
